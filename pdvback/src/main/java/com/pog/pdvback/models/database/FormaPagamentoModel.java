package com.pog.pdvback.models.database;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "formapagamento")
@SequenceGenerator(name = "formapagamento_idformapagamento_seq",
        sequenceName = "formapagamento_idformapagamento_seq",
        allocationSize = 1, initialValue = 1)
public class FormaPagamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idformapagamento;
    private Timestamp dthrcriacao;
    private String descricao;
    private String especie;
    private String status;
}
