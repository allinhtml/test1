package CollectionsExample;

/**
 * Created by prvikani on 6/30/2016.
 */
public class Parth
    {
        public static void main(String[] args)
        {
            System.out.println("you are on step to the right ");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie.getMessage());
            }
            System.out.println("you are on step to the up");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie.getMessage());
            }
            System.out.println("you are on step to the left ");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie.getMessage());
            }
        }
    }
