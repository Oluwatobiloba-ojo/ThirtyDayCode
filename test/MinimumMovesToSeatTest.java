import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumMovesToSeatTest {

    @Test
    public void testThatTheMinimumMovesToSeatInThisIsFour(){
        int[] students = {2, 7, 4};
        int[] seats = {3, 1, 5};
        assertEquals(4, MinimumMovesToSeat.minMovesToSeat(seats, students));
    }

    @Test
    public void testThatTheMinimumMovesToSeatIsSeven(){
        int[] students = {4, 1, 5, 9};
        int[] seats = {1, 3, 2, 6};
        assertEquals(7, MinimumMovesToSeat.minMovesToSeat(seats, students));
    }
    @Test
    public void testThatTheMinimumMovesToSeatIsFour(){
        int[] students = {2, 2, 6, 6};
        int[] seats = {1, 3, 2, 6};
        assertEquals(4, MinimumMovesToSeat.minMovesToSeat(seats, students));
    }


}