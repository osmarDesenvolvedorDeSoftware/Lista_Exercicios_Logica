
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {

     int numero =15;

    for( int i= 1; i <= numero; i++){ 
      
    if(i % 3 == 0 && i % 5 == 0){

        System.out.println("fizzbuzz");
      }else if(i % 5 == 0){
        System.out.println("buzz");
      }else if(i % 3 == 0){

        System.out.println("fizz");
      }else System.out.println(i);
    
    }


 }

  

}

 