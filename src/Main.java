import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double peso = 0;
        double estatura = 0;
        double IMC = 0;

        Scanner scaner = new Scanner(System.in);

        System.out.println("ingresa tu peso");
        peso = scaner.nextDouble();

        System.out.println("ingresa tu estatura");
        estatura = scaner.nextDouble();

        IMC = peso/(estatura*estatura);
        System.out.printf("Tu imc es de: " + IMC);
        System.out.println(" ");

        if(IMC < 18.5) {
            System.out.println("tienes bajo peso");
        }
        else if(IMC >= 18.5 & IMC <= 24.9) {
            System.out.println("tienes peso normal");
        }
        else if(IMC >= 25 & IMC <= 26.9) {
            System.out.println("tienes sobrepeso grado 1");
        }
        else if(IMC >= 27 & IMC <= 29.9) {
            System.out.println("tienes sobrepeso grado 2");
        }
        else if(IMC >= 30 & IMC <= 34.9) {
            System.out.println("tienes obesidad de tipo 1");
        }
        else if(IMC >= 35 & IMC <= 39.9) {
            System.out.println("tienes obesidad de tipo 2");
        }
        else if(IMC >= 40 & IMC <= 49.9) {
            System.out.println("tienes obesidad de tipo 3(mórbida)");
        }
        else {
            System.out.println("tienes obesidad de tipo 4(extrema)");
        }
    }
}