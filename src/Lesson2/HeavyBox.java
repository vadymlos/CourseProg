package Lesson2;

class HeavyBox extends Box {
    int weight; // вес коробки

    // конструктор
    // инициализируем переменные с помощью ключевого слова super
    HeavyBox(int w, int h, int d, int m) {
        super(w, h, d); // вызов конструктора суперкласса
        weight = m; // масса
    }
}
