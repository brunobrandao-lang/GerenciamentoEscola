package com.example.gerenciamentoEscola.repository;

import com.example.gerenciamentoEscola.model.AlunosModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlunosRepository extends JpaRepository<AlunosModel, Long> {
    Optional<AlunosModel>findByRa(Double ra);
}