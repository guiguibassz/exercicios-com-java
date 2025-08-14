import java.util.Scanner;

public class LoopDivisor {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Informe um número inicial: ");
        var numeroInicial = scanner.nextInt();

        var numeroAtual = 0;
        do {
            System.out.print("Informe outro número (ou um número que, dividido pelo inicial, tenha resto diferente de 0 para parar): ");
            numeroAtual = scanner.nextInt();

            if(numeroAtual < numeroInicial) {
                System.out.print("Número ignorado (menor que o inicial).");
                continue;
            }
        } while (numeroAtual % numeroInicial == 0);

        System.out.print("Execução encerrada. O número " + numeroAtual + " dividido por " + numeroInicial + " tem resto diferente de 0.");

    }
}
