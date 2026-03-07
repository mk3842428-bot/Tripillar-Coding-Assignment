package Module4;


final class Parent {
    void display() {
        System.out.println("Base class method.");
    }
}



/*class Child extends Parent {
    void show() {
        System.out.println("This will not compile.");
    }
}

 */
public class FinalClassDemo {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.display();
        System.out.println("Proof: The 'final' modifier prevents subclassing.");
    }
}
