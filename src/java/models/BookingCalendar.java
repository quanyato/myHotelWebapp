package models;

import java.util.*;

public class BookingCalendar {

    private ArrayList<BookingDay> bookedCalendar;

    public BookingCalendar() {
        this.bookedCalendar = new ArrayList<>();
    }

    public boolean addBookingDate(String checkInDate, String checkOutDate) {
        BookingDay newBooking = new BookingDay();
        if (newBooking.setCheckInDate(checkInDate)) {
            if (newBooking.setCheckOutDate(checkOutDate)) {
                this.bookedCalendar.add(newBooking);
                return true;
            }
        }
        return false;
    }

    public void addBookingDate(BookingDay bookingDay) {
        this.bookedCalendar.add(bookingDay);
    }

    public boolean isDateAvailable(BookingDay bookingNow) {
        for (BookingDay bookedDate : this.bookedCalendar) {
            if (bookingNow.isBefore(bookedDate) || bookingNow.isAfter(bookedDate)) {
            } else {
                return false;
            }
        }
        return true;
    }

    public ArrayList<BookingDay> getBookedCalendar() {
        return this.bookedCalendar;
    }
}
