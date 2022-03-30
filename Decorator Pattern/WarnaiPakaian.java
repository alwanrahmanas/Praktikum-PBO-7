//abstract untuk warnai pakaian

public abstract class WarnaiPakaian implements Pakaian{

    protected Pakaian warnai;
    
    public WarnaiPakaian(Pakaian warnai){

        this.warnai = warnai;
    }

    //@override
    public void pakai(){

        warnai.pakai();
    }
}

