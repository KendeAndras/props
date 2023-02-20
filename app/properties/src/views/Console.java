package views;

import java.util.ArrayList;
import models.Property;;

public class Console {
    
    public Console() {}

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
