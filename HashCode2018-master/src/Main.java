
import java.io.IOException;

public class Main {
    static Map map;
    static Ride[] rides;
    static int bonus;
    static int steps;
    static int currentTime;
    static int bonusScore;
    static Car[] maxScore;

    public static void main(String[] args){
        String[] fileNames = new String[]{"a_example",
            "b_should_be_easy",
            "c_no_hurry",
            "d_metropolis",
            "e_high_bonus"};
        int file = 3;
        System.out.println("\n\n" + fileNames[file]);
        for (int x = 0; x < 100; x++) {
            System.out.println(x);
            Map map = new Map();
            try {
                Input.inputFile(fileNames[file] + ".in");
            } catch (IOException e) {
                e.printStackTrace();
            }


            int currentScore = 0;
            while (currentTime < steps & ridesNotAllocated()) {
                for (int i = 0; i < Map.cars.length; i++) {
                    Car c = Map.cars[i];
                    if (currentTime <= c.time) currentScore += c.findNext();
                }
                currentTime++;
            }
            currentTime = 0;
            if(currentScore > bonusScore) {
                bonusScore = currentScore;
                maxScore = map.cars;
            }

        }


            for (Car c : Map.cars) {
                 System.out.println(c.toString());


            }

            System.err.println(bonusScore);
        }



    static boolean ridesNotAllocated(){
        for(Ride r : rides){
            if(!r.allocated){
                return true;
            }
        }
        return false;
    }

    public static int getRidesLength() {
        return rides.length;
    }

}
