package Constructor;

import javax.swing.JOptionPane;

public class constructor 
{

    public static class User 
    {
        private String name;
        private String password;

        public User() 
        {
            this.name = JOptionPane.showInputDialog(name, "masukkan nama"); //Juwan
            this.password = JOptionPane.showInputDialog(password,"masukkan password"); //12345
        }
    }

    public static class RUN{

        public static void main(String[] args) 
        {

            User u = new User();
            System.out.println(u.name);

            System.out.println(u.password);

        }

    }  
    
} 