import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Input {
    public static void inputFile(String fileName) throws IOException {
        FileReader fr = null;
        String line;
        try {
            fr = new FileReader("input/" + fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int lineCount = 0;
        BufferedReader br = new BufferedReader(fr);
        while((line = br.readLine()) != null){
            String[] input = line.split(" ");
            switch(lineCount){
                case 0:
                    Main.map = new Map(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                    Main.rides = new Ride[Integer.parseInt(input[3])];
                    Main.bonus = Integer.parseInt(input[4]);
                    Main.steps = Integer.parseInt(input[5]);
                    break;
                default:
                        Ride r = new Ride(lineCount - 1);
                        r.start = new int[]{Integer.parseInt(input[0]), Integer.parseInt(input[1])};
                        r.finish = new int[]{Integer.parseInt(input[2]), Integer.parseInt(input[3])};
                        r.earliestStart = Integer.parseInt(input[4]);
                        r.latestFinish = Integer.parseInt(input[5]);
                        r.setTimeTaken();
                        Main.rides[lineCount - 1] = r;
            }
            lineCount++;
        }
    }
}
