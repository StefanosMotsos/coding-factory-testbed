package gr.aueb.cf.cf9.ch6;

public class MeetingRooms {
    public static void main(String[] args) {
        int[][] meetings1 = {
                {900, 1000},
                {1030, 1130},
                {1200, 1300}
        };

        int[][] meetings2 = {
                {900, 1030},
                {1000, 1200},
                {1300, 1400}
        };

        System.out.println("Can attend all meetings 1? " + canAttendAll(meetings1));
        System.out.println("Can attend all meetings 2? " + canAttendAll(meetings2));
    }

    public static boolean canAttendAll(int[][] meetings) {
        if (meetings == null || meetings.length == 0) {
            return true;
        }

        for (int i = 0; i < meetings.length - 1; i++) {
            if (meetings[i][1] > meetings[i + 1][0]) return false;
        }
        return true;
    }
}
