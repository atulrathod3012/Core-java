import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String string=sc.nextLine();
        char[] ch=string.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        if (rev.equals(string)) {
          System.out.println(rev + " is Palindrome");
        }
        else{
           System.out.println(rev + " is not  Palindrome");
        }
      
        
    }
}
