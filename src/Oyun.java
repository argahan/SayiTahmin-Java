import java.util.Random;
import java.util.Scanner;
public class Oyun {
	public static void Baslat(){
	
	Scanner input=new Scanner(System.in);
	Random randomNum=new Random();
	
	int randomSayi=randomNum.nextInt(99)+1;
	int tahmin,adim=0;
	boolean durum=true;
	
	
	
	while(durum){
		System.out.print("Tahmininizi giriniz: ");
		tahmin=input.nextInt();
		
		if(tahmin<randomSayi){
			System.out.println("Tahmininiz sayidan küçüktür.");
			adim++;
		}
		else if(tahmin>randomSayi){
			System.out.println("Tahmininiz sayidan Büyüktür.");
			adim++;
		}
		else{
			adim++;
			System.out.println("tebrikler buldunuz.");
			System.out.println("sayi="+tahmin);
			System.out.println(adim+". adimda buldunuz.");
			durum=false;
		}
	}
	
	}
}
