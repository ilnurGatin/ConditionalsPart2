public class Main {
    public static void main(String[] args) {
        // Задание №1,2
        byte clientOS = 1;
        short clientDeviceYear = 2015;
        if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Нет такой OS");
        }

        // Задание 3
        short year = 2004;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
            } else {
            System.out.println(year + " год не является високосным");
        }

        //Задание 4
        short deliveryDistance = 95;
        short firstDistance = 20;
        short additionalDistance = 40;
        int daysToDeliver = 1 + (deliveryDistance + firstDistance) / additionalDistance;
        if (deliveryDistance > 0) {
            System.out.println("Потребуется дней: " + daysToDeliver);
        } else {
            System.out.println("Укажите расстояние доставки в км");
        }

        // Задание 5
        byte monthNumber = 0;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

    }
}