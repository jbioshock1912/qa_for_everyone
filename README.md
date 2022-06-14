Codewars Task1
Create a public class called Cube without a constructor which gets one single private integer variable Side, a getter GetSide() and a setter SetSide(int num) method for this property. 
Actually, getter and setter methods are not the common way to write this code in C#. In the next kata of this series, we gonna refactor the code and make it a bit more professional...
Notes:
There's no need to check for negative values!
initialise the side to 0.

Codewars Task2
Write a class Block that creates a block (Duh..)
The constructor should take an array as an argument, this will contain 3 integers 
of the form [width, length, height] from which the Block should be created.
Define these methods:
`getWidth()` return the width of the `Block`
`getLength()` return the length of the `Block`
`getHeight()` return the height of the `Block`
`getVolume()` return the volume of the `Block`
`getSurfaceArea()` return the surface area of the `Block`

Codewars Task3
Create a function that returns the name of the winner in a fight between two fighters.
Each fighter takes turns attacking the other and whoever kills the other first is victorious.
Death is defined as having health <= 0.
Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. 
You can mutate the Fighter objects.

Таск1 Map
Необходимо создать класс с тремя методами:
принимает текст и ничего не возвращает
возвращает список (Map) в котором в качестве ключа - слова из переданного текста, 
а в качестве значений - количество раз, когда этого слово встречается в тексте
в качестве параметра принимается слово, а возвращаются все предложения (List) 
в которых используется это слово в тексте
P.S. Поиск в третьем методе необходимо выполнять за O(1)

Такс2 Array
Задача №1
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести сумму всех значений массива.
Задача №2
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести максимальное значение массива.
Задача №3
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.
Задача №4
Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.
Задача №5
Дан массив: 
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.
Задача №6
Дан массив: 
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести максимальное значение массива.
Задача №7
Дан массив: 
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.

Таск3 OOP
Задача №1
Необходимо создать класс Person с полями: имя, возраст, пол. 
Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
 если пол указан как мужской и префикс “Mrs. ” если женский.
Задача №2
Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
Класс должен иметь метод isSameName(Employee employee) который возвращает true, 
если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
Задача №3
Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray), метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.


Таск4 String
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
Экстра задача*******
Дан массив:
String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

Таск5 Нарисовать фигуры (цикл в фикле)
Задача №1

0  1  2  3  4  5  6  7  8  9
0  1  2  3  4  5  6  7  8
0  1  2  3  4  5  6  7
0  1  2  3  4  5  6
0  1  2  3  4  5
0  1  2  3  4
0  1  2  3
0  1  2
0  1
0


Задача №2

0  1  2  3  4  5  6  7  8  9
    0  1  2  3  4  5  6  7  8
        0  1  2  3  4  5  6  7
             0  1  2  3  4  5  6
                 0  1  2  3  4  5
                     0  1  2  3  4
                         0  1  2  3
                             0  1  2
                                 0  1
                                     0


Задача №3

9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
   8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
      7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
         6 5 4 3 2 1 0 1 2 3 4 5 6
            5 4 3 2 1 0 1 2 3 4 5
               4 3 2 1 0 1 2 3 4
                  3 2 1 0 1 2 3
                     2 1 0 1 2
                        1 0 1
                           0
