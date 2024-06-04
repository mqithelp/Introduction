public class Main {
    public static void main(String[] args) {

        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
    }

    private static void Task1() {
    /*
Задача 1
С помощью условного оператора напишите программу, которая выводит в консоль:
сообщение о том, что человеку 18 или больше лет;
сообщение, что возраст совершеннолетия еще не наступил, нужно немного подождать.
При выполнении каждого условия программа должна выводить в консоль сообщение в формате: «Если возраст человека равен …,
то (вывести в зависимости от результата) он совершеннолетний / он не достиг совершеннолетия, нужно немного подождать».
     */
        System.out.println("\n==========[ Task 1. ]==========");
        String ageAbove18 = "Если возраст человека равен %d, он совершеннолетний.\n";
        String ageBelow18 = "Если возраст человека равен %d, он не достиг совершеннолетия, нужно немного подождать.\n";
        int age = 15;
        if (age >= 18) {
            System.out.printf(ageAbove18, age);
        } else {
            System.out.printf(ageBelow18, age);
        }
        age += 3;
        if (age >= 18) {
            System.out.printf(ageAbove18, age);
        } else {
            System.out.printf(ageBelow18, age);
        }
    }

    private static void Task2() {
    /*
Человек одевается в зависимости от температуры воздуха. Напишите программу, которая выводит сообщение:
«На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.
«Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.
При выполнении каждого условия выведите в консоль: «На улице … градусов, (вывести в зависимости от результата)
нужно надеть шапку / можно идти без шапки».
     */
        System.out.println("\n==========[ Task 2. ]==========");
        String tempAbove = "На улице %d град. Сегодня тепло, можно идти без шапки.\n";
        String tempBelow = "На улице %d град. На улице холодно, нужно надеть шапку.\n";
        short tempAir = 5;
        if (tempAir >= 5) {
            System.out.printf(tempAbove, tempAir);
        } else if (tempAir < 5) {
            System.out.printf(tempBelow, tempAir);
        }
    }

    private static void Task3() {
/*
За превышение скорости водителю могут выписать штраф. Напишите программу, которая сообщает водителю о том, что:

 скорость превышена, если она больше 60 км/ч;
 превышения скорости нет, если она меньше 60 км/ч.
При выполнении каждого условия программа должна выводить такое сообщение: «Если скорость …,
то (вывести в зависимости от результата) придется заплатить штраф / можно ездить спокойно».
 */
        System.out.println("\n==========[ Task 3. ]==========");
        short speed = 60;
        String speedAbove = "Если скорость %d, то придется заплатить штраф.\n";
        String speedBelow = "Если скорость %d, то можно ездить спокойно.\n";
        if (speed > 60) {
            System.out.printf(speedAbove, speed);
        } else {
            System.out.printf(speedBelow, speed);
        }
    }

    private static void Task4() {
        System.out.println("\n==========[ Task 4. ]==========");
        short age = 24;
        if (age >= 2 && age <= 6) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад.\n", age);
        }
        if (age >= 7 && age <= 17) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу.\n", age);
        }
        if (age >= 18 && age <= 24) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в университет.\n", age);
        }
        if (age > 24) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить на работу.\n", age);
        }
    }

    private static void Task5() {
        System.out.println("\n==========[ Task 5. ]==========");
        int age = 15;
        if (age < 5) {
            System.out.printf("Если возраст ребенка равен %d, то ему нельзя кататься на аттракционе.\n", age);
        }
        if (age >= 5 && age <= 14) {
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься " +
                    "на аттракционе в сопровождении взрослого.\n", age);
        }
        if (age > 14) {
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься " +
                    "на аттракционе без сопровождении взрослого.\n", age);
        }
    }

    private static void Task6() {
        System.out.println("\n==========[ Task 6. ]==========");
        byte placeTotal = 102;
        byte placeSit = 60;
        boolean sit = false;
        boolean stand = false;
        //расчет количества стоячих мест
        int placeStand = placeTotal - placeSit;

        //ввод данных: сколько занято сидячих и стоячих мест
        int occupiedPlaceSit = 60;
        int occupiedPlaceStand = 23;

        //всего занято мест
        int totalOccupiedPlace = occupiedPlaceStand + occupiedPlaceSit;

        //я считаю вагон забит когда стоячие и сидячие места в сумме больше или равны вместительности вагона
        //ситуация когда превышен порог только сидячих или стоячих мест я обрабатываю отдельно и вывожу на консоль
        //соответсвующие сообщения

        if (totalOccupiedPlace >= placeTotal) {
            System.out.println("Вагон забит мест нет.");
        } else {
            if (placeSit > occupiedPlaceSit) {
                System.out.printf("В вагоне осталось %d сидячих мест.\n", placeSit - occupiedPlaceSit);
                sit = true;
            } else if (placeSit < occupiedPlaceSit) {
                System.out.printf("В вагоне не хватает %d сидячих мест.\n", occupiedPlaceSit - placeSit);
            } else {
                System.out.printf("Все сидячие места (%d места) в вагоне заняты.\n", occupiedPlaceSit);
            }
            if (placeStand > occupiedPlaceStand) {
                System.out.printf("В вагоне осталось %d стоячих мест.\n", placeStand - occupiedPlaceStand);
                stand = true;
            } else if (placeStand < occupiedPlaceStand) {
                System.out.printf("В вагоне не хватает %d стоячих мест.\n", occupiedPlaceStand - placeStand);
            } else {
                System.out.printf("Все стоячие места (%d места) в вагоне заняты", occupiedPlaceStand);
            }
            if (stand == true && sit == true) {
                System.out.printf("В вагоне всего сбоводных мест -- %d, общее количество занятых мест -- %d.\n",
                        (placeTotal - occupiedPlaceSit - occupiedPlaceStand), occupiedPlaceSit + occupiedPlaceStand);
            }
        }

    }

    private static void Task7() {
        System.out.println("\n==========[ Task 7. ]==========");
        int one = 1;
        int two = 5;
        int three = 4;
        int max;
        if (one > two && one > three) {
            max = one;
        } else if (two > one && two > three) {
            max = two;
        } else {
            max = three;
        }
        System.out.printf("Максимальное число из %d, %d, %d равно %d\n", one, two, three, max);
    }
}