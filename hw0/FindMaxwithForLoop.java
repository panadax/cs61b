public class FindMaxwithForLoop {
   public static int max(int[] m) {
      int temp = m[0];
         for (int n=0;n<m.length;n++){
         if (m[n]>temp)
            temp = m[n];
      }
       return temp;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};      
   int MaxValue = max(numbers);
   System.out.printf("Max value of the array is %d",MaxValue);
   }
}