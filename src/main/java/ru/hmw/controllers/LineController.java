package ru.hmw.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hmw.dto.LineDto;
import ru.hmw.exceptions.LineTooLong;
import ru.hmw.services.LineService;

/**
 * The type Line controller.
 */
@RestController
@RequestMapping("/api/lines")
@RequiredArgsConstructor
public class LineController {
    private final LineService lineService;

    /**
     * Gets count of each char.
     * POST localhost/api/lines/count/eachChar
     *
     * @param line the input line in the request body
     * @return the count of each char in the input line
     */
    @PostMapping(value = "/count/eachChar")
    public ResponseEntity<?> getCountOfEachChar(@RequestBody LineDto line) {
            return ResponseEntity.ok()
                    .body(lineService.getCountOfEachChar(line));
    }
}
