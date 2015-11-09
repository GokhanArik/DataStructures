public class Entry{
    String key;
    String value;
    Entry next;


    public Entry(String key, String value){
        this.key = key;
        this.value = value;
    }

    String getValue(){
        return value;
    }

    void setKey(String key){
        this.key = key;
    }

    void setValue(String value){
        this.value = value;
    }
}
