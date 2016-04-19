package br.com.robsoncastilho.figurasgeometricas.quadro;

public class Retangulo {
    private double altura;
    private double comprimento;
    
    public double altura() {
        return this.altura * this.comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    
    
}
