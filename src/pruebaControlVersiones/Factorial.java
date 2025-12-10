package pruebaControlVersiones;

import java.util.Scanner;

public class Factorial {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

        System.out.print("Introduce un número entero mayor o igual que 0: ");
        int num = pedirNumero();

        if (num < 0) {
            System.out.println("ERROR: el número debe ser mayor o igual que 0.");
        } else {
            System.out.println("Has introducido el número: " + num);
        }
        
        System.out.println("RESULTADO - En versiones posteriores se calculará el factorial del número " + num);

        sc.close();
	}
	
	private static int pedirNumero() {
	    System.out.print("Introduce un número entero mayor o igual que 0: ");
	    return sc.nextInt();
	}
	
	private static long factorialRec(int n) {
	    if (n == 0 || n == 1) {
	      return 1;
	    }

	    return n * factorialRec(n - 1);
	}
}