package tokoonlinetugas;

import java.util.Scanner;

public abstract class userinter {
    private String nama;
    private String alamat;
    private int telepon;
    Scanner a = new Scanner(System.in);

    public abstract void nama();
    public abstract void alamat();
    public abstract void telepon();
    public abstract void display();

    public void setNama(String namaa){
        System.out.print("masukkan nama anda \t=\t");
        namaa = a.nextLine().toLowerCase();
        this.nama = namaa;
    }

    public void setAlamat(String alamataa){
        System.out.print("masukkan alamat anda \t=\t");
        alamataa = a.nextLine().toLowerCase();
        this.alamat = alamataa;

    }
    public void setTelepon(){
        System.out.print("masukkan no telepon anda \t=\t");
        telepon = a.nextInt();
        
    }

    public String getNama(){
        return this.nama;
    }

    public String getAlamat(){
        return this.alamat;
    }
    public int getTelepon(){
        return this.telepon;
    }
   
   

    




    // abstract initalize
}
