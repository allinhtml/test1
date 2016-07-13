package Interfaces;

/**
 * Created by prvikani on 6/16/2016.
 */
public interface one {
    public void test();

    default void testDefualt() {
        System.out.print("Inside testDefualt method.");
    }
}

