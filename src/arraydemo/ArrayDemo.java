/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo;

import java.util.Scanner;

/*
 * Hello this has been edited from remote
 * Commenting for modification on jan 17 at 9:48 AM
 * This is fetch and merge
 * @author daksh
 */
public class ArrayDemo {

    /**
    
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
       
        System.out.println("please Enter the word");
        String myWord = input.nextLine();
        
        char[] myLetters = new char[myWord.length()];
        
        for(int i =0;i< myLetters.length;i++){
            myLetters[i] = myWord.charAt(i);
        }
            
            System.out.println("printing in reverse order");
            
            for(int i = myLetters.length-1;i>=0;i--){
                    System.out.println(myLetters[i]);
            }
       
    }
    
}
