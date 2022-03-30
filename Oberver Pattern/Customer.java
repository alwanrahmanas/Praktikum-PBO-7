public class Customer implements Observer{

    private Observable observable;
    private String username;

    public Customer(Observable observable, String username){

        this.observable = observable;
        this.username = username;
    }

    //@override
    public void update(){

        System.out.println("Buku Pink Tersedia");
        buyDress();
    }

    private void buyDress(){
    
        System.out.println(username +" mendapatkan Buku Pink");
    }

    private void unsubscribe(){

        observable.removeObserver(this);
    }
    
    
}
