
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {

     int numero = 11;
    int primo = 0;

    for (int i = 1; i <= numero; i++){

        if (numero % i == 0){

           primo = primo+1;
        }    

    }

   if(primo ==2){
     System.out.println("numero é primo");
   }else System.out.println("não é primo"); 



 }

  

}

 