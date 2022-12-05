public class Main {
    public static void main(String[] args) {

        System.out.println("Условный оператор. Часть 2. Доработано");

        // Задание 1
        System.out.println("Задание 1");

        int iOS = 0;
        int Android = 1;
        if (iOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (Android == 1) {
            System.out.println("Установитек версию приложения для Android по ссылке");
        }

        // Задание 2
        System.out.println("Задание 2");

        int dateOfManufactureOfIos = 2021;
        System.out.println("дата изготовления телефона на операцонной системе ios" + dateOfManufactureOfIos + "год");
        int dateOfManufactureOfAndroid = 2014;
        System.out.println("дата изготовления телефона на операцонной системе Android" + dateOfManufactureOfAndroid + "год");
        if (dateOfManufactureOfIos <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (dateOfManufactureOfAndroid <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установитек версию приложения для Android по ссылке");
        }

        // Задание 3
        System.out.println("Задание 3");

        int year = 2020;
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            System.out.println("это високосный год" + year);
        } else
            System.out.println("это не високосный год" + year);

        // Задача 4
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int deliveryWithin20Km = 1;
        int deliveryWithin20KmTo60Km = deliveryWithin20Km + 1;
        int deliveryWithin60KmTo100Km = deliveryWithin20KmTo60Km + 1;
        boolean numberOfDays = ((deliveryWithin20Km <= 95) && (deliveryWithin20KmTo60Km <= 95) || (deliveryWithin60KmTo100Km <= 95));
        if (numberOfDays) {
            System.out.println("Потребуется дней" + deliveryWithin60KmTo100Km);

            // Задание 5
            System.out.println("Задание 5");

            int monthNumber = 12;
            switch (monthNumber) {
                case 1:
                    System.out.println("Январь");
                case 2:
                    System.out.println("Февраль");
                    System.out.println("Зима");
                    break;
                case 3:
                    System.out.println("Март");
                case 4:
                    System.out.println("Апрель");
                case 5:
                    System.out.println("Май");
                    System.out.println("Весна");
                    break;
                case 6:
                    System.out.println("Июнь");
                case 7:
                    System.out.println("Июль");
                case 8:
                    System.out.println("Август");
                    System.out.println("Лето");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                case 10:
                    System.out.println("Октябрь");
                case 11:
                    System.out.println("Ноябрь");
                    System.out.println("Осень");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    System.out.println("Зима");
                    break;
                default:
                    System.out.println("Такого месяца не существует");



            }


        }


    }
}

