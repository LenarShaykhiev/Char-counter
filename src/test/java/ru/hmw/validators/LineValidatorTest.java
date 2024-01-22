package ru.hmw.validators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class LineValidatorTest {
    LineValidator lineValidator = new LineValidator();

    @Test
    void validate_OnBlankString_ThrowsNullPointerException() {
        String str = "   ";
        assertThrows(NullPointerException.class, () -> lineValidator.validate(str));

    }
}