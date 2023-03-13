package pro.sky.budgetapp.service;

import pro.sky.budgetapp.model.Transaction;

public interface BudgetService {
    int getDailyBudget();

    int getBalance();

    long addTransaction(Transaction transaction);

    Transaction getTransaction(long id);

    int getDailyBalance();

    int getAllSpend();

    int getVacationBonus(int dayCount);

    int getSalaryWithVacation(int vocationDaysCount, int vacationWorkingDaysCount, int workingDaysInMonth);
}
