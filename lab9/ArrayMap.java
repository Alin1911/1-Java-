import java.util.*;

public class ArrayMap<K, V> extends AbstractMap<K, V> {
    Vector<K> keys;
    Vector<V> values;

    public ArrayMap(Vector<K> keys, Vector<V> values) {
        this.keys = keys;
        this.values = values;
    }
    public ArrayMap(){
        this.keySet();
        this.values();
    }

    public ArrayMap(K key, V value) {
        this.keys.add(key);
        this.values.add(value);
    }

    @Override
    public String toString() {
        return "ArrayMap{" +
                "keys=" + keys +
                ", values=" + values +
                '}';
    }

    @Override
    public V put(K key, V value) {
        return super.put(key, value);
    }

    @Override
    public V get(Object key) {
        final V v = super.get(key);
        return v;
    }

    @Override
    public Set<K> keySet() {
        final Set<K> ks = super.keySet();
        return ks;
    }

    @Override
    public Collection<V> values() {
        return super.values();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    class ArrayMapEntry implements Map.Entry<K, V>{
        private K key;
        private V vaue;

        public ArrayMapEntry(K key, V vaue) {
            this.key = key;
            this.vaue = vaue;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return vaue;
        }

        @Override
        public V setValue(V value) {
            this.vaue = value;
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ArrayMapEntry that = (ArrayMapEntry) o;
            return Objects.equals(key, that.key) &&
                    Objects.equals(vaue, that.vaue);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, vaue);
        }

        @Override
        public String toString() {
            return "ArrayMapEntry{" +
                    "key=" + key +
                    ", vaue=" + vaue +
                    '}';
        }

    }

    public static void main(String[] args) {
        ArrayMap<Integer,String> map =new ArrayMap<>();
        map.put(4, "Alin");
        map.put(1, "are");
        map.put(2, "mere");
        System.out.println("Colectia este:");
        System.out.println(map.toString());
    }
}
