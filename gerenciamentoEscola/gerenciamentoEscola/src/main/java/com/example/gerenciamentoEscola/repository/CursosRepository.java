package com.example.gerenciamentoEscola.repository;

import com.example.gerenciamentoEscola.model.CursosModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CursosRepository extends JpaRepository<CursosModel, Long> {
    Optional<CursosModel>findByRegistroDaTurma(String registroDaTurma);
}
