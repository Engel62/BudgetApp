package pro.sky.budgetapp.service;

import java.io.File;

public interface FilesService {
    boolean saveToFile(String json);

    String readFromFile();

    File getDataFile();

    void cleanDataFile();
}
