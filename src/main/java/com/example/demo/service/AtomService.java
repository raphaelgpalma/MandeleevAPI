package com.example.demo.service;

import com.example.demo.model.Atom;
import com.example.demo.repository.AtomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public List<Atom> criarVarios(List<Atom> listAtom) {
        return atomRepository.saveAll(listAtom);
    }



    @Override
    public Atom atualizar(Atom carros, Long id) {
        if (atomRepository.existsById(id)) {
            carros.setId(id); // Garante que o carro atualizado terá o ID correto.
            return atomRepository.save(carros);
        }
        return null; // Ou você pode lançar uma exceção se preferir.
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



