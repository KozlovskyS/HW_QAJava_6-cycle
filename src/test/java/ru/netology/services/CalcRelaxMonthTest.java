package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class CalcRelaxMonthTest {

    @Test
    public void calculateMonthLittle() {
        CalcRelaxMonth service = new CalcRelaxMonth();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        //System.out.println("Всего " + totalMonthRelax + " месяца(ев) отдыха за год");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateMonthBig() {
        CalcRelaxMonth service = new CalcRelaxMonth();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        //System.out.println("Всего " + totalMonthRelax + " месяца(ев) отдыха за год");
        Assertions.assertEquals(expected, actual);
    }
}
