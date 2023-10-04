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
            map[bucket].add(new Entry(key, value));
        } else {
            for (Entry entry : map[bucket]) {
                if (entry.key == key) {
                    entry.value = value; 
                    return;
                }
            }
            map[bucket].add(new Entry(key, value)); 
        }
    }

    public int get(int key) {
        int bucket = key % size;
        LinkedList<Entry> entries = map[bucket];
        if (entries == null)
            return -1;
        for (Entry entry : entries) {
            if (entry.key == key)
                return entry.value; 
        }
        return -1; 
    }

    public void remove(int key) {
        int bucket = key % size;
        LinkedList<Entry> entries = map[bucket];
        if (entries == null)
            return; 
        for (Entry entry : entries) {
            if (entry.key == key) {
                entries.remove(entry); 
                return; 
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