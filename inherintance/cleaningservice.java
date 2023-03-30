//SUB CLASS CLEANING SERVICE (3) START !!!!
package inherintance;
import java.util.Scanner;
public class cleaningservice extends employee {
    
    //disini kita mulai membuat scanner guna untuk input data si user dan gaji kita set ke 10 juta
    Scanner input = new Scanner(System.in); //scanner untuk inputan si user 
    double gaji = 3; //boss = 20 juta , manager = 8 juta , cleaning service = 3 juta , securtiy = 2 juta
    //disini kita menggunakan override untuk membuat ulang dari SUPERCLASS

   //baik kita mulai dari nama yang akan di input oleh user
    @Override
    void nama (){
        System.out.print("masukkan nama anda                      = ");
        nama = input.nextLine();
    }
    //membalikkan nilai nama (misal dari void nama kamu masukkan "juan", nah get nama ini berguna untuk mebalikkan nama ke void nama, dikarenakan kita memasukkan return ke string maka maka tidak bisa)
    public String getNama (){
        return nama;
    }
    //jam kerja, gunanya jam kerja disini untuk mengakumulasi dari bonus atau potongan yang akan di dapatkan si user ini dengan menggunakan method bonus dan method potongan
    @Override
    double jamKerja (){
        
        System.out.print("Jam kerja anda                                = ");
        jamKerja = input.nextFloat();
        return jamKerja;
    }

    //methodBonus, disini kita mengakumulasi menggunakan kondisi if else dengan parameter jam kerja sebagai acuan utama untuk mendapatkan bonus atau tidak 
    //kategori dibawah bonus ini berguna untuk menampilkan berapa persen tambahan gaji si user jika jam kerja melebihi ekspetasi di main class
    @Override
    double methodBonus(double bonus){
        
      
        if (jamKerja > 1500){
            bonus = (25*gaji/100);
            kategori = (" (Bonus 25%)");
            
        }
        else if (jamKerja <= 1499 && jamKerja >= 1000){
            bonus= (10*gaji/100);
            kategori =(" (Bonus 10%)");
        }
        else if (jamKerja <= 1000 && jamKerja >= 700){
            bonus =(20*gaji/100);
            kategori =(" (Bonus 20%)");
        }
        else if (jamKerja < 700){
            bonus =  0;
            kategori =(" (No bonus)");
        }
        else{
            kategori =(" (Tidak terdefinisi)");
        }
        return bonus;
        
        
    }
    
    // public void setBonus(double bonus) {
    //     bonus = bonus;
    // }
    
   
    //status, jadi disini kita akan menanyakan si user apakah si user ini sudah menikah atau belum menggunakan kondisi dengan parameter status1 dan equals sebagai syarat untuk mendapatkan bonus tunjangan atau tidak;
    @Override
        double status (){
        
        
        System.out.print("masukkan status anda (Menikah/Belum)          = ");
        status1 = input.nextLine();
        
        if (status1.equalsIgnoreCase("menikah")){
           status =  10; 
        }
        else if (status1.equalsIgnoreCase("belum")){
            status = 0 ;
        }
        return status;
        
    }

    
        
   
    //Potongan, Dan disini kita akan melakukan pemotongan gaji jika si user meng input jam kerja dibawah standart menggunakan kondisi if else dengan parameter jam kerja
    @Override
    double MethodPotongan (double potongan){
        
    
        if (jamKerja <= 200 &&jamKerja >= 150)
        {
            potongan = (2*gaji/100);
        }
        else if (jamKerja <= 150 && jamKerja >=101 ){
            potongan = (50*gaji/100);
        }
        else if (jamKerja <= 100 && jamKerja >=0){
           potongan = (80*gaji/100);
        }
        else if (jamKerja > 201){
            potongan = 0;
        }
      
        return potongan;
    }
        //hasilgaji, disini kita akan menghitung gaji bersih dari si user
        @Override
        protected void hasilgaji (){
  


        //value dari hasilgaji nett 
        double penambahan = (status + methodBonus(jamKerja) - MethodPotongan(potongan));
        hasilgaji =  (penambahan + gaji);
        
        
        
       
        
        
    }

    
 
}
