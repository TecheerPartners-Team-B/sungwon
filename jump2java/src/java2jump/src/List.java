import java.util.HashMap;

public class List {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "사람");
        map.put("name", "야구");
        map.put("meow", "dd");
        System.out.println(map.get("meow"));
        System.out.println(map.get("name")); // "사람",'dirn' 출력
        System.out.println(map.containsKey("사람")); // false 출력 because "사람" is not a key in the map
        System.out.println(map.containsValue("사람")); // true become because "사람" is value in the map\
        System.out.println(map.remove("meow")); // "dd" 출력 and remove the key-value pair 키 밸류 둘다 사라진

    }
}
