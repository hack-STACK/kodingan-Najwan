import java.util.ArrayList;

public class jenislaundry implements myInterfaces {

    public double getDurasi() {
        return durasi;
    }

    public void setDurasi(double durasi) {
        this.durasi = durasi;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    private  double durasi;
    private  String jenis;
    private  double harga;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private  int index;
    private ArrayList<jenislaundry> listlaundry = new ArrayList<jenislaundry>();
    public jenislaundry ()
    {
        jenislaundry aSuper = new jenislaundry(1,2,"Super",50000);
        jenislaundry aBiasa = new jenislaundry(2,5,"Biasa",20000);
        jenislaundry aHemat = new jenislaundry(3,9,"Hemat",10000);
        listlaundry.add(aSuper);
        listlaundry.add(aBiasa);
        listlaundry.add(aHemat);

    }




    jenislaundry(int index ,double durasi, String jenis, double harga){
        this.harga = harga;
        this.durasi = durasi;
        this.jenis = jenis;
        this.index = index;
    }





    public void print(){

//        System.out.println("======================================================");
//        System.out.println("| Index | Durasi |     Jenis     |      Harga      |");
//        System.out.println("======================================================");


            System.out.printf("|   %-3d |   %-4.1f | %-13s | Rp%-14.1f |\n",
                    getIndex(), getDurasi(), getJenis(), getHarga());
            System.out.println("------------------------------------------------------");


    }
    public void printReceipt(double jumlah, double totalHarga, String nama) {
        System.out.println("==============================");
        System.out.println("       Struk Laundryku        ");
        System.out.println("==============================");
        System.out.println("Nama anda: "+ nama);
        System.out.println("Jenis Laundry: " + jenis);
        System.out.println("Estimasi Waktu: " + durasi + " Jam");
        System.out.println("berat Barang: " + jumlah+"/Kg");
        System.out.println("Total Harga: Rp" + totalHarga);
        System.out.println("==============================");
    }

}

