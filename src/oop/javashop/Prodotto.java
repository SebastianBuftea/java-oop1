package oop.javashop;
import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {


    private String name;
    private String description;
    private BigDecimal  price ;
    private BigDecimal iva ;

   /* Costruttore*/
    public Prodotto(String name, String description, String price){
       this.name=name;
       this.description=description;
       this.price=new BigDecimal(price);
    }

    public int getCode(){
        Random random = new Random();
        int barcode=random.nextInt(1000000);
        return barcode;
    }


}
