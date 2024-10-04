import java.util.HashMap;

public class List {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "사람");
        map.put("name", "야구");
        map.put("meow", "dd");
        System.out.println(map.get("meow"));
        System.out.println(map.get("name")); // "사람",'dirn' 출력
    }
}
