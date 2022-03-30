//warnai merah

public class WarnaiMerah extends WarnaiPakaian{

    public WarnaiMerah(Pakaian warnai){

        super(warnai);
    }

    //@override
    public void pakai(){
        warnai.pakai();
        setWarnaPakaian(warnai);
    }

    public void setWarnaPakaian(Pakaian warnai){


        System.out.println("Warna Border: Merah");
    }


}