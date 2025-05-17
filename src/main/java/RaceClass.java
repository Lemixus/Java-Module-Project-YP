public class RaceClass {

    String leader = "";
    int leaderDistance = 0;

    public void calculateRaceLeader(CarClass car) {
        int time = 24;
        int distance = time * car.speed;

        if (distance > leaderDistance) {
            leader = car.carName;
            leaderDistance = distance;
        }
    }
}

