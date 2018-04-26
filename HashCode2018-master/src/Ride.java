public class Ride {
    int[] start;
    int[] finish;
    int earliestStart;
    int latestFinish;
    int timeTaken;
    boolean allocated;
    Car car;
    int id;

    public Ride(int id){
        this.id = id;
    }

    public int[] getStart(){
        return start;
    }

    public void setStart(int[] start) {
        this.start = start;
    }

    public int[] getFinish() {
        return finish;
    }

    public void setFinish(int[] finish) {
        this.finish = finish;
    }

    public int getEarliestStart() {
        return earliestStart;
    }

    public void setEarliestStart(int earliestStart) {
        this.earliestStart = earliestStart;
    }

    public int getLatestFinish() {
        return latestFinish;
    }

    public void setLatestFinish(int latestFinish) {
        this.latestFinish = latestFinish;
    }

    public int getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken() {
        this.timeTaken = Main.map.calculateDistance(start, finish);
    }
}
