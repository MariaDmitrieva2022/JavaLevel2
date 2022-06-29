package lesson1.obstacle;

import lesson1.participant.Participant;

public class Wall implements Obstacle {
    private int height;

    public Wall (int height) {
        this.height = height;
    }

    public boolean passObstacle(Participant jumper) {
        boolean success;
        success = jumper.jump(height);
        return success;
    }
}
