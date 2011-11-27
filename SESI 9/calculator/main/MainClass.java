package main;

import java.io.*;
import service.CalculatorService;
import service.impl.CalculatorServiceImpl;

public class MainClass{
	public static void main (String[] args){
	BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
	String n="y";
 	do{
			
	try {
		String z;
		int x, y;
		CalculatorService service = new CalculatorServiceImpl();
		System.out.println("___________________________________________________" );
		System.out.println("\nNama	: Irvan Abdurrahman | 4510210003" );
		System.out.println("Tanggal	: 16 November 2011" );
		System.out.println("Program	: Calculator" );
		System.out.println("___________________________________________________" );
			System.out.print("\nMasukkan Bilangan 1 : " );
			x = Integer.parseInt(input.readLine());
			System.out.print ("Masukkan Bilangan 2 : " );
			y = Integer.parseInt(input.readLine());
			System.out.print ("Masukkan Operator (+,-,*,/) : ");
			z = input.readLine();
			if(z.equals("+")){
			  	Integer a = service.tambah(x,y);
				System.out.println(x+" + "+y+" = "+a);
			}else if(z.equals("-")){
				Integer a = service.kurang(x,y);
				System.out.println(x+" - "+y+" = "+a);
			}else if(z.equals("*")){
				Integer a = service.kali(x,y);
				System.out.println(x+" * "+y+" = "+a);
			}else if(z.equals("/")){
				Integer a = service.bagi(x,y);
				System.out.println(x+" / "+y+" = "+a);
			}else{
				throw new Exception ("Pilihan Anda tidak ada !");
			}
			System.out.print("Apakah Anda mau Mengulang kembali (y/n) ?: ");
			n = input.readLine();
			}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}while(n.equals ("y"));
		
	}
}