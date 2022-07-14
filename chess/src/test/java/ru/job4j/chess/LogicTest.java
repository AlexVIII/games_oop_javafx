package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test
    public void moveException() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        try {
            logic.move(Cell.C1, Cell.H6);
        } catch (OccupiedCellException e) {
            throw new RuntimeException(e);
        } catch (FigureNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}