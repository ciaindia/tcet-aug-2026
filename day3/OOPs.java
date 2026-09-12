abstract class Person {

    String name;
    String phone;

    public Person(String nm, String ph) {
        this.name = nm;
        this.phone = ph;
    }

    abstract public void foo();

    public void showPerson() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone: " + this.phone);
    }

}

class Student extends Person {
    public Student(String nm, String ph) {
        super(nm, ph);
    }

    public void foo() {
        System.out.println(" I am from foo function...");
    }
}


interface DBOps {

    public static void bar() {
        System.out.println("I am from bar method");
    }

    public void select();
    public void insert();
    
}

class PGOps implements DBOps {
    public void select() {
        System.out.println("I am from pgops select");
    }
    public void insert() {
        System.out.println("I am from pgops insert");
    }
}

class Main {
    public static void main(String[] args) {
        Person pobj = new Student("Satish", "9876543210");
        pobj.showPerson();
        pobj.foo();

        PGOps dbobj = new PGOps();
        dbobj.select();
        dbobj.insert();

        DBOps.bar();
    }
}