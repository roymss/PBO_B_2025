package Pertemuan3.KelasDanObjek;

public class Main {

	    public static void main(String[] args) {
	        Mahasiswa o1 = new Mahasiswa("233040116", "haekal", "gerlong");
	        Mahasiswa o2 = new Mahasiswa("233040117", "renu", "gerlong");
	        Mahasiswa o3 = new Mahasiswa("233040112", "tegar", "gerlong");

	        System.out.println("Status kehadiran " + o1.nama + ": " + o1.hadir);
	        o1.masukKelas();
	        System.out.println("Status kehadiran setelah masuk kelas: " + o1.hadir);

	        System.out.println("Status kehadiran " + o2.nama + ": " + o2.hadir);
	        o2.masukKelas();
	        System.out.println("Status kehadiran setelah masuk kelas: " + o2.hadir);
	        
	        System.out.println("Status kehadiran " + o3.nama + ": " + o3.hadir);
	        o3.masukKelas();
	        System.out.println("Status kehadiran setelah masuk kelas: " + o3.hadir);
	    }
	}