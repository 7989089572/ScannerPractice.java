public class StaticKeywordDemo {
    // Static variable
    static int staticCount = 0;

    // Instance variable
    int instanceCount = 0;

    // Static method
    static void incrementStatic() {
        staticCount++;
        System.out.println("Static count: " + staticCount);
    }

    // Non-static method
    void incrementInstance() {
        instanceCount++;
        System.out.println("Instance count: " + instanceCount);
    }

    // Static block
    static {
        System.out.println("Static block executed once when the class is loaded.");
    }

    public static void main(String[] args) {
        StaticKeywordDemo.incrementStatic();
        StaticKeywordDemo.incrementStatic();

        StaticKeywordDemo obj1 = new StaticKeywordDemo();
        StaticKeywordDemo obj2 = new StaticKeywordDemo();

        obj1.incrementInstance();
        obj2.incrementInstance();

        // Show that static variable is shared
        obj1.incrementStatic();
        obj2.incrementStatic();
    }
}
