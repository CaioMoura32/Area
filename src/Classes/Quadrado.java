package Classes;

import Interface.CalcularMetodo;

public class Quadrado implements CalcularMetodo{
    private double lado;

    @Override
    public double calcularArea() {
        return lado * lado;   
    }

    @Override
    public String explicarMetodo() {
        return "O calculo da area é:  Base * Altura";
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

   
}
