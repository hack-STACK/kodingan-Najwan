package tokoonlinetugas;

import java.util.Scanner;

public class display {
    public void display(){
        Scanner a = new Scanner (System.in);
        String [][] logiusername = {{"adi","mimi","member"},{"juan", "kuda", "karyawan"}, {"saya", "mereka", "member"},{"kamu","awok","karyawan"}};
        member c = new member();
        karyawan d = new karyawan();

        System.out.print("masukkan username\t=\t");
        String input = a.nextLine().toLowerCase();
        System.out.print("masukkan password\t=\t");
        String password = a.nextLine().toLowerCase();

        boolean karyawan = false;
        boolean member = false;
        boolean ketawan = false;

      for (int i = 0; i < logiusername.length; i++){
        if(input.equals(logiusername[i][0])&&password.equals(logiusername[i][1])){
            if(logiusername[i][2].equals("member")){

                member = true;
               ketawan = true;
            }
            if(logiusername[i][2].equals("karyawan")){
                karyawan = true;
                ketawan = true;
            }
            break;
        }
    
        
      }
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

