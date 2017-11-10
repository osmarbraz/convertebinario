/*
 * Universidade Federal de Santa Catarina - UFSC
 * Departamento de Informática e Estatística - INE
 * Programa de Pós-Graduação em Ciências da Computação - PROPG
 * Disciplinas: Projeto e Análise de Algoritmos
 * Prof Alexandre Gonçalves da Silva 
 * Baseado nos slides 93 da aula do dia 28/08/2017 
 * Converte para Binário
 * Usando invariante de laços, provamos a corretude de um algoritmo que converte 
 * um número inteiro para a sua representação binária.
 */

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class Principal {

    /**
     * Converte um valor inteiro para binário
     * @param n Um valor inteiro a ser convertido para binário
     * @return Um vetor com o valor n convertido para binário
     */
    public static int[] converterBinario(int n) {
        int t = n;
        //Tamanho do vetor
        int tamanho = (int) (Math.log10(n) / Math.log10(2)) + 1;
        //Vetor de retorno
        int[] b = new int[tamanho];
        int k = -1;
        while (t > 0) {
            k = k + 1;
            // Precisa gravar de trás para frente do vetor
            // Do contrário, precisará inverter ao final o 
            // vetor para encontrar o resultado
            b[tamanho - 1 - k] = t % 2;
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
