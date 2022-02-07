
package butelka;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Butelka {

    double ileLitrow;
    Butelka()                      //konstruktor domyslny
    {
        
    }
    Butelka(double ileLitrow)     //konstruktor z parametrami
    {
        this.ileLitrow = ileLitrow;
    }
    double getIleLitrow()
    {
        return ileLitrow;
    }
    void wlej(double ilosc)
    {
        this.ileLitrow += ilosc;
    }
    void wylej(double ilosc) throws Exception
    {
        if(ilosc<ileLitrow)
        this.ileLitrow -= ilosc;
        else
            throw new Exception("za malo wody");
        
    }
    void przelej(double ilosc, Butelka gdziePrzelac) throws Exception
    {
        this.wylej(ilosc);
        gdziePrzelac.wlej(ilosc);
    }
    
    
    
    public static void main(String[] args) {
       
        Butelka[] butelka = new Butelka[3];
        butelka[0] = new Butelka(5);    //5, 8, 10 - symbolizuja poj. w litrach
        butelka[1] = new Butelka(8);
        butelka[2] = new Butelka(10);
        
        Butelka k = new Butelka(4);
        Butelka k2 = new Butelka(10);
        
        System.out.println("pojemnosc butelki 0:" + " "  + butelka[0].getIleLitrow()); 
        System.out.println("pojemnosc butelki 1:" + " "  + butelka[1].getIleLitrow()); 
        System.out.println("pojemnosc butelki 2:" + " "  + butelka[2].getIleLitrow()); 
        
        System.out.println("pojemnosc butelki k:" + " "  + k.getIleLitrow());
        System.out.println("pojemnosc butelki k2:" + " "  + k2.getIleLitrow());
        
        butelka[0].wlej(5);
        
        try 
        {
            butelka[0].wylej(1);
        } 
        catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
        
        try 
        {
            butelka[0].przelej(1, butelka[1]);
        } 
        catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
        
        try 
        {
            k.przelej(5, k2);
        } 
        catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Aktualnie butelka 0 ma: " + butelka[0].getIleLitrow());
        System.out.println("Aktualnie butelka 1 ma: " + butelka[1].getIleLitrow());
        System.out.println("Aktualnie butelka 2 ma: " + butelka[2].getIleLitrow());
        
        System.out.println("Aktualnie butelka k:" + " "  + k.getIleLitrow());
        System.out.println("Aktualnie butelka k2:" + " "  + k2.getIleLitrow());
        
        
        // Dla treningu petla wykonujaca kilka konstruktorow
        
        for (int i = 0; i < butelka.length; i++) 
        {
            butelka[i] = new Butelka(i+1);
            System.out.println(butelka[i].getIleLitrow());
        }


}
}
