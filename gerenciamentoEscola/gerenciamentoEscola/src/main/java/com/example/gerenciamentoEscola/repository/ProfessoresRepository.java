package com.example.gerenciamentoEscola.repository;

import com.example.gerenciamentoEscola.model.ProfessoresModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfessoresRepository extends JpaRepository<ProfessoresModel, Long> {
    Optional<ProfessoresModel>findByRegistroProfessor(String registroProfessor);
}
