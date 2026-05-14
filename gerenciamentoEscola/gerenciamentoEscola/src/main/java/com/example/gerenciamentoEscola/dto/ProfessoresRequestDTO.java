package com.example.gerenciamentoEscola.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProfessoresRequestDTO {
    @NotBlank(message = "Informe o nome do professor")
    private String nomeProfessor;

    @NotNull(message = "Informe o registro de professor")
    private String registroProfessor;

    @NotBlank(message = "Informe a matéria do professor")
    private String materia;

    @NotBlank(message = "Informe o turno do professor")
    private String turno;

    @NotNull(message = "Informe o salário do professor")
    private Double salario;

    public ProfessoresRequestDTO() {
    }

    public ProfessoresRequestDTO(String nomeProfessor, String registroProfessor, String materia, String turno, Double salario) {
        this.nomeProfessor = nomeProfessor;
        this.registroProfessor = registroProfessor;
        this.materia = materia;
        this.turno = turno;
        this.salario = salario;
    }

    public @NotBlank(message = "Informe o nome do professor") String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(@NotBlank(message = "Informe o nome do professor") String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public @NotNull(message = "Informe o registro de professor") String getRegistroProfessor() {
        return registroProfessor;
    }

    public void setRegistroProfessor(@NotNull(message = "Informe o registro de professor") String registroProfessor) {
        this.registroProfessor = registroProfessor;
    }

    public @NotBlank(message = "Informe a matéria do professor") String getMateria() {
        return materia;
    }

    public void setMateria(@NotBlank(message = "Informe a matéria do professor") String materia) {
        this.materia = materia;
    }

    public @NotBlank(message = "Informe o turno do professor") String getTurno() {
        return turno;
    }

    public void setTurno(@NotBlank(message = "Informe o turno do professor") String turno) {
        this.turno = turno;
    }

    public @NotNull(message = "Informe o salário do professor") Double getSalario() {
        return salario;
    }

    public void setSalario(@NotNull(message = "Informe o salário do professor") Double salario) {
        this.salario = salario;
    }
}
