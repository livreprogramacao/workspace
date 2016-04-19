package br.com.robsoncastilho.botaoligadesliga.bomexemplo;

public class Botao {

    private Dispositivo dispositivo;

    public void acionar(boolean condicao) {
        if (condicao) {
            dispositivo.ligar();
        }
    }
}
