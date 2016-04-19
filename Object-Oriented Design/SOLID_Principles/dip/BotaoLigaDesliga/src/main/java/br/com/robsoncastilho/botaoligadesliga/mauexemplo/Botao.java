package br.com.robsoncastilho.botaoligadesliga.mauexemplo;

public class Botao {

    private Lampada lampada;

    public void acionar(boolean condicao) {
        if (condicao) {
            lampada.ligar();
        }
    }
}
