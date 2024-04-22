import java.util.Scanner;

public class CalculadoraIMC2_0 {

   
    
    public static void main(String[] args) {

    
        Scanner scanner = new Scanner(System.in);

        System.out.println("VERSION 2.0");
        
        System.out.println("Calculadora de Índice de Masa Corporal (IMC)");
        System.out.println("Ingrese su peso en kilogramos:");
        double peso = scanner.nextDouble();
        
        System.out.println("Ingrese su altura en centímetros:");
        double altura = scanner.nextDouble();
        
        double imc = calcularIMC(peso, altura);
        
        System.out.println("Su IMC es: " + imc);
        System.out.println("Interpretación del IMC:");
        interpretarIMC(imc);
        
        scanner.close();
    }
    
    public static double calcularIMC(double peso, double altura) {
        // Fórmula para calcular el IMC: peso / (altura * altura)
        return peso / (altura * altura);
    }
    
    public static void interpretarIMC(double imc) {
        if (imc < 18.5) {
            System.out.println("Tiene bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Tiene peso normal, en la media");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Tiene Sobrepeso");
        } else {
            System.out.println("Tiene Obesidad , busque ayuda nutricional");
        }
    }
}