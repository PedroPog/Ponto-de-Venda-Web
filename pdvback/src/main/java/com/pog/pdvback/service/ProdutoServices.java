package com.pog.pdvback.service;

import com.pog.pdvback.models.database.CategoriaModel;
import com.pog.pdvback.models.database.ProdutoModel;
import com.pog.pdvback.repository.CategoriaRepository;
import com.pog.pdvback.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServices {

    @Autowired
    ProdutoRepository repository;

    public List<ProdutoModel> listItens(){
        return repository.findAll();
    }
}
