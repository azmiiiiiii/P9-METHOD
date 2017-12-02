public class Siswa1 {

	int nis;
	String nama_siswa;

	public Siswa1(int i, String a){ //method constructor
		nis=i;
		nama_siswa=a;
	}

	public int getNis(){
		return nis;
	}

	public String getNama(){
		return nama_siswa;
	}
}