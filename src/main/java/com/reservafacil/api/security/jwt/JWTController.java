package com.reservafacil.api.security.jwt;

import com.reservafacil.api.exceptions.InvalidCredentialsException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("v1/api/authenticate")
public class JWTController {
    private final JWTService jwtService;
    private final AuthenticationManager authenticationManager;

    @PostMapping
    public String getTokenForAuthenticatedUser(@RequestBody @Valid JWTAuthenticationRequest authRequest){
        try {
            Authentication authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword()));

            return jwtService.getGenaretedToken(authRequest.getEmail());

        } catch (BadCredentialsException ex) {
            throw new InvalidCredentialsException("Invalid users credentials");
        }
    }

}
