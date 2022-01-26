package if_else_statements_ch2;

import java.util.Scanner;

public class MultipleIfs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1 - 7");
        byte numberOfDay = input.nextByte();
        String dayOfWeek = "null";
        String weekdayDayOff;

        if(numberOfDay == 1) dayOfWeek = "Sunday";
        if(numberOfDay == 2) dayOfWeek = "Monday";
        if(numberOfDay == 3) dayOfWeek = "Tues";
        if(numberOfDay == 4) dayOfWeek = "Wed";
        if(numberOfDay == 5) dayOfWeek = "Thu";
        if(numberOfDay == 6) dayOfWeek = "Fri";
        if(numberOfDay == 7) dayOfWeek = "SAt";
        if(numberOfDay > 7 || numberOfDay < 1) System.out.println("Stupido");

        if(numberOfDay >= 2 && numberOfDay <= 6){
            weekdayDayOff = "Weekday";
        }else{
            weekdayDayOff = "Dayoff";
        }
        System.out.println(dayOfWeek + ", " + weekdayDayOff);
    }
}
