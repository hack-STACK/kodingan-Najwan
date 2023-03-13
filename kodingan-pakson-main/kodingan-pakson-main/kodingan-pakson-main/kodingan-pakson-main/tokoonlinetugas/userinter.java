package tokoonlinetugas;

import java.util.Scanner;

public abstract class userinter {
    private String nama;
    private String alamat;
    private String telepon;
    Scanner a = new Scanner(System.in);

    public abstract void nama();

    public abstract void alamat();

    public abstract void telepon();

    public abstract void display();

    public void setNama(String namaa) {
        System.out.print("masukkan nama anda lengkap \t=\t");
        namaa = a.nextLine().toLowerCase();
        this.nama = namaa;
    }

    public void setAlamat(String alamataa) {
        System.out.print("masukkan alamat anda \t=\t");
        alamataa = a.nextLine().toLowerCase();
        this.alamat = alamataa;

    }

    public void setTelepon() {
        System.out.print("masukkan no telepon anda \t=\t");
        telepon = a.nextLine();

    }

    public String getNama() {
        return this.nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public String getTelepon() {
        return this.telepon;
    }

    public int getHarga() {
        return this.getHarga();
    }

    public String getJumlah() {
        return null;
    }

    // abstract initalize
}
