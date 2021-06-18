import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

/**
 * test
 */
@DisplayName("TestCode String")
public class StringTest {

    @DisplayName("test split()")
    @Test
    public void testSplit() {

        String input1 = "1,2";
        String input2 = "1";
        String[] answer1 = { "1", "2" };
        String[] answer2 = { "1" };

        assertThat(input1.split(",")).contains(answer1);
        assertThat(input2.split(",")).containsExactly(answer2);
    }

    @DisplayName("test substring()")
    @Test
    public void testSubstring() {

        String input1 = "(1,2)";
        String answer1 = "1,2";

        assertEquals(input1.substring(1, input1.length() - 1), answer1);
    }

    @DisplayName("test charAt()")
    @Test
    public void testCharAt() {

        String input1 = "abc";
        int index1 = 4;

        assertThatExceptionOfType(StringIndexOutOfBoundsException.class).isThrownBy(() -> {
            input1.charAt(index1);
        }).withMessageMatching("String index out of range: \\d+");

    }

}