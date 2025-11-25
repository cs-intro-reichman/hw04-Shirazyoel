public class Primes {
    public static void main(String[] args) {
        int  N = Integer.parseInt(args[0]);
       boolean [] arr = new boolean[N + 1];
       arr = MakeAllTrue(arr);
       int i = 2;
       System.out.println("prime numbers up to " +   N  + ":" );

       while (i < arr.length) {
        int m = i + 1;

        while (m < arr.length){
          if (arr[m] == true){
            if (m % i == 0) {
            arr[m] = false;
            }      
          }   
         m++;
        }
         i++; 
    }
        int s = 2;
        int num = 0;
        while (s < arr.length) {
            if (arr[s] == true) {
            System.out.println(s);
            num ++; 
            }
            s++;
        }

        double p = ((double)num/N*100);
        System.out.println("There are " + num + " Primes between 2 and " + N + " (" + (int)p + "% are primes)");

        
}

public static boolean[] MakeAllTrue (boolean[] arr){
for (int i = 2; i < arr.length; i++){
    arr[i] = true;
}
return arr;
}
}