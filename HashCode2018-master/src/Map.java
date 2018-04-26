public class Map {
    int R;
    int C;
    static Car[] cars;

    public Map(){}

    public Map(int r, int c, int numCars) {
        R = r;
        C = c;
        cars = new Car[numCars];
        for (int i = 0; i < numCars; i++) {
            cars[i] = new Car(i);
        }
    }

    int calculateDistance(int[] start, int[] finish){
        return Math.abs(start[0] - finish[0]) + Math.abs(start[1] - finish[1]);
    }

}
