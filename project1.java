


import java.util.Scanner;
public class Main {
	static void Hitung(int lama) {
	int awal;
	awal = 200000;
	int diskon;
    diskon = awal * 25 / 100;
    int total;
    total = awal + ( (lama - 1) * diskon);
    System.out.println("Total bayar : " + total);
}	

	
  public static void main(String[] args) {
	  String nama, alamat, telp;
	  int lama;
	  Scanner data = new Scanner(System.in);
    System.out.println("Studio Al Izzah");
	System.out.println();
	System.out.println("====================");
	System.out.println();
	System.out.println("Isi Daftar Penyewa Berikut");
	System.out.println();
	System.out.println("Nama Group ; ");
	nama = data.nextLine();
	System.out.println();
	System.out.println("Alamat : ");
	alamat = data.nextLine();
	System.out.println();
	System.out.println("No Telp : ");
	telp = data.nextLine();
	System.out.println();
	System.out.println("=====================");
	System.out.println();
	System.out.println("Lama Rental : ");
	lama = data.nextInt();
	System.out.println();
	Hitung(lama);
	
  }
}