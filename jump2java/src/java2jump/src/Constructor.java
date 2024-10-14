class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {

    public HouseDog(String name) {
        this.setName(name);
    }

    public HouseDog(int type) {
        if (type == 1) {
            this.setName("Jindo");
        } else if (type == 2) {
            this.setName("Bulldog");
        }
    }

    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class Constructor {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog("meow");
        HouseDog houseDog2 = new HouseDog(1);
        System.out.println(houseDog.name);
        System.out.println(houseDog2.name);
    }
}
