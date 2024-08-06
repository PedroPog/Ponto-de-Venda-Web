package com.pog.pdvback.models.database;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "documentopagamento")
@SequenceGenerator(name = "documentopagamento_iddocumentopagamento_seq",
		sequenceName = "documentopagamento_iddocumentopagamento_seq",
		allocationSize = 1, initialValue = 1)
public class DocumentoPagamentoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddocumento;
    private int idformapagamento;
    private String especieformapagaento;
    private double totalpagamento;
    private String descricao;
	private Timestamp dthrcriacaoTimeStamp;
    
}
