package geekbrains.ru;

public class Wall
{

    int w;

    public Wall()
    {
        this.w = 5;
    }

    public Wall(int w)
    {
        this.w = w;
    }

    public void printWallHeight()
    {
        System.out.println("the wall's height is " + w);
    }
}
