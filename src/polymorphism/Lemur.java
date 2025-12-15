package polymorphism;

public class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }
    
    public String makeSound() {
        return "Stinky";
    }
    
    public static void displaySound(Primate m) {
        System.out.println(m.makeSound());
    }
    
    public int age = 10;
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        displaySound(lemur);
        
        Primate primate = new Lemur();
        displaySound(primate);
        
        Lemur lemur2 = (Lemur)primate;
        displaySound(lemur2);
        
    }
}
