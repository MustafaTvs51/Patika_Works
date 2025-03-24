import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<String,Scores> scores = new HashMap<>();

        scores.put("Ali",new Scores(85));
        scores.put("Ayşe",new Scores(65));
        scores.put("Mehmet",new Scores(56));
        scores.put("Arda",new Scores(48));
        scores.put("Mustafa",new Scores(89));

        for (Map.Entry<String,Scores> entry : scores.entrySet()) {

            System.out.println( entry.getKey() +  entry.getValue());

        }
    }
}
