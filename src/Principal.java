/*
 * Universidade Federal de Santa Catarina - UFSC
 * Departamento de Informática e Estatística - INE
 * Programa de Pós-Graduação em Ciências da Computação - PROPG
 * Disciplinas: Projeto e Análise de Algoritmos
 * Prof Alexandre Gonçalves da Silva 
 *
 * Baseado nos slides 28 da aula do dia 25/08/2017  e slide 5 de 01/09/2017
 *
 * Converte para Binário
 * Usando invariante de laços, provamos a corretude de um algoritmo que converte 
 * um número inteiro para a sua representação binária.
 *
 * Atenção:
 * Vetor em java inicia em 0, os algoritmos consideram início em 1.
 * A subtração de -1 ocorre somente no local de acesso ao vetor ou matriz 
 * para manter a compatibilidade entre os algoritmos.
 * 
 */

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class Principal {

    /**
     * Converte um valor inteiro para binário
     * @param n Um valor inteiro a ser convertido para binário
     * @return Um vetor com o representação binaria de n
     */
    public static int[] converterBinario(int n) {
        int t = n;
        //Tamanho do vetor
        int tamanho = (int) (Math.log10(n) / Math.log10(2))+1;
        //Vetor de retorno
        int[] b = new int[tamanho];
        int k = 0;
        while (t > 0) {
            k = k + 1;
            // Precisa gravar de trás para frente do vetor
            // Do contrário, precisará inverter ao final o 
            // vetor para encontrar o resultado
            //b[tamanho - 1 - k] = t % 2;
            b[k-1] = t % 2;
            t = t / 2;
        }
        return b;
    }

    public static void main(String[] args) {
        //Valor a ser convertido
        int n = 10;        
        
        //Vetor com o resultado da conversao
        int[] resultado = converterBinario(n);

        System.out.print("O valor:"+n+" em binário é:");    
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
        }
        System.out.println();
    }
}
