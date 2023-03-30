package inherintance;
import java.util.Scanner;
public class employee {
    
    double   potongan, jamKerja, status, hasilgaji; //Deklarasi untuk method yang akan digunakan
    String nama;
    String status1, kategori;
    
    

    //Method Nama untuk menyimpan nama  
    void nama (){
     
    }
    //Method getNama untuk mengambil dan mengembalikan hasil dari simpanan method nama
    public String getNama (){
        return nama;
    }
    
    //method jam kerja yang digunakan dalam perwarisan
    double jamKerja (){
        
        return 0;
    }
    //Method status untuk menseleksi apakah si user ini sudah MENIKAH/BELUM (jika ya dia akan mendapatkan tunjangan dan begitupun sebaliknya)
        double status (){
          
          
        return 0;
        
    }
    //Method Gaji ini akan digunakan dalam perwarisan
    double gaji (){
       
        return 0;
    }
    //method Bonus adalah bonus yang dihitung seberapa banyak jam kerja yang si user ini input dan akumulasi dan mendapatkan bonus dalam bentuk persen
    double methodBonus(double bonus){
        return 0;
    }
    //Method potongan adalah pemotongan gaji disaat input jam kerja ini kurang dari yang ditentukan
double MethodPotongan (double potongan){
       
        return 0;
    }
    protected void hasilgaji (){
        
        
    }
}

