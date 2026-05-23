import java.util.LinkedList;

public class HashTable<K, V> {

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final LinkedList<Entry<K, V>>[] table;
    private final int capacity;
    private int size;


    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.table = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<Entry<K,V>>();
        }
    }


    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        // номер ячейки
        int index = hash(key);
 
        for (int i = 0; i < table[index].size(); i++) {
            Entry<K, V> entry = table[index].get(i);
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
 
        // добавляем новую пару в конец списка
        table[index].add(new Entry<K, V>(key, value));
        size++;
    }
 
    public V get(K key) {
        int index = hash(key);
 
        for (int i = 0; i < table[index].size(); i++) {
            Entry<K, V> entry = table[index].get(i);
            if (entry.key.equals(key)) {
                return entry.value; 
            }
        }
 
        return null; 
    }
 
    public V remove(K key) {
        int index = hash(key);
 
        for (int i = 0; i < table[index].size(); i++) {
            Entry<K, V> entry = table[index].get(i);
            if (entry.key.equals(key)) {
                V oldValue = entry.value; // сохраняем значение для возврата
                table[index].remove(i);   // удаляем пару из списка
                size--;
                return oldValue;
            }
        }
 
        return null; // ключ не нашли — ничего не удаляли
    }
 
    public int size() {
        return size;
    }
 
    public boolean isEmpty() {
        return size == 0;
    }

}
