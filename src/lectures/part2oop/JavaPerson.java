package lectures.part2oop;

public class JavaPerson {
    private String name;
    private int age;

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //System.out.println("print something") not possible outside of a method declaration

    public static void main(String[] args) {
        JavaPerson javaPerson = new JavaPerson("John", 56);
        System.out.println(javaPerson.age); //we do not need a getter here since the JavaPerson is in the same scope
    }
}