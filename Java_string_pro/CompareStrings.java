public class CompareStrings {
    public static void main(String[] args) {
        String str1="Atul";
        String str2="Atul";
        String str3=null;
        String newString=new String("Atul");
        try{
            
        System.out.println("comparing String Using ==");
        System.out.println(str1 == str2);
        System.out.println(str1 == newString);
        System.out.println(str1 ==str3);
        System.out.println(str2 == newString);
        System.out.println(str2 == str3);
   
        System.out.println("comparing String with String equals() method");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(newString));
        System.out.println(str1.equals(str3));

        System.out.println("comparing String with compareTo() method");
        System.out.println(str1.compareTo(newString));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));  //throws Null pointer exception


        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());

        }


    }
}
