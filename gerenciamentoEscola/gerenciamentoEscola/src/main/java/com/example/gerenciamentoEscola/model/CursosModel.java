package com.example.gerenciamentoEscola.model;

import jakarta.persistence.*;

@Entity
@Table(name = "table_Cursos")
public class CursosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeCurso;

    @Column(nullable = false)
    private String modalidade;

    @Column(nullable = false)
    private String professor;

    @Column(nullable = false, unique = true, length = 10)
    private String registroDaTurma;

    @Column(nullable = false)
    private String materia;

    public CursosModel() {
    }

    public CursosModel(Long id, String nomeCurso, String modalidade, String professor, String registroDaTurma, String materia) {
        this.id = id;
        this.nomeCurso = nomeCurso;
        this.modalidade = modalidade;
        this.professor = professor;
        this.registroDaTurma = registroDaTurma;
        this.materia = materia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
