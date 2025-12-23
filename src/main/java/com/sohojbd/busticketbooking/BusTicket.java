package com.sohojbd.busticketbooking;

public class BusTicket {
    private String passengername,busname,date,time,seatnumber;
    private double price;
    private int number;
    BusTicket(String passengername,int number,String busname, String date, String time, String seatnumber,double price){
        this.passengername=passengername;
        this.number=number;
        this.busname=busname;
        this.date=date;
        this.time=time;
        this.seatnumber=seatnumber;
        this.price=price;
    }

    public String getPassengername() {
        return passengername;
    }

    public int getNumber() {
        return number;
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

