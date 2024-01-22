package ru.hmw.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.hmw.models.Line;

/**
 * The type Line data transfer object.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LineDto {
    private String line;

    public static LineDto from(Line line) {
        return new LineDto(line.getLine());
    }
}
