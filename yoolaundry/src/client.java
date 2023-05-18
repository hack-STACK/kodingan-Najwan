import java.util.ArrayList;
import java.util.Scanner;

public class client extends perwarisan implements myInterfaces {

    Scanner a = new Scanner(System.in);

    private userlogin user = new userlogin("admin","user","user",0,0);
    protected void alamat() {
        this.setAlamat(null);
    }


    protected void telepon() {
        this.setTelepon();
    }


    protected void nama() {
        this.setNama(null);
    }


    private ArrayList<jenislaundry> listlaun = new ArrayList<jenislaundry>();
    private jenislaundry aSuper = new jenislaundry(1,2,"Super",50000);
    private jenislaundry aBiasa = new jenislaundry(2,5,"Biasa",20000);
    private jenislaundry aHemat = new jenislaundry(3,9,"Hemat",10000);

    private void pilihjenis(){


        listlaun.add(aSuper);
        listlaun.add(aBiasa);
        listlaun.add(aHemat);

        System.out.println("Pilih jenis laundry");
        for (jenislaundry jenislaundry1 : listlaun){
            jenislaundry1.print();
        }
        System.out.print("silahkan pilih\t:\t");
        int input = a.nextInt();
        jenislaundry choosenlaundry =null;
        for (jenislaundry jenislaundry : listlaun){
            if(jenislaundry.getIndex() == input){
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
        double jumlah = a.nextDouble();
        double totalHarga =  (choosenlaundry.getHarga() * jumlah);
        if (user.getSaldo() < totalHarga) {
            System.out.println("saldo anda kurang");
            System.out.print("Kembali (Y/N)\t:\t");
            a.nextLine();
            String ab = a.nextLine().toLowerCase();
            if (ab.equals("y")){
                menutama();
            } else if (ab.equals("n")) {
                System.exit(0);
            }
        } else if (user.getSaldo() > totalHarga) {
            user.kurangiSaldo(totalHarga);
            choosenlaundry.printReceipt(jumlah,totalHarga);
            System.out.println("ingin kembali?(Y/N)");
            a.nextLine();
            String iput = a.nextLine();
            if (iput.equalsIgnoreCase("y")){
                menutama();
            } else if (iput.equalsIgnoreCase("n")) {
                System.exit(0);
            }


        }
    }

    private void isisaldo(){
        System.out.print("masukkan saldo yang akan ditambah\t:\t");
        int jumlahsaldo = a.nextInt();
        user.tambahSaldo(jumlahsaldo);
        System.out.print("Kembali?(Y/N)\t:");
        a.nextLine();
        String input = a.nextLine();
        if (input.equalsIgnoreCase("y")){
            menutama();
        } else if (input.equalsIgnoreCase("n")) {
            System.exit(0);
        }

    }
    private void lihatsaldo(){
        System.out.println("saldo anda RP."+user.getSaldo());
        menutama();
    }

    public void menutama() {//Opsi sebagai member
        System.out.println("");
        System.out.println("=====PILIHAN Client=====");
        System.out.println("1.Pilih Jenis");
        System.out.println("2.Isi saldo ");
        System.out.println("3.Lihat saldo ");
        System.out.println("4.keluar");
        System.out.println("");
        System.out.print("silahkan memilih\t: ");
        String seleksi = a.nextLine().toLowerCase();
        //switch case seleksi
        switch (seleksi) {
            case ("1"):
                pilihjenis();//membeli barang
                break;
            case ("2"):
                isisaldo();//mengisi saldo (SEBAGAI MEMBER)
                break;
            case ("3"):
                lihatsaldo();//Lihat saldo
                break;
            case ("4"):
                System.exit(0);//keluar dari system

            default:
                System.out.println("invalid");
        }

    }

    public void print() {
        menutama();
    }


}
