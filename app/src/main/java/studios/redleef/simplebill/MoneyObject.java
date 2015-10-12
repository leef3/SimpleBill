package studios.redleef.simplebill;

import java.util.Date;

/**
 * Created by Fred Lee on 10/6/2015.
 */
public class MoneyObject {

    public double amount;
    public int year, month, day;
    public boolean isExpense;
    public int totalTime;

    public MoneyObject()
    {
        year = month = day = 0;
        amount = 0.0;
        isExpense = false;
    }

    public MoneyObject(int year, int month, int day, double amount, boolean expense)
    {
        this.year = year;
        this.month = month;
        this.day = day;
        this.amount = amount;
        this.isExpense = expense;
        totalTime = convertTotalTime(year, month, day);
    }

    public int convertTotalTime(int yearIn, int monthIn, int dayIn)
    {
        return ((yearIn * 10000) + (monthIn * 100) + (dayIn));
    }
}
