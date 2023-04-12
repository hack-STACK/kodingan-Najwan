package tokoonlinetugas;

import java.util.ArrayList;
import java.util.Scanner;

public class display {
  String input;
    public void display(){
        Scanner a = new Scanner (System.in);
        //array declare of username passord, and clasifivcation
        loginuser adi = new loginuser("member","adi","mimi");
        loginuser juan = new loginuser("karyawan","juan","ju");

        ArrayList<loginuser> listawok = new ArrayList<loginuser>();
        listawok.add(adi);
        listawok.add(juan);
        //made a object
        member c = new member();
        karyawan d = new karyawan();
        //input usernam
        System.out.println("");
        System.out.print("masukkan username\t=\t");
        input = a.nextLine().toLowerCase();
       //input password
        System.out.print("masukkan password\t=\t");
        String password = a.nextLine().toLowerCase();
        
        //boolean
        boolean karyawan = false;
        boolean member = false;
        boolean ketawan = false;
      //find username and password
        for (loginuser loginuser : listawok){
            if (input.equals(loginuser.getNama())&&password.equals(loginuser.getPassword())){
                if (loginuser.getAdmin().equals("member")){
                    member = true;
                    ketawan = true;
                }
                else if (loginuser.getAdmin().equals("karyawan")){
                    karyawan = true;
                    ketawan = true;
                }
            }
        }
      //seleksi untuk terhindar dari else yang masuk ke dalam karyawan atau mekher
      if (ketawan){
        if(member){
            System.out.println("======MEMBER======");
            c.display();
        }
        if(karyawan){
            System.out.println("======KARYAWAN======");
            d.display();
        }
        
      }
      else{
        System.out.println("username and password salah");
        display();
      }
      
     


    
     
        
    }



    }

