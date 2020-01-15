public class Counting {

 
  
    public static void main(String[] args) {
        int[] num = { 3, 20, 12, 7, 2, 8, 10, 4, 19, 5 };
        sort(num,num.length);
 
        for (int h : num)
            System.out.print(h + " ");
    }
     public static void sort( int[] input,int n)
 
     {
 
         int min=0,max=0;
 
         for (int i = 1; i < n; i++)
 
         {
 
             if (input[i] > max)
 
                 max = input[i];
 
             if (input[i] < min)
 
                 min = input[i];
 
         }
 
         int range = max - min + 1;
 
 
 
         int[] count = new int[range];
 
         //counts frequencies for each element
 
         for (int i = 0; i < n; i++)
 
             count[input[i] - min]++;
 
         // getting positions in final array
 
         for (int i = 1; i < range; i++)
 
             count[i] += count[i - 1];
 
         
         //copy to output array, preserving order of inputs with equal keys
         int j = 0;
 
         for (int i = 0; i < range; i++)
 
             while (j < count[i])
 
                 input[j++] = i + min;
   
    }
    
}
