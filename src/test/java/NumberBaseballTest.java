import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import service.impl.NBgameServiceImpl;

public class NumberBaseballTest {

    private NBgameServiceImpl NBgameServiceImpl;

    @BeforeEach
    void setUp() {
        NBgameServiceImpl = new NBgameServiceImpl();
    }

    @Test
    @DisplayName("test makeTargetNumber()")
    public void generateNumbers() {
        int[] nums = NBgameServiceImpl.generateTargetNumbers();
        int length = 3;

        assertEquals(nums.length, length);
        assertFalse(nums[0] == nums[1]);
        assertFalse(nums[0] == nums[2]);
        assertFalse(nums[1] == nums[2]);
    }
}
