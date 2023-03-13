package tokoonlinetugas;

import java.util.Scanner;

public class barang1 extends member{
    Scanner a = new Scanner(System.in);
    private String namaBarang;
    protected int stokBarang;
    private double hargaBarang;


    barang1 (String namaBarang, double hargaBarang2){
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
        this.hargaBarang = hargaBarang2;
    }

    void setName (String namaBarangNew){
        this.namaBarang = namaBarangNew;
    }
    void setStok(int stokBarang){
        this.stokBarang = stokBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    void setHarga(double hargaBarang){
        this.hargaBarang = hargaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public void display(){
        System.out.println("Nama \t=\t"+this.namaBarang+"\nharga barang \t=\t "+this.hargaBarang);
    }




    
  



    



}
