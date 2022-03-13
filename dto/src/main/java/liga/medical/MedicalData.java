package liga.medical;

import lombok.Data;

import java.io.Serializable;

/**
 * Медицинские данные.
 */
@Data
public class MedicalData implements Serializable {

    /**
     * Температура.
     */
    private Double temperature;

    /**
     * Давление.
     */
    private Double pressure;

    /**
     * Уровень глюкозы.
     */
    private Double glucoseLevel;

    /**
     * Пульс.
     */
    private Integer pulse;
}