package geekbrains.ru;

public interface Runnable
{
    boolean run(int distance);

    default boolean testRun(int maxRunDistance, int distance)
    {
        if(maxRunDistance >= distance) return true;
        return false;

    };

    default void printRunSuccess(boolean a)
    {
        if(a) System.out.println("Run finished.");
        else System.out.println("Run failed");
    }



}
