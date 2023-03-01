package pro.sky.budgetapp.service;

public interface BudgetService {
    int getDailyBudget();

    int getBalance();

    int getVacationBonus(int dayCount);

    int getSalaryWithVacation(int vocationDaysCount, int vacationWorkingDaysCount, int workingDaysInMonth);
}
