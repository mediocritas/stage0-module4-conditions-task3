package school.mjc.stage0.conditions.task3;

import java.util.HashMap;
import java.util.Map;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        Map<Integer, Integer> months = new HashMap<Integer, Integer>();
        months.put(1, 31);
        months.put(2, 28);
        months.put(3, 31);
        months.put(4, 30);
        months.put(5, 31);
        months.put(6, 30);
        months.put(7, 31);
        months.put(8, 31);
        months.put(9, 30);
        months.put(10, 31);
        months.put(11, 30);
        months.put(12, 31);

        if (!months.containsKey(month)) {
            System.out.println("wrong number!");
        } else {
            System.out.println(months.get(month));
        }

    }
}
