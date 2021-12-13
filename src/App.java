import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
        
        //Variaveis
        int valor = 0;
        int[] cedulas = new int[]{200, 100, 50, 20, 10, 5, 2, 1};
        int[] numeroCedulas = new int [8];

        //Leitura
        System.out.println("Sistema bancário");
        System.out.println("Digite o valor de saque: ");
        valor = scan.nextInt();
        
        //Tratamento caso o usuário digite um número menor que 0
        while (valor < 0) {
            System.out.println("Valor inválido, digite um novo valor: ");
            valor = scan.nextInt();
        }

        //Cáculo das cédulas
        while (valor != 0) {
            for (int i = 0; i < 8; i++) {
                if (valor >= cedulas[i]) {
                    numeroCedulas[i] = valor / cedulas[i];
                    valor = valor - numeroCedulas[i] * cedulas[i];
                }
            }
        }
        
        //Resultados
        System.out.println("\n");
        for (int j = 0; j < 8; j++) {
            System.out.println("Nota(s) de R$" + cedulas[j] + ",00: " + numeroCedulas[j]);
        }
    }
}
