public class HashTableDemo{

    public static void main(String[] args){
        HashTable hashTable = new HashTable();
        hashTable.put("FB", "Fenerbahce");
        hashTable.put("GS", "Galatasaray");
        hashTable.put("BJK", "Besiktas");

        Entry e = hashTable.get("FB");
        System.out.println(e.getValue());
    }
}
