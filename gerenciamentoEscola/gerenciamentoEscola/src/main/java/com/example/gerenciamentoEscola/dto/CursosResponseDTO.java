package com.example.gerenciamentoEscola.dto;

public class CursosResponseDTO {
    private String nomeCurso;
    private String modalidade;
    private String professor;
    private String registroDaTurma;
    private String materia;

    public CursosResponseDTO() {
    }

    public CursosResponseDTO(String nomeCurso, String modalidade, String professor, String registroDaTurma, String materia) {
        this.nomeCurso = nomeCurso;
        this.modalidade = modalidade;
        this.professor = professor;
        this.registroDaTurma = registroDaTurma;
        this.materia = materia;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getRegistroDaTurma() {
        return registroDaTurma;
    }

    public void setRegistroDaTurma(String registroDaTurma) {
        this.registroDaTurma = registroDaTurma;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
