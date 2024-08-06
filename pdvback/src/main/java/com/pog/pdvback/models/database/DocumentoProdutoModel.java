package com.pog.pdvback.models.database;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "documentoproduto")
@SequenceGenerator(name = "documentoproduto_iddocumentoproduto_seq", sequenceName = "documentoproduto_iddocumentoproduto_seq",
        allocationSize = 1, initialValue = 1)
public class DocumentoProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iddocumento;
    private Timestamp dthrcriacaoTimeStamp;
    private int iddoproduto;
    private String descricao;
    private double preco;
    private double quantidade;
    private double totalproduto;
    private double totalprodutocdesc;
    private double descontounitario;
    private double descontopercentual;
    private double totaldesconto;
    private double acrescimounitario;
    private double acrescimopercentual;
    private double totalacrescimo;
    private String codigoean;
    private String precovariavel;
    private String codigoNcm;
    private int origem;
    private int csosn;
    private double aliqicms;
    private String cstpis;
    private double aliqpis;
    private String cstcofins;
    private double aliqicofins;
    private String codcontribsocial;
    private String cest;
    private String cfop;
    private int idunidade;
    private String undSigla;
    private int sequencial;
}
