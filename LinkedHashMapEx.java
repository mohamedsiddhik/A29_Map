
package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapEx
{
    public static void main(String[] args) {
        LinkedHashMap<String,String> heros = new LinkedHashMap<String,String>();
        heros.put("IRON MAN","Robert Downey jr");
        heros.put("SPIDER MAN ", "Tom Holland ");
        heros.put("CAPTAIN AMERICA ", "Chris Evans");
        heros.put("ETERNALS ","Angelina Jolie");

        heros.put(null,"Stylish Star");
        heros.put(null,"Mega Star");
        System.out.println("Preserved Order : " + heros);

        HashMap<String,String> superHeros = new HashMap<String,String>();
        superHeros.put("IRON MAN","Robert Downey jr");
        superHeros.put("SPIDER MAN ", "Tom Holland ");
        superHeros.put("CAPTAIN AMERICA ", "Chris Evans");
        superHeros.put("ETERNALS ","Angelina Jolie");

        superHeros.put(null,"Stylish Star");
        superHeros.put(null,"Mega Star");
        System.out.println("No order : " + superHeros);


    }
}