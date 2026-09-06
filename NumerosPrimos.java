// Número primo. Diseñar un programa que tome como entrada un número entero positivo y diga si es primo
// o no.
// • Descripción de entrada: un número entero positivo mayor o igual a 2 y menor o igual a
// 2000000.
// • Descripción de salida: prime o not prime, según el caso.
// • Ejemplo de entrada:
// 7
// • Ejemplo de salida:
// prime
// • Ejemplo de entrada 2:
// 2113
// • Ejemplo de salida 2:
// prime

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number < 2 || number > 2000000) {

            System.out.print(
                    "Please enter a positive integer greater than or equal to 2 and less than or equal to 2000000: ");

            number = scanner.nextInt();

            // Validate user data
            if (number >= 2 && number <= 2000000) {
                int count = 0;
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        count++;
                    }
                }

                if (count == 2) {
                    System.out.println("prime");
                } else {
                    System.out.println("not prime");
                }

            } else {
                System.out.println("Error! You add a 0, a negative number or bigger than 2000000, try again");
            }
        }
        scanner.close();

    }
}
