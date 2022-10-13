import java.util.Arrays;

public class Main {

    //Задача 1
    public static void isLeapYear(int year){
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0){
            System.out.println(year + " не високосный год");
        }
        else{
            System.out.println(year + " високосный год");
        }
    }
    //Задача 2
    public static void determineOsVersion(short OS, int clientDeviceYear) {
        if (OS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (OS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (OS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    //Задача 3
    public static int determineDeliveryTime (int deliveryDistance){

        if (deliveryDistance <= 20){
            return 1;
        }
        else if (deliveryDistance > 20 && deliveryDistance < 60){
            return 2;
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100){
            return 3;
        }
        return 0;
    }

    //Задача 4
    public static void isDoubleSymbol(String alph){
        for(int i=0; i<alph.length(); i++){
            for (int j = i+1; j<alph.length();j++){
                if (alph.charAt(i) == alph.charAt(j)){
                    System.out.println("В строке присутствует дубль символов");
                    return;
                }
            }
        }
        System.out.println("В строке нет дублей");

    }

    //Задача 4(повышенный урвоень)
    public static void reverseArray(int[] arr){
        int el = 0;
        int j = arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            el = arr[i];
            arr[i]=arr[j];
            arr[j]=el;
            j--;
        }
    }

    //Задача 5(повышенная сложность)
    static public void printDoubleSymbol(String line){
        char[] arrSymbol = line.toCharArray();
        for (int i = 0; i < arrSymbol.length; i++) {
            for (int j = i+1; j<arrSymbol.length; j++){
                if (arrSymbol[i]==arrSymbol[j]){
                    System.out.print(arrSymbol[j]);
                    break;
                }

            }
        }
    }

    //Задача 6(повышенная сложность)
    static public int addElements( int[] arr){
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa = summa + arr[i];
        }
        return summa;
    }

    static public float defineAverage(int[] arr){
        int summa = addElements(arr);
        float average = (float)summa / arr.length;
        return average;
    }
    public static void main(String[] args) {
        //задача 1
        int year = 2008;
        isLeapYear(year);

        //задача 2
        short OS = 1;
        int clientDeviceYear = 2013;
        determineOsVersion(OS, clientDeviceYear);

        //задача 3
        int deliveryDistance = 75;
        int deliveryTime = determineDeliveryTime(deliveryDistance);
        System.out.println("Потребуется дней: "+ deliveryTime);

        //задача 4
        String alph = "aabccddefgghiijjkk";
        isDoubleSymbol(alph);

        //Задача 4(повышенный уровень)
        int[] arr = {1,2,3,4,5};
        System.out.println("Исходный массив:" + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Преобразованный массив:" + Arrays.toString(arr));

        //Задача 5(повышенная сложность)
        String line = "aabccddefgghiijjkk";
        printDoubleSymbol(line);




        //Задача 6(повышенная сложность)
        System.out.println();
        int[] arrMonth = generateRandomArray();
        float average = defineAverage(arrMonth);
        System.out.println("«Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
