/**
 * Задан массив, например, nums = [1,7,3,6,5,6]. Написать программу, которая найдет индекс i для этого массива такой, 
 * что сумма элементов с индексами < i равна сумме элементов с индексами > i.
 */
public class Task_1 {
      /**
      */
    public static void main(String[] args) {
      int[] nums= {1,7,3,6,5,6};
      int length=nums.length;
      int temp=0;
      int offset=1;
      Boolean breakFlag=false;
      int[] forwardSumArray = new int [length];
      int[] reverseSumArray = new int [length];
      for (int i = 0; i < length; i++) {
        forwardSumArray[i]=temp+nums[i];
        temp=forwardSumArray[i];
        }
      temp=0;
      for (int i = length-1; i >=0; i--) {
        reverseSumArray[i]=temp+nums[i];
        temp=reverseSumArray[i];
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
              if ((forwardSumArray[i]==reverseSumArray[j])&(i<(length-1))) {
              System.out.println("Sum="+ forwardSumArray[i]);
              int index=i+offset;
              System.out.println("Index="+ index);
              breakFlag=true;
              }
         }
         if (breakFlag==true){
          break;
         }
        }
      }
    
}