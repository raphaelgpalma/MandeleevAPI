package com.example.demo.controller;

import com.example.demo.model.Elemento;
import com.example.demo.model.Funcionario;
import com.example.demo.service.ElementoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/elementos")
public class ElementoController {

    @Autowired
    ElementoService elementoService;

    @GetMapping
    public List<Elemento> listarElementos() { return elementoService.listarElementos(); }

    @PostMapping
    public Elemento criar(@Valid @RequestBody Elemento elemento) {

        return elementoService.criar(elemento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@RequestBody Elemento elemento, @PathVariable Long id) {
        if (elementoService.atualizar(elemento, id) == null) {

            String mensagem = "O id informado nao existe";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
        } else {

            return ResponseEntity.ok(elemento);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        if(elementoService.deletar(id)) {
            String mensagem = "O id " + id + " foi removido com sucesso.";
            return ResponseEntity.status(HttpStatus.OK).body(mensagem);
        } else {
            String mensagem = "O id informado não existe";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
        }
    }

    @GetMapping("/qtd")
    public int qtdElementos() {
        return elementoService.qtdElementos();
    }

    @GetMapping("/{id}")
    public Optional<Elemento> buscarPorID(@PathVariable Long id) {
        return elementoService.buscaPorID(id);
    }

}