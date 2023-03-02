 /*
* File: Console.java
* Author: KorcsmarosKendeAndras
* Copyright: 2023 , KorcsmarosKendeAndras
* Group: Szoft 2/N
* Date: 2023-03-03
* Github: https://github.com/KendeAndras/
* Licenc: GNU GPL
*/

package views;

import java.util.ArrayList;
import models.Property;

public class Console {
    
    public Console() {}

    public void printInfo(){
        System.out.println("props Java app, ingatlanok \n Author: KorcsmarosKendeAndras");
        System.out.println("");
    }

    public void printProperties(ArrayList<Property> props) {

        for(Property prop : props) {
            System.out.printf("%10s %12s %6.2f\n",
            prop.getCity(),
            prop.getAddress(),
            prop.getSize(),
            prop.getPrice()
            );
        }

    }

}
