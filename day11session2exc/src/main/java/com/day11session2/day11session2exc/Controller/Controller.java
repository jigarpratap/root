package com.day11session2.day11session2exc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.day11session2.day11session2exc.Entity.Flight;
import com.day11session2.day11session2exc.Entity.User;
import com.day11session2.day11session2exc.Exception.FlighBookingException;
import com.day11session2.day11session2exc.Exception.FlightSearchException;
import com.day11session2.day11session2exc.Service.FlightService;

@RestController
public class Controller {
    @Autowired
    FlightService flightService;
     
    @GetMapping("/search")
    public ResponseEntity<List<Flight>> searchFlight(@RequestParam("departureCity") String departureCity, @RequestParam("arrivalCity") String arrivalCity){
        List<Flight> flights = flightService.searchFlight(departureCity,arrivalCity);
        if (flights.isEmpty()) {
        return new ResponseEntity<List<Flight>>(flights,HttpStatus.OK);
        } else {
        return new ResponseEntity<List<Flight>>(flights, HttpStatus.OK);
        }
    }

     @PostMapping("/book/{flightNumber}")
     public ResponseEntity<String> bookFlight(@PathVariable String flightNumber, @RequestBody User user) {
           Flight isBooked = flightService.bookflight(flightNumber, user);
          if (isBooked!=null) {
                 return new ResponseEntity<String>("Flight Succesfully Booked",HttpStatus.OK); 
               } else {
                    return new ResponseEntity<String>("Failed to book the flight.",HttpStatus.BAD_REQUEST);
               }
            }           
        
    @ExceptionHandler({FlightSearchException.class,FlighBookingException.class})
    public ResponseEntity<String> handleFlightExceptions(Exception ex) {
                return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_REQUEST);
        }
                
}
