package com.example.gerenciamentoEscola.service;

import com.example.gerenciamentoEscola.dto.CursosRequestDTO;
import com.example.gerenciamentoEscola.dto.CursosResponseDTO;
import com.example.gerenciamentoEscola.model.CursosModel;
import com.example.gerenciamentoEscola.repository.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CursosService {
    @Autowired
    private CursosRepository repository;

    public List<CursosResponseDTO> listarTodos(){
        return repository.findAll().stream()
                .map(curso -> new CursosResponseDTO(
                        curso.getNomeCurso(),
                        curso.getModalidade(),
                        curso.getProfessor(),
                        curso.getRegistroDaTurma(),
                        curso.getMateria()))
                .collect(Collectors.toList());
    }

    public CursosResponseDTO salvarCursos(CursosRequestDTO dto){
        if (repository.findByRegistroDaTurma(dto.getRegistroDaTurma()).isPresent()){
            throw new RuntimeException("Registro da turma já cadastrado");
        }
        CursosModel novoCurso = new CursosModel();
        novoCurso.setNomeCurso(dto.getNomeCurso());
        novoCurso.setModalidade(dto.getModalidade());
        novoCurso.setProfessor(dto.getProfessor());
        novoCurso.setRegistroDaTurma(dto.getRegistroDaTurma());
        novoCurso.setMateria(dto.getMateria());

        CursosModel salvo = repository.save(novoCurso);
        return new CursosResponseDTO(salvo.getNomeCurso(), salvo.getModalidade(), salvo.getProfessor(), salvo.getRegistroDaTurma(), salvo.getMateria());
    }

    public Void atualizar (Long id, CursosRequestDTO dto){
        CursosModel cursos = repository .findAllById(id)
                .orElseThrow(()-> new RuntimeException("Curso não encontrado"));

        cursos.setNomeCurso(dto.getNomeCurso());
        cursos.setModalidade(dto.getModalidade());
        cursos.setProfessor(dto.getProfessor());
        cursos.setRegistroDaTurma(dto.getRegistroDaTurma());
        cursos.setMateria(dto.getMateria());

        repository.save(cursos);
    }

    public void excluir(Long id){
        if (!repository.existsById(id)){
            throw new RuntimeException("Curso não encontrado");
        }
        repository.deleteById(id);
    }
}
