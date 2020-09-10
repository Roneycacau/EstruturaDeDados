package lista1.exercicio2;

import java.util.Random;

/**
 * Carregar um vetor[5] inteiro. Enviar cada elemento para uma função e esta irá
 * retornar o seu fatorial que será armazenado em um outro vetor
 * Exibir os dados dos vetores
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] arrInt = new int[5];
        int[] arrFat = new int[5];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = r.nextInt(10);
            arrFat[i] = factor(arrInt[i]);
        }

        System.out.println("Vetor inteiro");
        printResult(arrInt);
        System.out.println("Vetor fatorial");
        printResult(arrFat);
    }

    public static int factor(int n) {
        return n==0 ? 1 : n * factor(n-1);
    }

    public static void printResult(int[] arr){
        for(int data : arr){
            System.out.print(data + " ");
        }
        System.out.println();
    }
}