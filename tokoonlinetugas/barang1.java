package tokoonlinetugas;

import java.util.Scanner;

public class barang1 extends member {
    Scanner a = new Scanner(System.in);
    //declare variables
    private String namaBarang;
    private int stokBarang = 0;
    private double hargaBarang;

    public int getPenguranganStok() {
        return penguranganStok;
    }

    public void setPenguranganStok(int penguranganStok) {
        this.penguranganStok = penguranganStok;
    }

    private int penguranganStok;
    //pembuatan class input
    barang1(String namaBarang, int stokBarang, double hargaBarang2, int penguranganStok) {
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
        this.hargaBarang = hargaBarang2;
        this.penguranganStok = penguranganStok;
    }

    void setName(String namaBarangNew) {
        this.namaBarang = namaBarangNew;
    }

    void setStok(int stokBarang) {
        this.stokBarang = stokBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    void setHarga(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }
    //display output
    public void display() {
        System.out.println("Nama \t\t=\t" + this.namaBarang + "\nstok barang\t=\t" + this.stokBarang
                + "\nharga barang \t=\t " + this.hargaBarang);
        System.out.println("");
    }

    public String getNama() {
        return this.namaBarang;
    }

}
