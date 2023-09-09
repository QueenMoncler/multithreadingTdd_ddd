import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    Map<String, Long> phoneBook = new TreeMap<>();

    public int add(String name, long number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, number);
        }
        return phoneBook.size();
    }

    public String findByNumber(long number) {
        return phoneBook.entrySet()
                .stream()
                .filter((x) -> x.getValue().equals(number))
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }

    public long findByName(String name) {
        return phoneBook.get(name);
    }

    public List<String> printAllNames() {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Long> entry : phoneBook.entrySet()) {
            list.add(entry.getKey());
        }
        return list;
    }

}
