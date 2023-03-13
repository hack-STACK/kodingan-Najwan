package tokoonlinetugas;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
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
        this.setsaldomember();
    }
    public void setOverall(){
        this.setoverall();
    }

    double saldomember = 10_000;
    double batasmin = 10_000;
    double tax = 5_000;

    int barang1 = 100;
    int barang2 = 100;

    

    Scanner a= new Scanner(System.in);

    


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
            case ("1") : setoverall();
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
                        menutama();
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
    else if (seleksi.equals("n")||seleksi.equals("no")){
        menutama();
    }

    
}

        

  public void setoverall (){
    
    
    roma barang3R = new roma("roma", barang2, 5000.0);
    
    double hargaBarang2 = barang3R.getHargaBarang();

    roma barang3 = new roma("malkist", barang1, 5000.0);
    double hargaBarang1 = barang3.getHargaBarang();

    ArrayList<barang1>listawok = new ArrayList<barang1>();
    listawok.add(barang3R);
    listawok.add(barang3);

    for(barang1 barang1 : listawok){
        barang1.display();
    }
 

    System.out.println("mau beli yang mana\t=\t");
    String seleksi = a.nextLine().toLowerCase();
    if (seleksi.equals("roma")||seleksi.equals("1")){
        System.out.println("masukkan stok\t=\t");
        double stok = a.nextInt();
        if(barang2 > stok){
            Double r = stok-barang2;  
            stok = stok * hargaBarang2;
            System.out.println("hargabarang" + hargaBarang2);
            System.out.println("harga yang akan dibeli adalah\t=\t"+stok);
            System.out.println("apakah ingin melanjutkan transaksi?(Y/N)");
            a.nextLine();
            String seleksia= a.nextLine().toLowerCase();
            if (seleksia.equals("yes")||seleksia.equals("y")){
                if(saldomember > stok){
                    
                    
                    saldomember -= stok;
                    System.out.println("pembelian sukses");
                    System.out.println("apakah ingin kembali ke halaman awal?(Y/N)\t=\t");
                    String seleksi4 = a.nextLine().toLowerCase();
                    if(seleksi4.equals("yes")||seleksi4.equals("y")){
                        menutama();
                        
                    }
                    else if(seleksi.equals("no")||seleksi.equals("n")){
                        System.exit(0);
                    }
                }

                else if (saldomember < stok){
                    System.out.println("saldo anda kurang harap top up terlebih dahulu");
                    menutama();
                }
            }
            else if (seleksia.equals("no")||seleksia.equals("n")){
                menutama();
            }


        }
        else if(barang2<stok){
            System.out.println("anda membeli lebih dari stok yang seharusnya");
            a.nextLine();
            menutama();
        }
   
        
    }
    else if(seleksi.equals("2")|| seleksi.equals("malkis")){
        System.out.println("masukkan stok\t=\t");
        double stok = a.nextInt();
        if(barang1 > stok){
            stok = stok * hargaBarang1;
            System.out.println("hargabarang" + hargaBarang1);
            System.out.println("harga yang akan dibeli adalah\t=\t"+stok);
            System.out.println("apakah ingin melanjutkan transaksi?(Y/N)");
            a.nextLine();
            String seleksia= a.nextLine().toLowerCase();
            if (seleksia.equals("yes")||seleksia.equals("y")){
                if(saldomember > stok){
                    stok-=barang1;
                    saldomember -= stok;
                    System.out.println("pembelian sukses");
                    System.out.println("apakah ingin kembali ke halaman awal?(Y/N)\t=\t");
                    String seleksi4 = a.nextLine().toLowerCase();
                    if(seleksi4.equals("yes")||seleksi4.equals("y")){
                        menutama();
                    }
                    else if(seleksi.equals("no")||seleksi.equals("n")){
                        System.exit(0);
                    }
                }

                else if (saldomember < stok){
                    System.out.println("saldo anda kurang harap top up terlebih dahulu");
                    menutama();
                }
            }
            else if (seleksia.equals("no")||seleksia.equals("n")){
                menutama();
            }


        }
        else if(barang1<stok){
            System.out.println("anda membeli lebih dari stok yang seharusnya");
            a.nextLine();
            menutama();
        }
    }
}

    
    
    
  
  
 
   
    
   


 












 




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
    
    
     
  
    class transaksi{
        private Date tanggal;

        public transaksi(Date tanggal) {
            this.tanggal = tanggal;
        }
    }



    

    
}
