/* Implemente uma função que recebe por parâmetro uma matriz 10x10 de números
inteiros e mostre na tela os elementos da diagonal principal */

package VetorMatriz;
import java.util.Scanner;
public class MatrizEx3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int linha = 3, coluna = 3;
            int[][] matriz = new int[linha][coluna];
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    System.out.println("Digite os valores da matriz ");
                    int valor = scan.nextInt();
                    matriz[i][j] = valor;
                }
            }
            funcao(matriz);
        }
        public static int funcao(int [][] matriz){
            for (int i = 0; i < matriz.length; i++) {
                int soma=0;
                for (int j = 0; j < matriz[i].length; j++) {
                    soma= soma +matriz[i][j];
                }
                System.out.println("Soma das linhas "+i+" é: "+soma);
            }
            return 0;
        }
    }