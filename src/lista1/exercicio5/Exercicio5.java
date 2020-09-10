package lista1.exercicio5;

import java.util.Scanner;

/**
 * Criar e carregar uma matriz [4x4] inteiro, onde os valores da diagonal
 * principal serão carregados pela aplicação conforme grafico abaixo e os demais
 * serão digitados pelo usuário
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    matriz[i][j] = (int) Math.pow(3, i);
                } else {
                    matriz[i][j] = sc.nextInt();
                }
            }
        }

        for (int[] row : matriz) {
            for (int cel : row) {
                System.out.print(cel + " ");
            }
            System.out.println();
        }

    }
}