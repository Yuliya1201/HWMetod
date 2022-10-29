package com.javacourse;


public class metod {
    public static void main(String[] args) {
        isLeapYear(2020);


    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsLeapYearResult(int year, boolean yearIsSleap) {
        if (yearIsSleap) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не високосный");
        }
    }

    public static void recommendApplicationVersion(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("lite ");
        }
        System.out.print("версию для ");
        if (clientOS == 0) {
            System.out.println("iOS");
        } else {
            System.out.println("Android");
        }
    }

    private static boolean isDeviceOld(int deviceYear) {
        return false;
    }

    public static void deliveryDistance(int deliveryDistance) {
        int result = 1;
        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            result++;
        } else {
            System.out.println("Невозможно рассчитать срок доставки");
        }
        System.out.println("Потребуется дней: " + result);
    }
}