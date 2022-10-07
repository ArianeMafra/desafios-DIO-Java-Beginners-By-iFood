/*Desafio
Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as aspas. 

Entrada
As entradas serão dois valores, um em cada linha, representados por A e B, que sempre serão números inteiros. 

Saída
A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor. Caso contrário,  retorne "Nao sao iguais!", sem as aspas.

EXEMPLO DE ENTRADA 

EXEMPLO DE SAÍDA 

1
2

Nao sao iguais! 

50
50

Sao iguais! 

38
90

Nao sao iguais! 

*/
import java.util.*;

public class NumerosSaoIguais {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int primeiroNumero = scanner.nextInt();
        int segundoNumero = scanner.nextInt();
        
        if (primeiroNumero == segundoNumero) {
          System.out.println ("Sao iguais");
        } else {
          System.out.println ("Nao sao iguais!");
        }

        scanner.close();
    }
}

