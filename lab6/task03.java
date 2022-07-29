package lab06;

public class task03 {
	public static void main(String[] args) {
	int[][][] arr={
            {
            	{30, 25},
                {35, 40},
                {41, 45},
                {26, 6}
                           },
            {
            {41, 45},
            {43, 47},
            {49, 44},
            {46, 47},
            
                     },
            {
                         {10, 15},
                         {35, 20},
                         {11, 17},
                         {29, 16}
                     }
	};
	
	for (int i = 0 ; i<arr.length; i++) {
		System.out.println("Student: " + i+1);
		for (int j = 0; j<i; j++) {
			System.out.println("Course " + j+1);
			System.out.println("Marks of Mic and Final");
			for (int k = 0; k<i && k<j; k++) {
				System.out.println(arr[i][j][k] +" ");
			}
			System.out.println();
			
			
			
		}
		System.out.println();
		
	}
	

}
}
