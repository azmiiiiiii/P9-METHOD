public class Truk {
	double muatan;
	double muatanmaks;

	public Truk(double beratmaks){
		muatanmaks=beratmaks;

	}

	public double getMuatan(){
		return muatan;
	}

	public double getMuatanMaks(){
		return muatanmaks;
	}

	public void tambahMuatan(double berat){
		muatan += berat;// muatan = muatan + berat
		if(muatan >= muatanmaks ){//1100>=1000
			muatan -= berat;// muatan=muatan-beart
		}

	}

}


/* atau juga boleh mengguunakan sintak dibawah ini 

public void tambahMuatan1(double berat){
		
		if((muatan + berat ) <= muatanmaks ){
			muatan += berat;// muatan=muatan+berat
		}
*/