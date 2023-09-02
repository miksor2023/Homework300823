public class Main {
    public static void main(String[] args) {
        //
        //задача 1
        System.out.println("\nЗадача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //
        //задача 2
        System.out.println("\nЗадача 2");
        int clientDeviceYear = 2010;// в условиях указано этой переменной присвоить значение 2015
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //
        //задача 3
        System.out.println("\nЗадача 3");
        int year = 2100;
        if (year >= 1584 && year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //
        //задача 4
        System.out.println("\nЗадача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1" );
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2" );
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3" );
        } else {
            System.out.println("Доставка невозможна" );
        }
        //
        //задача 5
        System.out.println("\nЗадача 5");
        int monthNumber = 5;
        switch (monthNumber) {
        case 12:
        case 1:
        case 2:
            System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
        case 9:
        case 10:
        case 11:
            System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
        default:
            System.out.println("Недопустимое значение переменной monthNumber");
        }


    }
}