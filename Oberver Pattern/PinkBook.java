import java.util.ArrayList;

public class PinkBook implements Observable{

    private boolean inStock = true;
    private ArrayList<Observer> customers;


    public PinkBook(boolean inStock) {

        this.inStock = inStock;
        customers = new ArrayList<Observer>();
    }

    public boolean isInStock() {

        return inStock;
    }

    public void setInStock(boolean inStock) {
        
        this.inStock = inStock;
        if(isInStock()){
            notifyObservers();
        }
    }

    //@override
    public void addObserver(Observer o){

        customers.add(o);
    }

    //@override
    public void removeObserver(Observer o){

        customers.remove(o);
    }

    //@override
    public void notifyObservers() {

        for(int i = 0; i < customers.size(); i++){
            customers.get(i).update();
        }
    }


}


/* Kelas PinkBook adalah representasi dari buku yang dicari Rahma. Ia memiliki atribut inStock, artinya stok tersedia. Karena PinkBook merupakan objek yang disubscribe, berarti ia adalah Observable. 
Oleh karenanya, perlu mengimplementasi interface Observable.
 */