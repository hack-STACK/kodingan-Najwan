package tokoonlinetugas;

import java.util.ArrayList;
import java.util.Scanner;

import tokoonlinetugas.Myinterfecases.karyawaninter;

public class karyawan extends userinter implements karyawaninter {
    String jabatana = null;


    Scanner a = new Scanner(System.in);
    int index;
    String nama;

    int stokbarang;

    double harga;

    barangsemua ak = new barangsemua(index,nama,stokbarang,harga,0);
    ArrayList<barang1> listawok = new ArrayList<barang1>();


    //penggunaan abstract 
    public void nama(){
        this.setNama(null);
    }
    public void alamat(){
        this.setAlamat(null);
    }

    public void telepon(){
        this.setTelepon();
      
    }
    //penggunaan interface
    public void jabatan(){//jabatan si user
        System.out.println("masukkan jabatan anda \n1.boss\n2.manager\n3.karyawan");
        int jabatan = a.nextInt();//inputan user menggunakan integer untuk mengklasifikasikan jabatan si user
        if(jabatan==1){
            jabatana = "boss";
        }
        else if(jabatan==2){
            jabatana = "manager";
        }
        else if(jabatan==3){
            jabatana = "karyawan";
        }
     }

     public void nambahin(){
         System.out.println("masukkan berapa barang yang akan di input");
         int jumlah = a.nextInt();//memasukkan beberapa unit yang akan diinputkan user
         for(int i = 1; i <= jumlah; i++ ){
             a.nextLine();
             index ++;
             System.out.println("\t"+index+"\t");
             System.out.print("masukkan nama barang\t=\t");
             nama = a.nextLine(); a.nextLine();
             System.out.print("masukkan stok baranng\t=\t");
             stokbarang = a.nextInt();
             System.out.print("masukkan harga\t=\t");
             harga = a.nextDouble();
             listawok.add(new barang1(index,nama,stokbarang,harga,0));
             a.nextLine();

         }//memasukkan beberapa unit barang

         menutama();//masuk ke class menu utama jika looping sudah terpenuhi

     }
     public  void  edit(){
        for (barang1 barang1 : listawok){
            barang1.display();//mengeluarkan semua isi arraylist yang telah dimasukkan oleh user
        }


     }
     public void editbarang(){
         System.out.println("Edit stok? (Y/N)");
         String seleksi = a.nextLine().toLowerCase();//seleksi antara menambahkan stok atau mengurangi

         if (seleksi.equals("y")){//seleksi kondisi jika ingin edit stok
             edit();
             System.out.print("masukkan urutan yang ingin di edit\t=\t");
             int seleksi1 = a.nextInt();//inputan user
             a.nextLine();//untuk menghindari buffer dalam scanner
             System.out.println("");
             if (seleksi1>0&&seleksi1 <=listawok.size()){
                 System.out.println("Stok sebelumnya\t=\t"+listawok.get(seleksi1-1).getStokBarang());//menampilkan barang sebelumnya dengan menggunakan constructor index sebagia acuan
                 System.out.print("masukkan stok\t=\t");
                 stokbarang = a.nextInt();//inputan memasukkan stok
                 a.nextLine();
                 listawok.get(seleksi1-1).setStok(stokbarang);//memperbarui stok sebelumnya
                 menutama();
             }


         } else if (seleksi.equals("n")) {
             menutama();
         }
     }

     public void menuawal(){//class untuk balik ke menuutama dengan seleksi kondisi
         System.out.println("");
         System.out.println("Balik ke menu awal?(Y/N)");
         String b = a.nextLine().toLowerCase();
         if (b.equals("y")){

             menutama();
         }
         else if (b.equals(("n"))){
             System.exit(0);
         }
     }




         public void menutama() {//menu utama yang berguna untuk pemilihan opsi sebagai karyawab
        if (jabatana == "boss"){
            a.nextLine();
            System.out.println("");
            System.out.println("=====PILIHAN BOSS=====");
            System.out.println("1.Nambahin Barang");
            System.out.println("2.Lihat barang ");
            System.out.println("3.Edit barang");
            System.out.println("4.keluar");
            System.out.println("");

            String seleksi = a.nextLine().toLowerCase();
            //switch case seleksi
            switch (seleksi) {
                case ("1"):nambahin();//menambahkan barang barang ke dalam arraylist

                    break;
                case ("2"):edit();//lihat barang menggunakan for each

                    break;
                case ("3"):editbarang();//edit stok barang

                    break;
                case ("4"):
                    System.exit(0);//keluar dari system

                default:
                    System.out.println("invalid");
                    break;
            }

        }
        else if (jabatana == "manager"){
            a.nextLine();
            System.out.println("");
            System.out.println("=====PILIHAN MANAGER=====");
            System.out.println("1.Nambahin Barang");
            System.out.println("2.Lihat barang ");
            System.out.println("3.Edit barang");
            System.out.println("4.keluar");
            System.out.println("");

            String seleksi = a.nextLine().toLowerCase();
            //switch case seleksi
            switch (seleksi) {
                case ("1"):nambahin();//menambahkan barang barang ke dalam arraylist

                    break;
                case ("2"):edit();//lihat barang menggunakan for each

                    break;
                case ("3"):editbarang();//edit stok barang

                    break;
                case ("4"):
                    System.exit(0);//keluar dari system

                default:
                    System.out.println("invalid");
            }
        } else if (jabatana == "karyawan") {
            a.nextLine();
            System.out.println("");
            System.out.println("=====PILIHAN KARYAWAN=====");
            System.out.println("1.Nambahin Barang");
            System.out.println("2.Lihat barang ");
            System.out.println("3.Edit barang");
            System.out.println("4.keluar");
            System.out.println("");

            String seleksi = a.nextLine().toLowerCase();
            //switch case seleksi
            switch (seleksi) {
                case ("1"):nambahin();//menambahkan barang barang ke dalam arraylist

                    break;
                case ("2"):edit();//lihat barang menggunakan for each

                    break;
                case ("3"):editbarang();//edit stok barang

                    break;
                case ("4"):
                    System.exit(0);//keluar dari system

                default:
                    System.out.println("invalid");
            }
        }


         }


     //display output
    public void display(){//mengeluarkan semua output dari semua class

        nama();//abstract nama
        alamat();//abstract alamat
        telepon();//abstract telepon
        jabatan();//jabatan interface
        menutama();//class menuutama


    }

}
