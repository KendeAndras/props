 /*
* File: Property.java
* Author: KorcsmarosKendeAndras
* Copyright: 2023 , KorcsmarosKendeAndras
* Group: Szoft 2/N
* Date: 2023-03-03
* Github: https://github.com/KendeAndras/
* Licenc: GNU GPL
*/

package models;

public class Property {
    String city;
    String address;
    double size;
    double price;

    public Property(String city, String address, double size, double price) {
        this.city = city;
        this.address = address;
        this.size = size;
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
}
