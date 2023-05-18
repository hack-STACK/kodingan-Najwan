import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class display {
    private Random random = new Random();
    private int id = random.nextInt(1000);
    private client c = new client();
    private petugas d = new petugas();
    public void display() {


        Scanner a = new Scanner(System.in);
        //array declare of username passord, and clasifivcation
        userlogin adi = new userlogin("Petugas", "adi", "mimi", 0,id);
        userlogin juan = new userlogin("Client", "juan", "ju", 0,id);

        ArrayList<userlogin> listawok = new ArrayList<userlogin>();
        listawok.add(adi);
        listawok.add(juan);
        //made a object

        //input usernam
        System.out.println("");
        System.out.print("masukkan username\t=\t");
        String input = a.nextLine().toLowerCase();
        //input password
        System.out.print("masukkan password\t=\t");
        String password = a.nextLine().toLowerCase();

        //boolean
        boolean Petugas = false;
        boolean client = false;
        boolean ketawan = false;
        //find username and password
        for (userlogin loginuser : listawok) {
            if (input.equals(loginuser.getNama()) && password.equals(loginuser.getPassword())) {
                if (loginuser.getAdmin().equals("Client")) {
                    client = true;
                    ketawan = true;
                } else if (loginuser.getAdmin().equals("Petugas")) {
                    Petugas = true;
                    ketawan = true;
                }
            }

        }
        //seleksi untuk terhindar dari else yang masuk ke dalam karyawan atau mekher
        if (ketawan) {
            if (client) {
                System.out.println("======CLIENT======");
                c.print();
            }
            if (Petugas) {
                System.out.println("======PETUGAS======");
                d.print();
            }

        } else {
            System.out.println("username and password salah");
            display();
        }

    }
}
