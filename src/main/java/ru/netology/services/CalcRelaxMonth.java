package ru.netology.services;

public class CalcRelaxMonth {
    // расчет количества месяцев отдыха за год
    public int calculate(int income, int expenses, int threshold) {
        /*  income - заработано за месяц
            expenses - обязательные траты за месяц
            threshold - расчетная сумма на отдых
         */
        int count = 0; // счетчик месяцев отдыха
        int money = 0; //денег на счету

        for (int month = 1; month <= 12; month++) {
            //System.out.printf("Месяц " + month + ". Денег " + money + ". ");
            if (money >= threshold) {        // условие отдыха
                count++;
                //int expensesRelax = (int) ((money - expenses) - (money - expenses) / 3); //траты на отдых
                money = (int) ((money - expenses) / 3);
                //System.out.println("Будем отдыхать. " + "Потратил -" + expenses + ". Потом еще -" + expensesRelax);
            } else {
                money = (money + income - expenses);
                //System.out.println("Придется работать. Заработал " + income + ". Потратил -" + expenses);
            }
        }
        return count;
    }
}
