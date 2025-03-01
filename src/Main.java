import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int max = 3;
        int min = 1;
        int Anum = 0;
        int Dinero = 0;
        boolean jugando = true;
        String respuesta;

        System.out.println("Bienvenido al casino, la maquina te dara entre 3 números");
        System.out.println("el 1 te duplica tu dinero");
        System.out.println("el 2 divide tu dinero a la mitad");
        System.out.println("el 3 te hace perder tu dinero");
        System.out.println(" ");

            System.out.println("Ingresa la cantidad de dinero que quieras apostar");
            Scanner num = new Scanner(System.in);
            Dinero = num.nextInt();
            System.out.println("comencemos el juego");

        while (jugando) {

            Random rNum = new Random();
            Anum = rNum.nextInt(max - min + 1) + min;


            System.out.println("la maquina genero el número " + Anum);

            if (Anum == 1) {
                Dinero = Dinero * 2;
                System.out.println("Su dinero ha sido duplicado");
                System.out.println("tu dinero ahora es:" + Dinero);
                System.out.println("quieres seguir jugando ?");
                respuesta = num.next();
                if (respuesta.equals("no")) {
                    System.out.println("gracias por jugar");
                    jugando = false;
                } else {
                    jugando=true;

                }
            }
            else if (Anum == 2) {
                Dinero = Dinero / 2;
                System.out.println("su dinero ha sido dividido a la mitad");
                System.out.println("tu dinero ahora es:" + Dinero);
                System.out.println("quieres seguir jugando ?");
                respuesta = num.next();
                if(respuesta.equals("no")) {
                    System.out.println("gracias por jugar");
                    jugando = false;
                }
                else{
                    jugando = true;
                }
            }
            else if (Anum == 3) {
                Dinero = 0;
                System.out.println("has perdido tu dinero");
                break;
            }
        }
    }
}