/* Dalam pemrograman berorientasi objek ada 
design pattern yang dipelajari, yaitu Observer Pattern, 
Decorator Pattern, Factory Pattern, Singleton Pattern. Oleh karena itu pada modul 7 ini kita akan mempelajari 
bagaimana mengonversi pattern tersebut ke kode. */

//observer pattern

/* Behaviour Observable dapat kita definisikan dalam sebuah interface. Misalkan kita buat interface dengan 
nama Observer dan Observable seperti berikut. */

public interface Observer{
    
    public void update();
}



