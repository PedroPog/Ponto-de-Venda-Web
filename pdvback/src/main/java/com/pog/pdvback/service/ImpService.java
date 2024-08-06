package com.pog.pdvback.service;

import com.pog.pdvback.drivers.SI300;
import com.pog.pdvback.drivers.SatSweda;
import com.pog.pdvback.util.UtilidadesGerais;
import org.springframework.stereotype.Service;

@Service
public class ImpService {
    public int GetStatus(String texto){
       return SI300.INSTANCE.SI300_iImprimirTexto(texto,0);
    }
}
