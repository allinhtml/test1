package Interfaces;

public class Developer implements one, two {
    @Override
    public void test() {
        System.out.print("Hi");
    }

    @Override
    public void testDefualt() {
        System.out.print("Inside interface implementated.");
    }
}
