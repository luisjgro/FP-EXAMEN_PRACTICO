package examen_practico_3;

import java.util.Scanner;

public class EXAMEN_PRACTICO_3 {

    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);

        int totalEstudiantes; // Variable para almacenar la cantidad de estudiantes

        // Validar que la cantidad de estudiantes sea mayor a 0
        do {
            System.out.print("Por favor, ingrese la cantidad de estudiantes: ");
            totalEstudiantes = captu.nextInt();

            if (totalEstudiantes <= 0) {
                System.out.println("La cantidad debe ser mayor a 0.");
            }
        } while (totalEstudiantes <= 0);

        // Crear un arreglo para almacenar las notas de los estudiantes
        double[] notas = new double[totalEstudiantes];
        int indice = 0; // Índice para recorrer el arreglo

        // Ciclo para ingresar las notas de los estudiantes
        while (indice < totalEstudiantes) {
            System.out.print("Ingrese la nota del estudiante " + (indice + 1) + ": ");
            double nota = captu.nextDouble();

            // Validar que la nota esté en el rango permitido (0 a 100)
            if (nota < 0 || nota > 100) {
                System.out.println("Nota inválida. Debe estar entre 0 y 100.");
            } else {
                notas[indice] = nota; // Almacenar la nota en el arreglo
                indice++;
            }
        }

        // Calcular el promedio de las notas
        double promedioNotas = calcularPromedio(notas);

        // Encontrar la nota más alta
        double mayorNota = obtenerNotaMaxima(notas);

        // Encontrar la nota más baja
        double menorNota = obtenerNotaMinima(notas);

        // Contar la cantidad de estudiantes con notas iguales o superiores al promedio
        int estudiantesEncimaPromedio = contarEncimaPromedio(notas, promedioNotas);

        // Imprimir los resultados
        System.out.println("-----RESULTADOS-----");
        System.out.println("Promedio de notas: " + promedioNotas);
        System.out.println("Cantidad de estudiantes con notas mayores al promedio: " + estudiantesEncimaPromedio);
        System.out.println("Nota más alta: " + mayorNota);
        System.out.println("Nota más baja: " + menorNota);
    }

    public static double calcularPromedio(double[] notas) {
        double sumaNotas = 0; // Variable para almacenar la suma de las notas

        // Sumar todas las notas
        for (double nota : notas) {
            sumaNotas += nota;
        }

        // Dividir la suma por la cantidad de notas
        return sumaNotas / notas.length;
    }

    public static double obtenerNotaMaxima(double[] notas) {
        double maxima = notas[0]; // Asumir que la primera nota es la más alta inicialmente

        // Recorrer el arreglo para encontrar la nota más alta
        for (double nota : notas) {
            if (nota > maxima) {
                maxima = nota;
            }
        }
        return maxima;
    }

    public static double obtenerNotaMinima(double[] notas) {
        double minima = notas[0]; // Asumir que la primera nota es la más baja inicialmente

        // Recorrer el arreglo para encontrar la nota más baja
        for (double nota : notas) {
            if (nota < minima) {
                minima = nota;
            }
        }
        return minima;
    }

    /**
     * Cuenta la cantidad de notas que son iguales o mayores al promedio.
     * @param notas Arreglo de notas.
     * @param promedio El promedio de las notas.
     * @return Cantidad de notas iguales o mayores al promedio.
     */
    public static int contarEncimaPromedio(double[] notas, double promedio) {
        int contador = 0; // Contador para las notas iguales o superiores al promedio

        // Contar las notas mayores o iguales al promedio
        for (double nota : notas) {
            if (nota >= promedio) {
                contador++;
            }
        }
        return contador;
    }
}
