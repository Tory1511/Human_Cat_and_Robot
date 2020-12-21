package geekbrains.ru;

public class Robot implements SuperJumpable
{

    int maxHeight;
    int maxRunDistance;
    String name;

    public Robot(int maxHeight, int maxRunDistance, String name)
    {
        this.maxHeight = maxHeight;
        this.maxRunDistance = maxRunDistance;
        this.name = name;
    }

    @Override
    public boolean jump(int wallHeight) {
        System.out.println(this.name + " Robot jumped");
        boolean isSuccess = this.testJump(this.maxHeight, wallHeight);
        this.printJumpSuccess(isSuccess);
        return  isSuccess;
    }

    @Override
    public boolean run(int distance)
    {
        System.out.println(this.name + " Robot run");
        boolean isSuccess = this.testRun(this.maxRunDistance, distance);
        this.printRunSuccess(isSuccess);
        return isSuccess;
    }


}
