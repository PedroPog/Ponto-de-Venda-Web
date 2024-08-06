package com.pog.pdvback.drivers;

import com.pog.pdvback.util.MemoryManager;
import com.sun.jna.Library;
import com.sun.jna.Native;

public interface SI300 extends Library {
    static String getLibraryPath() {
        String sistema = MemoryManager.recuperarValor("SO");
        String so;
        if ("WINDOWS".equals(sistema)) {
            so = "C:\\pdvremarca\\dlls\\SWSIM.dll";
        } else {
            String homeDireString = System.getProperty("user.home");
            String osArch = System.getProperty("os.arch");
            so = homeDireString+"/pdvremarca/linux/satsweda/"+osArch+"/libSI300DLL.so";
        }
        return so;
    }

    String LIBRARY_PATH = getLibraryPath();
    SI300 INSTANCE = (SI300) Native.load(LIBRARY_PATH, SI300.class);

        public int SI300_eBuscarPortaVelocidade();
	public int SI300_iImprimirTexto(String texto,int tam);
        public int SI300_iImprimirBMP(String pszArqOrigem);
        public int SI300_iImprimirImagem(String pszArqOrigem);
        public int SI300_iImprimirXML(String pszPath, String ptAutorizacao, String dhRecto, int tpCupom, String CID, String CSC, int ViaEstab, boolean Endereco);
        public int SI300_rConsultaStatusImpressora (int pszIndice, int pszTipoRetorno, byte[] pszRetornar);

        //SI300_iImprimirXML(char *pszPath, char* ptAutorizacao, char* dhRecto , int tpCupom)
        
        public int SI300_iImprimirXMLString(String stringXml, String ptAutorizacao, String dhRecto, int tpCupom, String CIDTOKEN, String CSC, int via, boolean Endereco);
        public int SI300_fecharPorta();
        public int SI300_rStatusGaveta(int[] GavetaStatus);
        public int SI300_regCodePageAutomatico(String pszParametro);
        public int SI300_iAcionarGaveta();
        public int SI300_rStatusGuilhotina();
}
