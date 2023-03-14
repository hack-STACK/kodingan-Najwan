package tokoonlinetugas;

import java.applet.AudioClip;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class member extends userinter {

    //declare variables
    Scanner input = new Scanner(System.in);
    display z = new display();
    double l, b;

    //barang class
    public class Barang {

        private String nama;
        private double harga;
        private int stok;

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public double getHarga() {
            return harga;
        }

        public void setHarga(double harga) {
            this.harga = harga;
        }

        public int getStok() {
            return stok;
        }

        public void setStok(int stok) {
            this.stok = stok;
        }
    }

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
        System.out.println("saldo anda sekitar\t=\t" + saldomember);
        System.out.println("apakah anda ingin kembali? (Y/N)");
        String seleksi = a.nextLine().toLowerCase();
        if (seleksi.equals("y") || seleksi.equals("yes")) {
            menutama();
        } else if (seleksi.equals("n") || seleksi.equals("no")) {
            System.out.println("have a nice day " + getNama());
            System.exit(0);
        }
    }

    //menambah saldo class
    public void setsaldomember() {
        System.out.println("saldo anda tersisa\t=\t" + saldomember);
        System.out.println("apakah anda ingin top up? (Y/N)");
        String seleksi = a.nextLine().toLowerCase();
        if (seleksi.equals("y") || seleksi.equals("yes")) {
            System.out.println("Ingin menggunakan ATM apa?\n1.Bca\n2.Mandiri");
            String seleksi2 = a.nextLine().toLowerCase();
            if (seleksi2.equals("bca") || seleksi2.equals("1")) {
                System.out.println("masukkan saldo yang ingin dimasukkan\n(batas minima top up RP.10.000)");
                double saldo = a.nextDouble();
                if (saldo < batasmin) {
                    while (saldo < batasmin) {
                        saldo -= batasmin;
                        System.out.println("saldo invalid");
                        System.out.println("silahkan pilih menu lagi");
                        System.out.println("");
                        menutama();

                    }

                } else if (saldo > batasmin) {
                    saldomember += saldo - tax;
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

            } else if (seleksi2.equals("mandiri") || seleksi2.equals("2")) {
                System.out.println("masukkan saldo yang ingin dimasukkan\n(batas minima top up RP.10.000)");
                double saldo = a.nextDouble();
                if (saldo < batasmin) {
                    while (saldo < batasmin) {
                        saldo -= batasmin;
                        System.out.println("saldo invalid");
                        System.out.println("silahkan login lagi ;)");
                        menutama();
                        break;
                    }
                } else if (saldo > batasmin) {
                    saldomember += saldo - tax;
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

        } else if (seleksi.equals("n") || seleksi.equals("no")) {
            menutama();
        }

    }

    //beli barang and laporan transaksi class
    public void setoverall() {

        barangsemua barangAlpha = new barangsemua("malkist", 100, 5000);
        String namaBarang = barangAlpha.getNama();
        int stokBarang = barangAlpha.getStokBarang();
        double hargaBarang1 = barangAlpha.getHargaBarang();
        barangsemua barangDelta = new barangsemua("roma", 100, 5000);
        String namaBarang2 = barangAlpha.getNama();
        int stokBarang1 = barangDelta.getStokBarang();
        double hargaBarang2 = barangDelta.getHargaBarang();

        ArrayList<barang1> listawok = new ArrayList<barang1>();
        listawok.add(barangAlpha);
        listawok.add(barangDelta);

        for (barang1 barang1 : listawok) {
            barang1.display();
        }

        System.out.print("mau beli yang mana\t=\t");
        String seleksi = a.nextLine().toLowerCase();
        if (seleksi.equals("malkis") || seleksi.equals("1")) {
            System.out.print("masukkan stok\t=\t");
            double stok = a.nextInt();
            if (stokBarang > stok) {
                double r = stok * hargaBarang1;
                System.out.println("hargabarang" + hargaBarang1);
                System.out.println("harga yang akan dibeli adalah\t=\t" + r);
                System.out.println("apakah ingin melanjutkan transaksi?(Y/N)");
                a.nextLine();
                String seleksia = a.nextLine().toLowerCase();
                if (seleksia.equals("yes") || seleksia.equals("y")) {
                    if (saldomember >= r) {

                        l = stok - stokBarang;
                        b = saldomember - r;
                        saldomember = b;
                        stokBarang -= stok;
                        System.out.println("pembelian sukses");
                        System.out.println("nama\t=\t" + getNama());
                        System.out.println("no telepon\t=\t" + getTelepon());
                        System.out.println("alamat anda\t=\t" + getAlamat());
                        System.out.println("membeli barang\t=\t" + namaBarang);
                        System.out.println("stok yang dibeli\t=\t" + stok);
                        System.out.println("stok barang sekarang\t= " +stokBarang);
                        System.out.println("======SEDANG DIKIRIM======");
                        System.out.println("apakah ingin kembali ke halaman awal?(Y/N)\t=\t");
                        String seleksi4 = a.nextLine().toLowerCase();
                        if (seleksi4.equals("yes") || seleksi4.equals("y")) {
                            menutama();

                        } else if (seleksi.equals("no") || seleksi.equals("n")) {
                            System.exit(0);
                        }
                    } else if (saldomember <= r) {
                        System.out.println("saldo anda kurang harap top up terlebih dahulu");
                        menutama();
                    }
                } else if (seleksia.equals("no") || seleksia.equals("n")) {
                    menutama();
                }

            } else if (stokBarang < stok) {
                System.out.println("anda membeli lebih dari stok yang seharusnya");
                a.nextLine();
                menutama();
            }

        } else if (seleksi.equals("2") || seleksi.equals("roma")) {
            System.out.print("masukkan stok\t=\t");
            double stok = a.nextInt();
            if (stokBarang1 > stok) {
                double r = stok * hargaBarang2;
                System.out.println("hargabarang" + hargaBarang2);
                System.out.println("harga yang akan dibeli adalah\t=\t" + r);
                System.out.println("apakah ingin melanjutkan transaksi?(Y/N)");
                a.nextLine();
                String seleksia = a.nextLine().toLowerCase();
                if (seleksia.equals("yes") || seleksia.equals("y")) {
                    if (saldomember >= r) {
                        l = stok * stokBarang1;
                        b = saldomember - r;
                        saldomember = b;
                        stokBarang1 -=stok;
                        System.out.println("pembelian sukses");

                        System.out.println("nama\t=" + getNama());
                        System.out.println("no telepon\t= " + getTelepon());
                        System.out.println("alamat anda\t= " + getAlamat());
                        System.out.println("membeli barang\t= " + namaBarang2);
                        System.out.println("stok yang dibeli\t= " + stok);
                        System.out.println("stok barang sekarang\t= " +stokBarang1);

                        System.out.println("apakah ingin kembali ke halaman awal?(Y/N)\t=\t");

                        String seleksi4 = a.nextLine().toLowerCase();
                        if (seleksi4.equals("yes") || seleksi4.equals("y")) {
                            menutama();
                        } else if (seleksi.equals("no") || seleksi.equals("n")) {
                            System.exit(0);
                        }
                    } else if (saldomember <= r) {
                        System.out.println("saldo anda kurang harap top up terlebih dahulu");
                        menutama();
                    }
                } else if (seleksia.equals("no") || seleksia.equals("n")) {
                    menutama();
                }

            } else if (stokBarang1 < stok) {
                System.out.println("anda membeli lebih dari stok yang seharusnya");
                a.nextLine();
                menutama();
            }
        }
    }

    //class menu utama
    public void menutama() {
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
                setoverall();
                break;
            case ("2"):
                saldomember();
                break;
            case ("3"):
                Lihatsaldo();
                break;
            case ("4"):
                System.exit(0);

            default:
                System.out.println("invalid");
        }

    }

    //display output
    public void display() {
        nama();
        alamat();
        telepon();

        menutama();

    }

}
