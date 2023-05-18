public class MainClass {
    private String class_string() {
        return "Hello, world";
    }
    public String getClassString() {
        return class_string();
    }
    private int class_number() {
        return 20 ;
    }
    public int getClassNumber() {
        return this.class_number();
    }
    public int getLocalNumber() {
        return 14;
    }
}
