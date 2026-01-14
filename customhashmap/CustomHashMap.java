package practise.customhashmap;

public class CustomHashMap<K,V> {
    private static final int DEFAULT_CAPACITY = 16;
    private Entry<K,V>[] buckets;
    private int size;

    public CustomHashMap() {
        this.buckets = new Entry[DEFAULT_CAPACITY];
        size = 0;
    }

    private int getBucketIndex(K key) {
        if(key == null) {
            return 0;
        }
        return Math.abs(key.hashCode())%buckets.length;
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Entry<K,V> head = buckets[bucketIndex];

        while(head != null) {
            if((key == head.getKey()) || (key != null && key.equals(head.getKey()))) {
                head.setValue(value);
                return;
            }
            head = head.next;
        }

        Entry<K,V> newEntry = new Entry<>(key,value);
        newEntry.next = buckets[bucketIndex];
        buckets[bucketIndex] = newEntry;
        size++;
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        Entry<K,V> head = buckets[bucketIndex];

        while(head != null) {
            if((key == head.getKey()) || (key != null && key.equals(head.getKey()))) {
                return head.getValue();
            }
            head = head.next;
        }
        return null;
    }

    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Entry<K,V> head = buckets[bucketIndex];
        Entry<K,V> prev = null;

        while(head != null){
            if((key == head.getKey()) || (key != null && key.equals(head.getKey()))) {
                if(prev != null) {
                    prev.next = head.next;
                }else {
                    buckets[bucketIndex] = head.next;
                }
                size--;
                return head.getValue();
            }
            prev = head;
            head = head.next;
        }
        return null;
    }

    public int size() {
        return size;
    }
}
