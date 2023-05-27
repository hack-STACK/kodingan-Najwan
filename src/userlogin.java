import java.util.ArrayList;

public class userlogin {

    private String admin;

    public String getAdmin()
    {
        return admin;
    }

    public void setAdmin(String admin)
    {
        this.admin = admin;
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    private String nama ;
    private String password;

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    private double saldo;

    public int getId() {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    private int id;


    userlogin(String admin, String nama, String password, double saldo, int Id)
    {
        this.admin = admin;
        this.nama = nama;
        this.password = password;
        this.saldo = saldo;
        this.id = Id;
    }
    public void tambahSaldo(double jumlah)
    {
        saldo += jumlah;
    }

    public boolean kurangiSaldo(double jumlah)
    {
        if (saldo >= jumlah)
        {
            saldo -= jumlah;
            return true;
        }
        else
        {
            return false;
        }
    }

}
