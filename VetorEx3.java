/*Faça um programa em java modularizado que preencha um vetor de 10 posições com valores inteiros recebidos pelo teclado e,
em seguida, mostre os valores na ordem inversa da que foram digitados.*/

package VetorMatriz;
import java.util.Scanner;
public class VetorEx3 {
    public static void main(String[] args) {
        int[] vet = new int[10];
        modulo(vet); //chamar modulo
    }
    public static void modulo(int[] vet) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os valores: ");
        for (int i = 0; i < vet.length; i++) {
            int valor = scan.nextInt();
            vet[i] = valor;
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(vet[i]);
        }
    }
}