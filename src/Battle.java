import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Ivan Shulga on 13.03.2016.
 * Задача 3. Битва за сокровища
 */
public class Battle {
        //Список стоимостей золота.
    private ArrayList<Integer> price = new ArrayList<Integer>();
        //Список кол-ва верёвок.
    private ArrayList<Integer> ropes = new ArrayList<Integer>();
        //Максимальная сумма при благоприятном исходе.
    private int result = 0;

    public void setPrice(int... args) {
        for (int i : args) {
            price.add(i);
        }
    }

    public void setRopes(int... args) {
        for (int i : args) {
            ropes.add(i);
        }
    }

        //Подсчитываем результат работы программы.
    public void calc() {
        ArrayList<Integer> buf = new ArrayList<Integer>(price);
        Collections.sort(buf);
        boolean flag = true;
        int index = 0;
        //Добавляем к результату суммы которые можем выиграть.
        for (int i = 0; i < price.size(); i++) {
            index = price.indexOf(buf.get((buf.size()-i)-1).intValue());
            if (((ropes.get(index).intValue() % 2 == 1) && flag) || ((ropes.get(index).intValue() % 2 == 0) && !flag)) {
                result += price.get(index).intValue();
                flag = !flag;
            }
        }
        printResult();
    }

    //Выводим результат в консоль.
    private void printResult() {
        System.out.println(result);
    }

}
