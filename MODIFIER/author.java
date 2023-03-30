//CLASS 2
package MODIFIER;

import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;

public class author {
    person p = new person();

    public author(){
        p.name = JOptionPane.showInputDialog(null, "masukkan nama andaa");//misal Najwan
        String ganti = JOptionPane.showInputDialog(null, "apakah anda mau mengganti nama anda \n yes or no");
        if(ganti.equals("yes")){
            p.name = JOptionPane.showInputDialog(null, "nama anda sekarang adalah (" + p.getName() + ") masukkan nama anda yang benar");
            
        }
    }
    public void print(){
        System.out.println("nama kamu adalah = "+p.name);
    }
    public static void main(String[] args) 
    {
        author a = new author();
        a.print();
    }
    


    
}
