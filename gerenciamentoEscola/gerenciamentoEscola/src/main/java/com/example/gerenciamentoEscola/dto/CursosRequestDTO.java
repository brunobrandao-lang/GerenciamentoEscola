package com.example.gerenciamentoEscola.dto;

import jakarta.validation.constraints.NotBlank;

public class CursosRequestDTO {
    @NotBlank(message = "Informe o nome do curso")
    private String nomeCurso;

    @NotBlank(message = "Informe a modalidade")
    private String modalidade;

    @NotBlank(message = "Informe o professor")
    private String professor;

    @NotBlank(message = "informe o registro da turma")
    private String registroDaTurma;

    @NotBlank(message = "Informe a matéria")
    private String materia;

    public CursosRequestDTO() {
    }

    public CursosRequestDTO(String nomeCurso, String modalidade, String professor, String registroDaTurma, String materia) {
        this.nomeCurso = nomeCurso;
        this.modalidade = modalidade;
        this.professor = professor;
        this.registroDaTurma = registroDaTurma;
        this.materia = materia;
    }

    public @NotBlank(message = "Informe o nome do curso") String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(@NotBlank(message = "Informe o nome do curso") String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public @NotBlank(message = "Informe a modalidade") String getModalidade() {
        return modalidade;
    }

    public void setModalidade(@NotBlank(message = "Informe a modalidade") String modalidade) {
        this.modalidade = modalidade;
    }

    public @NotBlank(message = "Informe o professor") String getProfessor() {
        return professor;
    }

    public void setProfessor(@NotBlank(message = "Informe o professor") String professor) {
        this.professor = professor;
    }

    public @NotBlank(message = "informe o registro da turma") String getRegistroDaTurma() {
        return registroDaTurma;
    }

    public void setRegistroDaTurma(@NotBlank(message = "informe o registro da turma") String registroDaTurma) {
        this.registroDaTurma = registroDaTurma;
    }

    public @NotBlank(message = "Informe a matéria") String getMateria() {
        return materia;
    }

    public void setMateria(@NotBlank(message = "Informe a matéria") String materia) {
        this.materia = materia;
    }
}
