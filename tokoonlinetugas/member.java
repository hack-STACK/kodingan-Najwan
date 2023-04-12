package tokoonlinetugas;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class member extends userinter {

    //declare variables
    Scanner input = new Scanner(System.in);
    display z = new display();
    double b;
    int atas,l,l2,atas2,k;
    //penggunaan abstract
    public void nama() {
        this.setNama(null);
    }

    public void alamat() {
        this.setAlamat(null);
    }

    public void telepon() {
        this.setTelepon();

    }

    public void saldomember() {
        this.setsaldomember();
    }

    public void setOverall() {
        this.setoverall();
    }
    //declare saldo
    double saldomember = 10000;
    double batasmin = 10000;
    double tax = 5000;

    Scanner a = new Scanner(System.in);

    //lihat saldo class
    public void Lihatsaldo() {
        System.out.println("saldo anda \t=\tRP." + saldomember);//melihat saldo anda
        System.out.println("apakah anda ingin kembali? (Y/N)");
        String seleksi = a.nextLine().toLowerCase();
        if (seleksi.equals("y") || seleksi.equals("yes")) {//kondisi ingin kembali ke menu utama
            menutama();
        } else if (seleksi.equals("n") || seleksi.equals("no")) {//kondisi ingin keluar dari programm
            System.out.println("have a nice day " + getNama());
            System.exit(0);
        }
    }

    //menambah saldo class
    public void setsaldomember() {

        //declare transaksi
        mandiriBank Mandiri = new mandiriBank("mandiri", 10000, 0, 0, 0);
        bca bcaa = new bca("bca", 10000, 0, 0, 0);
        //declare saldo
        double saldo = bcaa.getNambahsaldo();
        //barisan dimulai
        System.out.println("saldo anda tersisa\t=\t" + saldomember);
        System.out.println("apakah anda ingin top up? (Y/N)");
        String seleksi = a.nextLine().toLowerCase();
        if (seleksi.equals("y") || seleksi.equals("yes")) {//kondisi ingin topup
            System.out.println("Ingin menggunakan ATM apa?\n1.Bca\n2.Mandiri");
            String seleksi2 = a.nextLine().toLowerCase();
            if (seleksi2.equals(bcaa.getNamaAtm()) || seleksi2.equals("1") || seleksi2.equals(Mandiri.getNamaAtm()) || seleksi2.equals("2")) {
                if (seleksi2.equals(bcaa.getNamaAtm()) || seleksi2.equals("1")) {
                    System.out.println("masukkan saldo yang ingin dimasukkan\n(batas minima top up RP." + bcaa.getBiayatax());
                } else if (seleksi2.equals(Mandiri) || seleksi2.equals("2")) {
                    System.out.println("masukkan saldo yang ingin dimasukkan\n(batas minima top up RP." + Mandiri.getBiayatax());
                }

                saldo = a.nextDouble();
                if (saldo < batasmin) {
                    while (saldo < batasmin) {
                        saldo -= batasmin;
                        System.out.println("saldo invalid");
                        System.out.println("silahkan pilih menu lagi");
                        System.out.println("");
                        menutama();

                    }

                } else if (saldo > batasmin) {
                    saldomember += saldo - bcaa.getBiayatax();
                    System.out.println("saldo anda telah di update");
                    System.out.println("");
                    System.out.println("balik ke menu awal? (y/n)");
                    a.nextLine();
                    String seleksi3 = a.nextLine().toLowerCase();
                    if (seleksi3.equals("y") || seleksi3.equals("yes")) {
                        menutama();
                    } else {
                        System.out.println("have a nice day " + getNama());
                        System.exit(0);
                    }
                }

            }
        }

//        }
    }



    //beli barang and laporan transaksi class
    public void setoverall() {
        //declare variabel yang akan digunakan dalam perkondisian
        l = (int)atas;
        l2 = atas2;
        malkist barangAlpha = new malkist(1,"malkist", 100-l, 5000,0);
        String namaBarang = barangAlpha.getnama();
        int stokBarang = barangAlpha.getStokBarang();
        double hargaBarang1 = barangAlpha.getHargaBarang();
        int penguranganstok = barangAlpha.getPenguranganStok();
        int index = barangAlpha.getIndex();
        roma barangDelta = new roma(2,"roma", 100-l2, 5000, 0);
        String namaBarang2 = barangAlpha.getnama();
        int stokBarang1 = barangDelta.getStokBarang();
        double hargaBarang2 = barangDelta.getHargaBarang();
        int PembelianStok;
        int index1 = barangDelta.getIndex();
        //memasukkan barang ke dalam array list
        ArrayList<barang1> listawok = new ArrayList<barang1>();
        listawok.add(barangAlpha);//add barang pertama
        listawok.add(barangDelta);//add barang kedua

        for (barang1 barang1 : listawok) {//mengeluarkan semua barang ke dalam terminal
            barang1.display();//display
        }

        System.out.print("mau beli yang mana\t=\t");
        String seleksi = a.nextLine().toLowerCase();
        if (seleksi.equals(namaBarang) || seleksi.equals("1") ) {//user membeli barang 1
            System.out.print("masukkan stok\t=\t");
            penguranganstok = a.nextInt();//user memasukkan berapa stok yang ingin dibeli
            if (stokBarang > penguranganstok) {//memastikan bahwa stok barang lebih besar dari stok yang telah dimasukkan oleh user
                double r = penguranganstok * hargaBarang1;//menentukan harga
                System.out.println("hargabarang" + hargaBarang1);
                System.out.println("harga yang akan dibeli adalah\t=\t" + r);
                System.out.println("apakah ingin melanjutkan transaksi?(Y/N)");
                a.nextLine();
                String seleksia = a.nextLine().toLowerCase();
                if (seleksia.equals("yes") || seleksia.equals("y")) {
                    if (saldomember >= r) {

                            l = penguranganstok;//l sama dengan pembelian



                        atas = (int) l;//pembelian ke variable di atas2
                        b = saldomember - r;//pengurangan saldo di dalam variabel 'b'
                        saldomember = b;//hasil b sama dengan saldo

                        stokBarang-=l;
                        //receipt
                        System.out.println("pembelian sukses");
                        System.out.println("nama\t=\t" + getNama());
                        System.out.println("no telepon\t=\t" + getTelepon());
                        System.out.println("alamat anda\t=\t" + getAlamat());

                            System.out.println("membeli barang\t=\t" + namaBarang);

                        System.out.println("stok yang dibeli\t=\t" + l);
                        System.out.println("stok barang sekarang\t= " +stokBarang);
                        System.out.println("======SEDANG DIKIRIM======");
                        System.out.println("apakah ingin kembali ke halaman awal?(Y/N)\t=\t");

                    } else if (saldomember <= r) {//kondisi ketika saldo kurang
                        System.out.println("saldo anda kurang harap top up terlebih dahulu");
                        menutama();
                    }
                } else if (seleksia.equals("no") || seleksia.equals("n")) {//kondisi ketika si user tidak ingin melanjutakan transaksi
                    menutama();
                }

            } else if (stokBarang < penguranganstok) {//kondisi ketika si user menginput lebih dari stok yang ada
                System.out.println("anda membeli lebih dari stok yang seharusnya");
                a.nextLine();
                menutama();
            }

        }

        else if (seleksi.equals(namaBarang2) || seleksi.equals("2") ) {//kondisi membeli barang yang ke dua
            System.out.print("masukkan stok\t=\t");
            PembelianStok = a.nextInt();//user memasukkan berapa stok yang ingin dibeli
            if (stokBarang1 > PembelianStok) {//memastikan bahwa stok barang lebih besar dari stok yang telah dimasukkan oleh user
                double r = PembelianStok * hargaBarang1;//menentukan harga
                System.out.println("hargabarang" + hargaBarang2);
                System.out.println("harga yang akan dibeli adalah\t=\t" + r);
                System.out.println("apakah ingin melanjutkan transaksi?(Y/N)");
                a.nextLine();
                String seleksia = a.nextLine().toLowerCase();
                if (seleksia.equals("yes") || seleksia.equals("y")) {//kondisi jika si user ingin melanjutakn transaksi
                    if (saldomember >= r) {

                        l2 = PembelianStok;//l2 sama dengan pembelian



                        atas2 = (int) l;//pembelian ke variable di atas2
                        b = saldomember - r;//pengurangan saldo di dalam variabel 'b'
                        saldomember = b;//hasil b sama dengan saldo
                        stokBarang1-=l2;

                        //receipt
                        System.out.println("pembelian sukses");
                        System.out.println("nama\t=\t" + getNama());
                        System.out.println("no telepon\t=\t" + getTelepon());
                        System.out.println("alamat anda\t=\t" + getAlamat());

                        System.out.println("membeli barang\t=\t" + namaBarang2);

                        System.out.println("stok yang dibeli\t=\t" + l2);
                        System.out.println("stok barang sekarang\t= " +(stokBarang1-l2));
                        System.out.println("======SEDANG DIKIRIM======");
                        System.out.println("apakah ingin kembali ke halaman awal?(Y/N)\t=\t");

                    } else if (saldomember <= r) {//kondisi ketika saldo kurang
                        System.out.println("saldo anda kurang harap top up terlebih dahulu");
                        menutama();
                    }
                } else if (seleksia.equals("no") || seleksia.equals("n")) {//kondisi ketika si user tidak ingin melanjutakan transaksi
                    menutama();
                }

            } else if (stokBarang < penguranganstok) {//kondisi ketika si user menginput lebih dari stok yang ada
                System.out.println("anda membeli lebih dari stok yang seharusnya");
                a.nextLine();
                menutama();
            }

        }
        String seleksi4 = a.nextLine().toLowerCase();
        if (seleksi4.equals("yes") || seleksi4.equals("y")) {//kondisi ketika si user telah menyelesaikan transaksi dan ingin kembali ke menuutama
            menutama();

        } else if (seleksi.equals("no") || seleksi.equals("n")) {//kondisi jika user menyudahi semua transaksinya dan keluar dari system
            System.exit(0);
        }
        }


    //class menu utama
    public void menutama() {//Opsi sebagai member
        System.out.println("");
        System.out.println("=====PILIHAN MEMBER=====");
        System.out.println("1.Beli barang");
        System.out.println("2.Isi saldo ");
        System.out.println("3.Lihat saldo ");
        System.out.println("4.keluar");
        System.out.println("");

        String seleksi = a.nextLine().toLowerCase();
        //switch case seleksi
        switch (seleksi) {
            case ("1"):
                setoverall();//membeli barang
                break;
            case ("2"):
                saldomember();//mengisi saldo (SEBAGAI MEMBER)
                break;
            case ("3"):
                Lihatsaldo();//Lihat saldo
                break;
            case ("4"):
                System.exit(0);//keluar dari system

            default:
                System.out.println("invalid");
        }

    }

    //display output
    public void display() {//Menjalankan semua class yang ada diatas
        nama();//abstract nama
        alamat();//abstract alamat
        telepon();//abstract telepon

        menutama();//class menuutama (OPSI SEBAGAI MEMBER)

    }

}
