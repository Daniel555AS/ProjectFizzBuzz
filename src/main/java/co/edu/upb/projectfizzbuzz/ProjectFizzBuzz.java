package co.edu.upb.projectfizzbuzz;

public class ProjectFizzBuzz {

    public static void main(String[] args) {
        FizzBuzz game = new FizzBuzz();

        System.out.println("->Numero 1: " + game.getNumbers().get(0));
        System.out.println("->Numero 3: " + game.getNumbers().get(2));
        System.out.println("->Numero 5: " + game.getNumbers().get(4));
        System.out.println("->Numero 15: " + game.getNumbers().get(14));
    } // main
} // public class ProjectFizzBuzz
