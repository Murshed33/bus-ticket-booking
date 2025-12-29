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

    public String getPassengername() {
        return passengername;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getBusname() {
        return busname;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getSeatnumber() {
        return seatnumber;
    }

    public double getPrice() {
        return price;
    }
}

