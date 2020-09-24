## Defina cada um dos item abaixo e apresente exemplos de aplicação
 - Recursividade direta
 - Recursividade indireta
 - Divisão e conquista
 - Busca binária e busca sequencial

##### Recursividade direta
Quando a função chama a si própria    
ex: Função fatorial
``` Java
public static int fatorial(int n) {
      return n < 0 ? 
            throw new IllegalArgumentException("N não pode ser negativo")
                (n == 1 || n == 0) ? 1 : n *  factorial(n - 1);
   }
```
##### Recursividade Indireta
Quando uma função A chama uma função B e essa por sua vez chama a Função A;  
ex:  calcular par ou impar
``` Java
//de uma forma bem complexa sem sentido :) 
public static boolean impar(int n) {
    return n == 0 ?  false: par(n-1);
}
public static boolean par(int i) {
    return m == 0 ? true : impar(n-1);
}
```
##### Divisão e conquista
Uma técnica em que se divide um problema grade em menores recursivamente até que o menor problema possa ser resolvido.
Ex: Busca Binária
``` Java
private static int buscaBinaria(int[] arr, int menor, int maior, int chave) {
		int media = (maior + menor) / 2;
		int meio = arr[media];
        
        return menor > maior ? -1:
            meio == chave ? media : 
                meio < chave ? buscaBinaria(arr, media+1, maior, chave) : buscaBinaria(arr, menor, media-1, chave);
	}
```
##### Busca Binária
Primeiro é necessário ordernar o vetor, depois disso divide em duas metades, caso o valor procurado seja menor que a média media do vetor repete o procedimento com essa metade até que sobrem apenas 2 itens. Caso não encontre o valor buscado não existe;
ex:
``` Java
   private static int buscaBinaria(int[] arr, int menor, int maior, int chave) {
   		int media = (maior + menor) / 2;
   		int meio = arr[media];
           
           return menor > maior ? -1:
               meio == chave ? media : 
                   meio < chave ? buscaBinaria(arr, media+1, maior, chave) : buscaBinaria(arr, menor, media-1, chave);
   	}
   ```
##### Busca sequencial
Percorre todo o array, ou lista, comparando o valor buscado com todos os itens.
``` Java
public int procura(int[] vetor, int elementoProcurado) {
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == elementoProcurado)
                 return i;
        }
        return -1;
 }
```

