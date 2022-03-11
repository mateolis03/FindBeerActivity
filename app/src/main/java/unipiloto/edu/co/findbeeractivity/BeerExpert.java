package unipiloto.edu.co.findbeeractivity;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands(String color) {
        ArrayList<String> brand = new ArrayList<>();
        switch (color) {
            case "0":
                brand.add(0, "Corona");
                brand.add(1, "Tiger");
                break;
            case "1":
                brand.add(0, " platense Astor Birra");
                brand.add(1, " Cuatro Cerros");
                break;
            case "2":
                brand.add(0, "Porter");
                brand.add(1, "Red ale");
                break;
            case "3":
                brand.add(0, "Delirium");
                brand.add(1, "Kaiserdom");
                break;
        }
        return brand;
    }
}