package pro.sky.budgetapp.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.budgetapp.service.BudgetService;

import java.time.LocalDate;
@Service
public class BudgetServiceImpl implements BudgetService {

    public static final int SALARY = 10_000;
    @Override
    public int getDailyBudget() {
        return SALARY / 30;
    }

    @Override
    public int getBalance() {
        return SALARY - LocalDate.now().getDayOfMonth() * getDailyBudget();
    }
}
