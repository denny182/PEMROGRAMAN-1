import java.io.*;

public class TryCacthException {
    static BufferedReader input =new BufferedReader (new InputStreamReader( System.in));
	public static void main(String [] args) {
	   try{
	       System.out.println("Choose on of the options,(1-3) " + "\n\t1.)steak" + "\n\t2.)Lobster" + "n\t3.) Cheesburger");
		   System.out.println("Masukan pilihan anda : ");
		   String choose =input.readLine();
		   if(choose.equals("1")){
		       System.out.println("Anda  memilih steak :-)");
		   }else if(choose.equals("2")){
		       System.out.println("Anda  memilih Lobster:-D");
		   }else if(choose.equals("3")){ 
		       System.out.println("Anda  memilih cheesburger ;-)");
		   }else{
		       throw new Exception("pilihan anda tidak ada !");
		   }
        }catch (Exception e) {
 		    System.out.println(e.getMessage());
		}
	}
}

	