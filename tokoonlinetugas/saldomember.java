package tokoonlinetugas;

import java.util.Scanner;

public abstract class saldomember {
    double saldomember = 10_000;
    double batasmin = 10_000;
    double tax = 5_000;

    Scanner a= new Scanner(System.in);
    public abstract void saldomember();


    public void menutama(){
        System.out.println("1.Beli barang");
        System.out.println("2.Isi saldo ");
        System.out.println("3.Lihat saldo ");
        System.out.println("4.transaksi");
        System.out.println("5.keluar");

        String seleksi = a.nextLine().toLowerCase();

        switch(seleksi){
            case ("1") : 
            break;
            case ("2") :setsaldomember();
             break;
            case ("3") :
            break;
            case ("4"):
            break;
            case ("5") : System.exit(0);
            
            default : System.out.println("invalid");
        }
    
    }
    
    
    public void setsaldomember(){
        System.out.println("saldo anda sekitar\t=\t" + saldomember);
        System.out.println("sepertinya saldo anda sedikit untuk membeli barang\napakah anda ingin top up? (Y/N)");
        String seleksi = a.nextLine().toLowerCase();
        if(seleksi.equals("y") || seleksi.equals("yes")){
            System.out.println("Ingin menggunakan ATM apa?\n1.Bca\n2.Mandiri");
            String seleksi2 = a.nextLine().toLowerCase();
            if(seleksi2.equals("bca") || seleksi2.equals("1")){
                System.out.println("masukkan saldo yang ingin dimasukkan\n(batas minima top up RP.10.000)");
                double saldo = a.nextDouble();
                while (saldo <=batasmin ){
                    saldo -=batasmin;
                    System.out.println("saldo invalid");
                }
                saldomember += - saldo -tax;
                System.out.println("saldo anda telah di update");
            }
            
        }
    }
  
}
