package com.example.demo.repository;

import com.example.demo.model.Atom;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Comparator;

public interface AtomRepository extends JpaRepository<Atom, Long> {



}
