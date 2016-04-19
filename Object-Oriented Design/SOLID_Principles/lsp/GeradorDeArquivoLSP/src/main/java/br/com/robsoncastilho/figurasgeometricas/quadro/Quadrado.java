package br.com.robsoncastilho.figurasgeometricas.quadro;

public class Quadrado extends Retangulo {
    
    @Override
    public void setAltura(double valor) {
        altura = comprimento = valor;
    }
    
    @Override
    public void setComprimento(double valor) {
        altura = comprimento = valor;
    }
}
