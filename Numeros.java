import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        System.out.println("Números del 1 al 100 (while):");
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n\nNúmeros del 1 al 100 (for):");
        for (int j = 1; j <= 100; j++) {
            System.out.print(j + " ");
        }

        System.out.println("\n\nNúmeros del 1 al 100 divisibles entre 2 y 3:");
        for (int k = 1; k <= 100; k++) {
            if (k % 2 == 0 && k % 3 == 0) {
                System.out.print(k + " ");
            }
        }

        System.out.println("\n\nVerificación de número mayor o igual a cero:");
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un número mayor o igual a cero: ");
            numero = scanner.nextInt();
        } while (numero < 0);
        System.out.println("Número ingresado: " + numero);
    }
}
