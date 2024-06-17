import java.util.Arrays;

public class MinimumMovesToSeat {


    public static int minMovesToSeat(int[] seats, int[] students) {
        seats = Arrays.stream(seats).sorted().toArray();
        students = Arrays.stream(students).sorted().toArray();
        int move = 0;
        for (int index = 0; index < seats.length; index++) {
            int student = students[index];
            int seat = seats[index];
            if (student > seat)move += student - seat;
            else if(student < seat) move += seat - student;
            else move += 0;
        }
        return move;
    }

}
