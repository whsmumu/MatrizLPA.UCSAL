/* Implemente uma função que recebe por parâmetro um vetor de números inteiros
e a quantidade de elementos do mesmo e informe a posição do maior número.*/

package VetorMatriz;
import java.util.Scanner;
public class VetorEx1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = scan.nextInt();
        int[] vet = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite os numeros: ");
            int num = scan.nextInt();
            vet [i] = num;
        }
        VerificaMaior(vet);
    }
    public static int VerificaMaior(int[] tamanho) {
        int x = 0;
        int i;
        for (i = 0; i < tamanho.length; i++) {
            if (x < tamanho[i]) {
                x = tamanho[i];
            }
        }
        System.out.println("Maior numero digitado foi: " + x + " posição " +(i-1));
        return x;
    }
}