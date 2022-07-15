package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BishopBlackTest {

    @Test
    public void testPositionA3() {
        BishopBlack obj = new BishopBlack(Cell.A3);
        Assert.assertEquals(Cell.A3, obj.position());
    }

    @Test
    public void testWayC1G5() {
        BishopBlack obj = new BishopBlack(Cell.C1);
        Object[] result = obj.way(Cell.G5);
        Cell[] expected = new Cell[]{Cell.C1, Cell.D2, Cell.E3, Cell.F4};
        assertThat(expected, is(result));
    }

    @Test
    public void testCopy() {
        BishopBlack obj = new BishopBlack(Cell.A3);
        BishopBlack result = (BishopBlack) obj.copy(Cell.A3);
        Assert.assertEquals(Cell.A3, result.position());
    }
}