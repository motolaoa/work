package test2;

public class CalculatorImp implements Calculator {

    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int jian(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int cheng(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int chu(int i, int j) {
        int result = i / j;
        return result;
    }
}
