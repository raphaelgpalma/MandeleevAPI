package com.example.demo.service;

import com.example.demo.model.Elemento;
import com.example.demo.repository.ElementoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.Element;
import java.util.List;
import java.util.Optional;

@Service
public interface ElementoService <A extends Elemento>{

    List<A> listarAtom();

    A criar(A a);

    List<Elemento> findAll();

    A atualizar(A a, Long id);

    boolean deletar(Long id);

    int qtdElementos();

    Optional<Elemento> buscaPorID(Long id);
}