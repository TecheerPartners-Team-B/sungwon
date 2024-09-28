public class java2jump {

    public static void main(String[] args) {
        String a = "Hello world!";
        System.out.println("Hello world!");
        System.out.println("index연산자 "+a.indexOf('w'));
        System.out.println("charAt연산자 "+a.charAt(6));
        System.out.println("replaceAll 연산자 "+a.replaceAll("world","sungwon"));
        System.out.println("substring 연산자 "+a.substring(0,4));
        //두개 짬뽕으로 쓰까스기
        System.out.println("같이 쓰기 "+a.replaceAll("world","sungwon").substring(0,9));
        System.out.println("toUppercase 연산자 "+a.toUpperCase());
        String b = "Hello n world";
        System.out.println("split 연산자 "+b.split(" ")[0]);// 이거의 결과값으로 배열이 나오게 되는데
        // 몇번쨰 배열을 출력할것인가 선택할수도 있고 배열 전체를 출력하게끔 할수도 있당
        System.out.println("split 연산자 "+b.split("n"));
        String[] result = b.split("n");
        System.out.println(result); // 이거 왜이래요??
        System.out.println(String.format("my tier is %s ","diamond"));
        int roundNumber = 98;
        System.out.println(String.format("and i played %d rounds",roundNumber));
        System.out.printf("my tier is %s and i played %s rounds","diamond",roundNumber);
        //printf는 format과 같은 기능을 하는데 format은 문자열을 반환하지만 printf는 출력한다.
        //그리고 %s를 사용하면 파라미터값을 알아서 자기가 바꾸어 사용한다,. 개사기네 ㅇㅇ..;;






    }
}
