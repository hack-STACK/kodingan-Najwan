import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class display {
    private Random random = new Random();
    private int id = random.nextInt(1000);
    private client c = new client();
    private petugas d = new petugas();
    private double jumlah;
    //boolean
    boolean Petugas = false;
    boolean client = false;
    boolean found = false;

    public String[] getArray() {
        return new String[]{Arrays.toString(array)};
    }



    private String array[];

    private String input;

    private String input2;
    public void setInput(int input){
        this.input = String.valueOf(input);
    }
    public  void  setInput(String username){
        this.input = username;
    }

    public  void  setInput2(String password){
        this.input2 = password;
    }

    public void setInput(double input){
        this.input = String.valueOf((int) input);
    }
    public int getinput (){
        return Integer.parseInt(input);
    }

    public String getInput(){
        return input;
    }
    public String getinput2(){
        return input2;
    }

    public void setJumlah(double jumlah){
        this.jumlah = jumlah;
    }
    public double getJumlah(){
        return jumlah;
    }

    public void setArray(String input1 , String input2){
        this.array = new String[2];
        this.array[0] =input1;
        this.array [1]=input2;
    }

    Scanner a = new Scanner(System.in);
    ArrayList<userlogin> userlist = new ArrayList<userlogin>();


    public display(){
        //array declare of username passord, and clasifivcation
        userlogin adi = new userlogin("Petugas", "adi", "mimi", 0,id);
        userlogin juan = new userlogin("Client", "juan", "ju", 0,id);
        userlist.add(adi);
        userlist.add(juan);
    }

    public void display() throws InterruptedException {

        //made a object

        //input usernam
        System.out.println("");
        System.out.print("masukkan username\t=\t");
        setInput(a.nextLine());
        //input password
        System.out.print("masukkan password\t=\t");
        setInput2(a.nextLine());


        setArray(getInput(),getinput2());
        System.out.println(Arrays.toString(getArray()));

        //find username and password
        for (userlogin loginuser : userlist) {
            if (array[0].equals(loginuser.getNama()) && array[1].equals(loginuser.getPassword())) {
                if (loginuser.getAdmin().equals("Client")) {
                    client = true;
                    found = true;
                } else if (loginuser.getAdmin().equals("Petugas")) {
                    Petugas = true;
                    found = true;
                }
            }

        }
        //seleksi untuk terhindar dari else yang masuk ke dalam karyawan atau mekher
        if (found) {
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
