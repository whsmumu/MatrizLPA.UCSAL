package VetorMatriz;
import java.util.Scanner;
public class MatrizEx1 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linha = 3;
        int coluna = 3;
        int somaD =0;
        int somaImp=0;
        int[][] matriz = new int[linha][coluna];

        //atribuir valor cada posicao da matriz
        for (int i = 0; i <linha ; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Digite o valor da matriz:");
                matriz[i][j] = scan.nextInt();
            }
        }
        //apresentar matriz
        for (int i = 0; i <linha ; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.print("\n");
        }
        //mostrar numeros da diagonal
        for(int i = 0; i<linha; i++){
            System.out.println("Diagonal é: ["+matriz[i][i]+"]");
        }
        //somar diagonal
        for (int i = 0; i <linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i==j){
                    somaD = somaD + matriz[i][j];
                }
            }
        }
        System.out.println("Soma dos numeros na diagonal é: "+somaD);

        //mostrar e calcular valores impares
        for (int i = 0; i <linha ; i++) {
            for (int j = 0; j <coluna ; j++) {
                if(matriz[i][j]%2==1){
                    System.out.print("Numeros impares da matriz é: "+matriz[i][j]);
                    System.out.print("\n");
                    somaImp=somaImp+matriz[i][j];
                }
            }

        }
            System.out.print("A soma dos numeros impares é: "+somaImp);
        }
}
