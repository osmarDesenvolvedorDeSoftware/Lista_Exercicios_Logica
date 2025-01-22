
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
//1 - Faça um algoritmo valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class Main {
  public static void main(String[] args) {

  double numero1,numero2, resultado;
  char operador;  

    numero1 = 10;
    numero2= 0;
    operador = '/';

    if (operador == '+'){
      resultado = numero1 + numero2;
    } else if(operador == '-'){
      resultado = numero1 - numero2;
    }else if(operador == '*'){
      resultado= numero1 * numero2;
    }else if (numero2== 0){
    System.out.println("Não é possivel dividir por zero");
      resultado =0;
    } else{
      resultado= numero1/numero2;
    }

  System.out.println(resultado);
    
    
      

    
  }

}

 