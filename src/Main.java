import java.util.Random;

public class Main {
    public static void main(String[] args){
        int max = 10;
        int min = 1;
        int numR;

        Random aleR = new Random();

        numR = aleR.nextInt((max - min + 1)) + min;
        System.out.println("el número de rondas es " + numR);

        System.out.println("los valores del dado 1 son:");

        int maxDado1 = 6;
        int minDado1 = 1;
        int numD1;

        int maxDado2 = 6;
        int minDado2 = 1;
        int numD2;

        int sumdado1 = 0, sumdado2 = 0;

        boolean dado1 = true;
        int veces1= 0;
        while (dado1) {
            numD1 = aleR.nextInt((maxDado1 - minDado1 + 1)) + minDado1;
            sumdado1 +=numD1;
            System.out.println("D1: " + numD1);

            veces1++;
            if (veces1 >= numR) {
                dado1 = false;

                System.out.println("los valores del dado 2 son:");


                boolean dado2 = true;
                int veces2 = 0;
                while (dado2) {
                    numD2 = aleR.nextInt((maxDado2 - minDado2 + 1)) + minDado2;
                    sumdado2 +=numD2;
                    System.out.println("D2: " + numD2);
                    veces2++;

                    if (veces2 >= numR) {
                        dado2 = false;

                        }
                    }
                }
            }

        System.out.println("la suma de los primeros dados es: " + sumdado1);
        System.out.println("la suma de los segundos dados es: " + sumdado2);
        if(sumdado1 > sumdado2){
            System.out.println("dado uno gano");
        }
        else{
            System.out.println("el dado dos gano");
        }
    }
    }

