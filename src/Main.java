import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\Mañana\\Downloads\\lista_alumnos (1).csv"; // Ruta al archivo CSV
        int numEstudiantes = 0; // Variable para almacenar el número de estudiantes
        int sumaEdades = 0; // Variable para almacenar la suma de las edades
        double sumaNotas = 0; // Variable para almacenar la suma de las notas
        double notaMaxima = Double.MIN_VALUE; // Variable para almacenar la nota máxima, inicializada con el valor mínimo posible
        double notaMinima = Double.MAX_VALUE; // Variable para almacenar la nota mínima, inicializada con el valor máximo posible

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            // Leer cada línea del archivo
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Imprimir cada línea del archivo
                String[] datos = line.split(","); // Dividir la línea en datos separados por comas
                if (!datos[0].equals("nombre")) { // Omitir la primera línea que contiene encabezados
                    numEstudiantes++; // Incrementar el contador de estudiantes
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}