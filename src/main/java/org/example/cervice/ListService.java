package org.example.cervice;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ListService {

    private ListService() {
        throw new IllegalStateException("Utility class");
    }

    public static double calculateAverage(List<Integer> list) {
        IntSummaryStatistics stats = list.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        return stats.getAverage();
    }

    public static String compareAverage(double fist, double second) {
        double result = fist - second;

        if (result > 0) {
            return "Первый список имеет большее среднее значение";
        } else if (result < 0) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
