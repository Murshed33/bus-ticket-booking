package com.sohojbd.busticketbooking.busticketmanagement;

public class BusTicket {
    private String passengername,source,destination,busname,date,time,seatnumber;
    private double price;

    BusTicket(String passengername,String source, String destination,String busname, String date, String time, String seatnumber,double price){
        this.passengername=passengername;
        this.source=source;
        this.destination=destination;
        this.busname=busname;
        this.date=date;
        this.time=time;
        this.seatnumber=seatnumber;
        this.price=price;
    }


}

