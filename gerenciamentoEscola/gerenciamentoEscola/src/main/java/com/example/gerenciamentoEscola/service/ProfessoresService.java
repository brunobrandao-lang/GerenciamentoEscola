package com.example.gerenciamentoEscola.service;

import com.example.gerenciamentoEscola.dto.ProfessoresRequestDTO;
import com.example.gerenciamentoEscola.dto.ProfessoresResponseDTO;
import com.example.gerenciamentoEscola.model.ProfessoresModel;
import com.example.gerenciamentoEscola.repository.ProfessoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfessoresService {
    @Autowired private ProfessoresRepository repository;

    public List<ProfessoresResponseDTO> listarTodos(){
        return repository.findAll().stream()
                .map(professor -> new ProfessoresResponseDTO(
                        professor.getNomeProfessor(),
                        professor.getRegistroProfessor(),
                        professor.getMateria(),
                        professor.getTurno(),
                        professor.getSalario()))
                .collect(Collectors.toList());
    }

    public ProfessoresResponseDTO salvarProfessor(ProfessoresRequestDTO dto){
        if (repository.findByRegistroProfessor(dto.getRegistroProfessor()).isPresent()){
            throw new RuntimeException("Registro de professor já cadastrado");
        }
        ProfessoresModel novoProfessor = new ProfessoresModel();
        novoProfessor.setNomeProfessor(dto.getNomeProfessor());
        novoProfessor.setRegistroProfessor(dto.getRegistroProfessor());
        novoProfessor.setMateria(dto.getMateria());
        novoProfessor.setTurno(dto.getTurno());
        novoProfessor.setSalario(dto.getSalario());

        ProfessoresModel salvo = repository.save(novoProfessor);
        return new ProfessoresResponseDTO(salvo.getNomeProfessor(), salvo.getRegistroProfessor(), salvo.getMateria(), salvo.getTurno(), salvo.getSalario());
    }

    public void atualizar(Long id, ProfessoresRequestDTO dto){
        ProfessoresModel professores = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Professor não encontrado"));

        professores.setNomeProfessor(dto.getNomeProfessor());
        professores.setRegistroProfessor(dto.getRegistroProfessor());
        professores.setMateria(dto.getMateria());
        professores.setTurno(dto.getTurno());
        professores.setSalario(dto.getSalario());

        repository.save(professores);
    }

    public void excluir(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Professor não encontrado");
        }
        repository.deleteById(id);
    }
}
