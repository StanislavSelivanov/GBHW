package com.company;

public interface Participants {

    default String getName() {
        return null;
    }

    default int getMaxJump() {
        return 0;
    }

    default int getMaxRun() {
        return 0;
    }

    default boolean canAction(Obstacles obstacle) {
        if (obstacle instanceof Wall) {
            return getMaxJump() >= obstacle.getValue();
        }
        if (obstacle instanceof Track) {
            return getMaxRun() >= obstacle.getValue();
        }
        return false;
    }
}
