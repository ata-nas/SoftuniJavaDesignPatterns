import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Singleton {
    private static Singleton INSTANCE;

    private final List<String> database;

    private Singleton() {
        // simulate database connection
        this.database = new ArrayList<>();
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void add(String data) {
        database.add(data);
    }

    public void remove(int index) {
        database.remove(index);
    }

    public Collection<String> getDB() {
        return Collections.unmodifiableCollection(database);
    }
}