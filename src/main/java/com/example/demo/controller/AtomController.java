package com.example.demo.controller;


import com.example.demo.model.Atom;
import com.example.demo.repository.AtomRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atom")
public class AtomController {

    @Autowired
    AtomRepository atomRepository;

    @GetMapping
    public List<Atom> listarAtom() {
        return atomRepository.findAll();
    }

    @PostMapping
    public List<Atom> criar(@Valid @RequestBody List<Atom> atom) {

        return atomRepository.saveAll(atom);
    }
}
