package tugas;

import java.util.Scanner;

public class Menu{
	public static int pil;
	public static int tampil;
	public static int add;
	public static int hapus;
	public static int urut;
	public static int edit;

	public static void op(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Selamat datang dalam program gue");
		System.out.println(" == DATA PERUSHANAAN == ");
		System.out.println("Silahkan pilih menu : ");
		System.out.println("1. Memasukkan data perusahaan ");
		System.out.println("2. Menampilkan data ");
		System.out.println("3. Menambah data ");
		System.out.println("4. Mencari data ");
		System.out.println("5. Mengedit data ");
		System.out.println("6. Menghapus data ");
		System.out.println("7. Mengurutkan data ");
		System.out.println("8. Keluar ");
		System.out.print(" pilihan anda (1-8) : ");
		pil = scan.nextInt();
	}

	public static void tambah_data(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Menu Tambah Data");
		System.out.println("===========================");
		System.out.println("1. tambah data di depan ");
		System.out.println("2. tambah data di tengah ");
		System.out.println("3. tambah data di belakang ");
		System.out.println("4. kembali ke menu utama ");
		System.out.println("===========================");
		System.out.println(" silahkan pilih menu : ");
		add = scan.nextInt();
	}
	
	public static void tampilkan(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Menampilkan data");
		System.out.println("===========================");
		System.out.println("1. Menampilkan semua data ");
		System.out.println("2. Menampilkan data alamat ");
		System.out.println("3. Menampilkan jumlah karyawan ");
		System.out.println("4. kembali ke menu utama ");
		System.out.println("===========================");
		System.out.println(" silahkan pilih menu : ");
		tampil = scan.nextInt();
	}

	public static void hapus_data(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Menu Hapus Data");
		System.out.println("===========================");
		System.out.println("1. Hapus data di depan ");
		System.out.println("2. Hapus data di tengah ");
		System.out.println("3. Hapus data di belakang ");
		System.out.println("4. kembali ke menu utama ");
		System.out.println("===========================");
		System.out.println(" silahkan pilih menu : ");
		hapus = scan.nextInt();
	}

	public static void urut_data(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Menu pengurutan data");
		System.out.println("===========================");
		System.out.println("1. urut data ");
		System.out.println("2. kembali ke menu utama ");
		System.out.println("===========================");
		System.out.println(" silahkan pilih menu : ");
		urut = scan.nextInt();
	}

	public static void edit_data(){
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Edit nama perusahaan");
        System.out.println("2. Edit nama direktur");
        System.out.println("3. Edit Jumlah karyawan");
        System.out.println("4. Kembali Ke Menu Utama");
        System.out.println(" silahkan pilih menu : ");
		edit = scan.nextInt();

	}

}