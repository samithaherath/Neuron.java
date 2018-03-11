/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.algo;

/**
 *
 * @author samit
 */
public class PatternAlgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int a,b,c;
        
      
        
        /*for(a=1;a<=5;a++){
            
            for(b=1;b<=5-a;b++){
                System.out.print(" ");
            }
                for(c=1;c<=a;c++){
                    System.out.print("*");
                }
                System.out.println("");
        }*/ 
        for(a=1;a<=5;a++){
            
            for(b=1;b<=5-a;b++){
                System.out.print(" ");
            }
                for(c=1;c<=a*2-1;c++){
                    System.out.print("*");
                }
                System.out.println("");
        }
        for(a=4;a>=1;a--){
            
            for(b=1;b<=5-a;b++){
                System.out.print(" ");
            }
                for(c=1;c<=a*2-1;c++){
                    System.out.print("*");
                }
                System.out.println("");
        }
    
    }
}
