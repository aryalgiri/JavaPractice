package Assignment;

import java.util.HashMap;
import java.util.Map;

public class Q44Map {
    public static void main(String[] args) {
        Map<String, String> StudentMap=new HashMap ();
            StudentMap.put("Ram", "California");
            StudentMap.put("Shyam", "Colorado");
            StudentMap.put("Hari", "Washington");
            StudentMap.put("Bishnu", "Massachusetts");
            StudentMap.put("Bashu", "Colorado");
            StudentMap.put("Krishna", "Virginia");
            StudentMap.put("Shiva", "Michigan");
            StudentMap.put("Shankar", "Florida");
            StudentMap.put("Indra", "Idaho");
            StudentMap.put("Keshav", "Pennsylvania");


        System.out.println("Shiva lives in: "+ StudentMap.get("Shiva"));
        System.out.println("Keshav lives in: "+ StudentMap.get("Keshav"));
        System.out.println("Hari lives in: "+ StudentMap.get("Hari"));








        }

    }

