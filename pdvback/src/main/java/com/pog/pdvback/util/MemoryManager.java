package com.pog.pdvback.util;


import java.util.prefs.Preferences;

public class MemoryManager {
    private static final Preferences prefs = Preferences.userNodeForPackage(MemoryManager.class);


    public static void salvarValor(String chave,String valor){
        prefs.put(chave,valor);
    }
    public static String recuperarValor(String chave){
        return prefs.get(chave,null);
    }
    public static boolean existeChave(String chave) {
        return prefs.get(chave, null) != null;
    }
    public static void clearChave(String chave) {
        prefs.remove(chave);
    }
}
