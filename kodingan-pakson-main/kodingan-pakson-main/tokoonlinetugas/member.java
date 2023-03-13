package tokoonlinetugas;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import tokoonlinetugas.Myinterfecases.barangmember;

public class member extends userinter implements barangmember{
 
    Scanner input = new Scanner(System.in);
    display z = new display();
    public class Barang {
        private String nama;
        private double harga;
        private int stok;
    
        public Barang(String nama, double harga, int stok) {
            this.nama = nama;
            this.harga = harga;
            this.stok = stok;
        }
    
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
    
    
    public void nama(){
        this.setNama(null);
    }
    public void alamat(){
        this.setAlamat(null);
    }

    public void telepon(){
        this.setTelepon();
      
    }
    public void saldomember(){
        this.saldomember();
    }


    double saldomember = 10_000;
    double batasmin = 10_000;
    double tax = 5_000;

    Scanner a= new Scanner(System.in);
    private ArrayList<Barang> namaBarang;
    private ArrayList<Barang> hargaBarang;
    private ArrayList<Barang> stokBarang;
    


    public void menutama(){
        System.out.println("");
        System.out.println("=====PILIHAN MEMBER=====");
        System.out.println("1.Beli barang");
        System.out.println("2.Isi saldo ");
        System.out.println("3.Lihat saldo ");
        System.out.println("4.transaksi");
        System.out.println("5.keluar");

        String seleksi = a.nextLine().toLowerCase();

        switch(seleksi){
            case ("1") : 
            break;
            case ("2") :saldomember();
             break;
            case ("3") :Lihatsaldo();
            break;
            case ("4"):
            break;
            case ("5") : System.exit(0);
            
            default : System.out.println("invalid");
        }
    
    }

    public void Lihatsaldo(){
        System.out.println("saldo anda sekitar\t=\t" + saldomember);
        System.out.println("apakah anda ingin kembali? (Y/N)");
        String seleksi = a.nextLine().toLowerCase();
        if(seleksi.equals("y") || seleksi.equals("yes")){
            menutama();
        }
        else if (seleksi.equals("n") || seleksi.equals("no")){
            System.out.println("have a nice day " +getNama());
            System.exit(0);
        }
    }
    
    
    public void setsaldomember(){
        System.out.println("saldo anda sekitar\t=\t" + saldomember);
        System.out.println("apakah anda ingin top up? (Y/N)");
        String seleksi = a.nextLine().toLowerCase();
        if(seleksi.equals("y") || seleksi.equals("yes")){
            System.out.println("Ingin menggunakan ATM apa?\n1.Bca\n2.Mandiri");
            String seleksi2 = a.nextLine().toLowerCase();
            if(seleksi2.equals("bca") || seleksi2.equals("1")){
                System.out.println("masukkan saldo yang ingin dimasukkan\n(batas minima top up RP.10.000)");
                double saldo = a.nextDouble();
                if(saldo < batasmin){
                    while (saldo < batasmin){
                        saldo -=batasmin;
                        System.out.println("saldo invalid");
                        System.out.println("silahkan pilih menu lagi");
                        System.out.println("");
                        menutama();
                        
                    }

                }
                else if (saldo >batasmin){
                    saldomember += saldo -tax;
                    System.out.println("saldo anda telah di update");
                    System.out.println("");
                    System.out.println("balik ke menu awal? (y/n)");
                    a.nextLine();
                    String seleksi3 = a.nextLine().toLowerCase();
                    if(seleksi3.equals("y") || seleksi3.equals("yes")){
                        menutama();
                    }else{
                        System.out.println("have a nice day " + getNama());
                        System.exit(0);
                    }
                }

                }
            
            else if (seleksi2.equals("mandiri") || seleksi2.equals("2")){
                System.out.println("masukkan saldo yang ingin dimasukkan\n(batas minima top up RP.10.000)");
                double saldo = a.nextDouble();
                if(saldo < batasmin){
                    while (saldo < batasmin){
                        saldo -=batasmin;
                        System.out.println("saldo invalid");
                        System.out.println("silahkan login lagi ;)");
                        break;
                    }
            }
            else if (saldo >batasmin){
                saldomember += saldo -tax;
                System.out.println("saldo anda telah di update");
                System.out.println("");
                System.out.println("balik ke menu awal? (y/n)");
                a.nextLine();
                String seleksi3 = a.nextLine().toLowerCase();
                if(seleksi3.equals("y") || seleksi3.equals("yes")){
                    menutama();
                }else{
                    System.out.println("have a nice day " + getNama());
                    System.exit(0);
                }

        }
    }
    
        
    }
}
        
 
 












 


// public class baran {
//    ArrayList<Double> hargaBarang = new ArrayList<Double>();
//    ArrayList<String> namaBarang = new ArrayList<String>();
//    ArrayList<Integer> stokBarang = new ArrayList<Integer>();
//    public void tambahBarang(String barang, Double harga, int stok) {
//     namaBarang.add(barang);
//     hargaBarang.add(harga);
//     stokBarang.add(stok);
// }
// }


    public void display(){
        nama();
        alamat();
        telepon();
        
        menutama();
     
        
    }
    @Override
    public void barangMember() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'barangMember'");
    }
    
    
     
   
    // public void barangMember() {
    //     baran a = new baran();
    //     a.tambahBarang("malkis", 5000.0, 100);
    //     a.tambahBarang("roma", 10_000.0, 100);
    //     a.tambahBarang("mangga", 1000.0, 100);
    //     for(barang b :)

    // }

    // class transaksi{
    //     private Date tanggal;

    //     public transaksi(Date tanggal) {
    //         this.tanggal = tanggal;
    //     }
    // }



    

    
}
