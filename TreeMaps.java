


package map;

import java.util.TreeMap;

public class TreeMaps
{
    public static void main(String[] args) {

        TreeMap<String,String> metroCity = new TreeMap<String,String>();   //maintain an ascending order.
        metroCity.put("Chennai","INDIA");
        metroCity.put("Bangalore", "INDIA");
        metroCity.put("Cochin","INDIA");
        metroCity.put("Hyderabad","INDIA");
        metroCity.put("Delhi","INDIA");
        metroCity.put("Ahmedabad","INDIA");

        metroCity.put("INDIA"," Africa Continent");
        metroCity.put("INDIA"," Asia continent");   //We're try to insert the duplicate values otherwise the value is overrided.
        System.out.println(metroCity);
    }
}