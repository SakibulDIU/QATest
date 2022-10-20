import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"zahir");
        map.put(2, "Shakib");


        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());


            //System.out.println(map);
        }
    }
}