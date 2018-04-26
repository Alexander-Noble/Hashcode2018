/*import java.util.ArrayList;
import java.util.Random;

public class Car2 {
    int id;
    int X;
    int Y;
    ArrayList<Ride> history;
    int time;

    public Car2(int id){
        this.id = id;
        this.X = 0;
        this.Y = 0;
        int time = 0;
        history = new ArrayList<>();
    }

    public int findNext(){
        Ride nextRide = null;
        int score = 0;
        double shortest = Double.POSITIVE_INFINITY;
        //Random rand = new Random();
        //int min = 0;
        //int max = Main.getRidesLength();
        //int randomNum = rand.nextInt((max - min) + 1) + min;

        for (int i = 0; i < Main.getRidesLength(); i++) {
            Ride r = Main.rides[i];
            if((Math.abs(Main.map.calculateDistance(new int[]{X,Y}, r.getStart()) - r.getEarliestStart())  <= shortest) && !r.allocated){
                nextRide = r;
                shortest = (double) Math.abs(Main.map.calculateDistance(new int[]{X,Y}, r.getStart()) - r.getEarliestStart());
            }
        }
        if(nextRide != null){
            nextRide.car = this;
            nextRide.allocated = true;
            history.add(nextRide);
            this.X = nextRide.getFinish()[0];
            this.Y = nextRide.getFinish()[1];
            if(Main.currentTime + (int) shortest < nextRide.getEarliestStart()){
                time = nextRide.getEarliestStart() + nextRide.timeTaken;
            }else {
                time = Main.currentTime + (int) shortest + nextRide.timeTaken;
            }
            if(Main.currentTime + (int)shortest <= nextRide.getEarliestStart()){
                score += Main.bonus;
            }
            score += nextRide.timeTaken;
        }
        return score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(history.size()).append(" ");
        for (Ride r : history) {
            sb.append(r.id).append(" ");
        }
        return sb.toString();
    }
}
*/