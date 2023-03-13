package pro.sky.budgetapp.service;

import pro.sky.budgetapp.model.Transaction;

public interface BudgetService {
    int getDailyBudget();

    int getBalance();

    long addTransaction(Transaction transaction);

    Transaction getTransaction(long id);

    Transaction editTransaction(long id, Transaction transaction);

    boolean deleteTransaction(long id);

    void deleteAllTransaction();

    int getDailyBalance();

    int getAllSpend();

    int getVacationBonus(int dayCount);

    int getSalaryWithVacation(int vocationDaysCount, int vacationWorkingDaysCount, int workingDaysInMonth);
}
