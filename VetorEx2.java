/*Faça uma função que receba 2 vetores com 10 números inteiros cada um e gere um terceiro vetor
cujos elementos contém a soma dos elementos de mesmo índice dos outros dois vetores*/

package VetorMatriz;
import java.util.Scanner;
public class VetorEx2 {
        public static void main(String[] args) {
            int[] vet1 = new int[10];
            int[] vet2 = new int[10];
            funcao(vet1,vet2);
        }
        public static int funcao(int[] vet1, int[] vet2){
            int[] vet3 = new int[10];
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um numero para cada posição do primeiro vetor:");
            int contador;
            for (contador = 0; contador < vet1.length; contador++) {
                int valor = scan.nextInt();
                vet1[contador] = valor;
            }
            System.out.println("Digite um numero para cada posição do segundo vetor");
            for (int contador2 = 0; contador2 < vet2.length; contador2++) {
                int valor2 = scan.nextInt();
                vet2[contador2] = valor2;
            }
            for(int cont = 0; cont<vet3.length; cont++){
                vet3[cont] = vet1[cont]+vet2[cont];
                System.out.println("A soma do indice " +cont+ " com o mesmo indice " +cont+ " é: " +vet3[cont]);
            }
            return contador;
        }
}