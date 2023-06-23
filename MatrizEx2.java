/* Faça uma função que receba uma matriz 10x10 de números inteiros e um número inteiro e retorne a quantidade de vezes
que o número recebido aparece na matriz. */

package VetorMatriz;
import java.util.Scanner;
public class MatrizEx2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int linha=2, coluna=2;
            int [][] matriz = new int[linha][coluna];
            for (int i = 0; i <linha ; i++) {
                for (int j = 0; j <coluna ; j++) {
                    System.out.println("Digite o valor da matriz: ");
                    int valor = scan.nextInt();
                    matriz[i][j] = valor;
                }
            }
            System.out.println("Digite um numero: ");
            int num = scan.nextInt();
            int quantidadeD = funcao(matriz,num);
            System.out.println("Quantidade que "+num +" Aparece no vetor é: "+quantidadeD);
        }
        public static int funcao (int [][] matriz, int num){
            int vezes=0;
            for (int i = 0; i <matriz.length; i++) {
                for (int j = 0; j <matriz.length ; j++) {
                    if(matriz[i][j]==num){
                        vezes++;
                    }
                }
            }
            return vezes;
        }
    }