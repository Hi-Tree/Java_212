public class Question_4 {
public static void main(String[] args){
    Book cat = new Book("Cat", "Meri", 100000000.0f);
    System.out.println(cat.getPrice());
}

public static class Book{
    private String Author;
    private String Title;
    private float Price;

    public Book(String authorr, String titlee, float pricee){//constructor 3 methods with exception 
        if(authorr == " " || authorr == null || pricee < 0){
            throw new IllegalArgumentException("One or more of the entered values are incorrect.");
        }
        else{
        Author = authorr;
        Title = titlee;
        Price = pricee;
        }
    }
    public void setAuthor(String name){
        Author = name;
    }
    public void setTitle(String bookName){
        Title = bookName;
    }
    public void setPrice(float pri){
        Price = pri;
    }
    public String getAuthor(){
        return Author;
    }
    public String getTitle(){
        return Title;
    }
    public float getPrice(){
        return Price;
    }
}


}
