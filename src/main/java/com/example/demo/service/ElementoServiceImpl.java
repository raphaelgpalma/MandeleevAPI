package com.example.demo.service;

import com.example.demo.model.Elemento;
import com.example.demo.repository.ElementoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElementoServiceImpl implements ElementoService {

    @Autowired
    private ElementoRepository elementoRepository;


    public List<Elemento> listarElementos() {
        return elementoRepository.findAll();
    }


    public Elemento criarElemento(Elemento elemento) {
        return elementoRepository.save(elemento);
    }


    public Elemento atualizarElemento(Elemento elemento) {
        return elementoRepository.save(elemento);
    }


    public boolean deletarElemento(Long id) {
        if (elementoRepository.existsById(id)) {
            elementoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List listarAtom() {
        return null;
    }

    @Override
    public Elemento criar(Elemento elemento) {
        return null;
    }

    @Override
    public List<Elemento> findAll() {
        return null;
    }

    @Override
    public Elemento atualizar(Elemento elemento, Long id) {
        return null;
    }

    @Override
    public boolean deletar(Long id) {
        return false;
    }

    @Override
    public int qtdElementos() {
        return (int) elementoRepository.count();
    }

    @Override
    public Optional<Elemento> buscaPorID(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Elemento> buscaPorId(Long id) {
        return elementoRepository.findById(id);
    }
}
