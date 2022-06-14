package qa_for_everyone;

/*Таск4 String
        Задача №1
        Дана строка:
        String s = “Перестановочный алгоритм быстрого действия”;
        необходимо вывести все буквы “о” из этой строки.
        Для указанной строки ответ будет “ооооо” (или в столбик)
        Задача №2
        Дана строка:
        String s = “Перевыборы выбранного президента”;
        необходимо подсчитать количество букв “е” в строке.
        Для указанной строки ответ будет 4.
        Задача №3
        Дана строка:
        String s = “Посмотрите как Рите нравится ритм”;
        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        Для указанной строки ответ будет 6, 15, 29.
       */

public class StringResult_4 {

    public static void getSymbol(String myString, char myChar) {
        char[] charArrayMyString = myString.toCharArray();
        for (char c : charArrayMyString) {
            if (c == myChar)
                System.out.print(c);
        }
    }

    public static int getNumberOfSymbol(String myString, char myChar) {
        char[] charArrayMyString = myString.toCharArray();
        int count = 0;
        for (int i = 0; i < charArrayMyString.length; i++) {
            if (charArrayMyString[i] == myChar) {
                count++;
            }
        }
        return count;
    }

    public static void getIndex(String myString, String partOfString) {
        myString = myString.toLowerCase();
        partOfString = partOfString.toLowerCase();
        int index1 =myString.indexOf(partOfString);
        while (index1 != -1){
            System.out.print(index1 + " ");
            int index = myString.indexOf(partOfString, index1 + partOfString.length());
            index1 = index;
        }
    }
}
