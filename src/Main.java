import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    //1) Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса,
// но есть общий класс родитель. Эти классы должны уметь бегать и прыгать,
// все также с выводом информации о действии в консоль.
//2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
//(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
//списку препятствий он не идет.
    public static void main(String[] args) {
        List<Creature> allCreature = new ArrayList<>();
        List<Barrier> allBarrier = new ArrayList<>();
        List<Creature> res = new ArrayList<>();

        Creature human1 = new Human("Иван", 150, 3, "Человек");
        allCreature.add(human1);
        Creature cat1 = new Cat("Барсик",10, 1, "Кот");
        allCreature.add(cat1);
        Creature robot1 = new Robot("DP3", 80, 0, "Робот");
        allCreature.add(robot1);

        getAllaPlayer(allCreature);

        Barrier barrier1 = new Wall(3, "Первая стена");
        Barrier barrier2 = new Treadmill(100, "Первая дорожка");
        Barrier barrier3 = new Wall(2, "Вторая стена");
        Barrier barrier4 = new Treadmill(80, "Вторая дорожка");
        allBarrier.add(barrier1);
        allBarrier.add(barrier2);
        allBarrier.add(barrier3);
        allBarrier.add(barrier4);

        getAllBariers(allBarrier);

        System.out.println(competitions(allCreature, allBarrier, res));

        sortedRes(allCreature, res, allBarrier);
    }

    private static void getAllaPlayer(List<Creature> allCreature) {
        System.out.println("Список участников: ");
        for (Creature player : allCreature) {
            System.out.println(player);
        }
        System.out.println("______________________________");
    }

    private static void getAllBariers(List<Barrier> allBarriers) {
        System.out.println("Список препятствий: ");
        for (Barrier barrier : allBarriers) {
            System.out.println(barrier);
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    private static String competitions(List<Creature> allCreature, List<Barrier> allBarriers, List<Creature> res) {
        System.out.println("Результаты соревнований!");
        for (Creature player : allCreature) {
            for (int i = 0; i < allBarriers.size(); i++) {
                if (allBarriers.get(i) instanceof Wall) {
                    if (player.jumping(((Wall) allBarriers.get(i)).getSize())) {
                        res.add(player);
                    }
                }
                if (allBarriers.get(i) instanceof Treadmill) {
                    if (player.running(((Treadmill) allBarriers.get(i)).getSize()))
                        res.add(player);
                }
            }
        }
        return "Соревнования окончены!";
    }

    private static void sortedRes(List<Creature> allCreatures, List<Creature> res, List<Barrier> countBar) {
        System.out.println();
        System.out.println("Список победителей: ");
        for (Creature player : allCreatures) {
            if (Collections.frequency(res, player) == countBar.size()) {
                System.out.println(player);
            }
        }
    }
}

