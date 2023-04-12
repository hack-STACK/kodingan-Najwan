package tokoonlinetugas;

public class loginuser {//constructor dari sebuah user login dan klasifikasi
    private String admin;

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String nama ;
    private String password;

    loginuser(String admin, String nama,String password){
        this.admin = admin;
        this.nama = nama;
        this.password = password;
    }


}
