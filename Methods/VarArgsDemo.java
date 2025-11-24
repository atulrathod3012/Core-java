package Methods;

public class VarArgsDemo {
public static int sum(int... nums) {
int s = 0;
for (int n : nums) s += n;
return s;
}


public static void main(String[] args) {
System.out.println(sum(1,2,3,4));
}
}