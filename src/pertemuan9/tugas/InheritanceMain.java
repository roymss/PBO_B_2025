package pertemuan9.tugas;

public class InheritanceMain {
	public static void main(String [] args) {
		Mobil mbl = new Mobil("Merah", "Toyota", "Civic");
		System.out.println(mbl.getWarna()+ 
				"-"+ mbl.getMerk()+
				"-"+ mbl.getJenis());
	}
}