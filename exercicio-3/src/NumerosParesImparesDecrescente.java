import java.util.Scanner;

public class NumerosParesImparesDecrescente {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        var num1 = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        var num2 = scanner.nextInt();

        if (num2 <= num1) {
            System.out.print("Erro: o segundo número deve ser maior que o primeiro.");
            return;
        }

        System.out.print("Você deseja ver os números pares ou ímpares? (par/ímpar): ");
        var escolha = scanner.next().toLowerCase();

        System.out.println("Números " + escolha + "entre " + num1 + "e " + num2 + " (ordem decrescente): ");

        for ( var i = num2; i >= num1; i--) {
            if(escolha.equals("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha.equals("impar") && i % 2 != 0){
                System.out.println(i);
            } 
        }
    }
}
