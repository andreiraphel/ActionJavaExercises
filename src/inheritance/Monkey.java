package inheritance;

public class Monkey {
    public static void main(String[] args) {
        String test = "a";
        for(; test.compareTo("aaa") == 0; test = test + "a") {
            System.out.println(test.length() + " ");
        }
        System.out.println(test);
        
    }
}
