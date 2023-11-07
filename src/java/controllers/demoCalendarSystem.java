package controllers;

import java.util.*;
import models.BookingCalendar;
import models.BookingDay;

public class demoCalendarSystem {

    public static void main(String[] args) {
        BookingCalendar hotelCalendar = new BookingCalendar();

        BookingDay tempDay = new BookingDay();
        hotelCalendar.addBookingDate(tempDay);

        tempDay.setCheckInDate("14/11/2023");
        tempDay.setCheckOutDate("15/11/2023");
        hotelCalendar.addBookingDate(tempDay);
        
        tempDay.setCheckInDate("16/11/2023");
        tempDay.setCheckOutDate("18/11/2023");
        hotelCalendar.addBookingDate(tempDay);
        
        tempDay.setCheckInDate("20/11/2023");
        tempDay.setCheckOutDate("23/11/2023");
        hotelCalendar.addBookingDate(tempDay);

        ArrayList<BookingDay> bookedCalendar = hotelCalendar.getBookedCalendar();
        for (BookingDay bookedDay : bookedCalendar) {
            System.out.print(bookedDay.getCheckInDate() + " ");
            System.out.println(bookedDay.getCheckOutDate());
        }
    }
}
