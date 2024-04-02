package com.example.demo.controller;


import com.example.demo.model.Atom;
import com.example.demo.service.AtomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atom")
public class AtomController {

    @Autowired
    private AtomService atomService;

    @GetMapping
    public ResponseEntity<List<Atom>> listar() {
        List<Atom> lista = atomService.listarAtom();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Atom> criar(@RequestBody Atom atom) {
        Atom newAtom = atomService.criar(atom);
        return new ResponseEntity<>(newAtom, HttpStatus.CREATED);
    }

    @PostMapping("/save-all")
    public ResponseEntity<List<Atom>> criarVarios(@RequestBody List<Atom> atom) {
        List<Atom> newAtom = atomService.criarVarios(atom);
        return new ResponseEntity<>(newAtom, HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Atom> atualizar(@RequestBody Atom atom, @PathVariable Long id) {
        Atom atomUpdate = atomService.atualizar(atom, id);
        if (atomUpdate == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(atomUpdate, HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean deleted = atomService.deletar(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
