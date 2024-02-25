package mukemmelSayi;

import java.util.Scanner;

public class mukemmelSayi {

	public static void main(String[] args) {

		int sayi,i,toplam;		
		Scanner input = new Scanner(System.in);

		while (true) {
			
			toplam=0;
			System.out.print("Bir sayı giriniz: ");
			sayi = input.nextInt();
			
			if (sayi>=1) {
				
				for (i=1 ; i<sayi ; i++) {
					if(sayi%i==0) toplam=toplam+i; 
				}
				
				if (toplam==sayi) System.out.println(sayi+" Mükemmel sayıdır.\n\n");
				else System.out.println(sayi+" Mükemmel sayi değildir.\n\n");					
			}
			
			else System.out.println("Pozitif tam sayı giriniz. \n\n");
	
		}
	}
}
