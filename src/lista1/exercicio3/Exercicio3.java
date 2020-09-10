package lista1.exercicio3;

import java.util.Random;

/**
 * Carregar um vetor[100] inteiros positivos ou negativos.
 * Classificar esse vetor em ordem crescente e apresentar os valores
 */
public class Exercicio3 {

    static int[] arr = new int[100];
    public static void main(String[] args) {
        Random r = new Random();
        
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
            System.out.print(" " + arr[i] + " ");
        }
        
        sort(arr);
        System.out.println();
        for (int i : arr) {
            System.out.print(" " + i + " ");
        }
        
    }
    public static void sort(int[] arr) {
        boolean flag = true;
        while(flag){
            flag = false;
            int aux;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i]>arr[i+1]){
                    aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    flag = true;
                }
            }
        }
    }
}