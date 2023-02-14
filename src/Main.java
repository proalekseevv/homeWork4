public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }
    public static void task1() {
        System.out.println("Задача 1");

    byte a = 127;
    short b = 32767;
    int c = 2147483647;
    long d = 9223372036854775807L;
    float x = 4.45F;
    double y = 5234234.2343242340;
        System.out.println("Значение переменной a c типом byte равно " + a);
        System.out.println("Значение переменной b c типом short равно " + b);
        System.out.println("Значение переменной c c типом int равно " + c);
        System.out.println("Значение переменной d c типом long равно " + d);
        System.out.println("Значение переменной x c типом float равно " + x);
        System.out.println("Значение переменной y c типом double равно " + y);

    }
    public static void task2() {
        System.out.println("Задача 2");
        float A = 27.12F;
        long B = 987678965549L;
        float C = 2.786F;
        short D = 569;
        short X = -159;
        short Y = 27897;
        byte Z = 67;
        System.out.println("float " + A);
        System.out.println("long " + B);
        System.out.println("float " + C);
        System.out.println("short " + D);
        System.out.println("short " + X);
        System.out.println("short " + Y);
        System.out.println("byte " + Z);

    }
    public static void task3() {
        System.out.println("Задача 3");
        byte studentsLyudmilaPavlovna = 23;
        byte studentsAnnaSergeevna = 27;
        byte studentsEkaterinaAndreevna = 30;
        short totalSheets = 480;
        short sheetsPerStudent = (short) (totalSheets / (studentsLyudmilaPavlovna + studentsAnnaSergeevna + studentsEkaterinaAndreevna));
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte machinePerformance = 16;
        byte time = 2;
        byte performanceForecastTimeA = 20;
        short performanceForecastTimeB = 1440;
        short performanceForecastTimeC = 4320;
        int performanceForecastTimeD = 44640;
        int totalBottlesA = performanceForecastTimeA / time * machinePerformance;
        int totalBottlesB = performanceForecastTimeB / time * machinePerformance;
        int totalBottlesC = performanceForecastTimeC / time * machinePerformance;
        int totalBottlesD = performanceForecastTimeD / time * machinePerformance;


        System.out.println("За 20 минут машина произвела " + totalBottlesA + " штук бутылок");
        System.out.println("В сутки машина произвела " + totalBottlesB + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + totalBottlesC + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + totalBottlesD + " штук бутылок");

    }
    public static void task5() {
        System.out.println("Задача 5");
        byte cansOfPaintTotal = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int totalClasses = cansOfPaintTotal / (whitePaint + brownPaint);
        int boughtWhitePaint = totalClasses * whitePaint;
        int boughtBrownPaint = totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + boughtWhitePaint + " банок белой краски и " + boughtBrownPaint + " банок коричневой краски»");

    }
    public static void task6() {
        System.out.println("Задача 6");
        byte banana = 5;
        byte weightOfOneBanana = 80;
        short milk = 200;
        byte weightOfOneMilk = 105;
        byte iceCreamSundae = 2;
        byte weightOfOneIceCream = 100;
        byte eggs = 4;
        byte weightOfOneEggs = 70;
        int totalGrams = banana * weightOfOneBanana + milk / 100 * weightOfOneMilk + iceCreamSundae * weightOfOneIceCream + eggs * weightOfOneEggs;
        float weightInKg = totalGrams / 1000F;
        System.out.println("Вес в граммах " + totalGrams);
        System.out.println("Вес в киллограммах " + weightInKg);
    }
    public static void task7() {
        System.out.println("Задача 7");

        byte needToReset = 7;
        int needToResetInGrams = needToReset * 1000;
        short losesPerDay1 = 250;
        short losesPerDay2 = 500;
        int needDays1 = needToResetInGrams / losesPerDay1 ;
        int needDays2 = needToResetInGrams / losesPerDay2 ;

        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то на похудение уйдет " + needDays1 + " дней.");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то на похудение уйдет " + needDays2 + " дней.");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int mashaSalaryIsAMonth = 67760;
        int denisSalaryIsAMonth = 83690;
        int kristinaSalaryIsAMonth = 76230;
        byte raising = 10;
        byte monthsPerYear = 12;
        float newMashaSalaryIsAMonth = mashaSalaryIsAMonth / 100F * raising + mashaSalaryIsAMonth;
        float newDenisSalaryIsAMonth = denisSalaryIsAMonth / 100F * raising + denisSalaryIsAMonth;
        float newKristinaSalaryIsAMonth = kristinaSalaryIsAMonth / 100F * raising + kristinaSalaryIsAMonth;
        float mashaTheDifferenceInTheYear = newMashaSalaryIsAMonth * monthsPerYear - mashaSalaryIsAMonth * monthsPerYear;
        float denisTheDifferenceInTheYear = newDenisSalaryIsAMonth * monthsPerYear - denisSalaryIsAMonth * monthsPerYear;
        float kristinaTheDifferenceInTheYear = newKristinaSalaryIsAMonth * monthsPerYear - kristinaSalaryIsAMonth * monthsPerYear;



        System.out.println("Маша теперь получает " + newMashaSalaryIsAMonth + " рублей в месяц. Годовой доход вырос на " + mashaTheDifferenceInTheYear + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalaryIsAMonth + " рублей в месяц. Годовой доход вырос на " + denisTheDifferenceInTheYear + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalaryIsAMonth + " рублей в месяц. Годовой доход вырос на " + kristinaTheDifferenceInTheYear + " рублей");
    }







}


