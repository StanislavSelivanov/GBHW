package com.company;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Vasya", 1, 100);
        Human human = new Human("Kolya", 5, 40000);
        Robot robot = new Robot("Alisa", 0,1000);

        Participants[] participants = {cat, human, robot};
        Obstacles[] obstacles = {new Wall(3), new Track(1000)};

        for (final Obstacles obstacle : obstacles) {
            for (final Participants participant: participants) {
                if (participant.canAction(obstacle)) {
                    System.out.println(participant.getName() + " прошел препятствие");
                }
                else {
                    System.out.println(participant.getName() + " не смог пройти препятствие");
                }
            }
        }
    }
}
