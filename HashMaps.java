

package map;
// HashMap

import java.util.HashMap;

public class HashMaps
{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("China",142);    //Adding
        map.put("India", 141);
        map.put("US",33);
        map.put("Indonesia",27);
        map.put("Pakistan",23);
        System.out.println(map);
        map.put("US",34);
        System.out.println(map);

        HashMap<String,Integer> duplicateMaps = new HashMap<>();
        duplicateMaps.putAll(map);
        System.out.println("Duplicate : " + duplicateMaps);

        //search
        System.out.println("check True or false : " + map.containsKey("US"));
        if (map.containsKey("India")){                     //searching via key
            System.out.println("India is in the list");
        }
        else {
            System.out.println("India is not in the list");
        }
        if (map.containsValue(141)){                     //searching via Value
            System.out.println("India value 141 is in the list");
        }
        else {
            System.out.println("India value 141 is not in the list");
        }
        System.out.println(map.get("Indonesia"));    // map is exists
        System.out.println(map.get("Afghanistan"));   // map does not exists

        System.out.println(map.entrySet());   // its accessing set

        HashMap<String,Integer> duplicateMap = new HashMap<String,Integer>();
        duplicateMap.putAll(map);                            // Creating a Duplicate map
        System.out.println("Map : " + map);
        System.out.println("Duplicate map :" + duplicateMap);

        duplicateMap.clear();
        System.out.println("Clear : " + duplicateMap );          // Clear all elements
        System.out.println("Clone : " + duplicateMap.clone());             // Cloning
        System.out.println("KeySet : " + map.keySet());            // its display keys
        System.out.println("Get Values : " + map.values());         // its display values
        System.out.println(map.get("US"));    // getting individuals values.

        System.out.println(map.isEmpty());  //element in map here or not
        System.out.println(map.entrySet());

    }
}