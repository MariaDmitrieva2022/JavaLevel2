package lesson1.participant;

public class Robot implements Participant {
    private int heightRobot = 9;
    private int lengthRobot = 12;
    private String name;

    public Robot(String name) {
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
        if (heightRobot >= height) {
            System.out.println("Робот смог прыгнуть.");
            return true;
        } else {
            System.out.println("Робот не смог прыгнуть.");
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (lengthRobot >= length) {
            System.out.println("Робот смог пробежать.");
            return true;
        } else {
            System.out.println("Робот не смог пробежать.");
            return false;
        }
    }
}
