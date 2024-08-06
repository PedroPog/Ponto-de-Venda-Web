package com.pog.pdvback.repository;

import com.pog.pdvback.models.database.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel,Integer> {
}
