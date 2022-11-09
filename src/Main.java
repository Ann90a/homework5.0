
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





    }
}

