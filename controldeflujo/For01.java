public class For01{
   public static void main(String args[]){
      int i;
      int j;
      for (i = 0, j = 0; j < i; ++j, i++){
         System.out.println(i + " " + j);
      }
      System.out.println(i + " " + j);
   }
}

// Imprime 0 0 una sola vez