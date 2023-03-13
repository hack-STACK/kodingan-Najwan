package tokoonlinetugas;

import java.util.Scanner;

public class display {
  String input;
    public void display(){
        Scanner a = new Scanner (System.in);
        //array declare of username passord, and clasifivcation 
        String [][] logiusername = {{"adi","mimi","member"},{"juan", "kuda", "karyawan"}, {"saya", "mereka", "member"},{"kamu","awok","karyawan"}};
        //made a object
        member c = new member();
        karyawan d = new karyawan();
        //input usernam
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
      for (int i = 0; i < logiusername.length; i++){
        if(input.equals(logiusername[i][0])&&password.equals(logiusername[i][1])){
          //member
            if(logiusername[i][2].equals("member")){

                member = true;
               ketawan = true;
            }
            //karyawan
            if(logiusername[i][2].equals("karyawan")){
                karyawan = true;
                ketawan = true;
            }
            break;
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
      }
      
     


    
     
        
    }



    }

