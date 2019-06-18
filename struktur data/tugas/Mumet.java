package tugas;

import tugas.*;
import java.util.Scanner;

public class Mumet{
	public static int N = 0;

	public static void mulai(){
		data[] dp = new data[9999]; 

		Scanner scan = new Scanner(System.in);

		Menu pilihan = new Menu();

		do{
			
			pilihan.op();

			switch (pilihan.pil){
				case 1 :
				char ulang;
				N = 0;

				do{
					dp[N] = new data();
					System.out.println("input data perusahaan ke - " + (N+1) + " : " );
					System.out.print("Masukkan nama perusahaan : ");dp[N].nama_perusahaan = scan.next();
					System.out.print("Masukkan alamat perusahaan: ");dp[N].alamat = scan.next();
					System.out.print("Silahkan masukkan jenis perusahaan : ");dp[N].jenis_usaha = scan.next();
					System.out.print("masukkan nama direktur: ");dp[N].nama_direktur = scan.next();
					System.out.print("Masukkan jumlah karyawan : ");dp[N].jml_karyawan = scan.nextInt();

					System.out.print("tambah data lagi (y/t)?");
					ulang = scan.next().charAt(0);
					N++;
				}while(ulang == 'y');
				break;

				case 2 :
					do{
						pilihan.tampilkan();
						switch(pilihan.tampil){
							case 1:
								System.out.println("Menampilkan semua data");
								System.out.println("NO Nama_perusahaan Alamat jenis_usaha nama direktur jumlah karyawan");
								for(int i=0; i<N; i++){
									System.out.println("----------------------------------------------------------");
									System.out.println((i+1)+"\t"+dp[i].nama_perusahaan+"  "+dp[i].alamat+"  \t"+dp[i].jenis_usaha+"\t"+dp[i].nama_direktur+"\t\t"+dp[i].jml_karyawan);
								}
							break;
							case 2:
								System.out.println("Menampilkan data alamat perusahaan");
								System.out.println("NO\tAlamat");
								for(int i=0; i<N; i++){
									System.out.println((i+1)+"\t" +dp[i].alamat);
								}
							break;	
							case 3:
								System.out.println("Menampilkan data jumlah karyawan ");
								System.out.println("NO\tjumlah karyawan");
								for(int i=0; i<N; i++){
									System.out.println((i+1)+"\t" +dp[i].jml_karyawan);
								}
							break;
							case 4:
								pilihan.op();
							break;
							default:
								System.out.print("salah masukkan pilihan !!!");
						}
					}while(pilihan.tampil !=4);
				break;

			case 3:

				do{
					pilihan.tambah_data();

					switch(pilihan.add){
						case 1 :{
							data dp1 = new data();
							System.out.print("Tambah data di depan");
							System.out.print("Silahkan masukkan nama perusahaan : ");
							dp1.nama_perusahaan = scan.next();
							System.out.print("Silahkan masukkan alamat perushaan : ");
							dp1.alamat = scan.next();
							System.out.print("Silahkan masukkan jenis perusahaan (misal PT , PO ,dll ) : ");
							dp1.jenis_usaha = scan.next();
							System.out.print("Silahkan masukkan nama direktur perusahaan : ");
							dp1.nama_direktur = scan.next();
							System.out.print("Silahkan masukkan jumlah karyawan : ");
							dp1.jml_karyawan = scan.nextInt();
							for(int i = N-1; i>=0; i--){
								dp[i+1] = dp[i];
							}
							dp[0] = dp1;
							N++;					
							break;
						}
						case 2 :{
							data dp1 = new data();
							System.out.print("Silahkan masukkan nama perusahaan : ");
							dp1.nama_perusahaan = scan.next();
							System.out.print("Silahkan masukkan alamat perushaan : ");
							dp1.alamat = scan.next();
							System.out.print("Silahkan masukkan jenis perusahaan (misal PT , PO ,dll ) : ");
							dp1.jenis_usaha = scan.next();
							System.out.print("Silahkan masukkan nama direktur perusahaan : ");
							dp1.nama_direktur = scan.next();
							System.out.print("Silahkan masukkan jumlah karyawan : ");
							dp1.jml_karyawan = scan.nextInt();
							int a;
							System.out.print("Masukkan pada nomor urut ke : ");
								a = scan.nextInt();
								for(int i = N-1; i>=a; i--){
								dp[i+1] = dp[i];
							}	
							dp[a] = dp1;
							N++;
							break;
						}
						case 3 :{
							data dp1 = new data();
							System.out.print("Silahkan masukkan nama perusahaan : ");
							dp1.nama_perusahaan = scan.next();
							System.out.print("Silahkan masukkan alamat perushaan : ");
							dp1.alamat = scan.next();
							System.out.print("Silahkan masukkan jenis perusahaan (misal PT , PO ,dll ) : ");
							dp1.jenis_usaha = scan.next();
							System.out.print("Silahkan masukkan nama direktur perusahaan : ");
							dp1.nama_direktur = scan.next();
							System.out.print("Silahkan masukkan jumlah karyawan : ");
							dp1.jml_karyawan = scan.nextInt();
							dp[N] = new data();
							dp[N] = dp1;
							N++;
							break;
						}
						case 4 :{
							pilihan.op();
							break;
						}
						default:
							System.out.print("salah masukkan pilihan !!!");
					}
				}while(pilihan.add != 3);
			case 4:{
				String kataKunci;
				int lokasi = 1;
				boolean statusKetemu = false;
				System.out.print("Masukkan kata kunci pencarian : ");
				kataKunci = scan.next();

				for (int i = 0 ; i<= N-1 ; i++){
					if (dp[i].nama_perusahaan.equals(kataKunci))
					{
						statusKetemu = true;
						lokasi = i;
						break;
						}
					}
					if (statusKetemu == true){
						System.out.println("Data yang anda cari Ketemu dilarik ke : " + lokasi);
						}
					else
					{
						System.out.println("maaf, nama yang anda cari tidak ditemukan ");
					};
				break;
			}
			case 5:
				do{
					pilihan.edit_data();
					int x;
					switch(pilihan.edit){
						case 1:{
				              System.out.print("Input nama perushaan yang akan diganti : ");
				              String np = scan.next();
				                for(int i=0; i<=N-1; i++){
				                  if(dp[i].nama_perusahaan.equals(np)){
				                    x=1;
				                    System.out.println("nama perushaan "+np+" Berada Pada Data Ke-"+(i+1));
				                    System.out.print("Input nama baru : ");
				                    dp[i].nama_perusahaan = scan.next();
				                    System.out.println("nama Berhasil Diedit ");
				                  }
				                }
				              break;
           				 }
           				 case 2 : {
				              System.out.print("Input nama direktur yang akan diganti : ");
				              String nm = scan.next();
				                for(int i=0; i<=N-1; i++){
				                  if(dp[i].nama_direktur.equals(nm)){
				                    x=1;
				                    System.out.println("nama direktur "+nm+" Berada Pada Data Ke-"+(i+1));
				                    System.out.print("Input nama baru : ");
				                    dp[i].nama_perusahaan = scan.next();
				                    System.out.println("nama Berhasil Diedit ");
				                  }
				                }
				              break;
           				 }
           				 case 3 :{
				              System.out.print("Input jumlah karyawan yang akan diganti : ");
				              int jm = scan.nextInt();
				                for(int i=0; i<=N-1; i++){
				                  if(dp[i].jml_karyawan == (jm)){
				                    x=1;
				                    System.out.println("nama perushaan "+jm+" Berada Pada Data Ke-"+(i+1));
				                    System.out.print("Input nama baru : ");
				                    dp[i].jml_karyawan = scan.nextInt();
				                    System.out.println("nama Berhasil Diedit ");
				                  }
				                }
				              break;
           				 }
           				 case 4 :{
           				 		pilihan.op();
           				 		break;
           				 	}
           				 default:
           				 	System.out.print("salah masukkan pilihan !!!");
           				 }

				}while(pilihan.edit != 4);
				break;
			case 6:
				do{
					pilihan.hapus_data();
					switch(pilihan.hapus){
						
						case 1 :{
							for(int i = 0; i<=N; i++){
								dp[i] = dp[i+1];
							}
							System.out.println("Menghapus data ke-0, berhasil.");
							N--;
							break;
						}
						case 2 : {
							int T;
							System.out.print("Hapus data ke : ");
							T = scan.nextInt();
							for(int i = T; i<N; i++){
								dp[i] = dp[i+1];
							}
							System.out.println("Menghapus data ke-"+T+", berhasil.");
							N--;
							break;
						}
						case 3 :{
							N--;
							System.out.println("Menghapus data terakhir, berhasil.");
							break;
						}
						default:
							System.out.print("salah masukkan pilihan !!!");
					}
				}while(pilihan.hapus != 4);
				break;
			case 7:
				do{
					pilihan.urut_data();
					switch(pilihan.urut){
						case 1:{
							data dp1 = new data();
							int last = N-1; 
							for (int j = 0 ; j<= last - 1 ; j++){
								for (int i = 0 ; i<= last -1 -j ; i++){
									if(dp[i].nama_perusahaan.compareTo(dp[i+1].nama_perusahaan) < 0){
										dp1 = dp[i];
										dp[i] = dp[i+1];
										dp[i+1] = dp1;
										}
									}
								}
								System.out.println("Menampilkan semua data");
								System.out.println("NO Nama_perusahaan Alamat jenis_usaha nama direktur jumlah karyawan");
								for(int i=0; i<N; i++){
									System.out.println("----------------------------------------------------------");
									System.out.println((i+1)+"\t"+dp[i].nama_perusahaan+"  "+dp[i].alamat+"  \t"+dp[i].jenis_usaha+"\t"+dp[i].nama_direktur+"\t\t"+dp[i].jml_karyawan);
								}
							break;
							}
						case 2:{
							pilihan.op();
							break;
						}
						default:
							System.out.print("salah masukkan pilihan !!!");
					}
				}while(pilihan.urut != 2 );
			case 8:
				System.exit(0);
			default:
				System.out.println("Salah memasukkan pilihan !!!");
			}
		}while(pilihan.pil != 8);
	}
}