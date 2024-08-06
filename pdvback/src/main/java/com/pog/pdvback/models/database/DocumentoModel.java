package com.pog.pdvback.models.database;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.ArrayList;

@Getter
@Setter
@Entity
@Table(name = "documento")
@SequenceGenerator(name = "documento_iddocumento_seq",
		sequenceName = "documento_iddocumento_seq",
		allocationSize = 1, initialValue = 1)
public class DocumentoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddocumento;
	private Timestamp dthrcriacaoTimeStamp;
    private double totaldocumento;
    private String nomecliente;
    private String cpfcnpj;
    private String operacao;
    private int numerodeprodutos;
    private double totalquantidade;
    private double totaltroco;
    private double totaldesconto;
    private double totaldositens;
    private double totalrestante;
    private double totalacrescimo;
    private  double totaldocumentocdesc;
    private String xml;
    private int numero;
    private String chaveCfe;
	private String status;
	private String modelo; //Modelo nota 59 = sat , 65 = NFCe
	private String protocoloNfce;
	private String serie;
	private String xmlcanc;
	private Timestamp dthrcancelamento;
	private String chavecanc;
	private String protocolocanc;
	private String observacao;
	//private ArrayList<DocumentoProdutoModel> listaProduto ;
	//private ArrayList<DocumentoPagamentoModel> listaPagamento ;
}
