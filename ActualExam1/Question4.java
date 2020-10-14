public class Pen{
    private float price;
    private String color;

    public Pen(String colo, float pric){//constructor 
        if(pric < 0.0f){
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        price = pric;
        color = colo;
    }
    public void setPrice(float pri){
        price = pri;
    }
    public void setColor(String col){
        color = col;
    }
    public float getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }
}
