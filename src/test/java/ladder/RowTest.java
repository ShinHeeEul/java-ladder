package ladder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RowTest {

    @Test
    @DisplayName("사다리 : 0")
    void OneColWithoutLine() {

        //when
        int numberOfPerson = 1;
        Row row = new Row(numberOfPerson);

        //given
        int nthOfPerson = 1;

        //then
        assertEquals(1, row.nextPosition(nthOfPerson));
    }

    @Test
    @DisplayName("사다리 : 11")
    void twoColWithLine() {

        //when
        int numberOfPerson = 2;
        Row row = new Row(numberOfPerson);
        row.drawLine(0);
        //given
        int nthOfPerson = 1;

        //then
        assertEquals(2, row.nextPosition(nthOfPerson));

        //given
        nthOfPerson = 2;

        //then
        assertEquals(1, row.nextPosition(nthOfPerson));
    }

    @Test
    @DisplayName("사다리 : 110")
    void oneRowThreeColWithLine() {
        //when
        int numberOfPerson = 3;
        Row row = new Row(numberOfPerson);

        row.drawLine(0);


        //given
        int nthOfPerson = 1;

        //then
        assertEquals(2, row.nextPosition(nthOfPerson));

        //given
        nthOfPerson = 2;

        //then
        assertEquals(1, row.nextPosition(nthOfPerson));

        //given
        nthOfPerson = 3;

        //then
        assertEquals(3, row.nextPosition(nthOfPerson));
    }

}