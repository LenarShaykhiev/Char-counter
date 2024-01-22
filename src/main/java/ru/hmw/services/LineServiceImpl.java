package ru.hmw.services;

import org.springframework.stereotype.Service;
import ru.hmw.dto.LineDto;
import ru.hmw.exceptions.LineTooLong;
import ru.hmw.validators.LineValidator;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The type Line service.
 */
@Service
public class LineServiceImpl implements LineService{
    private final HashMap<Character, Integer> counter = new HashMap<>();

    LineValidator lineValidator = new LineValidator();

    /**
     * Gets count of each char.
     *
     * @param line the input line
     * @return the string with count of each char in the input line
     */
    @Override
    public String getCountOfEachChar(LineDto line) {
        String str = line.getLine();
        lineValidator.validate(str);
        str = str.toLowerCase();
        //  проход по строке и подсчет каждого символа
        for (int i = 0; i < str.length(); i++) {
            if (counter.containsKey(str.charAt(i))){
                int temp = counter.get(str.charAt(i)) + 1;
                counter.put(str.charAt(i), temp);
            } else {
                counter.put(str.charAt(i), 1);
            }
        }
        //  сортировка по value
        HashMap<Character, Integer> sortedCounter = sortMap(counter);
        //  приведение вывода к нужному формату
        return sortedCounter.toString().replace("=", ": ").replaceAll("[{}]", "").replace(" :", " space:");
    }

    /**
     * Gets sorted HashMap by values in descending order.
     *
     * @param map the input HashMap
     * @return sorted HashMap by values in descending order
     */
    private HashMap<Character, Integer> sortMap (HashMap<Character, Integer> map) {
        return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (perv, next) -> perv, LinkedHashMap::new));
    }
}
