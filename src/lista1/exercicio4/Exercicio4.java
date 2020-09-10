package lista1.exercicio4;

import java.math.BigDecimal;
import java.util.Random;


/**
 * Carregar uma matriz[4x4 inteiro]. apresentar: a) Soma dos valores no
 * intervalo 1 a 100 b) Quantidades de números impares entre 30 e 50 c)
 * Quantidade de números divisiveis por 8 d) Quantidade de números impares
 * divisiveis por 3 e) Fatorial do maior número informado na matriz
 */
public class Exercicio4 {
    static int[][] matriz = new int[4][4];

    public static void main(String[] args) {
        int max;
        loadMatrix();
        printMatrix();
        
        System.out.println("Soma dos valores no intervalo 1 a 100: " + sum1to100());
        System.out.println("Quantidades de números impares entre 30 e 50: " + countOdd30To50());
        System.out.println("Quantidade de números divisiveis por 8: " + count8());
        System.out.println("Quantidade de números impares divisiveis por 3: " + oddDivibleBy3());
        max = max();
        System.out.println("Fatorial do maior número informado na matriz: " + factor(max));
    }

    public static void loadMatrix() {
        Random r = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = r.ints(-200, (200 + 1)).findFirst().getAsInt();
            }
        }
    }

    public static void printMatrix() {
        for (int[] row : matriz) {
            for (int cel : row) {
                System.out.print(cel + " ");
            }
            System.out.println();
        }
    }

    public static int sum1to100() {
        int sum = 0;
        for (int[] row : matriz) {
            for (int cel : row) {
                if (cel > 0 && cel <= 100) {
                    sum += cel;
                }
            }
        }
        return sum;
    }

    public static int countOdd30To50() {
        int count = 0;
        for (int[] row : matriz) {
            for (int cel : row) {
                if (cel >= 30 && cel <= 50) {
                    if (odd(cel))
                        count++;
                }
            }
        }
        return count;
    }

    public static int count8() {
        int count = 0;
        for (int[] row : matriz) {
            for (int cel : row) {
                if (divisibleBy(cel, 8))
                    count++;
            }
        }
        return count;
    }

    public static int oddDivibleBy3() {
        int count = 0;
        for (int[] row : matriz) {
            for (int cel : row) {
                if (odd(cel) && divisibleBy(cel, 3)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean odd(int num) {
        return num % 2 != 0;
    }

    public static boolean divisibleBy(int dividend, int divider) {
        return dividend % divider == 0;
    }

    public static int max(){
        int max = Integer.MIN_VALUE;
        for (int[] row : matriz) {
            for (int cel : row) {
                max = cel > max ? cel : max;
            }
        }
        return max;
    }

    public static BigDecimal factor(int max) {
        BigDecimal fat = new BigDecimal(1);
        for (int i = max; i > 1; i--)
            fat = fat.multiply(new BigDecimal(i));
        return fat;
    }
}