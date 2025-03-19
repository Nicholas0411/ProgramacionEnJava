import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1 = 0, num2 = 0;
        boolean validInput = false;

        // Solicita dos números flotantes con validación
        while (!validInput) {
            try {
                System.out.print("Ingresa el primer número: ");
                num1 = Float.parseFloat(scanner.nextLine());
                System.out.print("Ingresa el segundo número: ");
                num2 = Float.parseFloat(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Eso no parece un número válido. Intenta de nuevo.");
            }
        }

        // Muestra opciones de operaciones
        System.out.println("\n¿Qué operación te gustaría realizar?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Elevar ambos números al cuadrado");
        System.out.print("Elige una opción (1-5): ");
        int opcion = scanner.nextInt();

        float resultado;
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.printf("El resultado de la suma es: %.2f\n", resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.printf("El resultado de la resta es: %.2f\n", resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.printf("El resultado de la multiplicación es: %.2f\n", resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("El resultado de la división es: %.2f\n", resultado);
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;
            case 5:
                System.out.printf("El cuadrado de %.2f es: %.2f\n", num1, num1 * num1);
                System.out.printf("El cuadrado de %.2f es: %.2f\n", num2, num2 * num2);
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
        }

        System.out.println("Gracias por usar la calculadora. ¡Hasta la próxima!");
        scanner.close();
    }
}
