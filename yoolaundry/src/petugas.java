public class petugas extends perwarisan implements myInterfaces{
    String jabatana = null;
    protected void alamat() {
        this.setAlamat(null);
    }


    protected void telepon() {
        this.setTelepon();
    }

    protected void nama (){
        this.setNama(null);
    }
    protected void  jabatan(){
        System.out.println("masukkan jabatan anda \n1.boss\n2.manager\n3.karyawan");
        int jabatan = a.nextInt();//inputan user menggunakan integer untuk mengklasifikasikan jabatan si user
        if(jabatan==1){
            jabatana = "boss";
        }
        else if(jabatan==2){
            jabatana = "manager";
        }
        else if(jabatan==3){
            jabatana = "karyawan";
        }
    }

    public void print(){
        nama();
        telepon();
        alamat();
        jabatan();

    }
}
