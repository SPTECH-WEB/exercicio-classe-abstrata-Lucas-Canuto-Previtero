package sptech.school;

public class Quadrado extends Figura {
    private Double lado;


    public Double getLado() {return lado;}
    public void setLado(Double lado) {this.lado = lado;}

    @Override
    public Double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public String toString(){
        return "Lado do quadrado: " + this.lado + "\nÁrea da figura: " + calcularArea();

    }
}
