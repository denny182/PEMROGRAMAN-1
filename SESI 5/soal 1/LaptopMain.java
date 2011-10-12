import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

	public class LaptopMain {
		public static void main(String[] args) {
		File file = new File("F:/PANCASILA/SEMESTER 3/PEMROGRAMAN_1/SESI 5/soal 1/Laptop.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		List<Laptop> listLaptop = new ArrayList<Laptop>();
		
		try{
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);

			while(dis.available() !=0){
				//memecah text perbaris menjadi beberapa kolom sesuai dengan pemisah koom
				String line = dis.readLine();
				String[] data = line.split(",");
				
				Laptop l = new Laptop();
				l.setMerk(data[0]);
				l.setProcessor(data[1]);
				l.setHarga(data[2]);
				
				listLaptop.add(l);
				
			}
			} catch (IOException ex) {
				System.out.println("File " + file.getName() + " tidak ketemu !");
				System.out.println("Exception : " + ex.getMessage());
				}
				
				for (Laptop lp : listLaptop) {
				System.out.println("===============================");
				System.out.println("Merk : " + lp.getMerk());
				System.out.println("Processor : " + lp.getProcessor()) ;
				System.out.println("Harga : " + lp.getHarga());
				}
			}
		}
		