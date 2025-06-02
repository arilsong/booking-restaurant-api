package com.reservafacil.api.repositories;

import com.reservafacil.api.entities.Tables;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TablesRepository extends JpaRepository<Tables, UUID> {
}
