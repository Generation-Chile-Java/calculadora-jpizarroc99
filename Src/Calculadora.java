import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //Solicitud de números
        System.out.println("Ingresa un número: ");
        double n1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double n2 = scanner.nextDouble();

    //Opereciones
        double suma = n1 + n2;
        double resta = n1 - n2;
        double multiplicacion = n1 * n2;
        double division  =(n2 != 0) ? n1 /n2: 0;
        double restoDiv =(n2 != 0) ? n1%n2: 0;

    //Resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación; " + multiplicacion);
    //División//
    if (n1 != 0){
        System.out.println("División; " + division);
        System.out.println("Resto:"+ restoDiv);}
    else {
        System.out.println("No se puede dividir entre cero");}
    scanner.close();
    }
}