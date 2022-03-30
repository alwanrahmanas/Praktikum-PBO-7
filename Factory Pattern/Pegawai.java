public class Pegawai{

    private String nama;
    private String tipe;
    private String pembayarangaji;

    public void setNama(String nama){

        this.nama = nama;
    }

    public String getNama(){

        return this.nama;
    }

    public void setTipe(String tipe){

        this.tipe = tipe;
    }

    public String getTipe(){

        return this.tipe;
    }

    public void setPembayarangaji(String pembayarangaji){
        this.pembayarangaji= pembayarangaji;
    }

    public String getPembayarangaji(){

        return this.pembayarangaji;
    }

    //override

    public String toString(){

        return "Nama             :\t" + this.nama+
               "\nTipe pegawai     :\t"+this.tipe+
               "\nPembayaran Gaji  : \t"+this.pembayarangaji+"\n";
    }
}