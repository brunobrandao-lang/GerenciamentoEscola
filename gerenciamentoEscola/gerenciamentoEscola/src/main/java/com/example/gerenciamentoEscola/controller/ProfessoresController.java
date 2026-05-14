package com.example.gerenciamentoEscola.controller;

import com.example.gerenciamentoEscola.dto.ProfessoresRequestDTO;
import com.example.gerenciamentoEscola.dto.ProfessoresResponseDTO;
import com.example.gerenciamentoEscola.service.ProfessoresService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/professores")
public class ProfessoresController {
    @Autowired
    private ProfessoresService service;

    @GetMapping
    public ResponseEntity<List<ProfessoresResponseDTO>> listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());
    }

    @PostMapping("/{id}")
    public ResponseEntity<Map<String, Object>> salvar (@Valid @RequestBody ProfessoresRequestDTO dto){
        service.salvarProfessor(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Professor cadastrado com sucesso"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizar(@PathVariable Long id,@RequestBody @Valid ProfessoresRequestDTO dto){
        service.atualizar(id, dto);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of("mensagem","Professor atualizado"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluir(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of("mensagem", "Professor excluido com sucesso"));
    }
}
