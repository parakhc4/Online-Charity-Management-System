package com.mycompany.springbootproject.controller;
import com.mycompany.springbootproject.model.Donor;
import com.mycompany.springbootproject.service.DonorService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//RESTful APIs
@Slf4j // It offers a generic API making the logging independent of the actual implementation.
@Controller // allows us to auto-detect implementation classes through the classpath scanning.
@ResponseBody // tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.
@RequestMapping("donor") // the annotation is used to map web requests to Spring Controller methods.
public class DonorController {

    @Autowired // Enabling annotation injection, we can use autowiring on properties, setters, and constructors.
    private DonorService airportService;

    @GetMapping("/getall") // annotation that acts as a shortcut for @RequestMapping.
    @ApiOperation("Fetch All Donors") // annotation to describe the endpoint and its response type
    public List<Donor> getEmployees() {
        return airportService.getAll();
    }

    @ApiOperation("Save a New ADMIN") // annotation to describe the endpoint and its response type
    @PostMapping("/add") // Annotation for mapping HTTP POST requests onto specific handler methods.
    public ResponseEntity<Donor> createFlightRoute(@Valid @RequestBody Donor airport) {
        Donor cust = airportService.addDonor(airport);
        return new ResponseEntity<>(cust, HttpStatus.CREATED);
    }

    @ApiOperation("Get an ADMIN By ID") // annotation to describe the endpoint and its response type
    @GetMapping("/getbyid/{id}")  // annotation that acts as a shortcut for @RequestMapping.
    public Donor fetchById(@PathVariable int id) {
        return airportService.fetchById(id);
    }

    @ApiOperation("Delete an ADMIN")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        log.info("Deleting a flight record with id %d", id);
        airportService.deleteDonor(id);
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}