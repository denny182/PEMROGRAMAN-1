public class Paket implements Harga {
    private String nmPengirim;
	private String tujuanPaket;
	private int beratPaket;
	private int biayaperkg;
	private double bayar;
	public Paket() {

	}

	public String getNmPengirim(){
	    return nmPengirim;
    }

	public void setNmPengirim(String temp){
	    nmPengirim = temp;
	}

	public String getTujuanPaket(){
	    return tujuanPaket;
	}

	public void setTujuanPaket(String temp){
	    tujuanPaket = temp;
	}

	public int getBeratPaket(){
	     return beratPaket;
    }

	public void setBeratPaket(int temp) {
	     beratPaket = temp;
    }

    public double biayaperkg(){
       if(tujuanPaket.equalsIgnoreCase("Bali")){
	      biayaperkg = 10000;
	      return biayaperkg;
	   }else if (tujuanPaket.equalsIgnoreCase("Surabaya")){
	      biayaperkg = 15000;
	      return biayaperkg;
	   }else if (tujuanPaket.equalsIgnoreCase("Jakarta")){
	      biayaperkg = 20000;
	      return biayaperkg;
	   } else{
	      biayaperkg = 25000;
		  return biayaperkg;
	   }

	   }
       public  double Bayar(){
          bayar = beratPaket*biayaperkg;
	     return bayar;
       }
    }
