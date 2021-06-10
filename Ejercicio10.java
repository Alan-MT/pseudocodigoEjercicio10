import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String args[]){
		Scanner sca = new Scanner(System.in);
		int multiplo6 = 0;
		int num = 0;
		int suma = 0;
		int sumam = 0;
		do {
			System.out.println("Ingrese un numero: ");
			num = sca.nextInt();
			suma = suma+num;
			if (num%6==0) {
				multiplo6 ++;
			}
			if (num<=10 && num>0) {
				sumam ++;
			}
		} while (suma<1000);
		System.out.println("Multiplo de 6: "+multiplo6);
		System.out.println("Suma de numero entre 1 y 10: "+sumam);
	}


}

