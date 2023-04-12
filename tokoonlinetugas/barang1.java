package tokoonlinetugas;

import java.util.Scanner;

public class barang1 extends member {
    Scanner a = new Scanner(System.in);
    //declare variables
    private String namaBarang;
    private int stokBarang = 0;
    private double hargaBarang;
    //setter and getter
    public int getIndex() {
        return index;
    }
    public String getnama() {
        return this.namaBarang;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private  int index;

    public int getPenguranganStok() {
        return penguranganStok;
    }

    public void setPenguranganStok(int penguranganStok) {
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
    private int penguranganStok;
    //pembuatan constructor
    barang1(int index,String namaBarang, int stokBarang, double hargaBarang2, int penguranganStok) {
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
        this.hargaBarang = hargaBarang2;
        this.penguranganStok = penguranganStok;
        this.index = index;
    }


    //display output
    public void display() {
        System.out.println("NO."+this.index+"\nNama \t\t=\t" + this.namaBarang + "\nstok barang\t=\t" + this.stokBarang
                + "\nharga barang \t=\t " + this.hargaBarang);
        System.out.println("");
    }



}
