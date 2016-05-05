package br.com.robsoncastilho.geradordearquivo.bomexemplo;

import java.util.List;

public class GeradorDeArquivos {
    
    public void GerarArquivos(List<Arquivo> arquivos) {
        arquivos.stream().forEach((arquivo) -> {
                arquivo.gerar();
        });
    }
}
