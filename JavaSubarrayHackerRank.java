import java.util.Scanner;
public class JavaSubarrayHackerRank {
    public static void main(String args[]) {
        int count = 0;
        int sum = 0;
        int i;
        
      Scanner sc = new Scanner(System.in);
      
      System.out.println("enter how many array values you want to  take: ");
      
      int n = sc.nextInt();
      int a[] = new int [n];
      
      for(i = 0; i <n ; i++){
          
          a[i] = sc.nextInt();
          System.out.println(a[i]);
          
    //  a[i] = 0;  ekhane 0,1,2,3....number position gulo i er modde ei sob position e value abar 0 kore dile j te
    // sob 0 e dekhabe.
      
      }
      
      System.out.println("Number of minus sub Array: "+count);
      for(int j = 0; j < n; j++){
          
          System.out.println("J te j value ase: "+a[j]);   /*j er modde to position 0,1,2,3...r ei same position e value ja ase tai
                                      to print korbe.*/
          for(int k = j; k < n; k++ ){
              // ekhane k er modde j er position assign hoise r sei position onujai a[k] te value dekhasse.
              // k er modde j er value assign hoyni.
              
             /* sum = a[k] + sum; 
              
              System.out.println("sum e j value ase: "+sum+"+"+a[k]+" = "+sum);*/
              //sum = sum+a[k];
              /*System.out.println("sum = "+sum);
              System.out.println("a[k] = "+a[k]);*/
              sum = sum +a[k]; // First e ei sum er modde given -1 value ta count hosse then plus minus hoye count hosse. tai ekhanei jotheshto age r lagbe na.
              System.out.println("sum = "+sum);
              if(sum < 0){
                  
                  count++;
              }
          }
          sum = 0;
      }
      System.out.println("Number of minus sub Array: "+count);
      
    }
}
