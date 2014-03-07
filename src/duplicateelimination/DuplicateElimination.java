/**
 * @author Thembelani Dyosiba
 * Student NO: 210114363
 */ 

package duplicateelimination;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElimination {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        
        for(int i = 0; i < names.length; i++){
            System.out.println("Enter first name: ");
            names[i] = input.nextLine();
        }
        
        //Printout that array as a list
        List<String> list = Arrays.asList(names);
        
        //Initial Array Elements
        System.out.printf("%s", list);
        System.out.println();
        
        //Calling removeDuplicates and searchForName methods
        removeDuplicates(list);
        searchForName(list);
    }
    
    // Make a methos called removeDuplicates
    private static void removeDuplicates(Collection<String> values){
        // Implement a HashSet in it.
        Set<String> set = new HashSet<String>(values);
        
        // Print a non-duplicate list of elements
        for(String value : set){
            System.out.printf("%s", value);
        }
        System.out.println();
    }
    
    // Make a method to search for a first name.
    public static void searchForName(Collection<String> names){
        String someName = null;
        
        Set<String> set = new HashSet<String>(names);
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i <= 5; i++){
            System.out.println("Search this name: ");
            someName = input.nextLine();
            
            if(set.contains(someName)){
                System.out.println("Search item exists");
            }else{
                System.out.println("invalid entry! Please try again.");
            }
        }
    }
    
}
