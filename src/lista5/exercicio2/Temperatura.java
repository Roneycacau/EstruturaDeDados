package lista5.exercicio2;

import lista5.util.Lista;

import java.util.Random;

public class Temperatura {
    public static void main(String[] args) {
        Random random = new Random();

        Lista<Double> temperaturas = new Lista<Double>();
        System.out.println(temperaturas.toString());

        temperaturas.inserirInicio(random.doubles(-100, 100 ).findFirst().getAsDouble());
        temperaturas.inserirInicio(random.doubles(-100, 100 ).findFirst().getAsDouble());
        temperaturas.inserirInicio(random.doubles(-100, 100 ).findFirst().getAsDouble());
        temperaturas.inserirInicio(random.doubles(-100, 100 ).findFirst().getAsDouble());

        temperaturas.inserirFinal(random.doubles(-100, 100 ).findFirst().getAsDouble());
        temperaturas.inserirFinal(random.doubles(-100, 100 ).findFirst().getAsDouble());
        temperaturas.inserirFinal(random.doubles(-100, 100 ).findFirst().getAsDouble());
        temperaturas.inserirFinal(random.doubles(-100, 100 ).findFirst().getAsDouble());
        temperaturas.inserirFinal(random.doubles(-100, 100 ).findFirst().getAsDouble());
        temperaturas.inserirFinal(random.doubles(-100, 100 ).findFirst().getAsDouble());
        temperaturas.inserirFinal(random.doubles(-100, 100 ).findFirst().getAsDouble());

        temperaturas.inserirQualquer(random.doubles(-100, 100 ).findFirst().getAsDouble(), random.nextInt(5)+1);
        temperaturas.inserirQualquer(random.doubles(-100, 100 ).findFirst().getAsDouble(), random.nextInt(5)+1);
        temperaturas.inserirQualquer(random.doubles(-100, 100 ).findFirst().getAsDouble(), random.nextInt(5)+1);
        temperaturas.inserirQualquer(random.doubles(-100, 100 ).findFirst().getAsDouble(), random.nextInt(5)+1);
        temperaturas.inserirQualquer(random.doubles(-100, 100 ).findFirst().getAsDouble(), random.nextInt(5)+1);
        temperaturas.inserirQualquer(random.doubles(-100, 100 ).findFirst().getAsDouble(), random.nextInt(5)+1);
        temperaturas.inserirQualquer(random.doubles(-100, 100 ).findFirst().getAsDouble(), random.nextInt(5)+1);
        temperaturas.inserirQualquer(random.doubles(-100, 100 ).findFirst().getAsDouble(), random.nextInt(5)+1);
        System.out.println("Fim dos Inserts\n");
        System.out.println(temperaturas.toString());

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
        System.out.println("Fim dos Remove\n");
        temperaturas.inserirFinal(21D);
        System.out.println(temperaturas.toString());
    }
}
