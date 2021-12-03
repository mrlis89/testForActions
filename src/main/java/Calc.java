import com.arnava.interpreter.calculator.Calculator;

public class Calc {
    public Integer comp(String st) {
        return (new Calculator().calculate(st));
    }
}
