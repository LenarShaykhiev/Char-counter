package ru.hmw.validators;

import ru.hmw.exceptions.LineTooLong;

/**
 * The type Line validator.
 */
public class LineValidator {
    /**
     * Validate input string.
     *
     * @param str input string
     * @throws NullPointerException if the string is blank
     * @throws LineTooLong          if the string longer than Integer.MAX_VALUE - 8
     */
    public void validate(String str) throws NullPointerException, LineTooLong {
        if (str.length() > Integer.MAX_VALUE - 8) {         // проверка верхней границы
            throw new LineTooLong("Строка слишком длинная!");
        }
        if (str.isBlank()) {                                // проверка нижней границы
            throw new NullPointerException("Строка не должна быть пустой!");
        }
    }
}
