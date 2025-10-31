package sptech.school;

public class Circulo extends Figura{
    private Double raio;

    public Circulo() {
    }

    public Double getRaio() {return raio;}
    public void setRaio(Double raio) {this.raio = raio;}

    @Override
    public Double calcularArea() {
        return Math.PI * (Math.pow(raio, 2));
    }

    @Override
    public String toString(){
        return "Raio do círculo: " + this.raio + "\nÁrea do círculo: " + calcularArea();
    }
}
