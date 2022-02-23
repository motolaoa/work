package test2;

public class test1 {
    //动态代理测试
    public static void main(String[] args) {
        Calculator proxy = CalculatorProxy.getProxy(new CalculatorImp());
        System.out.println(proxy.add(1, 1));
        System.out.println(proxy.getClass());

    }
}
