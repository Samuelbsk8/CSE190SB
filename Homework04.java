import java.util.Scanner;
public class Homework04 {

	public static final double PI = 3.14;

	public static void main(String[] args) {
		// Samuel Britton
		
		Scanner key= new Scanner(System.in);
		
		//Makes sure that the amount of circles in not less than 1
		int Circles;
		while(true) {
			System.out.println("List how many circles you want to create");
			Circles = key.nextInt();
			if (Circles > 0) {
				break;
			}
			System.out.println("I cannot continue with less than 1 Circles\n");
			
		}
		
		//creating the variables area and temp.
		double area, temp;
		
		double radCircle[] = new double[Circles];
		
		for(int i = 0; i < Circles; i++) 
		{
			
			System.out.println("Enter the radius of circle " + (i + 1));
			radCircle[i] = key.nextDouble();
			
			area = ((radCircle[i] * radCircle[i]) * 3.14);
			
			radCircle[i] = area;
			
		}
		//asks the user whether how they want to sort the areas
		System.out.println("Do you want to sort the area of the circles from smallest to largest(Enter \"1\") or largest to smallest(Enter \"2\")");
		
		int sort = key.nextInt();
		//sorts the array using selection sort
		if(sort == 1) {
			
			for(int i = 0; i < Circles; i++)  
		       {  
		           for(int j = i + 1; j < Circles; j++)  
		           {  
		               if(radCircle[i] > radCircle[j])  
		               {  
		                   temp = radCircle[i];  
		                   radCircle[i] = radCircle[j];  
		                   radCircle[j] = temp;  
		               }  
		           }  
		       }  
			  
			
			
		} else if (sort == 2) {
			
			for(int i = 0; i < Circles; i++)  
		       {  
		           for(int j = i + 1; j < Circles; j++)  
		           {  
		               if(radCircle[i] < radCircle[j])  
		               {  
		                   temp = radCircle[i];  
		                   radCircle[i] = radCircle[j];  
		                   radCircle[j] = temp;  
		               }  
		           }  
		       }  
			
			  
		}
		
		//print the areas while also making sure there are no duplicates
		for (int i = 0; i < Circles; i++) {
		    
		    if (i == 0 || radCircle[i] != radCircle[i - 1]) {
		    	
		        System.out.print(radCircle[i] + "  ");
		        
		    }
		}
		
		
		
		
	}

}
