package geekbrains.ru;

//1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию
// о действии в консоль).
//2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать),
// результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
// Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        Wall wall = new Wall();
        Distance distance = new Distance();

        Human human = new Human(2,20,"Roberto");
        human.jump(wall.w);
        human.run(distance.d);


        Cat cat = new Cat(2, 4, "Boris");
        cat.jump(wall.w);
        cat.run(distance.d);


        Robot robot = new Robot(5,100, "XGIhg5");
        robot.run(distance.d);
        robot.jump(wall.w);


        List<Object> team = new ArrayList<Object>();
        List<Object> obstacles = new ArrayList<Object>();

        team.add(new Human(2,10,"Timur"));
        team.add(new Cat(5, 4, "Sergey"));
        team.add(new Robot(20,100,"Anna"));

        obstacles.add(new Wall(2));
        obstacles.add(new Distance(4));
        obstacles.add(new Wall(6));
        obstacles.add(new Distance(95));

        for (Object member : team)
        {
            for (Object obstacle : obstacles)
            {
                if (obstacle.getClass() == Wall.class)
                {
                    Wall tempWall = (Wall) obstacle;
                    if (!memberJump(member, tempWall.w))
                    {
                        System.out.println("Jump Wasted");
                        break;
                    }
                }
                else if (obstacle.getClass() == Distance.class)
                {
                    Distance tempDistance = (Distance)  obstacle;
                    if (!memberRun(member, tempDistance.d))
                    {
                        System.out.println("Run Wasted");
                        break;
                    }
                }

                if (obstacle == obstacles.get(obstacles.size()-1))
                {
                    System.out.println("Track completed");
                }
            }
        }
    }

    private static boolean memberJump(Object member, int height) throws Exception {

            if (member.getClass() == Human.class)
            {
                Human human = (Human) member;
                return human.jump(height);
            }
            else if (member.getClass()  == Cat.class)
             {
                Cat cat = (Cat) member;
                return cat.jump(height);
             }
            else if (member.getClass() == Robot.class)
            {
                Robot robot = (Robot) member;
                return robot.jump(height);
            }
            else
            {
                throw new Exception("Unexpectred object type");
            }

    }

    private static boolean memberRun(Object member, int distance) throws Exception {

        if (member.getClass() == Human.class)
        {
            Human human = (Human) member;
            return human.run(distance);
        }
        else if (member.getClass()  == Cat.class)
        {
            Cat cat = (Cat) member;
            return cat.run(distance);
        }
        else if (member.getClass() == Robot.class)
        {
            Robot robot = (Robot) member;
            return robot.run(distance);
        }
        else
        {
            throw new Exception("Unexpectred object type");
        }

    }

}
