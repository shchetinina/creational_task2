import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Привет, пользователь!");
        logger.log("Введи желаемый размер списка: ");
        int size = 0;
        try {
            size = Integer.parseInt(scanner.next());
        }catch (Exception exception){
            logger.log("Неккоретно введено значение размера списка");
        }
        logger.log("Введи верхнюю границу значений элементов списка: ");
        int height = 0;
        try{
            height = Integer.parseInt(scanner.next());
        }catch (Exception exception){
            logger.log("Некорректно введено значение верхней границы элементов списка");
        }
        List<Integer> list = fillArray(size, height);
        logger.log("Список: " + list);
        logger.log("Введи пороговое значение для фильтрации списка: ");
        int filter = 0;
        try{
            filter = Integer.parseInt(scanner.next());
        }catch (Exception exception){
            logger.log("Некорректно введено пороговое значение для фильтрации");
        }
        Filter filterExecutor = new Filter(filter);
        List<Integer> filteredList = filterExecutor.filterOut(list);
        logger.log("Список по итогам фильтрации: " + filteredList);
    }

    public static List<Integer> fillArray(int size, int height){
        Logger logger = Logger.getInstance();
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(height));
        }
        logger.log(String.format("Создан список из %d элементов", size));
        return list;
    }
}
