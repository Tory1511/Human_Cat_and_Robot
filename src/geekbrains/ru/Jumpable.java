package geekbrains.ru;

public interface Jumpable
{
    boolean jump(int wallHeight);

    default boolean testJump(int maxHeight, int wallHeight)
    {
            if(maxHeight >= wallHeight) return true;
            return false;

    };

    default void printJumpSuccess(boolean a)
    {
        if(a) System.out.println("Jump success.");
        else System.out.println("Jump failed");
    }

}
