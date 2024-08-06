package com.pog.pdvback.models.database;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "ncm")
@SequenceGenerator(name = "ncm_idncm_seq",
        sequenceName = "ncm_idncm_seq",
        allocationSize = 1, initialValue = 1)
public class NcmModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idncm;
    private Timestamp dthrcriacao;
    private String codigoncm;
    private String descricao;
    private String origem;
    private String csosn;
    private int aliqicms;
    private int cstpis;
    private int aliqpis;
    private int cstcofins;
    private int aliqcofins;
    private int codcontribsocial;
    private String cest;
    private String cfop;
}
