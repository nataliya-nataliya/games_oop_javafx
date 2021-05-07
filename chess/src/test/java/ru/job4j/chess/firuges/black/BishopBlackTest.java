package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack pos = new BishopBlack(F8);
        assertThat(pos.position(), is(F8));
    }

    @Test
    public void copy() {
        BishopBlack pos = new BishopBlack(F8);
        Figure figure = pos.copy(E7);
        assertThat(figure.position(), is(E7));
    }

    @Test
    public void testWay() {
        BishopBlack pos = new BishopBlack(C1);
        Cell[] trace = new Cell[] {D2, E3, F4, G5};
        assertThat(pos.way(G5), is(trace));
    }
}
