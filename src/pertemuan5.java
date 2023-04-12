import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//
//
public class pertemuan5 {
//    while do
    //    public static void main(String[] args) {
////        Scanner input = new Scanner(System.in);
////        int count = 0;
////
////        System.out.println("Masukkan angka positif (ketik angka negatif untuk berhenti):");
////        int num = input.nextInt();
////
////        while (num >= 0) {
////            count++;
////            System.out.println("Angka ke-" + count + " adalah " + num);
////            System.out.println("Masukkan angka positif (ketik angka negatif untuk berhenti):");
////            num = input.nextInt();
////        }
////
////        System.out.println("Anda telah memasukkan " + count + " angka positif.");
//        int nim;
//        String nama;
//
//
//        try {
//            do {
//                System.out.println("entri nim");
//                nim = Integer, parseInt, (br.readLine());
//                System.out.println("entri nama");
//                nama = br.readLine();
//                i++;
//            } while (1 <= 5);
//        } catch (Exception e) {
//        }
//
//    }
//}
//        int bulan = 5;
//        String namaBulan;
//
//        switch (bulan) {
//            case 1:
//                namaBulan = "Januari";
//                break;
//            case 2:
//                namaBulan = "Februari";
//                break;
//            case 3:
//                namaBulan = "Maret";
//                break;
//            case 4:
//                namaBulan = "April";
//                break;
//            case 5:
//                namaBulan = "Mei";
//                break;
//            case 6:
//                namaBulan = "Juni";
//                break;
//            default:
//                namaBulan = "Bulan tidak valid";
//                break;
//        }
//
//        System.out.println("Nama bulan adalah: " + namaBulan);
//    }
//}
    public static void main(String[] s) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // letakkan variabel sebelum blok try agar terbaca didalam blok try-catch
//        int nim, i = 0;
//        String nama;
//
//        try {
//            do {
//                System.out.println("Entri nim : ");
//                nim = Integer.parseInt(br.readLine());
//                System.out.println("Entri nama : ");
//                nama = br.readLine();
//                i++;
//            } while (i < 5);
//        } catch (Exception e) {
//            // kosongkan saja
//        }

        try {
            /*
             * membuat program dengan menu 1.Entri mahasiswa (nim, nama, prodi, matakuliah)
             * 2.Hitung nilai mahasiswa {uts, uas, tugas) 3.lihat rapor mahasiswa 4.keluar program
             */
            String nimMhs = null, namaMhs = null, prodi = null, matakuliah = null, cari = null;
            int uts, uas, tugas, menu, nilaiAkhir = 0;

            do {
                System.out.println("=== Program Akademik Mahasiswa ===");
                System.out.println("1.Entri mahasiswa");
                System.out.println("2.Hitung nilai mahasiswa");
                System.out.println("3.lihat rapor mahasiswa");
                System.out.println("4.keluar program");
                System.out.println("Masukkan pilihan anda : ");
                menu = Integer.parseInt(br.readLine());

                switch (menu) {
                    case 1:
                        System.out.println("=== Menu Entri Mahasiswa ===");
                        System.out.println("Entri nim");
                        nimMhs = br.readLine();
                        System.out.println("Entri nama");
                        namaMhs = br.readLine();
                        System.out.println("Entri Program Studi");
                        prodi = br.readLine();
                        System.out.println("Entri mata kuliah");
                        matakuliah = br.readLine();
                        break;
                    case 2:
                        System.out.println("===Menu Hitung Nilai Mahasiswa");
                        //hitung nilai akhir (30% * uts + 30% * uas + 40% * tugas)
                        System.out.println("Cari dari nim : ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)) {
                            System.out.println("Entri nilai uts");
                            uts = Integer.parseInt(br.readLine());
                            System.out.println("Entri nilai uas ");
                            uas = Integer.parseInt(br.readLine());
                            System.out.println("Entri nilai tugas");
                            tugas = Integer.parseInt(br.readLine());

                            nilaiAkhir = (uts * 30 / 100) + (uas * 30 / 100) + (tugas * 40 / 100);

                            //cetak nilai akhir
                            System.out.println("nilai akhirn: " + nilaiAkhir);
                        }
                        break;
                    case 3:
                        System.out.println("=== Menu Lihat Rapor");
                        // Menampilkan semua data (termasuk nilai akhir dan nilai huruf)
                        System.out.println("Cari dari nim : ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)) {
                            System.out.println(nimMhs + " " + namaMhs);
                            System.out.println("Nilai akhir MK " + matakuliah + ": " + nilaiAkhir);
                        /*
                        A = 80 - 100
                        B+ = 75 - 79
                        B = 65 -74
                        C+ = 60 - 64
                        C = 55 - 59
                        Nilai < 55 == D/E
                        */
                            if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
                                System.out.println("Nilai huruf : A");
                            } else if (nilaiAkhir >= 75 && nilaiAkhir <= 79) {
                                System.out.println("Nilai huruf : B+");
                            } else if (nilaiAkhir >= 65 && nilaiAkhir <= 74) {
                                System.out.println("Nilai huruf: B");
                            } else if (nilaiAkhir >= 60 && nilaiAkhir <= 64) {
                                System.out.println("Nilai huruf: C+");
                            } else if (nilaiAkhir >= 55 && nilaiAkhir <= 59) {
                                System.out.println("Nilai huruf: C");
                            } else {
                                System.out.println("Nilai huruf: D/E");
                            }
                        }

                        break;
                    default:
                        // jika yang dipilih diluar 1-3, maka keluar dari perulangan
                        break;
                }
            } while (menu < 4);
        } catch (Exception e) {
            // kosongkan saja
            System.out.println("terdapat kesalahan -->" + e.getMessage());
        }
    }
}






