package pro.sky.budgetapp.service;

public interface FilesService {
    boolean saveToFile(String json);

    String readFromFile();
}
