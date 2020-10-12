import javax.swing.*;
public class teststrings {
    public static void main(String args[]){
        String cat = "cat";
        String[] arr = new String[3];
        for(int i = 0; i <= 2; i++){
            arr[i] = cat[i];
        }
        System.out.println(arr[1]);
    }
}
