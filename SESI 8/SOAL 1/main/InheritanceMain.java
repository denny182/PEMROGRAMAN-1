package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employee;
import model.student;

public class InheritanceMain{

       public static void main(String[]args) throws
	   ParseException{
	        student s = new student();
			s.setNim("12101011");
			s.setNama("Dadang Iswanto");
			s.setAlamat("Jl.Taman bung no. 2");
			s.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("20-06-1990"));
			s.setNoHp("081122334455");
			
			
			
			Employee e = new Employee();
			e.setNip("21100989");
			e.setNama("Adi Sulistiono");
			e.setAlamat("Jl.Asem Jajar no.6");
			e.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("13-06-1986"));
			e.setNoHp("085210831766");
			
			showData(s);
			System.out.println("\n=======================================\n");
			showData(e);
	   }
	   
	   
	   static void showData(student s) {
	        System.out.println("Class student");
			System.out.println("NIM : " + s.getNim());
			System.out.println("Nama : " + s.getNama());
			System.out.println("Alamat : " + s.getAlamat());
			System.out.println("Tgl Lahir: " + new
			SimpleDateFormat("dd MMMMM yyyy").format(s.getTglLahir()));
			System.out.println("No HP : " + s.getNoHp());		   
	   }
	   
	   static void showData(Employee e ) {
	        System.out.println("Class Employee");
	        System.out.println("NIP: " + e.getNip());
	        System.out.println("Nama : " + e.getNama());
	        System.out.println("Alamat: " + e.getAlamat());
	        System.out.println("Tgl Lahir: " + new
	        SimpleDateFormat("dd MMMMM yyyy").format(e.getTglLahir()));
	        System.out.println("No HP : " + e.getNoHp());
	   }
}