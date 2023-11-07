package models;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class BookingDay {

    private final ZoneId zoneId;
    private final DateTimeFormatter VnFormatter;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    //INIT Methods
    public BookingDay() {
        this.zoneId = ZoneId.of("Asia/Ho_Chi_Minh");
        this.VnFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.checkInDate = LocalDate.now(this.zoneId);
        this.checkOutDate = this.checkInDate.plusDays(1);
    }

    //SETTER Methods
    public boolean setCheckInDate(String checkInDate) {
        try {
            this.checkInDate = LocalDate.parse(checkInDate, VnFormatter);
            this.checkOutDate = this.checkInDate.plusDays(1);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean setCheckOutDate(String checkOutDate) {
        try {
            this.checkOutDate = LocalDate.parse(checkOutDate, VnFormatter);
            if (this.checkOutDate.isBefore(this.checkInDate)) {
                this.checkOutDate = this.checkInDate.plusDays(1);
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //GETTER Methods
    public String getToday() {
        LocalDate today = LocalDate.now(this.zoneId);
        return today.format(this.VnFormatter);
    }

    public String getCheckInDate() {
        return this.checkInDate.format(this.VnFormatter);
    }

    public String getCheckOutDate() {
        return this.checkOutDate.format(this.VnFormatter);
    }

    public boolean isAfter(BookingDay bookedDay) {
        return this.checkInDate.isAfter(bookedDay.checkOutDate);
    }

    public boolean isBefore(BookingDay bookedDay) {
        return this.checkOutDate.isBefore(bookedDay.checkInDate);
    }
}
