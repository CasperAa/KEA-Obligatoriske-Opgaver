public class TennisPlayer extends Athlete {
    public TennisPlayer(String name, String sport, int age, double height,  boolean retired, int endurance, int speed){
        super(name, sport, age, height, retired, endurance, speed);
        this.name = name;
        this.sport = sport;
        this.age = age;
        this.height = height;
        this.retired = retired;
        this.endurance = endurance;
        this.speed = speed;
    }

    @Override
    public String celebrationRoar() {
        return "YEESSS";
    }

    @Override
    public String celebrationDance() {
        return "Harlem Shake";
    }
}
