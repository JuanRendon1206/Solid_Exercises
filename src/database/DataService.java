package database;

public class DataService {
    private Database database = new Database();

    public void saveData(String data) {
        database.save(data);
    }
}