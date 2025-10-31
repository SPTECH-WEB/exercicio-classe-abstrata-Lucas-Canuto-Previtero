package sptech.school;

public class Triangulo extends Figura{
    private Double base;
    private Double altura;

    public Triangulo() {
    }

    public Double getBase() {return base;}
    public Double getAltura() {return altura;}

    public void setBase(Double base) {this.base = base;}
    public void setAltura(Double altura) {this.altura = altura;}

    @Override
    public Double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public String toString(){
        return "Base do triângulo: " + this.base + "\nAltura do triângulo: " + this.altura + "\nÁrea do triângulo: " + calcularArea();
    }
}
