package Interface;
interface Utils {
static void help() { System.out.println("Utils help"); }
}


public class StaticMethodInInterfaceDemo {
public static void main(String[] args) {
Utils.help();
}
}