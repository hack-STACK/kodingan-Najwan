
package inherintance;

import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.function.ToDoubleBiFunction;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

import Setter.scatter;

public class mainnn {
    public static void main(String[] args) throws InterruptedException {
        
        Scanner a = new Scanner(System.in);
        
        int seleksi;//BUAT PERCABANGAN
        boss lofi = new boss();// Membuat OBJECT boss
        manager sofi = new manager();// Membuat OBJECT manager
        cleaningservice kofi = new cleaningservice();// Membuat OBJECT cleaningservice
        security mofi = new security();// Membuat OBJECT security


        //input user, disini kita harus tahu dulu user bekerja sebagai apa, jika user sudah menginput maka kita masuk ke step selanjutnya
        System.out.print("anda bekerja sebagai apa \n1.Boss\n2.Manager\n3.Cleaning Service\n4.Security\nmasukkan jawaban anda(format Berupa Nomor)             = ");
         seleksi= a.nextInt();//seleksi menyimpan inputan user

         //masuk ke dalam kondisi dengan (SELEKSI) sebagai acuan dia mendapatkan gaji berapa
        if (seleksi == 1){  //boss
            
            System.out.println("=================" + "START" + "=================");
            lofi.nama();//user input nama
            lofi.status();//user input status (MENIKAH/BELUM) dengan format equals
          
            lofi.jamKerja();//user input jam kerja untuk menjadi acuan mendapatkan berapa bonus atau potongan
            lofi.hasilgaji();// hasil gaji bersih dari si user
            System.out.println("=================" + "OUTPUT" + "=================");
            System.out.println("Nama Anda                   = " + lofi.getNama()); //nama user
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Status Anda                 = " + lofi.status1);// status user
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Gaji Pokok                =" + lofi.gaji + " juta"); //gaji pokok user
            TimeUnit.SECONDS.sleep(1);
            System.out.println("                Menghitung");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Gaji nett                    = " + lofi.hasilgaji +"Juta"+ lofi.kategori); //gaji bersih user
           
            System.out.println("=================" + "BOSS" + "=================");
        }
        else if (seleksi == 2){//MANAGER
            System.out.println("=================" + "START" + "=================");
            sofi.nama();//user input nama
            sofi.status();//user input status (MENIKAH/BELUM) dengan format equals
          
            sofi.jamKerja();//user input jam kerja untuk menjadi acuan mendapatkan berapa bonus atau potongan
            sofi.hasilgaji();// hasil gaji bersih dari si user
            System.out.println("=================" + "OUTPUT" + "=================");
            System.out.println("Nama Anda                   = " + sofi.getNama()); // nama user
            TimeUnit.SECONDS.sleep(1);  //time unit ini berguna untuk seberapa lama si output atau input akan muncul di terminal
            System.out.println("Status Anda                 = " + sofi.status1); // status user
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Gaji Pokok                =" + sofi.gaji + " juta"); //Gaji pokok user
            TimeUnit.SECONDS.sleep(1);
            System.out.println("                Menghitung");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Gaji nett                    =" + sofi.hasilgaji +"Juta"+ sofi.kategori); // hasilg Gaji bersih
            System.out.println("=================" + "MANAGER" + "=================");
        }
        else if (seleksi == 3){
            System.out.println("=================" + "START" + "=================");
            kofi.nama();//user input nama
            kofi.status();//user input status (MENIKAH/BELUM) dengan format equals
          
            kofi.jamKerja();//user input jam kerja untuk menjadi acuan mendapatkan berapa bonus atau potongan
            kofi.hasilgaji();// hasil gaji bersih dari si user
            System.out.println("=================" + "OUTPUT" + "=================");
            System.out.println("Nama Anda                   = " + kofi.getNama()); // nama user
            TimeUnit.SECONDS.sleep(1);//time unit ini berguna untuk seberapa lama si output atau input akan muncul di terminal
            System.out.println("Status Anda                 = " + kofi.status1); // status user
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Gaji Pokok                =" + kofi.gaji + " juta");//Gaji pokok user
            TimeUnit.SECONDS.sleep(1);
            System.out.println("                Menghitung");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Gaji nett                    =" + kofi.hasilgaji +"Juta"+ kofi.kategori); // hasilg Gaji bersih
            System.out.println("=================" + "ClEANING" + "=================");
        }
        else if (seleksi == 4){
            System.out.println("=================" + "START" + "=================");
            mofi.nama();//user input nama
            mofi.status();//user input status (MENIKAH/BELUM) dengan format equals
          
            mofi.jamKerja();//user input jam kerja untuk menjadi acuan mendapatkan berapa bonus atau potongan
            mofi.hasilgaji();// hasil gaji bersih dari si user
            System.out.println("=================" + "OUTPUT" + "=================");
            System.out.println("Nama Anda                   = " + mofi.getNama()); // nama user
            TimeUnit.SECONDS.sleep(1);//time unit ini berguna untuk seberapa lama si output atau input akan muncul di terminal
            System.out.println("Status Anda                 = " + mofi.status1);// status user
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Gaji Pokok                =" + mofi.gaji + " juta");//Gaji pokok user
            TimeUnit.SECONDS.sleep(1);
            System.out.println("                Menghitung");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Gaji nett                    =" + mofi.hasilgaji +"Juta"+ mofi.kategori); // hasilg Gaji bersih
            System.out.println("=================" + "SECURITY" + "=================");
        }
        else {
            System.out.println("not defined"); //jika user salah menginput maka keluar else 
        }

    }
}
