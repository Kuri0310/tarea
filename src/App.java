import java.util.Scanner;

public class App {

    public static int num1;
    public static int num2;
    public static int num3;

    //Moisés Francisco Flores Arias, 2024-1371U
    
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        //lectura de los numeros

        do {

            try {
                System.out.println("Ingrese tres numeros enteros diferente.");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                num3 = leer.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ingrese valores correctos");
                leer.nextLine();
            }

        } while (num1 == num2 || num1 == num3 || num2 == num3);

        //Sumatoria de los numeros pequeños 
        int small1 = Math.min(num1, Math.min(num2, num3));
        int small2 = Math.max(Math.min(num1, num2), Math.min(num2, num3));

        int sumSmall = small1 + small2;

        System.out.println("La sumatoria de los numeros mas pequeños es: " + sumSmall);

        //la diferencia de los numeros grandes
        int larger1 = Math.max(num1, Math.max(num2, num3));
        int larger2 = Math.min(Math.max(num1, num2), Math.max(num2, num3));

        int diffLarge = larger1 - larger2;
        System.out.println("La diferencia de los 2 numeros grandes es: " + diffLarge);

        //El numero mayor de los tres numeros
        if (num1>num2 && num1>num3) {
            System.out.println("El numero mayor es: " + num1);
        
        } else if (num2>num1 && num2> num3) {
            System.out.println("El numero mayor es: "+ num2);
        
        } else if (num3>num1 && num3>num2) {
            System.out.println("El numero mayor es: " + num3);
        }

    }
}
