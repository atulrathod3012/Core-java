import java.util.Scanner;

public class PalindromeStringBuilder {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        if (sb.reverse().toString().equals(str)) {
            System.out.println(str +" is Palindrome");  
        }
        else{
             System.out.println(str +" is not Palindrome"); 
        }

    }
}
