package com.pog.pdvback.controller;

import com.pog.pdvback.models.database.CategoriaModel;
import com.pog.pdvback.models.database.ProdutoModel;
import com.pog.pdvback.service.CategoriaServices;
import com.pog.pdvback.service.ProdutoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pk")
@CrossOrigin
public class ProdutoController {

    @Autowired
    ProdutoServices services;

    @GetMapping("/list")
    public ResponseEntity<List<ProdutoModel>> listItens(){
        List<ProdutoModel> list = services.listItens();
        if(list.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(list);
        }
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
}
