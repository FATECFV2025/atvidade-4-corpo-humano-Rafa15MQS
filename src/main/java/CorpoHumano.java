package main.java;

public class CorpoHumano {
    private double massa;     
    private double volume;    
    private double densidade; 
    private double altura;    

    public CorpoHumano(double massa, double volume, double altura) {
        this.massa = massa;
        this.volume = volume;
        this.altura = altura;
        calcularDensidade();
    }

    private void calcularDensidade() {
        if (volume > 0) {
            this.densidade = massa / volume;
        } else {
            this.densidade = 0;
        }
    }

    public double getMassa() {
        return massa;
    }

    public double getVolume() {
        return volume;
    }

    public double getDensidade() {
        return densidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setMassa(double massa) {
        this.massa = massa;
        calcularDensidade();
    }

    public void setVolume(double volume) {
        this.volume = volume;
        calcularDensidade();
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
    
            return massa / (altura * altura);
  
    }
}