package ru.hmw.services;

import org.junit.jupiter.api.Test;
import ru.hmw.dto.LineDto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class LineServiceImplTest {

    LineService service = new LineServiceImpl();

    @Test
    void getCountOfEachChar_OnValidString_ReturnsValidString() {
        var line = new LineDto("aaaaeeebbbbbb");
        var ans = "b: 6, a: 4, e: 3";

        var str = this.service.getCountOfEachChar(line);

        assertNotNull(str);
        assertEquals(ans, str);
    }

}