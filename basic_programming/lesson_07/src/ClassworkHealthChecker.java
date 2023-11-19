import java.util.Scanner;

public class ClassworkHealthChecker {

    /**
     * Задача: Проверка Симптомов и Рекомендации по Лечению
     * <p>
     * Цель Задачи: Написать программу для оценки состояния здоровья человека и предоставления рекомендаций на
     * основе его симптомов.
     * <p>
     * Описание Задачи: Разработайте код, который анализирует два симптома: наличие температуры (`gotTemperature`) и
     * наличие боли в горле (`haveSoreThroat`). На основе этих симптомов метод должен предоставлять соответствующие
     * рекомендации.
     * <p>
     * Шаги Решения:
     * 1. Если у человека одновременно присутствуют и температура, и боль в горле, программа должна
     * предложить обратиться к врачу, так как это может быть признаком серьезного заболевания.
     * 2. Если присутствует
     * только один из симптомов:
     * - В случае наличия температуры программа должна запросить у пользователя ввод его текущей температуры тела.
     * Далее, в зависимости от введенной температуры, программа предлагает различные действия:
     * - Если температура выше 43 градусов — рекомендовать вызвать скорую помощь.
     * - Если температура от 39 до 43 градусов — рекомендовать обратиться к врачу.
     * - Если температура ниже 39 градусов — посоветовать принять лекарство.
     *
     * - В случае наличия только боли в горле — рекомендовать пить больше горячего чая с лимоном и медом.
     * 3. Если ни один из симптомов не присутствует, программа сообщает, что все хорошо, и нет повода для беспокойства.
     * <p>

     */

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Здравствуйте! Опишите пожалуйста свое состояние и на основе ваших ответов я постараюсь " +
                "вам помочь");
        System.out.println("Есть ли у вас боль в горле? Введите пожалуйста ответ true/false");
        boolean gotTemperature = false;

        System.out.println("Повышенная я ли у вас температура? Введите пожалуйста ответ true/false");
        boolean haveSoreThroat = false;


        // если оба условия true
        if (true) { // заменить условие
            System.out.println("Ваши симптомы выглядят серьезно, лучше позвонить врачу");
        } else if (true) { // заменить условие, если только одно из условий true
            // дополнительные проверки температура или кашель?
            // спросить температуру только если пользователь указал, что у него повышенная температура
            // если температура выше 43, то вызвать скорую
            // если температура 39 - 43, то посоветовать позвонить врачу
            // если температура ниже 39, то рекомендовать выпить жаропонижающие

            // в случае, если у пользователя только боль в горле, то советовать ему пить больше горячего чая с лимоном
            // и медом
        } else {
            System.out.println("Все выглядит хорошо, вы в отличной форме!");
        }
    }
}
