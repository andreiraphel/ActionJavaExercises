package inheritance;

public class Animal {
    public String name = "Mommy Monkey";
    private String type;
    private int age;
    
    public Animal(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void makeSound() {
        System.out.println("Mommy Monkey growls");
    }
    
    
}
