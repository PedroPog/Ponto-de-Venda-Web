package com.pog.pdvback.service;

import com.pog.pdvback.drivers.SatSweda;
import com.pog.pdvback.util.UtilidadesGerais;
import org.springframework.stereotype.Service;

@Service
public class SatService {
    public String GetStatus(){
       return SatSweda.INSTANCE.ConsultarSAT(UtilidadesGerais.gerarNumeroSessao());
    }
    public String StatusOperacional(String cod){
        return SatSweda.INSTANCE.ConsultarStatusOperacional(UtilidadesGerais.gerarNumeroSessao(),cod);
    }
    public String EnviarDadosVenda(String cod,String dados){
        return SatSweda.INSTANCE.EnviarDadosVenda(UtilidadesGerais.gerarNumeroSessao(),cod,dados);
    }
    public String CancelarUltimaVenda(String cod, String chave, String dadoscancel){
        return SatSweda.INSTANCE.CancelarUltimaVenda(UtilidadesGerais.gerarNumeroSessao(),cod,chave,dadoscancel);
    }
    public String ConsultarNumeroSessao(String cod, int sessao_a_ser_consultada){
        return SatSweda.INSTANCE.ConsultarNumeroSessao(UtilidadesGerais.gerarNumeroSessao(),cod,sessao_a_ser_consultada);
    }
    public String ConfigurarInterfaceDeRede(String cod, String xmlConfig){
        return SatSweda.INSTANCE.ConfigurarInterfaceDeRede(UtilidadesGerais.gerarNumeroSessao(),cod,xmlConfig);
    }
    public String ExtrairLogs(String cod){
        return SatSweda.INSTANCE.ExtrairLogs(UtilidadesGerais.gerarNumeroSessao(),cod);
    }

}
