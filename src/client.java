import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class client extends perwarisan implements myInterfaces
{
    Scanner a = new Scanner(System.in);

    private String input;
    private double jumlah;

    private double harga;

    private userlogin user = new userlogin("admin","user","user",0,0);
    private ArrayList<jenislaundry> listlaundry = new ArrayList<jenislaundry>();

    protected void alamat()
    {
        this.setAlamat(null);
    }


    protected void telepon()
    {
        this.setTelepon();
    }

    public void setHarga(double ab, double ag){
        this.harga = ab * ag;
    }
    public double getHarga(){
        return harga;
    }



    protected void nama()
    {
        this.setNama(getNama());
    }

    public void setInput(int input){
        this.input = String.valueOf(input);
    }
    public  void  setInput(String input){
        this.input = input;
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

    public void setJumlah(double jumlah){
        this.jumlah = jumlah;
    }
    public double getJumlah(){
        return Double.parseDouble(String.valueOf(jumlah));
    }

    public client ()
    {
        jenislaundry aSuper = new jenislaundry(1,2,"Super",50000);
        jenislaundry aBiasa = new jenislaundry(2,5,"Biasa",20000);
        jenislaundry aHemat = new jenislaundry(3,9,"Hemat",10000);
        listlaundry.add(aSuper);
        listlaundry.add(aBiasa);
        listlaundry.add(aHemat);

    }

    private void clearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }


    private void pilihjenis() throws InterruptedException {
        System.out.println("Pilih jenis laundry");
        System.out.println("======================================================");
        System.out.println("| Index | Durasi |     Jenis     |      Harga      |");
        System.out.println("======================================================");
        for (jenislaundry jenislaundry1 : listlaundry)
        {
            jenislaundry1.print();
        }
        System.out.print("silahkan pilih\t:\t");
        super.setInput(a.nextInt());
        jenislaundry choosenlaundry = null;
        for (jenislaundry jenislaundry : listlaundry)

        {
            if(jenislaundry.getIndex() == getinput())
            {
                choosenlaundry = jenislaundry;
                break;
            }


        }
        if (choosenlaundry == null){
            System.out.println("pilihan tidak valid");
            return;
        }
        System.out.printf("Anda memilih laundry %s (Rp%.0f/KG).%n", choosenlaundry.getJenis(), choosenlaundry.getHarga());
        System.out.print("Masukkan berapa barang yang akan dicuci: ");
        super.setJumlah(a.nextDouble());
        //double totalHarga =  (choosenlaundry.getHarga() * getinput());
        //setJumlah(choosenlaundry.getHarga()*getinput());
//        setHarga(choosenlaundry.getHarga(), super.getJumlah());
        setHarga(choosenlaundry.getHarga(), super.getJumlah());
        System.out.println(getHarga() + super.getJumlah());
        if (user.getSaldo() < getHarga())
        {
            System.out.println("saldo anda kurang");
            System.out.print("Kembali (Y/N)\t:\t");
            a.nextLine();
            super.setInput(a.nextLine().toLowerCase());
            if (super.getInput().equals("y"))
            {

                menutama();
            }
            else if (super.getInput().equals("n"))
            {
                System.exit(0);
            }
        }
        else if (user.getSaldo() > super.getJumlah())
        {
            nama();
            user.kurangiSaldo(getHarga());
            choosenlaundry.printReceipt(super.getJumlah(),getHarga(),super.getNama());
            System.out.println(user.getSaldo() + getHarga());
            System.out.println("ingin kembali?(Y/N)");
            a.nextLine();
            setInput(a.nextLine());
            if (input.equalsIgnoreCase("y"))
            {
                menutama();
            }
            else if (input.equalsIgnoreCase("n"))
            {
                System.exit(0);
            }


        }
    }

    private void isisaldo() throws InterruptedException {
        System.out.print("masukkan saldo yang akan ditambah\t:\t");
        super.setJumlah(a.nextDouble());
        user.tambahSaldo(super.getJumlah());
        System.out.print("Kembali?(Y/N)\t:");
        a.nextLine();
        super.setInput(a.nextLine());
        if (super.getInput().equalsIgnoreCase("y"))
        {
            menutama();
        } else if (super.getInput().equalsIgnoreCase("n"))
        {
            System.exit(3);
        }

    }
    private void lihatsaldo() throws InterruptedException {
        System.out.print("Loading");

        for (int i = 0; i < 3; i++) {
            Thread.sleep(500); // Jeda selama 0.5 detik
            System.out.print(".");
        }
        clearConsole();
        System.out.println();
        System.out.println("Saldo anda RP." + user.getSaldo());
        System.out.print("1. Kembali\n2. Top Up\nSilahkan memilih : \t");
        a.nextLine(); // Membersihkan newline character
        setInput(a.nextLine().toLowerCase());
        if (input.equals("1") || input.equals("kembali")) {
            System.out.print("Loading");

            for (int i = 0; i < 3; i++) {
                Thread.sleep(500); // Jeda selama 0.5 detik biar keren
                System.out.print(".");
            }
            clearConsole();
            System.out.println("\n");
            menutama();
        } else if (input.equals("2") || input.equals("top up")) {
            System.out.print("Loading");

            for (int i = 0; i < 3; i++) {
                Thread.sleep(500); // Jeda selama 0.5 detik biar keren
                System.out.print(".");
            }
            clearConsole();
            System.out.println("\n");
            isisaldo();
        }
    }


    public void menutama() throws InterruptedException {//Opsi sebagai member
        System.out.println("");
        System.out.println("=====PILIHAN Client=====");
        System.out.println("1.Pilih Jenis");
        System.out.println("2.Isi saldo ");
        System.out.println("3.Lihat saldo ");
        System.out.println("4.keluar");
        System.out.println("");
        System.out.print("silahkan memilih\t: ");
        setInput(a.nextInt());
        //switch case seleksi
        switch (getinput())
        {
            case (1):
                pilihjenis();//membeli barang
                break;
            case (2):
                isisaldo();//mengisi saldo (SEBAGAI MEMBER)
                break;
            case (3):
                lihatsaldo();//Lihat saldo
                break;
            case (4):
                System.exit(3);//keluar dari system

            default:
                System.out.println("invalid");
                menutama();
        }

    }

    public void print() throws InterruptedException {
        menutama();
    }


}