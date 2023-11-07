package models;

import java.util.*;

public class BookingPerson {
    private String name, subname, emailAdr, phoneNum;
    private int age, id;
    private boolean gender;
    
    public BookingPerson(ArrayList<BookingPerson> bookedPersonList){
        Random rand = new Random();
        this.id = 0;
        while (this.id==0) {
            int tempId = rand.nextInt(Integer.MAX_VALUE);
            if (tempId==0) {
                continue;
            }
            boolean idAlreadyExist = false;
            for (BookingPerson bookedPerson:bookedPersonList) {
                if (tempId==bookedPerson.id) {
                    idAlreadyExist = true;
                    break;
                }
            }
            if (!idAlreadyExist) {
                this.id = tempId;
                break;
            }
        }
        this.name = "Name";
        this.subname = "Sub Name";
        this.emailAdr = "Email Adress";
        this.phoneNum = "Phone Number";
        this.age = 0;
        this.gender = false; //Gioi tinh nam
    }
}
