import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("#########################################################################################");
        System.out.println("//Сочетание клавиш-----------------------------------------------------------------------");
        System.out.println("Ctrl + D         - Создать копию выделенной(х) строки(ок) кода с низу.");
        System.out.println("Ctrl + /         - Закомментировать выделенную(е) строку(и).");
        System.out.println("Ctrl + Shift + / - Закомментировать выделанный кусок кода.");
        System.out.println("Ctrl + Alt - L   - Выровнять код по стилю.");
        System.out.println("Shift + F10      - Запустить код.");
        System.out.println("#########################################################################################");
        System.out.println("//Типы данных: Примитивные данные--------------------------------------------------------");
        System.out.println("//Типы данных: //Символьные--------------------------------------------------------------");
        char ppChar = 'c';
        System.out.println("Символ:  " + ppChar);         //Вывод самого символа
        System.out.println("Его код: " + (int) (ppChar)); //Вывод кода   символа
        System.out.println("//Типы данных: //Числовые----------------------------------------------------------------");
        System.out.println("//Типы данных: ////Целые-----------------------------------------------------------------");
        byte ppBite = 100;                        // Бит: 8,  Байт: 1, Диапазон: [-128;127], 01111111
        short ppShort = 30_000;                   // Бит: 16, Байт: 2, Диапазон: [-32_768;32_767], 01111111_11111111
        int ppInt = 2_000_000_000;                // Бит: 32, Байт: 4, Диапазон: [-2_147_483_648;2_147_483_647], 01111111_11111111_11111111_11111111
        long ppLong = 9_000_000_000_000_000_000L; // Бит: 64, Байт: 8, Диапазон: [-9_223_372_036_854_775_808;9_223_372_036_854_775_807], 01111111_11111111_11111111_11111111_11111111_11111111_11111111_11111111
        System.out.println("byte:  " + ppBite);
        System.out.println("short: " + ppShort);
        System.out.println("int:   " + ppInt);
        System.out.println("long:  " + ppLong);
        System.out.println("//Типы данных: ////Вещественные----------------------------------------------------------");
        float ppFloat = 1.0F;   // Бит: 32, Байт: 4
        double ppDouble = 1.0; // Бит: 64, Байт: 8
        System.out.println("float:   " + ppFloat / 3);
        System.out.println("double:  " + ppDouble / 3);
        System.out.println("//Типы данных: //Булевы------------------------------------------------------------------");
        boolean ppBoolean = true; // true или false
        System.out.println("boolean: " + ppBoolean);
        System.out.println("//Типы данных: Ссылочные------------------------------------------------------------------");
        System.out.println("//Типы данных: //Классы-------------------------------------------------------------------");
        System.out.println("//Типы данных: //Класс - String-----------------------------------------------------------");
        String ppString1 = "Три";
        String ppString2 = "Один Два Три";
        System.out.println("ppString1: " + ppString1);
        System.out.println("ppString2: " + ppString2);
        System.out.println("//Типы данных: //Класс - String //Метод - length      - длина строки---------------------");
        System.out.println("//Типы данных: //Класс - String //Метод - equals      - сравнение строк------------------");
        System.out.println("//Типы данных: //Класс - String //Метод - charAt      - символ строки--------------------");
        System.out.println("//Типы данных: //Класс - String //Метод - indexOf     - индекс первого искомого символа--");
        System.out.println("//Типы данных: //Класс - String //Метод - contains    - содержит ли строка подстроку-----");
        System.out.println("//Типы данных: //Класс - String //Метод - substring   - подстрока по индексу-------------");
        System.out.println("//Типы данных: //Класс - String //Метод - replace     - замена символов или части строки-");
        System.out.println("//Типы данных: //Класс - String //Метод - toUpperCase - перевод в заглавные--------------");
        System.out.println("//Типы данных: //Класс - String //Метод - toLowerCase - перевод в строчные---------------");
        System.out.println("Примеры:");
        System.out.println("Длина строки ppString1: " + ppString1.length());
        System.out.println("Сравнение строк ppString1 и ppString2: " + ppString1.equals(ppString2));
        System.out.println("2ой Символ строки ppString1: " + ppString1.charAt(1));
        System.out.println("Индекс символа 'и' в ppString1: " + ppString1.indexOf('и'));
        System.out.println("в ppString2 есть ppString1: " + ppString2.contains(ppString1));
        System.out.println("Часть ppString2 с 5 символа по 7: " + ppString2.substring(5, 8));
        System.out.println("Часть ppString2 с 5 символа до конца: " + ppString2.substring(5));
        System.out.println("Замена Три на Четыре: " + ppString2.replace("Три", "Четыре"));
        System.out.println("Замена 'и' на 'е': " + ppString2.replace('и', 'е'));
        System.out.println("Все в заглавные: " + ppString2.toUpperCase());
        System.out.println("Все в строчные: " + ppString2.toLowerCase());
        System.out.println("//Типы данных: //Интерфейсы--------------------------------------------------------------");
        System.out.println("//Типы данных: //Массивы-----------------------------------------------------------------");
        System.out.println("//Типы данных: //Массивы - Одномерные----------------------------------------------------");
        String[] ppMString1 = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String[] ppMString2 = {"Красный", "Оранжевый", "Жёлтый", "Зелёный", "Синий", "Голубой", "Фиолетовый"};
        String[] ppMString3 = new String[3]; //Три элемента null
        ppMString3[0] = "Один";
        ppMString3[1] = "Два";
        ppMString3[2] = "Три";
        // Вывод через for ppMString1[]
        for (int i = 0; i < ppMString1.length; i++) System.out.print(ppMString1[i] + " ");
        System.out.println();
        // Вывод через for each ppMString2[]
        for (String s : ppMString2) System.out.print(s + " ");
        System.out.println();
        System.out.println("//Типы данных: //Массивы - Двумерные-----------------------------------------------------");
        String[][] ppMMSrting1 = {{"aa", "bb", "cc"}, {"dd", "ee", "ff"}, {"gg", "hh", "ii"}, {"jj", "kk", "ll"}};
        String[][] ppMMSrting2 = {{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",}, ppMString1, ppMString2, {"mm", "nn"}, ppMString3};
        // Вывод через for ppMMSrting1[][]
        for (int i = 0; i < ppMMSrting1.length; i++) {
            for (int j = 0; j < ppMMSrting1[i].length; j++) {
                System.out.print(ppMMSrting1[i][j] + " ");
            }
            System.out.println();
        }
        // Вывод через for each ppMMSrting2[][]
        for (String[] s1 : ppMMSrting2) {
            for (String s : s1) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        System.out.println("#########################################################################################");
        System.out.println("//Вывод данных---------------------------------------------------------------------------");
        System.out.print("System.out.print   - Нет перехода на новую строку. ");
        System.out.print("Спец символ \"\\n\" для перехода на новую строчку.\n");
        System.out.println("System.out.println - Есть переход на новую строку.");
        System.out.printf("System.out.printf  - Нет перехода на новую строку. но удобно использовать с переменными:\n");
        System.out.printf("%%d: %d, %%f: %f, %%b: %b, %%B: %B, %%c: %c, %%C: %C, %%s: %s, %%S: %S, %%h: %h, %%n: Переход на новую строку %n", ppInt, ppFloat, ppBoolean, ppBoolean, ppChar, ppChar, ppString1, ppString1, ppString2);
        System.out.println("""
                **************************************
                * Интересный вид записи              *
                * Посмотри как он был написан в коде *
                * Так он и выведен на экран          *
                **************************************""");
        System.out.println("#########################################################################################");
        System.out.println("//Операции-------------------------------------------------------------------------------");
        System.out.println("//Операции - Бинарные - [+ - * / %]------------------------------------------------------");
        int ppInt1 = 3;
        int ppInt2 = 2;
        System.out.printf("%d + %d = %d%n", ppInt1, ppInt2, (ppInt1 + ppInt2));
        System.out.printf("%d - %d = %d%n", ppInt1, ppInt2, (ppInt1 - ppInt2));
        System.out.printf("%d * %d = %d%n", ppInt1, ppInt2, (ppInt1 * ppInt2));
        System.out.printf("%d / %d = %d%n", ppInt1, ppInt2, (ppInt1 / ppInt2));
        System.out.printf("%d %% %d = %d%n", ppInt1, ppInt2, (ppInt1 % ppInt2));
        System.out.println("//Операции - Унарные - [+= -= *= /= %= ++ --]--------------------------------------------");
        System.out.printf("a было: %d,   b было: %d,   a+=b,   a стало: %d%n", ppInt1, ppInt2, ppInt1 += ppInt2);
        System.out.printf("a было: %d,   b было: %d,   a-=b,   a стало: %d%n", ppInt1, ppInt2, ppInt1 -= ppInt2);
        System.out.printf("a было: %d,   b было: %d,   a*=b,   a стало: %d%n", ppInt1, ppInt2, ppInt1 *= ppInt2);
        System.out.printf("a было: %d,   b было: %d,   a/=b,   a стало: %d%n", ppInt1, ppInt2, ppInt1 /= ppInt2);
        System.out.printf("a было: %d,   b было: %d,   a%%=b,   a стало: %d%n", ppInt1, ppInt2, ppInt1 %= ppInt2);
        System.out.printf("i было: %d,   ++i,   i стало: %d%n", ppInt1++, ppInt1);
        System.out.printf("i было: %d,   i++,   i стало: %d%n", ppInt1, ++ppInt1);
        System.out.printf("i было: %d,   --i,   i стало: %d%n", ppInt1--, ppInt1);
        System.out.printf("i было: %d,   i--,   i стало: %d%n", ppInt1, --ppInt1);
        System.out.println("#########################################################################################");
        System.out.println("//Операторы сравнения - [> >= < <= != ==] и Условный оператор if--------------------------");
        ppBite = 5;
        ppShort = 1;
        ppBoolean = ppBite > ppShort;
        System.out.printf("%d >  %d %b%n", ppBite, ppShort, ppBoolean);
        ppBoolean = ppBite >= ppShort;
        System.out.printf("%d >= %d %b%n", ppBite, ppShort, ppBoolean);
        ppBoolean = ppBite < ppShort;
        System.out.printf("%d <  %d %b%n", ppBite, ppShort, ppBoolean);
        ppBoolean = ppBite <= ppShort;
        System.out.printf("%d <= %d %b%n", ppBite, ppShort, ppBoolean);
        ppBoolean = ppBite != ppShort;
        System.out.printf("%d != %d %b%n", ppBite, ppShort, ppBoolean);
        ppBoolean = ppBite == ppShort;
        System.out.printf("%d == %d %b%n", ppBite, ppShort, ppBoolean);
        System.out.println("-----------------------------------------------------------------------------------------");

        if (ppBite > ppShort) {
            System.out.printf("%d > %d%n", ppBite, ppShort);
        } else if (ppBite < ppShort) {
            System.out.printf("%d < %d%n", ppBite, ppShort);
        } else {
            System.out.printf("%d = %d%n", ppBite, ppShort);
        }

        System.out.println("//Логические операции - [&& || !]--------------------------------------------------------");
        ppShort = 1;

        //Если в фигурных скобочках одна строчка кода то их можно не писать
        if (ppShort > 0 && ppShort < 90) System.out.printf("Угол равен: %d Острый%n", ppShort);
        else if (ppShort == 90) System.out.printf("Угол равен: %d Прямой%n", ppShort);
        else if (ppShort > 90 && ppShort < 180) System.out.printf("Угол равен: %d Тупой%n", ppShort);
        else if (ppShort == 180) System.out.printf("Угол равен: %d Развернутый%n", ppShort);
        else if (ppShort > 180 && ppShort < 360) System.out.printf("Угол равен: %d Выпуклый%n", ppShort);
        else if (ppShort == 360) System.out.printf("Угол равен: %d Полный%n", ppShort);
        else System.out.printf("Угол равен: %d Не корректный%n", ppShort);

        System.out.println("//Оператор выбора switch-----------------------------------------------------------------");
        ppBite = 13;

        //int short byte char String
        //Полная запись запись
        switch (ppBite) {
            case 12:
            case 1:
            case 2:
                System.out.printf("Зима, месяц № %d%n", ppBite);
                break;
            case 3:
            case 4:
            case 5:
                System.out.printf("Весна, месяц %d%n", ppBite);
                break;
            case 6:
            case 7:
            case 8:
                System.out.printf("Лето, месяц № %d%n", ppBite);
                break;
            case 9:
            case 10:
            case 11:
                System.out.printf("Осень, месяц № %d%n", ppBite);
                break;
            default:
                System.out.printf("Не возможный месяц %d%n", ppBite);
        }

        //Укороченная запись
        switch (ppBite) {
            case 12, 1, 2 -> System.out.printf("Зима, месяц № %d%n", ppBite);
            case 3, 4, 5 -> System.out.printf("Весна, месяц %d%n", ppBite);
            case 6, 7, 8 -> System.out.printf("Лето, месяц № %d%n", ppBite);
            case 9, 10, 11 -> System.out.printf("Осень, месяц № %d%n", ppBite);
            default -> System.out.printf("Не возможный месяц %d%n", ppBite);
        }

        System.out.println("//Оператор break-------------------------------------------------------------------------");

        while (true) {
            System.out.println("Запущен бесконечный цикл который остановил \"break\"");
            break;
        }

        System.out.println("break во внутреннем цикле по j = 2");
        for (int i = 0; i < 5; i++) {
            System.out.printf("i=%d j=", i);
            for (int j = 0; j < 5; j++) {
                if (j == 2) break;
                System.out.print(" " + j);
            }
            System.out.println();
        }

        System.out.println("break во внутреннем цикле по i = 2");
        for (int i = 0; i < 5; i++) {
            System.out.printf("i=%d j=", i);
            for (int j = 0; j < 5; j++) {
                if (i == 2) break;
                System.out.print(" " + j);
            }
            System.out.println();
        }

        System.out.println("//Оператор continue----------------------------------------------------------------------");

        for (int i = 1; i < 15; i++) {
            if (i % 2 == 0) continue;
            System.out.printf("%d - Это не четное число%n", i);
        }

        System.out.println("#########################################################################################");
        System.out.println("//Циклы----------------------------------------------------------------------------------");
        System.out.println("//Цикл - for-----------------------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (String s : ppMString1) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println("//Цикл - while---------------------------------------------------------------------------");

        while (ppBoolean) {
            System.out.println("while - Первый вариант");
            ppBoolean = false;
        }

        while (!ppBoolean) {
            System.out.println("while - Второй вариант");
            ppBoolean = true;
        }

        int ww = 10;
        while (ww < 10) {
            System.out.println("   wile сначала проверяю условие потом делаю тело цикла");
            ww++;
        }

        System.out.println("//Цикл - do while------------------------------------------------------------------------");

        int dw = 10;
        do {
            System.out.println("do wile сначала делаю тело цикла потом проверяю условие");
            System.out.println("do wile гарантирует однократное выполнение");
            dw++;
        } while (dw < 10);

        System.out.println("#########################################################################################");
        System.out.println("//Другое - Math-------------------------------------------------------------------------");
        System.out.printf("Наименьшее число из [%d], [%d] это %d %n", ppInt1, ppInt2, Math.min(ppInt1, ppInt2));
        System.out.printf("Наибольшее число из [%d], [%d] это %d %n", ppInt1, ppInt2, Math.max(ppInt1, ppInt2));
        System.out.println("//Другое - List-------------------------------------------------------------------------");
        List<Integer> ppLInteger = List.of(0, (int) ppShort, ppInt, 12345);
        List<String> ppLString = List.of(String.valueOf(ppChar), ppString1, ppString2, "qwerty");
        System.out.printf("Элемент Листа с индексом %d это: %d%n", 2, ppLInteger.get(2));
        //Если в List (Integer или String) изменить значения, то в переменной они останутся старые и на оборот.
        String a1 = "aa";
        String b1 = "bb";
        String c1 = "cc";
        List<String> pplist1 = List.of(a1, b1, c1);
        System.out.printf("Переменные String равны   a1=%s, b1=%s, c1=%s%n", a1, b1, c1);
        System.out.printf("Проверяем значения листа  a1=%s, b1=%s, c1=%s%n", pplist1.get(0), pplist1.get(1), pplist1.get(2));
        a1 = "aaa";
        System.out.printf("Задаем a1 = \"aaa\", и запрашиваем значения лист a1=%s, b1=%s, b1=%s.%nОни не изменились.%n%n", pplist1.get(0), pplist1.get(1), pplist1.get(2));
        //Если в List (Integer[] или String[]) изменить значения, то они изменятся в переменной  и на оборот.
        String[] a2 = {"aaa"};
        String[] b2 = {"aaa"};
        String[] c2 = {"aaa"};
        List<String[]> pplist2 = List.of(a2, b2, c2);
        System.out.printf("Переменные String[] равны a2=%s, b2=%s, c2=%s%n", a2[0], b2[0], c2[0]);
        System.out.printf("Проверяем значения листа  a2=%s, b2=%s, c2=%s%n", pplist2.get(0)[0], pplist2.get(1)[0], pplist2.get(2)[0]);
        b2[0] = "bbb";
        System.out.printf("Задаем b2[0] = \"bbb\",             и запрашиваем значения лист a2=%s, b2=%s, c2=%s. Они изменились.%n", pplist2.get(0)[0], pplist2.get(1)[0], pplist2.get(2)[0]);
        pplist2.get(2)[0] = "ccc";
        System.out.printf("Задаем pplist2.get(0)[0] = \"ccc\", и запрашиваем значения лист a2=%s, b2=%s, c2=%s. Они изменились.%n", pplist2.get(0)[0], pplist2.get(1)[0], pplist2.get(2)[0]);
        System.out.println("#########################################################################################");
    }
}