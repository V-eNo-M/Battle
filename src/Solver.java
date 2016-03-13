/**
 * Created by Ivan Shulga on 13.03.2016.
 * Задача 3. Битва за сокровища
 */
public class Solver {
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.setPrice(3,2);   //Задаём стоимости.
        battle.setRopes(1,2);   //Задаём количество верёвок.
        battle.calc();          //Подсчитываем максимальная суммарная стоимость золота при благоприятном исходе.
    }
}
