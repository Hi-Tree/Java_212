
public class Lab3 {
   public static void main(String[] args) {
	float farenheit = 98.6f;
	float celcius = ((farenheit-32)*5/9);
	  for(float i=0.0f; i <= 40.0; i+=5){
		  System.out.println((i-32)*5/9+"cat");
	  }
	   //reset farenheit from last time
	  farenheit = 0;
	  while(farenheit <= 40.0){
		System.out.println((farenheit-32)*5/9);
		farenheit+=5.0;
	}
   } 
}//yay meri did it 