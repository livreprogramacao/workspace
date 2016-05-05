package br.com.robsoncastilho.geradordearquivo.mauexemplo;

import java.util.List;

public class GeradorDeArquivos {
    
    public void GerarArquivos(List<Arquivo> arquivos) {
        arquivos.stream().forEach((arquivo) -> {
            if (arquivo instanceof ArquivoWord) {
                ((ArquivoWord) arquivo).gerarDocX();
            } else if (arquivo instanceof ArquivoPdf) {
                ((ArquivoPdf) arquivo).gerarPdf();
            }
        });
    }
}
