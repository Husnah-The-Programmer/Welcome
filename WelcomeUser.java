public class WelcomeUser {

    static int multiplier(int a, int b){
        int product = a * b;
        return product;
    }
    static void greetings(){
        System.out.println("Welcome");
    }
    
    public static void main(String args[]) {
        System.out.println(multiplier(2,5));
        greetings();
    }
}