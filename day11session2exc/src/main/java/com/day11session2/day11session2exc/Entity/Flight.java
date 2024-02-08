package com.day11session2.day11session2exc.Entity;

public class Flight {
      private String flightNumber;
      private String flightDepart;
      private String flightArrival;
      private String time;
    public Flight() {
    }
    
    public Flight(String flightNumber, String flightDepart, String flightArrival, String time) {
        this.flightNumber = flightNumber;
        this.flightDepart = flightDepart;
        this.flightArrival = flightArrival;
        this.time = time;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public String getFlightDepart() {
        return flightDepart;
    }
    public void setFlightDepart(String flightDepart) {
        this.flightDepart = flightDepart;
    }
    public String getFlightArrival() {
        return flightArrival;
    }
    public void setFlightArrival(String flightArrival) {
        this.flightArrival = flightArrival;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
      
}
