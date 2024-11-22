package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcRelaxMonthTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/relax.csv")
    public void testCalculateMonth(int expected, int income, int expenses, int threshold) {
        CalcRelaxMonth service = new CalcRelaxMonth();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
// @Test
// public void calculateMonthBig() {
//     CalcRelaxMonth service = new CalcRelaxMonth();
//
//     int expected = 2;
//     int actual = service.calculate(100_000, 60_000, 150_000);
//     Assertions.assertEquals(expected, actual);
// }
}
