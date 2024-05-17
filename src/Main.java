import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\Mañana\\Downloads\\lista_alumnos (1).csv";
        int numEstudiantes = 0; 
        int sumaEdades = 0; 
        double sumaNotas = 0; 
        double notaMaxima = Double.MIN_VALUE; 
        double notaMinima = Double.MAX_VALUE; 

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            // Leer cada línea del archivo
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] datos = line.split(","); 
                if (!datos[0].equals("nombre")) { 
                    numEstudiantes++; 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
