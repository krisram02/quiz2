
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Kristin
 */
public class userTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner scanner = new Scanner(System.in);
            
            
            System.out.println("CALCULADORA DE RECTANGULO");
            System.out.println("--------------------------");
            System.out.print("Ingrese el ancho del rectángulo: ");
            int ancho = scanner.nextInt();
            
            System.out.println("--------------------------");
            System.out.print("Ingrese la altura del rectángulo: ");
            int altura = scanner.nextInt();

            Rectangulo rectangulo = new Rectangulo(ancho, altura);
            int area = rectangulo.calcularArea();

            System.out.println("El área del rectángulo es: " + area);
        } catch (RectanguloExcep e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
    
