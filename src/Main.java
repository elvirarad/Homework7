public class Main {
    public static void main(String[] args) {
        // Домашнее задание - 1
        // Task 1
        //Продолжим работать с накоплениями. Продолжите работать с кодом, кот. вы написали в предыдущем уроке.
        //С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей
        // при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        //Результат программы должен быть выведен в консоль в формате "Месяц … , сумма накоплений равна … рублей"
        // с тем количеством месяцев, необходимым для накопления данной суммы.
        System.out.println("                     ДОМАШНЕЕ ЗАДАНИЕ - 1");
        System.out.println("решение задачи 1");
        int deposit = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + deposit;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений = " + total + " рублей");
        }
        System.out.println(" ");

        // Task 2
        //Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        //На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
        //Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        //Не забудьте выполнить переход на новую строку между двумя циклами.
        //В результате программы вывод должен получиться следующий:
        //1 2 3 4 5 6 7 8 9 10
        //10 9 8 7 6 5 4 3 2 1
        System.out.println("Решение задачи 2");
        int y = 0;
        while (y < 10) {
            y++;
            System.out.print(y + " ");
        }
        System.out.println(" ");
        for (; y > 0; y--) {
            System.out.print(y + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        // Task 3
        //В стране Y население равно 12 миллионам человек.
        //За год рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек.
        // Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание, что
        // показатели рождаемости и смертности постоянны.
        //В консоль выведите результат операции на каждый год в формате "Год …, численность населения составляет … "
        System.out.println("Решение задачи 3");
        int people = 12_000_000;
        int birthPeople100 = 17;
        int deathPeople100 = 8;
        y = 0;
        while (y < 10) {
            y++;
            people = people + people / 100 * birthPeople100 - people / 100 * deathPeople100;
            System.out.println("Год " + y + ", численность населения составляет = " + people + " человек");
        }
        System.out.println(" ");

        // Домашнее задание - 2.1
        //Условие: вывести в консоль сумму накоплений.
        //Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется ещё 7%.
        //Первоначальная сумма вклада Василия составляет 15 тысяч рублей.
        // Task 2.1
        //выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей
        //при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
        // Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
        System.out.println("                     ДОМАШНЕЕ ЗАДАНИЕ - 2");
        System.out.println("Решение задачи 2.1");
        System.out.println("каждый месяц Василий вносит 15 000руб ");
        double deposit1 = 15000;
        double depositNext = 0;
        double percent = 0.07 / 12;
        double percentNext;
        int month = 0;
        while (depositNext < 12_000_000) {
            month++;
            depositNext = depositNext + deposit1;
            depositNext = depositNext + depositNext * percent;
        // каждый месяц Василий вносит 15 000руб
            System.out.println("месяц " + month + " сумма накоплений = " + (float) depositNext + " рублей");
        }
        System.out.println(" ");

        // Домашнее задание - 2.2
        //Видоизмените программу 2.1 таким образом, чтобы в консоль выводились не все месяцы подряд,
        // а только каждый шестой. Должны быть видны накопления за 6, 12, 18, 24 и далее месяцы.
        System.out.println("Решение задачи 2.2");
        System.out.println("каждый месяц Василий вносит 15 000руб ");
        deposit1 = 15000;
        depositNext = 0;
        percent = 0.07 / 12;
        month = 0;
        while (depositNext < 12_000_000) {
            month++;
            depositNext = depositNext + deposit1;
            depositNext = depositNext + depositNext * percent;
        // каждый месяц Василий вносит 15 000руб
            if (month % 6 == 0) {
                System.out.println("месяц " + month + " сумма накоплений = " + (float) depositNext + " рублей");
            }
        }
        System.out.println(" ");

        // Домашнее задание - 2.3
        //Василий решил год копить деньги ближайшие 9 лет. И он хочет знать, какой будет сумма его накоплений
        // каждые полгода на протяжении этих 9 лет.
        //Исходная сумма всё так же 15 тысяч рублей, проценты банка – 7% ежемесячно.
        // выводить Василию сумму его накоплений за следующие каждые полгода в течение 9 лет.
        System.out.println("Решение задачи 2.3");
        System.out.println("Василий внёс единожды 15 000руб ");
        deposit1 = 15000;
        depositNext = 0;
        percent = 0.07 / 12;
        month = 0;
        while (month < 9 * 12) {
            month++;
            deposit1 = deposit1 + deposit1 * percent;
            // Василий внёс единственный раз 15 000руб
            if (month % 6 == 0) {
                System.out.println("месяц " + month + " сумма накоплений = " + (float) deposit1 + " рублей");
            }
        }
        System.out.println(" ");

        // Домашнее задание - 2.4
        //В вашей компании пятница является днем отчетным.
        //посчитать дни месяца по датам, определить, какой день пятница, и выводит сообщение с напоминанием,
        // что нужно подготовить еженедельный отчет.
        //Условия задачи:
        //Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        //Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        //"Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        //В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
        System.out.println("Решение задачи 2.4");
        int fridayFirst;
        for (fridayFirst = 6; fridayFirst < 31; fridayFirst = fridayFirst + 7){
            System.out.println("Сегодня пятница, " + fridayFirst + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("  ");

        // Домашнее задание - 3.1
        // астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно будет увидеть.
        // Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год,
        // начиная с нулевого.
        //Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет
        //и когда мы увидим ее в следующий раз.
        //Условия:
        //В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
        //Для вычисления периода можно создать две дополнительные переменные, которые содержат
        // год за 200 лет до текущего (из созданной ранее переменной) в качестве старта и
        // 100 лет после в качестве завершения периода расчета.
        //В результате решения задачи в консоль должен вывестись следующий результат:
        //1896
        //1975
        //2054
        System.out.println("                     ДОМАШНЕЕ ЗАДАНИЕ - 3");
        System.out.println("Решение задачи 3.1");
        int year;
        int startYear = 2022 - 200;
        int stopYear = 2022 + 100;
        for (year = 0; year < startYear; year = year + 79){
        }
        System.out.println(year);
        do {
            year = year + 79;
            System.out.println(year);
        }
        while (year < 2022);

        System.out.println(" ");

        // Домашнее задание - 3.2
        // Напишите программу, которая выводит в консоль таблицу умножения на 2:
        //2*1=2
        //2*2=4
        //2*3=6
        //2*4=8
        //2*5=10
        //2*6=12
        //2*7=14
        //2*8=16
        //2*9=18
        //2*10=20
        System.out.println("Решение задачи 3.2:");
        System.out.println("Таблица умножения на 2");
        System.out.println(" ");
        int too = 2;
        int n = 1;
        int result = too * n;
        for (n = 1; n < 11; result = too * n){
            System.out.println( too + " * " + n + " = " + result);
            n ++;
        }
   }
}