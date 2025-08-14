import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        var number = scanner.nextInt();

        System.out.print("\nTabuada do " + number + ":");

        for(var i = 1; i <= 10; i++) {
            var result = number * i;
            System.out.println(number + "x" + i + "=" + result);
        }
    }
}
