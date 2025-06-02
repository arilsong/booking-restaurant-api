package com.reservafacil.api.repositories;

import com.reservafacil.api.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeRepository extends JpaRepository<Employee, UUID> {
}
