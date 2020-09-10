package lista1.exercicio1;

import java.util.Random;

/**
 * Carregar um vetor[100] real de valores de saldos. Calcular e exibir:
 * a) Média dos saldos positivos entre 100 à 1000
 * b) Média geral dos saldos
 * c) Soma dos saldos negativos
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Random random = new Random();
        double[] arr = new double[100];
        double avgPos = 0;
        double avgAll = 0;
        double sumNeg = 0;
        int countPos = 0;
        for (double index : arr) {
            index = random.nextDouble() * (random.ints(-100000, (100000 + 1)).findFirst().getAsInt());
            System.out.printf("%.2f\n", index);
            if (index < 0) {
                sumNeg += index;
            }
            if (index >= 100 && index <= 1000) {
                avgPos += index;
                countPos++;
            }
            avgAll += index;
        }
        avgPos /= countPos;
        avgAll /= arr.length;

        System.out.printf("Média dos valores positivos entre 100 e 1000: %.2f\nMédia total: %.2f\nSoma dos negativos: %.2f\n\n", avgPos, avgAll, sumNeg);

    }
}