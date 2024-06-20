
/* Tipos primitivos de variáveis
 * 
 * Int;Byte;Short;Long;Boolean;Float;Double;Char
 * 
 * Byte = 4 bits
 * Short = 8 bits
 * Int = 16 bits
 * long = 32 bits
 * float = 16 bits
 * double = 32 bits
 * 
 * Java é fortemente tipado, respeitando o limites e normas da variavel
 * 
 * 
 * short numeroCurto = 1;
 * int numeroNormal = numeroCurto; 
 * short numeroCurto2 = numeroNormal;
 * 
 * resolução:
   short numeroCurto2 = (short)numeroNormal;
<<<<<<< HEAD

   Constanste são valores armazenados em memoria que não podem ser modificados depois de definido, usando
   Final;
 */

public class Tipos_Variaveis {

    public static void main(String[] args){

        final double SALDO = 0;

        System.out.println("Meu saldo é " + SALDO);
    }
  }
