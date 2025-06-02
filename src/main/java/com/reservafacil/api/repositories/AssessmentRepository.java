package com.reservafacil.api.repositories;

import com.reservafacil.api.entities.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AssessmentRepository extends JpaRepository<Assessment, UUID> {
}
