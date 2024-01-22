package ru.hmw.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import ru.hmw.dto.LineDto;
import ru.hmw.services.LineService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class LineControllerTest {

    @Mock
    LineService lineService;

    @InjectMocks
    LineController controller;

    @Test
    @DisplayName("POST /api/lines/count/eachChar on valid string returns an HTTP response with the status 200 and a counter string")
    void getCountOfEachChar_OnValidString_ReturnsValidResponseEntity() {
        var line = new LineDto("aaaabbbbbcccccc");
        var ans = "c: 6, b: 5, a: 4";
        doReturn(ans).when(this.lineService).getCountOfEachChar(line);

        var responseEntity = this.controller.getCountOfEachChar(line);

        assertNotNull(responseEntity);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(ans, responseEntity.getBody());
    }
}