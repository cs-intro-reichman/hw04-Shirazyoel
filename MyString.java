public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }


    public static String lowerCase(String str) {
        char[] arr = new char[str.length()];

        for (int i=0; i < str.length(); i++){

        arr [i] = str.charAt(i);
        char ch = arr[i];

        if (ch >= 'A' && ch <= 'Z'){
        ch = (char) (ch + 32);
        }
        
        arr[i] = ch;
       }

        String newString = new String(arr);

        return newString;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
         if (str1 == null || str2 == null){
          return false;  
         }        
         if (str2.length() == 0){
            return true;
         }
         if (str2.length() > str1.length()){
          return false;
         }
         String lower1 = lowerCase(str1);
         String lower2 = lowerCase(str2);
         for (int i = 0; i <= lower1.length() - lower2.length(); i++){
            int m = 0;
           while (m < lower2.length() && lower1.charAt(i + m) == lower2.charAt(m)) {
            m++;
           }
           if (m == lower2.length()) {
             return true;
           }
        }
           return false;
           
         } 
        }


         
