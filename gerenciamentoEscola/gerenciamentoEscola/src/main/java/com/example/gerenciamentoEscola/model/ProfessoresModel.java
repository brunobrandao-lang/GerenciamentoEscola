package com.example.gerenciamentoEscola.model;

import jakarta.persistence.*;

@Entity
@Table(name = "table_Professor")
public class ProfessoresModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeProfessor;

    @Column(nullable = false, unique = true)
    private String registroProfessor;

    @Column(nullable = false)
    private String materia;

    @Column(nullable = false)
    private String turno;

    @Column(nullable = false)
    private Double salario;

    public ProfessoresModel() {
    }

    public ProfessoresModel(Long id, String nomeProfessor, String registroProfessor, String materia, String turno, Double salario) {
        this.id = id;
        this.nomeProfessor = nomeProfessor;
        this.registroProfessor = registroProfessor;
        this.materia = materia;
        this.turno = turno;
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
