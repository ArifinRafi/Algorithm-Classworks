package lab05;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;
import java.util.Stack;
public class task3 {
	
	    public static void main(String[] args){
	        // try catch for exception handling
	        try{
	            // for reading task3_input.txt file
	            // such that file will be considered similar to user input.
	            System.setIn(new FileInputStream("/Users/arifin/eclipse-workspace/CSE 221/src/lab05/input03.txt"));
	        
	        // declare sc
	        Scanner sc = new Scanner(System.in);
	        // n represents size of tasks
	        int n;
	        // take n
	        n = sc.nextInt();
	        // declare tasks arrray.
	        int[] tasks = new int[n];
	        // run loop to take values of tasks array.
	        for(int i=0;i<n;i++){
	            tasks[i] = sc.nextInt();
	        }
	        // to clear buffer
	        sc.nextLine();
	        
	        // take string input
	        String str = sc.nextLine();

	        // sort tasks array in ascending order
	        Arrays.sort(tasks);
	        
	        // declare stack
	        Stack<Integer> jackStack = new Stack<Integer>();
	        // declare arraylist hourSequence that represents the sequence of tasks.
	        ArrayList<Integer> hourSequence = new ArrayList<Integer>();
	        // declare jackHour and jillHour as 0
	        int jackHour=0, jillHour=0;


	        int j = 0;
	        // loop over str
	        for(int i=0;i<str.length();i++){
	            // if value of str at index i is J then
	            if(str.charAt(i)=='J'){
	                // push value at tasks[j] in stack and in hourSequence
	                jackStack.push(tasks[j]);
	                hourSequence.add(tasks[j]);
	                // increase jackHour
	                jackHour = jackHour + tasks[j];
	                // increment j
	                j++;
	            }else{
	                // pick the highest value from jackStack
	                int value = jackStack.pop();
	                // add this value in hourSequence
	                hourSequence.add(value);
	                // increase jillHour
	                jillHour = jillHour + value;
	            }
	        }

	        // print hourSequence
	        Formatter formatter = new Formatter("/Users/arifin/eclipse-workspace/CSE 221/src/lab05/output03.txt");
	    	

	        for(int i=0;i<hourSequence.size();i++){
	            formatter.format("%s \n", hourSequence.get(i));
	        }
	        formatter.format(" ");
	        formatter.format("Jack will work for "+jackHour+" hrs");
	        formatter.format("Jill will work for "+jillHour+" hrs");
	    	formatter.close();
	    	
	        // break line
	        // print jack and jill hour
	        
	    }
	    
	        catch(Exception e){
	            System.out.println("error occured.");
	        }
	    }
}



