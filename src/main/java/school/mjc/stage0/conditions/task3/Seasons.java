package school.mjc.stage0.conditions.task3;

import java.util.HashMap;
import java.util.Map;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        Map<Integer, String> months = new HashMap<Integer, String>();
        months.put(1, "Winter");
        months.put(2, "Winter");
        months.put(3, "Spring");
        months.put(4, "Spring");
        months.put(5, "Spring");
        months.put(6, "Summer");
        months.put(7, "Summer");
        months.put(8, "Summer");
        months.put(9, "Autumn");
        months.put(10, "Autumn");
        months.put(11, "Autumn");
        months.put(12, "Winter");


        System.out.println(months.getOrDefault(month, "wrong number!"));

    }
}
