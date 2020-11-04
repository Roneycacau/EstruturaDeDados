## Dado o algoritmo Quick Sort, explique o funcionamento de cada método abaixo, implemente o algoritmo e simule a sua execução para o seguinte domínio de entrada: [11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82, 42, 55, 78], realizando a ordenação escolhendo como pivô o elemento central.
 ---
#### public static void quickSort(int[] vet, int ini, int fim)
Método recursivo que separa o vetor a partir de um pivo enquanto inicio for menor que fim.
na primeira chamada desse método o inicio será o index 0 do vetor e o fim será o vetor.length-1 - o ultimo indice do vetor.
O processamento dos valores maiores ou menores que o vetor é feito pelo método particao.
---
#### public static int particao(int[] vet, int ini, int fim)
Onde a mágica acontece.  
Primeiro é definido o pivo, que nesse caso é será sempre o valor de ini;
Definimos os valores de i e f (ou i e j em uma notação mais clássica), que serão os valores que irão iterar em nosso vetor. i para valores que vão ficar a esquerda do pivô  e f para valores que irão para a direita do pivô;
e já definimos a variavel auxiliar para as trocas.

Enquanto i for menor iremos iterar no vetor.  
 - enquanto o vetor na posição i for menor que o pivô, incrementamos i.
 - enquanto o vetor na posição f for menor que o pivô, decrementamos f.
 
 e se i for menor que f tocamos os elementos do vetor nessas posições;
 
 depois de iterarmos no nosso vetor, verficiamos se valor inicial é diferente de f, se verdadeiro o vetor na posição inicial é trocado com a posição f e o valor no index f será o novo pivô;
 
 retornamos o valor de f que será usado nas próximas chamadas do método quicksort como novo valor de fim.

---

## SIMULAÇÃO

![Alt Text](quicksort.GIF)