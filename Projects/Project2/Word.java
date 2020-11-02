public class Word {
    protected String data;
    public Word(String w){
        data = w;
    }

    int compareTo(Word other){
        return(this.data.compareTo(other.data));
    }
}
