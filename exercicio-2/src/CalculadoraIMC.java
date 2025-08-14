import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // força uso de ponto como separador decimal

        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        var altura = scanner.nextDouble();

        System.out.print("Digite seu peso em kg (ex: 70.5): ");
        var peso = scanner.nextDouble();

        var imc = peso / (altura * altura);
        var resultado = "";

        if (imc <= 18.5) {
            resultado = "Abaixo do peso";
        } else if (imc <= 24.9) {
            resultado = "Peso ideal";
        } else if (imc <= 29.9) {
            resultado = "Levemente acima do peso";
        } else if (imc <= 34.9) {
            resultado = "Obesidade Grau 1";
        } else if (imc <= 39.9) {
            resultado = "Obesidade Grau 2 (Severa)";
        } else {
            resultado = "Obesidade Grau 3 (Mórbida)";
        }

        System.out.printf("Seu IMC é: %.2f - %s%n", imc, resultado);

        scanner.close();
    }
}
