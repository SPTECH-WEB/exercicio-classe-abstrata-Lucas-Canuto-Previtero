package sptech.school;

public class Retangulo extends Figura{
    private Double altura;
    private Double base;

    public Double getAltura() {return altura;}
    public Double getBase() {return base;}

    public void setAltura(Double altura) {this.altura = altura;}
    public void setBase(Double base) {this.base = base;}

    @Override
    public Double calcularArea() {
        return this.altura * this.base;
    }

    @Override
    public String toString(){
        return "Base do retângulo: " + this.base + "\nAltura do retângulo: " + this.altura + "\nÁrea do trângulo: " + calcularArea();
    }
}
