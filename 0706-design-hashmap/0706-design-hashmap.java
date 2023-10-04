class MyHashMap {
    int size = 789;
    LinkedList<Entry>[] map;

    public MyHashMap() {
        map = new LinkedList[size];
    }

    public void put(int key, int value) {
        int bucket = key % size;
        if (map[bucket] == null) {
            map[bucket] = new LinkedList<>();
            map[bucket].add(new Entry(key, value)); // Add the entry to the linked list in the bucket
        } else {
            for (Entry entry : map[bucket]) {
                if (entry.key == key) {
                    entry.value = value; // Update the value if the key already exists in the bucket
                    return; // Exit the method after updating the value
                }
            }
            map[bucket].add(new Entry(key, value)); // Add a new entry if the key does not exist in the bucket
        }
    }

    public int get(int key) {
        int bucket = key % size;
        LinkedList<Entry> entries = map[bucket];
        if (entries == null)
            return -1;
        for (Entry entry : entries) {
            if (entry.key == key)
                return entry.value; // Return the value associated with the key if found
        }
        return -1; // Key not found
    }

    public void remove(int key) {
        int bucket = key % size;
        LinkedList<Entry> entries = map[bucket];
        if (entries == null)
            return; // No entries in the bucket, nothing to remove
        for (Entry entry : entries) {
            if (entry.key == key) {
                entries.remove(entry); // Remove the entry if the key is found in the bucket
                return; // Exit the method after removing the entry
            }
        }
    }
}

class Entry {
    public int key;
    public int value;

    public Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }
}