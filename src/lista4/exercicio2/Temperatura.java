package lista4.exercicio2;

import lista4.util.Lista;

import java.util.Random;

public class Temperatura {
    public static void main(String[] args) {
        Random random = new Random();

        Lista<Double> temperaturas = new Lista<Double>();
        System.out.println(temperaturas.toString());

        temperaturas.inserirInicio(random.doubles(-100, 100 ).findFirst().getAsDouble());
        System.out.println(temperaturas.toString());

        temperaturas.inserirFinal(random.doubles(-100, 100 ).findFirst().getAsDouble());
        System.out.println(temperaturas.toString());

        temperaturas.inserirQualquer(random.doubles(-100, 100 ).findFirst().getAsDouble(), 2);
        System.out.println(temperaturas.toString());

        temperaturas.removerInicio();

        temperaturas.removerFinal();

        temperaturas.removerQualquer(random.nextInt(6)+1);

        System.out.println(temperaturas.toString());
    }
}
