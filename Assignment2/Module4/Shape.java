package Assignment2.Module4;

abstract class Shape {
    abstract void display();
}

class Circle extends Shape {
    @Override
    void display() {
        System.out.println("This is a Circle");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
    }
}