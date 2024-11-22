package ru.netology.services;

import org.junit.jupiter.api.Test;

public class CalcRelaxMonthTest {

    @Test
    public void calculateMonth() {
        CalcRelaxMonth service = new CalcRelaxMonth();

        int totalMonthRelax = service.calculate(10_000, 3_000, 20_000);
        System.out.println("Всего " + totalMonthRelax + " месяца(ев) отдыха за год");
    }
}
