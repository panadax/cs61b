public class FindMaxwithWhileLoop {
   public static int max(int[] m) {
   	int n =0;
   	int temp = m[0];
   	while (n<m.length){
   		if(temp<m[n]){
   			temp = m[n];
   		}
   		n++;
   	}
   	return temp;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};      
   int MaxValue = max(numbers);
   System.out.printf("Max value of the array is %d",MaxValue);
   }
}