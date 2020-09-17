package lista4.exercicio1;

import lista4.util.Lista;

import java.util.Random;

public class Temperatura {
    public static void main(String[] args) {
        Random random = new Random();
        Double temperatura =  random.doubles(-100, 100 )
                .findFirst()
                .getAsDouble();

        Lista<Double> temperaturas = new Lista<>();
        System.out.println("Lista vazia?" + temperaturas.listaVazia());

        temperaturas.inserirInicio(temperatura);
        temperaturas.inserirInicio(temperatura);
        temperaturas.inserirInicio(temperatura);
        temperaturas.inserirInicio(temperatura);
        temperaturas.inserirInicio(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirFinal(temperatura);
        temperaturas.inserirQualquer(temperatura, 2);
        temperaturas.inserirQualquer(temperatura, 2);
        temperaturas.inserirQualquer(temperatura, 2);
        temperaturas.inserirQualquer(temperatura, 2);
        temperaturas.inserirQualquer(temperatura, 2);
        temperaturas.removerInicio();
        temperaturas.removerInicio();
        temperaturas.removerInicio();
        temperaturas.removerInicio();
        temperaturas.removerInicio();
        temperaturas.removerFinal();
        temperaturas.removerFinal();
        temperaturas.removerFinal();
        temperaturas.removerFinal();
        temperaturas.removerFinal();
        temperaturas.removerQualquer(random.nextInt(6)+1);
        temperaturas.removerQualquer(random.nextInt(6)+1);
        temperaturas.removerQualquer(random.nextInt(6)+1);
        temperaturas.removerQualquer(random.nextInt(6)+1);
        temperaturas.removerQualquer(random.nextInt(6)+1);

        temperaturas.toString();
    }
}
