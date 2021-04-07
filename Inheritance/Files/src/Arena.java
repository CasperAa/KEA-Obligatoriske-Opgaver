import java.util.ArrayList;

public class Arena {
    public static void main(String[] args) {
        //Creating an ArrayList to fit all athletes in one list

        ArrayList <Athlete> AthleteList = new ArrayList<Athlete>();

        //Creating multiple instance of each subclass
        FootballPlayer FootPlayer1 = new FootballPlayer("Christian Eriksen", "Football", 29, 1.82, false, 92, 70);
        FootballPlayer FootPlayer2 = new FootballPlayer("Niklas Bendter", "Football", 31, 1.93, true, 53, 62);
        HandballPlayer HandPlayer1 = new HandballPlayer("Mikkel Hansen", "Handball", 33, 1.96, false, 90, 72);
        HandballPlayer HandPlayer2 = new HandballPlayer("Niklas Landin", "Handball", 32, 2.01, false, 84, 78);
        TennisPlayer TennisPlayer1 = new TennisPlayer("Caroline Wozniacki", "Tennis", 30, 1.77, true, 94, 85);
        TennisPlayer TennisPlayer2 = new TennisPlayer("Frederik Løchte Nielsen", "Tennis", 37, 1.90, false, 83, 87);

        //Adding the created athlete to the ArrayList
        AthleteList.add(FootPlayer1);
        AthleteList.add(FootPlayer2);
        AthleteList.add(HandPlayer1);
        AthleteList.add(HandPlayer2);
        AthleteList.add(TennisPlayer1);
        AthleteList.add(TennisPlayer2);

        //Loops for each athlete in the ArrayList and prints out their attributes
        for(Athlete Player : AthleteList){
            System.out.println("Athlete is: " + Player.name + " Sport: " + Player.sport + " - Age: " +
                    + Player.age + " - Retired: " + Player.retired + " - They usually celebrate a point by yelling: " + Player.celebrationRoar() + " or by doing the " + Player.celebrationDance());
        }
    }
}
