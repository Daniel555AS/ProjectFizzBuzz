package co.edu.upb.projectfizzbuzz;

// I created this project using NetBeans IDE
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    
    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";

    public List<String> getNumbers() {
        List<String> numbers = new ArrayList<>();
        for (int ii = 1; ii <= 100; ii++) {
            numbers.add(getNumber(ii));
        }
        return numbers;
    } // public List<String> getNumbers()

    public String getNumber(int ii) {
        if ((isMultiple(ii, 3)) && (isMultiple(ii,5))) {
            return FIZZ + BUZZ;
        } else if (isMultiple(ii, 3)) {
            return FIZZ;
        } else if (isMultiple(ii, 5)) {
            return BUZZ;
        } 
            return "" + ii; // Passing integer to String
    } // public String getNumber(int ii 

    public boolean isMultiple(int number, int multiple) {
        return number % multiple == 0;
    } // public boolean isMultiple(int number, int multiple)

} // public class FizzBuzz
