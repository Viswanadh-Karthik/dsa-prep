package dsa;
import java.util.Objects;

class MyHashMap<K, V> {

    private static final int INITIAL_CAPACITY = 16;

    private Node<K, V>[] buckets;

    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new Node[INITIAL_CAPACITY];
    }

    private int getIndex(K key) {
        int hash = Objects.hashCode(key);
        return Math.abs(hash % buckets.length);
    }

    public void put(K key, V value) {
        int index = getIndex(key);

        Node<K, V> head = buckets[index];

        while (head != null) {
            if (Objects.equals(head.key, key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    public V get(K key) {
        int index = getIndex(key);

        Node<K, V> head = buckets[index];

        while (head != null) {
            if (Objects.equals(head.key, key)) {
                return head.value;
            }
            head = head.next;
        }

        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);

        Node<K, V> head = buckets[index];
        Node<K, V> prev = null;

        while (head != null) {
            if (Objects.equals(head.key, key)) {

                if (prev == null) {
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }

                return;
            }

            prev = head;
            head = head.next;
        }
    }

    public void display() {
        for (int i = 0; i < buckets.length; i++) {

            Node<K, V> head = buckets[i];

            if (head != null) {
                System.out.print("Bucket " + i + ": ");

                while (head != null) {
                    System.out.print("[" + head.key + " = " + head.value + "] -> ");
                    head = head.next;
                }

                System.out.println("null");
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        System.out.println("Initial HashMap:");
        map.display();

        System.out.println("\nValue for Apple: " + map.get("Apple"));

        map.put("Apple", 50);

        System.out.println("\nAfter Updating Apple:");
        map.display();

        map.remove("Banana");

        System.out.println("\nAfter Removing Banana:");
        map.display();
    }
}