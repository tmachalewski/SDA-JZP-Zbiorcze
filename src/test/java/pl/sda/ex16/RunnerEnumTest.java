package pl.sda.ex16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunnerEnumTest {
    @Test
    public void getFitnessLevelShouldAttributeCorrectLevel(){
        assertEquals(null,RunnerEnum.getFitnessLevel(1000));
        assertEquals(RunnerEnum.BEGINNER,RunnerEnum.getFitnessLevel(500));
        assertEquals(RunnerEnum.INTERMEDIATE,RunnerEnum.getFitnessLevel(330));
        assertEquals(RunnerEnum.ADVANCED,RunnerEnum.getFitnessLevel(120));

    }
}
