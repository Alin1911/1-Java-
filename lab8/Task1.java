package lab08;

import java.util.Map;
import java.util.Set;
import java.util.*;

class ArrayMap<K, V> extends AbstractMap<K, V> {

    ArrayList<ArrayMapEntry> abcd;

    public ArrayMap(ArrayList<ArrayMapEntry> abcd) {
        this.abcd = abcd;
    }

    ArrayMap() {
        this.abcd = new ArrayList<>();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return new HashSet<>(abcd);
    }

    @Override
    public int size() {
        return abcd.size();
    }

    @Override
    public V put(K key, V value) {
        for(ArrayMapEntry entry : abcd) {
            if(entry.getKey().equals(key)) {
                entry.setValue(value);
                return value;
            }
        }
        abcd.add(new ArrayMapEntry(key, value));
        return value;
    }

    class ArrayMapEntry implements Map.Entry<K, V> {
        K key;
        V value;

        ArrayMapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            this.value = value;
            return this.value;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }

        @Override
        public boolean equals(Object obj) {

            if (obj.getClass() != this.getClass())
                return false;

            return (((Map.Entry<K, V>) obj).getValue() == this.value && ((Map.Entry<K, V>) obj).getKey() == this.key);
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }
}

public class Task1 {

    public static void main(String args[]) {
        ArrayMap<Integer, String> map = new ArrayMap<>();

        System.out.println("Populam colectia...");
        map.put(7, "Colectii si genericitate");
        map.put(8, "Clase interne");
        map.put(5, "Fluxuri");

        System.out.println("Verificam...");
        System.out.println("Continutul colectiei: " + map);

        if (map.size() != 3) {
            System.err.println("ArrayMap.size() (" + map.size() + ") a fost implementata gresit.");
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        if (entries.size() != 3) {
            System.err.println("ArrayMap.entrySet() a fost implementata gresit.");
        }

        for (Map.Entry<Integer, String> e : entries) {
            map.put(e.getKey(), new StringBuffer(e.getValue()).reverse().toString());
            if (!map.entrySet().contains(e)) {
                System.err.println("ArrayMap.put() nu inlocuieste vechea valoare.");
            }
            if ((!e.toString().contains(e.getKey().toString()) || (!e.toString().contains(e.getValue())))) {
                System.err.println("ArrayMap.ArrayMapEntry.toString() a fost implementata gresit.");
            }
        }

        for (Map.Entry<Integer, String> e1 : entries) {
            for (Map.Entry<Integer, String> e2 : entries) {
                if ((e1 == e2) != (e1.equals(e2))) {
                    System.err.println("ArrayMap.ArrayMapEntry.equals() a fost implementata gresit.");
                }
                if ((e1 == e2) != (e1.hashCode() == e2.hashCode())) {
                    System.err.println("ArrayMap.ArrayMapEntry.hashCode() a fost implementata gresit.");
                }
            }
        }
    }
}
