
public class Program2 {
   
    static int countOccurences(String str, String word)  
    { 
        String a[] = str.split(" "); 
      
        // search for pattern in a 
        int count = 0; 
        for (int i = 0; i < a.length; i++)  
        { 
        // if match found increase count 
        if (word.equals(a[i])) 
            count++; 
        } 
      
        return count; 
    } 

    public static void main(String[] args) {
        String Str = new String("TERE teRe VaNa KerE");
        String[] arrOfStr = Str.split(" ", 0);
        String StrLower = Str.toLowerCase();
        String word = "tere";
        String word2 = "vana";
        String word3 = "kere";

        for (String a : arrOfStr)
        System.out.println(a); 

        System.out.println(StrLower);  
        System.out.print("Sõna tere esinevus: ");
        System.out.println(countOccurences(StrLower, word));
        System.out.print("Sõna vana esinevus: ");
        System.out.println(countOccurences(StrLower, word2));
        System.out.print("Sõna kere esinevus: ");
        System.out.println(countOccurences(StrLower, word3));
    }
}