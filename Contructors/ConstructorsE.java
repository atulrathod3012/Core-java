package Contructors;
public class ConstructorsE {
    String tag;

    ConstructorsE(String tag, boolean uppercase) {
        this.tag = uppercase ? tag.toUpperCase() : tag;
    }

    public static void main(String[] args) {
        ConstructorsE e = new ConstructorsE("tag", true);
        System.out.println(e.tag);
    }
}

