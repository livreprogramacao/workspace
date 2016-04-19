package br.com.robsoncastilho.figurasgeometricas.calcular;

import br.com.robsoncastilho.figurasgeometricas.quadro.Retangulo;

public class CalcularArea {

    public void MetodoQualquer(Retangulo retangulo) {
        retangulo.setAltura(  retangulo.getAltura() * 2 );
        retangulo.setComprimento( retangulo.getComprimento() * 4 );
        // faz alguma coisa com essa nova área...
    }

}
