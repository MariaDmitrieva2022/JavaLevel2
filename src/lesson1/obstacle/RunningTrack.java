package lesson1.obstacle;

import lesson1.participant.Participant;

public class RunningTrack implements Obstacle {
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public boolean passObstacle(Participant runner) {
        return runner.run(length);
    }
}
