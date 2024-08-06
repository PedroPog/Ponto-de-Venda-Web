package com.pog.pdvback.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Random;

public class UtilidadesGerais {
    public static int gerarNumeroSessao() {

        Random random = new Random();
        int numeroSessao = random.nextInt(999999);

        return numeroSessao;
    }
    public  String converterBase64(String texto) {
        byte[] arrayBytesDecodificado = Base64.getDecoder().decode(texto);/// linha alterada em 14/06/2020
        String textoStringDecodificado = new String(arrayBytesDecodificado);
        return textoStringDecodificado;
    }
}
