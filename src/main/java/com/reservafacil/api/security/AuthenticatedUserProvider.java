package com.reservafacil.api.security;

import com.reservafacil.api.security.jwt.JWTService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Objects;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class AuthenticatedUserProvider {

    private final JWTService jwtService;

    private String extractTokenFromRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder
                .getRequestAttributes())).getRequest();

        String authHeader = request.getHeader("Authorization");
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            return authHeader.substring(7);
        }
        throw new RuntimeException("JWT Token não encontrado no header Authorization");
    }

    public String getAuthenticatedEmail() {
        String token = extractTokenFromRequest();
        return jwtService.extractUserNameFromToken(token);
    }

    public UUID getAuthenticatedUserId() {
        String token = extractTokenFromRequest();
        return jwtService.extractUserIdFromToken(token);
    }
}
