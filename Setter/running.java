//CLASS 2
package Setter;
import java.util.Set;
import javax.swing.JOptionPane;
import MODIFIER.author;

public class running 
{
   scatter a = new scatter();

    public running()
    {
      a.nama = JOptionPane.showInputDialog(null, "masukin nama anda");//MISAL NAJWAN
        a.umut = Integer.parseInt(JOptionPane.showInputDialog(null, "masukkan umur anda"));//MISAL 16
        a.alamat = JOptionPane.showInputDialog(null, "masukkan alamat anda");//MISAL PAKIS
        a.email = JOptionPane.showInputDialog(null, "masukkan email anda");//MISAL AWIKWOKGMAIL

        
    }
    public void print() 
    { 

      System.out.println(a.nama); 
      System.out.println(a.umut); 
      System.out.println(a.alamat); 
      System.out.println(a.email); 

  }



    public static void main(String[] args) 
    { 
      running awok = new running();
        awok.print();


    }
}