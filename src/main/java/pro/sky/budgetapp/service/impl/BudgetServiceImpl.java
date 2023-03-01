package pro.sky.budgetapp.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.budgetapp.service.BudgetService;

import java.time.LocalDate;
@Service
public class BudgetServiceImpl implements BudgetService {

    public static final int SALARY = 20_000;
    public static final int AVG_SALARY = (10000+10000+10000+10000+10000+15000+15000+15000+15000+15000+15000+20000) / 12;
    public static final double AVG_DAYS = 29.3;
    @Override
    public int getDailyBudget() {
        return SALARY / 30;
    }

    @Override
    public int getBalance() {
        return SALARY - LocalDate.now().getDayOfMonth() * getDailyBudget();
    }
@Override
    public int getVacationBonus(int dayCount) {
         double avgDaySalary = AVG_SALARY / AVG_DAYS;
         return  (int) (dayCount * avgDaySalary);
    }
@Override
    public int getSalaryWithVacation(int vocationDaysCount, int vacationWorkingDaysCount, int workingDaysInMonth) {
      int salary =  SALARY / workingDaysInMonth * (workingDaysInMonth - vocationDaysCount);
      return salary + getVacationBonus(vacationWorkingDaysCount);
    }
}

