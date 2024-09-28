public class Main {
    String a = "Hello world!";
    public static void main(String[] args) {
        Main main = new Main();  // 인스턴스 생성
        System.out.println("Hello world!");
        System.out.println(main.a.indexOf('w'));  // 인스턴스를 통해 변수 접근
    }
}
