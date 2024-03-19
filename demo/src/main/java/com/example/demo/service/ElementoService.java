package com.example.demo.service;

import com.example.demo.model.Elemento;
import com.example.demo.repository.ElementoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.Element;
import java.util.List;
import java.util.Optional;

@Service
public class ElementoService {

    @Autowired
    ElementoRepository elementoRepository;

    public List<Elemento> listarElementos(){return elementoRepository.findAll();}

    public Elemento criar(Elemento elemento) {return elementoRepository.save(elemento);}

    public Elemento atualizar(Elemento elemento, Long id){

        if(verificaID(id)){
            //verdadeiro
            elemento.setId(id);
            return elementoRepository.save(elemento);


        }
        return null;
    }

    private boolean verificaID(Long id) {
        if(elementoRepository.existsById(id)){

            return true;
        } else {

            return false;
        }
    }
    public boolean deletar(Long id) {
        if(verificaID(id)) {
            elementoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public int qtdElementos() {
        return elementoRepository.findAll().size();
    }

    public Optional<Elemento> buscaPorID(Long id) { return elementoRepository.findById(id); }
}
