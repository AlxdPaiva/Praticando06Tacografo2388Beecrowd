/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praticando06tacografo2388beecrowd;

import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Praticando06Tacografo2388Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        //System.out.println(N);
        
        int cont = 0;
        int res = 0;
        while (cont < N){
            int T = teclado.nextInt(); int V = teclado.nextInt();
            int D = T * V;
            res += D;
            cont++;
        }
        System.out.println(res);
        
    }
    
}
