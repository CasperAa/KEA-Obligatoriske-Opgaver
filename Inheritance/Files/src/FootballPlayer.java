public class FootballPlayer extends Athlete {

    //Constructor of a Football Player
    public FootballPlayer(String name, String sport, int age, double height, boolean retired, int endurance, int speed){
        super(name, sport, age, height, retired, endurance, speed);
        this.name = name;
        this.sport = sport;
        this.age = age;
        this.height = height;
        this.retired = retired;
        this.endurance = endurance;
        this.speed = speed;
    }
    //Overriding the method celebrationRoar, and therefore making a specific roar for football players
    @Override
    public String celebrationRoar() {
        return "ROOOAAAAARRRR!!!!!";
    }
    //Overriding the method celebrationDance, and therefore making a specific dance for football players
    @Override
    public String celebrationDance() {
        return "Robot Dance";
    }
}
