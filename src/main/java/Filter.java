import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int threshold;

    public Filter(int threshold){
        this.threshold = threshold;
    }

    List<Integer> filterOut(List<Integer> list){
        Logger logger = Logger.getInstance();
        List<Integer> resultList = new ArrayList<>();
        for (var item : list){
            if (item >= threshold){
                resultList.add(item);
                logger.log(String.format("Значение %d проходит", item));
            }else logger.log(String.format("Значение %d не проходит", item));
        }
        logger.log(String.format("Прошло фильтрацию %d элементов, не прошло - %d",
                resultList.size(), list.size() - resultList.size()));
        return resultList;
    }
}
