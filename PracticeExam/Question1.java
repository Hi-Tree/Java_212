import java.util.Scanner;
public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = sc.nextInt();
        for(int j = i; j<=i+5; j++){
            System.out.print(j+ " ");
        }
        System.out.print("\n");
    }
}