package com.day11session2.day11session2exc.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.day11session2.day11session2exc.Entity.Flight;
import com.day11session2.day11session2exc.Entity.User;
import com.day11session2.day11session2exc.Exception.FlighBookingException;
import com.day11session2.day11session2exc.Exception.FlightSearchException;

@Service
public class FlightService {
    private  List<Flight> list=new ArrayList<>();
    private  Map<User,Flight> map=new HashMap<>();
   public List<Flight> searchFlight(String departureCity,String arrivalCity) throws FlightSearchException{
    List<Flight> l=new ArrayList<>();
    for(Flight f:list){
        if(f.getFlightDepart().equalsIgnoreCase(departureCity) && f.getFlightArrival().equalsIgnoreCase(arrivalCity)){
            l.add(f);
        }
    }
    return l;
   }
   public Flight bookflight(String flightnumber,User user) throws FlighBookingException{
      for(Flight f:list){
        if(f.getFlightNumber().equalsIgnoreCase(flightnumber)){
            map.put(user, f);
            return f;
        }
      }
      return null;
   }


}
