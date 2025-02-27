import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvanido al juego");
        System.out.println("Adivina el numero");

        int max = 50;
        int min = 1;
        int num;
        int intentos = 3;
        int unum;

        Random numAle = new Random();
        num=numAle.nextInt(max - min + 1) + min;
        System.out.println("escribe un numero entre 1 y 50");
        for (int i=0 ;i<intentos;){

            Scanner scanner = new Scanner(System.in);
            unum=scanner.nextInt();

            if (unum > num){
                System.out.println("el numero es menor");
                intentos--;
            } else if (unum < num) {
                System.out.println("el numero es mayor");
                intentos--;
            }else {
                System.out.println("el numero es correcto");
            }

        }
        System.out.println("te quedaste sin intentos, el numero era: " + num);
}
}

