public abstract class Athlete {
        //An abstract class with the given attributes
        String name;
        String sport;
        int age;
        double height;
        double weight;
        boolean retired;
        int endurance;
        int speed;

        //Athlete constructor
        public Athlete(String name, String sport, int age, double height, boolean retired, int endurance, int speed) {
            this.name = name;
            this.sport = sport;
            this.age = age;
            this.height = height;
            this.retired = retired;
            this.endurance = endurance;
            this.speed = speed;
        }

        //A no method body to create methods used in subclasses
        public abstract String celebrationRoar();

        public abstract String celebrationDance();


}
