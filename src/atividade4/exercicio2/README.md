## Dado o algoritmo Quick Sort, explique o funcionamento de cada método abaixo, implemente o algoritmo e simule a sua execução para o seguinte domínio de entrada: [11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82, 42, 55, 78]
---
#### public static void mergeSortRecursivo(int[] lista, int inicio, int fim)  
Método recursivo que separa o vetor em 2 até que o vetor tenha apenas 1 item.
É também o método responsável por chamar o merge para recriar o vetor ordenado.
Compara o inicio com o fim é a instrução de parada;
encontra o meio do vetor e passa as duas metades como novo vetor, do inicio ao meio e do meio+1 ao fim;
E passa para o método mesclar o vetor os dois inícios - inicio e meio - e os dois fins - meio +1 e fim.

---
#### public static void mesclar(int lista[], int inicioA, int fimA, int inicioB, int fimB)
Método responsável pela ordenação e recriação do vetor separado pelo método merveSortRecursivo.
Cria variáveis auxiliares para iterar no vetor e um vetor auxiliar que irá receber o vetor ordenado.
O primeiro while vai ser executado até que se percorra todo o vetor pelos 2 lados - inicio ao meio e meio+1 ao fim;   
compara o vetor nos dois inicios e adiciona o menor valor no vetor auxiliar na posição seguinte ao inicioA o valor do vetor na posição seguinte ao i1 ou i2, a depender de quem for menor.   
O segundo e terceiro while vai copiar o vetor recebido para o vetor auxiliar.   
o for no final irá remontar o vetor completo.
---

## SIMULAÇÃO

![Alt Text](mergeSort.GIF)
