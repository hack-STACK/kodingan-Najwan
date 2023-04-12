package tokoonlinetugas;

public class atmconstructor {
    public String getNamaAtm() {
        return namaAtm;
    }

    public void setNamaAtm(String namaAtm) {
        this.namaAtm = namaAtm;
    }

    public double getBiayatax() {
        return biayatax;
    }

    public void setBiayatax(double biayatax) {
        this.biayatax = biayatax;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getNariksaldo() {
        return nariksaldo;
    }

    public void setNariksaldo(double nariksaldo) {
        this.nariksaldo = nariksaldo;
    }

    public double getNambahsaldo() {
        return nambahsaldo;
    }

    public void setNambahsaldo(double nambahsaldo) {
        this.nambahsaldo = nambahsaldo;
    }

    private String namaAtm;
    private double biayatax = 0;
    private double saldo = 0;
    private double nariksaldo = 0;

    private double nambahsaldo = 0;
    atmconstructor(String namaAtm, double biayatax, double saldo , double nariksaldo, double nambahsaldo){
        this.namaAtm = namaAtm;
        this.biayatax = biayatax;
        this.saldo = saldo;
        this.nambahsaldo = nambahsaldo;
        this.nariksaldo = nariksaldo;
    }

}
