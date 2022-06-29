package lesson1.participant;

public class Cat implements Participant {
    private int heightCat = 16;
    private int lengthCat = 12;
    private String name;

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean jump(int height) {
        if (heightCat >= height) {
            System.out.println("Кот смог прыгнуть.");
            return true;
        } else {
            System.out.println("Кот не смог прыгнуть.");
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (lengthCat >= length) {
            System.out.println("Кот смог пробежать.");
            return true;
        } else {
            System.out.println("Кот не смог пробежать.");
            return false;
        }
    }
}
