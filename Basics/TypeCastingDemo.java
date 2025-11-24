package Basics;
public class TypeCastingDemo {
public static void main(String[] args) {
int i = 100;
double d = i; // implicit widening
System.out.println("double d = " + d);


double val = 9.78;
int j = (int) val; // explicit narrowing
System.out.println("int j = " + j);


byte b = (byte) 130; // overflow
System.out.println("byte b = " + b);
}
}