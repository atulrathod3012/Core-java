package Loops_And_Conditions;
public class NestedIfDemo {
public static void main(String[] args) {
int age = 20;
boolean hasLicense = true;
if (age >= 18) {
if (hasLicense) {
System.out.println("Allowed to drive");
} else {
System.out.println("Need a license");
}
} else {
System.out.println("Too young");
}
}
}
