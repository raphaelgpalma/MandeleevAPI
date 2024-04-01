package com.example.demo.service;

import com.example.demo.model.Atom;
import com.example.demo.repository.AtomRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AtomService implements ElementoService<Atom>{

    @Autowired
    AtomRepository atomRepository;

    @Override
    public List<Atom> listarAtom() {
    return atomRepository.findAll();
    }

    @Override
    public Atom criar(Atom atom) {
        return atomRepository.save(atom);
    }


}
