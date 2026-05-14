package com.example.gerenciamentoEscola.dto;

public class ProfessoresResponseDTO {
    private String nomeProfessor;
    private String registroProfessor;
    private String materia;
    private String turno;
    private Double salario;

    public ProfessoresResponseDTO() {
    }

    public ProfessoresResponseDTO(String nomeProfessor, String registroProfessor, String materia, String turno, Double salario) {
        this.nomeProfessor = nomeProfessor;
        this.registroProfessor = registroProfessor;
        this.materia = materia;
        this.turno = turno;
        this.salario = salario;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getRegistroProfessor() {
        return registroProfessor;
    }

    public void setRegistroProfessor(String registroProfessor) {
        this.registroProfessor = registroProfessor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}


