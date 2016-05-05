package br.com.robsoncastilho.geradordearquivo.bomexemplo;

public class ArquivoPdf extends Arquivo {
    @Override
    public void gerar() {
        System.out.println("Arquivo PDF gerado com sucesso!");
    }
}
