package com.pog.pdvback.models.database;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "categoria")
@SequenceGenerator(name = "categoria_idcategoria_seq", sequenceName = "categoria_idcategoria_seq",
        allocationSize = 1, initialValue = 1)
public class CategoriaModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcategoria;
    private Timestamp dthrcriacao;
    private String descricao;
    private String padrao;
    private int idncm;
    private String sinctributacao;
    private String origem;
    private String csosn;
    private double aliqicms;
    private String cstpis;
    private double aliqpis;
    private String cstcofins;
    private double aliqcofins;
    private String codcontribsocial;
    private String cor;
    private String cest;
    private String cfop;
    private boolean sincronizado = false;
}
