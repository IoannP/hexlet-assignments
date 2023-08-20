package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> list = new ArrayList<>();

        assertThat(App.take(list, 1)).isEmpty();

        list.add(1);
        list.add(2);
        List<Integer> expected = Arrays.asList(1);

        assertThat(App.take(list, 0)).isEmpty();
        assertThat(App.take(list, 10)).isEqualTo(list);
        assertThat(App.take(list, 1)).isEqualTo(expected);
        // END
    }
}
