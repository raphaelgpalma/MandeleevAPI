package com.example.demo.service;

import com.example.demo.model.Atom;
import com.example.demo.model.Elemento;
import com.example.demo.repository.AtomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class AtomService implements ElementoService<Atom>{

    @Autowired
    private AtomRepository atomRepository;


    @Override
    public List<Atom> listarAtom() {
        return atomRepository.findAll();
    }

    @Override
    public Atom criar(Atom atom) {
        return atomRepository.save(atom);
    }


    public List<Atom> criarVarios(List<Atom> listAtom) {
        return atomRepository.saveAll(listAtom);
    }

    public List<Atom> ordenarAtom() {
        // Obtém a lista de átomos do repositório
        List<Atom> listaAtom = atomRepository.findAll();

        // Ordena a lista de átomos pelo número atômico
        listaAtom.sort(Comparator.comparingInt(Atom::getNumeroAtomico));

        return listaAtom;
    }



    @Override
    public Atom atualizar(Atom atom, Long id) {
        if (atomRepository.existsById(id)) {
            atom.setId(id);
            return atomRepository.save(atom);
        }
        return null;
    }


    @Override
    public boolean deletar(Long id) {
        if(atomRepository.existsById(id)) {
            atomRepository.deleteById(id);
            return true;
        }
        return false;
    }
}



