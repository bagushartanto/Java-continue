/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continu;

/**
 *
 * @author user
 */
public class Continu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++){
            if (i == 4){
                continue;
            }
            System.out.print(i);
        }
    }
    
}
