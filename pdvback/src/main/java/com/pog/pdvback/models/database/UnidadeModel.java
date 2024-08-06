package com.pog.pdvback.models.database;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "unidade")
@SequenceGenerator(name = "unidade_idunidade_seq",
        sequenceName = "unidade_idunidade_seq",
        allocationSize = 1, initialValue = 1)
public class UnidadeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idunidade;
    private Timestamp dthrcriacao;
    private String descricao;
    private String sigla;
    private int precisao;
}
