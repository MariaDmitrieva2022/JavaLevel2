package lesson1.participant;

public class Person implements Participant {
    private int heightPerson = 17;
    private int lengthPerson = 9;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean jump(int height) {
        if (heightPerson >= height) {
            System.out.println("Человек смог прыгнуть.");
            return true;
        } else {
            System.out.println("Человек не смог прыгнуть.");
            return false;

        }
    }

    @Override
    public boolean run(int length) {
        if (lengthPerson >= length) {
            System.out.println("Человек смог пробежать.");
            return true;
        } else {
            System.out.println("Человек не смог пробежать.");
            return false;
        }
    }

}
