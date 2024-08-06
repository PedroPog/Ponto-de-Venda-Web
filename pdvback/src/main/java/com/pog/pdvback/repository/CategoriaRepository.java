package com.pog.pdvback.repository;

import com.pog.pdvback.models.database.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaModel,Integer> {
}
