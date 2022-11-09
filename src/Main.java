
public class Main {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравление пользователя с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        //задание 2

        int age2 = 18;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        else  {
            System.out.println("Человек уже закончил школу");
        }
        if (age2 >=24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //задание 3

        int capacity = 102;
        int seatPlace = 60;
        int standingPlace = 41;
        if (capacity >= 102 && seatPlace + standingPlace >= 102) {
            System.out.println("Мест в вагоне нет");
        }
        else {
            System.out.println("В вагоне " + seatPlace + " сидячих мест");
            System.out.println("В вагоне " + standingPlace + " стоячих мест.");
        }

        //задание 4

        int age3 = 25;
        if (age3 >= 2 && age3 <= 6) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
        }
        else if ( age3 >= 7 && age3 <= 18) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        }
        else if (age3 >= 18 && age3 <= 24) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + age3 + ", то ему пора на работу");
        }

        //задача 5

        int secondAge = 15;
        if (secondAge < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (secondAge >=5 && secondAge <= 14) {
            System.out.println("Ребенок может кататься на аттракицоне в сопровождении взрослого");
        } else {
            System.out.println("Можно кататься без сопровождения взрослого");
        }






    }
}

