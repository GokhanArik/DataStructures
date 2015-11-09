public class HashTable{
    private static final int SIZE = 16;
    private Entry[] table = new Entry[SIZE];

    public void put(String key, String value){
        int hash = key.hashCode() % SIZE;

        Entry e = table[hash];

        if (e == null){
            Entry newEntry = new Entry(key, value);
            table[hash] = newEntry;
        } else {
            if(e.key.equals(key)){
                e.value = value;
            } else {
                while(e.next != null){
                    e = e.next;
                }

                Entry newEntryInOldBucket = new Entry(key, value);
                e.next = newEntryInOldBucket;
            }
        }

    }

    public Entry get(String key){
        int hash = key.hashCode() % SIZE;

        Entry e = table[hash];

        while(e != null){
            if(e.key.equals(key)){
                return e;
            }
            e = e.next;
        }
        return null;
    }
}
