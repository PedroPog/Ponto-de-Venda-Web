package com.pog.pdvback.models.database;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "produto")
@SequenceGenerator(name = "produto_idproduto_seq", sequenceName = "produto_idproduto_seq",
        allocationSize = 1, initialValue = 2)
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idproduto;
    private Timestamp dthrcriacao;
    private String descricao;
    private int idcategoria;
    private double preco;
    private String codigoean;
    private String precovariavel;
    private String favorito;
    private String sinctributacao;
    private int idncm;
    private String origem;
    private String csosn;
    private double aliqicms;
    private String cstpis;
    private double aliqpis;
    private String cstcofins;
    private double aliqcofins;
    private String codcontribsocial;
    private String cest;
    private String cfop;
    private String status;
    private int idunidade;
    private int quantestoque;
    private String imagem;
    private boolean sincronizado = false;
}
