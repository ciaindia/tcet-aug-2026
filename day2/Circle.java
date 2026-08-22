class Circle {
    
    int radius;

    public Circle(int r) {
        this.radius = r;
    }

    public void area() {
        System.out.println("I am from Circle area with radius " + this.radius);
        System.out.println("Area: " + 3.14 * this.radius * this.radius);
    }

}

class Main {
    public static void main(String[] args) {
        Circle cobj1 = new Circle(5);
        cobj1.area();

        Circle cobj2 = new Circle(7);
        cobj2.area();
    }
}
