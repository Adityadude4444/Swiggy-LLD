import java.util.HashMap;

public class Cart {
    private HashMap<String, Integer> items;

    public Cart() {
        items = new HashMap<>();
    }

    public void addItem(String item, int price) {
        items.put(item, items.getOrDefault(item, 0) + price);
    }

    public boolean removeItem(String item) {
        if (items.containsKey(item)) {
            items.remove(item);
            return true;
        }
        return false;
    }

    public int getTotalAmount() {
        return items.values().stream().mapToInt(Integer::intValue).sum();
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void clearCart() {
        items.clear();
    }
}
