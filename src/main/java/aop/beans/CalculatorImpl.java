package aop.beans;

/**
 * Created by chen- on 2017-02-15.
 */
public class CalculatorImpl implements Calculator{

    @Override
    public int calculate(int a, int b) {
        System.out.println("**********Actual Method Execution**********");
        return a/b;
    }
}
