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





    jenislaundry(int index ,double durasi, String jenis, double harga){
        this.harga = harga;
        this.durasi = durasi;
        this.jenis = jenis;
        this.index = index;
    }





    public void print(){
        System.out.println("No."+index+"\nJenis\t=\t"+jenis+"\nHarga\t=\t"+harga+"\nDurasi\t=\t"+durasi);
        System.out.println("");
    }
    public void printReceipt(double jumlah, double totalHarga) {
        System.out.println("==============================");
        System.out.println("       Struk Laundryku        ");
        System.out.println("==============================");
        System.out.println("Jenis Laundry: " + jenis);
        System.out.println("Estimasi Waktu: " + durasi + " Jam");
        System.out.println("Jumlah Barang: " + jumlah);
        System.out.println("Total Harga: Rp" + totalHarga);
        System.out.println("==============================");
    }

}

