import java.util.ArrayList;
import java.util.Scanner;

public abstract class perwarisan
{
    private String nama;
    private String alamat;
    private String telepon;

    private double harga;
    private double jumlah;
    private String input;

    Scanner a = new Scanner(System.in);


    protected abstract void alamat();

    protected abstract void telepon();
    protected   abstract void nama();
    public void setNama(String namaa)
    {//memasukkan nama anda dan disimpan dalam variabel 'nama'
        System.out.print("masukkan nama lengkap \t=\t");
        namaa = a.nextLine().toLowerCase();
        this.nama = namaa;
    }

    public void setAlamat(String alamataa)
    {//memasukkan alamat anda dan disimpan dalam variabel 'alamataa'
        System.out.print("masukkan alamat anda \t=\t");
        alamataa = a.nextLine().toLowerCase();
        this.alamat = alamataa;

    }

    public void setTelepon()
    {
        System.out.print("masukkan no telepon anda \t=\t");
        telepon = a.nextLine();

    }

    public String getNama()
    {
        return this.nama;
    }

    public String getAlamat()
    {
        return this.alamat;
    }

    public String getTelepon()
    {
        return this.telepon;
    }




    protected double getJumlah() {
        return jumlah;
    }

    protected void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }


    protected void setInput(int i) {
        this.input = String.valueOf(i);
    }
    protected void setInput(String a){
        this.input = a;
    }
    protected String getInput(){
        return input;
    }

}
