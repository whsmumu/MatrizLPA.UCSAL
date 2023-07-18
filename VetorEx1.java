/* Implemente uma função que recebe por parâmetro um vetor de números inteiros
e a quantidade de elementos do mesmo e informe a posição do maior número.*/
import java.util.Scanner;

public class Praticar2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de elementos: ");
        int elementos = scan.nextInt();
        int[] number = new int[elementos];
        for (int contador = 0; contador < number.length; contador++) {
            System.out.println("Digite um numero: ");
            number[contador] = scan.nextInt();
        }
        int position=modulo(number, elementos);
        System.out.println("A posição do maior numero é: " +position);
    }
    public static int modulo(int[] number, int qntd) {
        if (qntd==0){
            return 0;
        }
        int MaiorNumero = 0;
        int Position=0;
        for (int contador = 0; contador < number.length; contador++) {
            if (MaiorNumero < number[contador]) {
                MaiorNumero = number[contador];
                Position = contador;
            }
        }
        System.out.println("Maior numero digitado foi: " + MaiorNumero + " na posição: " + (Position+1));
        return qntd;
    }
}
