package geekbrains.ru;

public class Cat implements SuperJumpable {

    int maxHeight;
    int maxRunDistance;
    String name;

    public Cat(int maxHeight, int maxRunDistance, String name)
    {
        this.maxHeight = maxHeight;
        this.maxRunDistance = maxRunDistance;
        this.name = name;
    }


    @Override
    public boolean jump(int wallHeight) {
        System.out.println(this.name + " Cat jumped");
        boolean isSuccess = this.testJump(this.maxHeight, wallHeight);
        this.printJumpSuccess(isSuccess);
        return  isSuccess;
    }

    @Override
    public boolean run(int distance)
    {
        System.out.println(this.name + " Cat run");
        boolean isSuccess = this.testRun(this.maxRunDistance, distance);
        this.printRunSuccess(isSuccess);
        return isSuccess;
    }

}

