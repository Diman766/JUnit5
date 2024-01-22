package org.example.cervice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


class ListServiceTest {

    @Test
    void calculateAverage() {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7));

        double result = ListService.calculateAverage(list);

        assertThat(result).isEqualTo(4);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 1, Первый список имеет большее среднее значение",
            "3, 4, Второй список имеет большее среднее значение",
            "5, 5, Средние значения равны"
    })
    void compareAverage(int fist, int second, String text) {

        String result = ListService.compareAverage(fist, second);

        assertThat(result).isEqualTo(text);
    }
}