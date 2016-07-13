package Interfaces;

public interface two {
    public void test();

    default void testDefualt() {
        System.out.print("Inside testDefualt method.");
    }
}
