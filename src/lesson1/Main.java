package lesson1;

import lesson1.obstacle.Obstacle;
import lesson1.obstacle.RunningTrack;
import lesson1.obstacle.Wall;
import lesson1.participant.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Человек");
        Cat cat = new Cat("Кот");
        Robot robot = new Robot("Робот");
        RunningTrack runningTrack = new RunningTrack(10);
        Wall wall = new Wall(15);

        Participant[] participants = {cat, person, robot};
        Obstacle[] obstacles = {runningTrack, wall};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                boolean success = obstacle.passObstacle(participant);
                if (!success) {
                    System.out.println(participant.getName() + " покинул соревнование.");
                    break;
                }
            }
        }
    }

    //1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
    // Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).

    //2.Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
    // соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль
    // (успешно пробежал, не смог пробежать и т.д.).

    //3.Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.

    //4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
    // Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
}
