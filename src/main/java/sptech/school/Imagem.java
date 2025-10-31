package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double areaTotal = 0.0;
        for (Figura figura : figuras){
            areaTotal+= figura.calcularArea();
        }

        return areaTotal;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figurasMaior20 = new ArrayList<>();

        for (Figura figura : figuras){
            if (figura.calcularArea() > 20){
                figurasMaior20.add(figura);
            }
        }

        return figurasMaior20;
    }


    public List<Figura> buscarQuadrados(){
        List<Figura> listaQuadrados = new ArrayList<>();

        for (Figura figura : figuras){
            if (figura instanceof Quadrado){
                listaQuadrados.add(figura);
            }
        }

        return listaQuadrados;
    }






}
