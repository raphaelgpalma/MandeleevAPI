package com.example.demo.controller;


import com.example.demo.model.MetaisAlcalinos;
import com.example.demo.repository.MetaisAlcalinosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metais-alcalinos")
public class MetaisAlcalinosController {

    @Autowired
    MetaisAlcalinosRepository metaisAlcalinosRepository;

    @GetMapping
    public List<MetaisAlcalinos> listarMetaisAlcalinos() {
        return metaisAlcalinosRepository.findAll();
    }

    @PostMapping
    public MetaisAlcalinos criar(@Valid @RequestBody MetaisAlcalinos metaisAlcalinos) {
        return metaisAlcalinosRepository.save(metaisAlcalinos);
    }
}
