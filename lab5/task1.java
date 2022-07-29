package lab05;
import java.io.File;
import java.util.*;
public class task1 {
	
	   public static void main(String[] args) {
	   /*Scanner for inputting the values*/
		   try {
				File file = new File("/Users/arifin/eclipse-workspace/CSE 221/src/lab05/input01.txt");
				Scanner in = new Scanner(file);
				int n = in.nextInt();
				/*nx2 array to store start and end time*/
			    int arr[][] = new int[n][2];
			    for(int i=0;i<n;i++){
			    arr[i][0] = in.nextInt();
			    arr[i][1] = in.nextInt();
			    }
			  
			       
		   
		   
	       
	       
	       /*Sorting array according to finish time*/
	       Arrays.sort(arr,new Comparator<int[]>(){
	       @Override
	       public int compare(int arr1[],int arr2[]){
	       int a1 = arr1[1];
	       int a2 = arr2[1];
	       return String.valueOf(a1).compareTo(String.valueOf(a2));
	       }
	       });
	       ArrayList<Integer> index = new ArrayList<>();
	       int res = 1;
	       int f = arr[0][1];
	       /*Finding the total number of assignments*/
	       for(int c=1;c<n;c++){
	       if(arr[c][0]>=f){
	       res++;
	       f = arr[c][1];
	       index.add(c);
	       }
	       }
	       Formatter formatter = new Formatter("/Users/arifin/eclipse-workspace/CSE 221/src/lab05/output01.txt");
	       formatter.format("%s \n"  , res );
			 
	       formatter.format(arr[0][0]+" "+arr[0][1]);
	       for(int i=0;i<index.size();i++){
	       formatter.format(arr[index.get(i)][0]+" "+arr[index.get(i)][1]);
	       }
			formatter.close();
	       /*Printing the assignments count and time periods*/
	       
		   }
		   catch(Exception e) {
				
			}

	   }
	}
	


