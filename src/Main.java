public class Main {
    public static void main(String[] args) {
        { System.out.println("----------------"); }
        // Задание 1.

        // 1.1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3.
        // С помощью ключевого слова new.

        int[] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        System.out.println(integerArray[0]);
        System.out.println(integerArray[1]);
        System.out.println(integerArray[2]);

        { System.out.println("----------------"); }

        // 1.2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986.
        // Сразу заполнив его значениями.

        double[] arrayFractionalNumbers = {1.57, 7.654, 9.986};
        System.out.println(arrayFractionalNumbers[0]);
        System.out.println(arrayFractionalNumbers[1]);
        System.out.println(arrayFractionalNumbers[2]);

        { System.out.println("----------------"); }

        // 1.3. Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива:
        // с помощью ключевого слова или сразу заполненный элементами.

        int[] arbitraryArrayOneSummer = new int[3];
        arbitraryArrayOneSummer[0] = 6;
        arbitraryArrayOneSummer[1] = 7;
        arbitraryArrayOneSummer[2] = 8;
        System.out.println(arbitraryArrayOneSummer[0]);
        System.out.println(arbitraryArrayOneSummer[1]);
        System.out.println(arbitraryArrayOneSummer[2]);
        int[] arbitraryArrayTwoAutumn = {9, 10, 11};
        System.out.println(arbitraryArrayTwoAutumn[0]);
        System.out.println(arbitraryArrayTwoAutumn[1]);
        System.out.println(arbitraryArrayTwoAutumn[2]);

        // Задание 2.

        { System.out.println("----------------"); }

        // Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        // начиная с первого элемента, через запятую. Запятая между последним элементом одного
        // массива и первым элементом следующего не нужна.

        for (int i = 0; i < integerArray.length; i++) {
            if (i < integerArray.length - 1)
                System.out.print(integerArray[i] + ", ");
            else
                System.out.print(integerArray[i]);
        }
        System.out.println();
        for (int i = 0; i < arrayFractionalNumbers.length; i++) {
            if (i < arrayFractionalNumbers.length - 1)
                System.out.print(arrayFractionalNumbers[i] + ", ");
            else
                System.out.print(arrayFractionalNumbers[i]);
        }
        System.out.println();
        for (int i = 0; i < arbitraryArrayOneSummer.length; i++) {
            if (i < arbitraryArrayOneSummer.length - 1)
                System.out.print(arbitraryArrayOneSummer[i] + ", ");
            else
                System.out.print(arbitraryArrayOneSummer[i]);
        }
        System.out.println();

        // Задание 3.

        { System.out.println("----------------"); }

        // Теперь ваша задача – распечатать все элементы всех трех массивов,
        // но начинать нужно не с первого элемента массива, а с последнего.
        // Элементы должны быть распечатаны через запятую, при этом элементы
        // одного массива располагаются на одной строчке, а элементы другого массива – на другой.
        // Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        //Если во втором задании в консоль у вас вывелся результат
        //1, 2, 3
        //1.57, 7.654, 9.986
        //*произвольные элементы третьего массива*
        //То в третьем задании результат должен быть
        // 3, 2, 1
        //9.986, 7.654, 1.57
        //*произвольные элементы третьего массива в обратном порядке*

        for (int i = integerArray.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(integerArray[i] + ", ");
            else
                System.out.print(integerArray[i]);
        }
        System.out.println();
        for (int i = arrayFractionalNumbers.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(arrayFractionalNumbers[i] + ", ");
            else
                System.out.print(arrayFractionalNumbers[i]);
        }
        System.out.println();
        for (int i = arbitraryArrayOneSummer.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(arbitraryArrayOneSummer[i] + ", ");
            else
                System.out.print(arbitraryArrayOneSummer[i]);
        }
        System.out.println();

        // Задание 4.

        { System.out.println("----------------"); }

        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем
        // сделайте четными (нужно прибавить 1).
        // Важно: код должен работать с любым целочисленным массивом,
        // поэтому для решения задания вам нужно использовать циклы.
        // Распечатайте результат преобразования в консоль.

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 1)
                integerArray[i]++;
            if (i < integerArray.length - 1)
                System.out.print(integerArray[i] + ", ");
            else
                System.out.print(integerArray[i]);
        }
        System.out.println();
        for (int i = integerArray.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(integerArray[i] + ", ");
            else
                System.out.print(integerArray[i]);
        }
    }
}