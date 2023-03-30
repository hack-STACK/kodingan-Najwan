//CLASS
package Setter;

import javax.swing.JOptionPane;

public class scatter {
    private String nama;
    private String email;
    private int umut;
    private String alamat;
   
       
       
        public void setUmut(int umut) 
        {
            this.umut = umut;
        }
        
        public void setNama(String nama) 
        {
           
            this.nama = nama;
        }
        public void setEmail(String email) 
        {
           
            this.email = email;
        }
      
        public void setAlamat(String alamat) 
        {
            this.alamat = alamat;
        }
        public String getNama() 
        {
            
            return this.nama;
        }
        public String getEmail() 
        {
            
            return this.email;
          
        }
        public int getUmut() 
        {
            return this.umut;
        }
      
        public String getAlamat() 
        {
            
            return this.alamat;
        }
      public static void main(String[] args) 
      {
        scatter a = new scatter();
        a.setNama(JOptionPane.showInputDialog("Masukkan Nama"));//MISAL NAJWAN
        a.setUmut(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Umut")));//MISAL 16
        a.setEmail(JOptionPane.showInputDialog("Masukkan Email"));//MISAL AWIKWOKGGMAIL
        a.setAlamat(JOptionPane.showInputDialog("Masukkan Alamat"));//MISAL PAKIS 

        //PERINTOUT
        System.out.println("Nama : "+a.getNama());
        System.out.println("Email : "+a.getEmail());
        System.out.println("Umut : "+a.getUmut());
        System.out.println("Alamat : "+a.getAlamat());

      }
 }
   
   
