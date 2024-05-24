package hw1;
import java.util.*;
public class Calculator {

    /* 1. Evaluate a mathematical string that consists of addition and subtraction operators.
          Example: "12+5-3" ----> 14

       Extra Credit: Have your function also handle multiplication and division. Remember the
       order of operations matters!
     */
    public int evaluateString(String s){
        // TODO
        return Integer.MAX_VALUE;
    }

    // 2. Return a polynomial that represents the derivative of the Polynomial
    public Polynomial getDerivative(Polynomial p){
        // Do not remove this condition
        if(p.getPolynomialDegree() == 0){
            return new Polynomial(0, new double[0]);
        }
        // TODO
        return null;
    }

    // 3. Evaluate the polynomial at the given point x
    public double evaluatePolynomial(Polynomial p, double x){
        // TODO
        return Double.MAX_VALUE;
    }


    /*
        4. Find the root of the Polynomial using the Newton-Raphson method starting at the point x.
        Note that we defined a variable called tolerance. Use this threshold when determining whether
        your algorithm has converged or not.
     */
    public double newtonRaphson(Polynomial p, double initialGuess){
        double tolerance = .001;
        // TODO
        return Double.MAX_VALUE;
    }
}
