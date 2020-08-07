public class DrawTriangle{
	public static void DrawTriangle(int n){
		int i =0;
		/*The first loop is for the height of the triangle*/
		while(i<n){
			int j = 0;
			/*Note that the number of asterisks for each row is related to the "i-th" instead of the value of n.*/
			while(j<i+1){
				System.out.print("*");
				j++;
			}
			System.out.print("\n");
			i++;
		}

	}


	public static void main(String[] args){
		if (args.length < 1) {
			System.out.println("Please enter command line arguments.");
		}		
		else if (args.length > 1) {
			System.out.println("Please enter ONE parameter to draw a triangle.");
		}
		else{
			try{
			int amount = Integer.parseInt(args[0]);
			if(amount<=0){
				System.out.printf("Argument should be a positive number.\n");
			}
			else
			DrawTriangle(amount);
		}catch (NumberFormatException e) {
            System.out.printf("%s is not a valid number.\n", args[0]);
        	}
		}	
    }
}
