interface AnimalInterface {
    String getName();
    default void printFood() {
        System.out.printf("my food is %s\n", getName());
    } // default 로 만들어주면 나중에 이 인터페이스를 extend 받은 객체는 자동적으로 이게 생긴다
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements AnimalInterface {
    public String getName() {
        return "Tiger";
    }
}

class Lion extends Animal implements AnimalInterface {
    public String getName() {
        return "Lion";
    }
}

class ZooKeeper {
    public void feed(AnimalInterface animal) {
        System.out.print("feed ");
        animal.printFood();
    }
}

public class Interface {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  // feed apple 출력
        zooKeeper.feed(lion);  // feed banana 출력
    }
}
