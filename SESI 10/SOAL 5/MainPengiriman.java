import javax.swing.JOptionPane;

public class MainPengiriman extends Paket {
   public MainPengiriman() {
   
   }
   
   public static void main (String args [] ) {
      MainPengiriman elie = new MainPengiriman ();
	  
	  String nmPengirim = JOptionPane.showInputDialog("biaya pengiriman paket" + "\n Inputkan Nama pengirim");
	  
	  elie.setNmPengirim(nmPengirim);
	  
	  String tujuanPaket = JOptionPane.showInputDialog("biaya pengiriman paket" + "\n Inputkan tujuan paket : Bali | Surabaya | Jakarta | Bandung");
	  
	  elie.setTujuanPaket(tujuanPaket);
	  
	  String br = JOptionPane.showInputDialog("biaya pengiriman paket" + "\n Inputkan berat paket : ");
	  
	  
	  int beratPaket= Integer.parseInt(br);
	  elie.setBeratPaket(beratPaket);
	  elie.biayaperkg();
	  elie.Bayar();
	  
	  JOptionPane.showMessageDialog(null,"Biaya Pengiriman paket Adalah" + "\n Nama Pengirim: " + elie.getNmPengirim()+ "\n Tujuan Paket: " + elie.getTujuanPaket() + "\n Berat paket " + elie.getBeratPaket() + "Kg" + "\n Biaya per kg : " + elie.biayaperkg() + "\n Total Bayar : " + elie.Bayar()+ "\nTerima Kasih");
   }
}