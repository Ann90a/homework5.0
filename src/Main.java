
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





    }
}

