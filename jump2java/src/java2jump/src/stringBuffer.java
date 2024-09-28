public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        System.out.println(sb.toString());
        String result = "";
        result += "hello";
        result += " ";
        result += "jump to java";
        System.out.println(result);
        //두개의 결과값은 같다. 하지만 속도차이가 있다.
        //String 클래스는 한번 생성되면 그 값을 읽기만 할수 있고 변경할수 없다.
        //toupperCase같은 메소드를 사용하면 새로운 메모리를 할당받아서 값을 변경하고 그 값을 반환한다.
        //String buffer는 String보다 무겁다 그러므로 문자열의 수정이 많은 사항이 많다면 String buffer를
        //변경하는 작업이 적다면 String을 쓰는게 좋을것같다 ㅇㅇ..
        StringBuilder sb2 = new StringBuilder();
        sb2.append("hello");
        sb2.append(" ");
        sb2.append("jump to java");
        String outPut = sb2.toString();
        System.out.println(outPut);
        //StringBuffer와 StringBuilder는 같은 기능을 하지만 StringBuffer는 멀티쓰레드 환경에서 사용할수 있고
        //StringBuilder는 싱글쓰레드 환경에서 사용할수 있다.
        StringBuffer sb3 = new StringBuffer();
        sb3.append("jump to java");
        sb3.insert(0, "hello ");
        System.out.println(sb3.toString());
        //insert는 특정 위치에 문자열을 삽입하는 메소드이다.

    }
}
