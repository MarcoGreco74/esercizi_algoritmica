/*
Vi consegno degli esercizi di algoritmica da terminare entro un'ora circa:
1)	Somma dei primi n numeri. Es:
	Input: n
	Output: somma da 1 a n.
2)	Inverti una stringa. Es:
	Input: "ciao"
	Output: "oaic"
3)	Conta le parole in una frase. Es:
	Input: "ciao come va?"
	Output: 3
4) Scrivi un programma che:
	- prende in input un numero intero positivo
	- conta quante cifre contiene quel numero
	- stampa il risultato.
	Es:
	Input: 5        → Output: 1
	Input: 123      → Output: 3
	Input: 10000    → Output: 5 
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ///////// 1)
        System.out.println("Inserisci un numero intero");
        int count = 0;
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){
            count+=i;
        }
        System.out.println("La somma dei numeri fino a "+n+" è "+count);
        ////////// 2)
        System.out.println("Inserisci una stringa");
        String str = scan.next();
        String reversed = "";
        for(int i = 0; i < str.length(); i++){
           reversed = str.charAt(i)+reversed;
        }
        System.out.println("La frase al contrario è "+reversed);
        /////////// 3)
        System.out.println("Inserisci una frase");
        scan.next();
        String frase = scan.nextLine();
        String[] parole = frase.split("\\s+");
        int numParole = parole.length;
        System.out.println("La frase è fatta di "+numParole+" parole");
        //////////// 4)
        System.out.println("Inserisci un numero intero");
        int num = scan.nextInt();
        Integer numInteger = Integer.valueOf(num);
        System.out.println("Il numero inserito è composto da "+numInteger.toString().length()+" cifre");
    }
}
