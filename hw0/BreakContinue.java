public class BreakContinue {
  public static void windowPosSum(int[] m, int n) {
  	int ArraySize = m.length;
    /*Iterate all numbers in array*/
  	for(int i=0;i<ArraySize;i++){
      /*Gaurentee the program only apples to possitive numbers*/
      if (m[i] <=0){
        continue;
      }
      else{
        /*Discuss the case the number of the rest numbers is not larger than the value of argument n*/
        if(i+n<ArraySize){
          /*Determine the i-th number in the array in general circumstance*/
          for(int j=i;j<i+n;j++){
            m[i] = m[i]+ m[j+1];
          }
        }
        else{
          for(int j=i;j<ArraySize-1;j++){
            m[i] = m[i]+ m[j+1];
          }
        }
      } 
  	}
  }

  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}