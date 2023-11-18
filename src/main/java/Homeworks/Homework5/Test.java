package Homeworks.Homework5;

/*
Домашно 5:
Имплементирайте клас Parrot по подобие на клас Dog, който extend-ва клас Pet:
- Какви instance променливи биха били подходящи (и за двата класа)?
- Създайте get & set методи за всяка от тях (с подходящи валидации).
- Помислете какви действия биха били възможни с тях и имплементирайте логика за тях
- Направете конструктор с параметри
 */
public class Test {
    public static void main(String[] args) {

        Parrot Lusi = new Parrot("Ara", "female", (byte) 10, "green",
                1.53f, "Lusi", (byte) 2, 12.21f, false, true);
        Parrot Brus = new Parrot("Ara", "male", (byte) 12, "blue",
                2.23f, "Brus", (byte) 2, 13.28f, true, true);

        Lusi.printData();

        Lusi.makeSomeNoise();

        Lusi.eat();

        Lusi.sleep();

        Lusi.playing();

        Brus.printData();

        Brus.makeSomeNoise();

        Brus.eat();

        Brus.sleep();

        Brus.playing();
    }
}