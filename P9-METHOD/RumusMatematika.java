public class RumusMatematika {

	double a, t; 											//deklarasi variable
	double l_segitiga;

	public static void main(String[] args) { 				//method static (method main)
		RumusMatematika rm = new  RumusMatematika();		//deklarasi objek dn nama rm
		rm.luasSegitiga();									//pemanggilan method luas segitiga
	}

	void luasSegitiga () { 									//method void(method yg tdk ada return valuenya)
		a = 7;
		t = 10;
		l_segitiga = 0.5 * a * t;
		System.out.println("Luas Segitiga ="+l_segitiga);
	}
}

/**
* pemanggilan method luasSegitiga harus dideklarasikan object class nya terlebih dahulu
* karena method luasSegitiga tergolong method bukan static
*/