//ini adalah nama class yang harus sesuai dengan nama filenya.Praktikum.java
public class Praktikum{
//dibawah ini adalah method utama yang akan dieksekusi oleh java
	public static void main(String[] args){
		int number1, number2, results; //Deklarasi variabel yang bertipe int
		boolean number; //deklarasi variabel number yang bertipe boolean
		number1 = 20; //pemberian nilai 20 pada variabel number1
		number2 = 10; //pemberian nilai 10 pada variabel number2
		
		results = number1 / number2; //proses perbandingan kedua variabel
			System.out.println(results); //output dari program
		results = number1 + number2;//proses penjumlahan keduan variabel
			System.out.println(results);//output dari program
		number = (20 != 10); //pernyataan boolean
			System.out.println(number);//output dari program
		number = (20 == 10); //pernyataan boolean
			System.out.println(number);//output dari program
	}
}