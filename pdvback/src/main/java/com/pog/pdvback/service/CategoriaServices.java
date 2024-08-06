package com.pog.pdvback.service;

import com.pog.pdvback.models.database.CategoriaModel;
import com.pog.pdvback.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServices {

    @Autowired
    CategoriaRepository repository;

    public List<CategoriaModel> listItens(){
        return repository.findAll();
    }
}
