package tokoonlinetugas;

import java.util.Scanner;

import tokoonlinetugas.Myinterfecases.karyawaninter;

public class karyawan extends userinter implements karyawaninter {
    String jabatana = null;
    Scanner a = new Scanner(System.in);

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
    public void jabatan(){
        System.out.println("masukkan jabatan anda \n1.boss\n2.manager\n3.karyawan");
        int jabatan = a.nextInt();
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

     //display output
    public void display(){
        nama();
        alamat();
        telepon();
        jabatan();
        System.out.println("Nama : "+this.getNama());
        System.out.println("Alamat : "+this.getAlamat());
        System.out.println("Telepon : "+this.getTelepon());
        System.out.println("Jabatan : "+jabatana);
       
    }

}
