package com.mycompany.springbootproject.controller;
import com.mycompany.springbootproject.model.NGO;
import com.mycompany.springbootproject.service.NGOService;
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
@RequestMapping("ngo") // the annotation is used to map web requests to Spring Controller methods.
public class NGOController {

    @Autowired // Enabling annotation injection, we can use autowiring on properties, setters, and constructors.
    private NGOService ngoService;

    @GetMapping("/getall") // annotation that acts as a shortcut for @RequestMapping.
    @ApiOperation("Fetch All NGO Details") // annotation to describe the endpoint and its response type
    public List<NGO> getEmployees() {
        return ngoService.getAll();
    }

    @ApiOperation("Save a New NGO record") // annotation to describe the endpoint and its response type
    @PostMapping("/add") // Annotation for mapping HTTP POST requests onto specific handler methods.
    public ResponseEntity<NGO> createFlightRoute(@Valid @RequestBody NGO ngo) {
        NGO cust = ngoService.addNGO(ngo);
        return new ResponseEntity<>(cust, HttpStatus.CREATED);
    }

    @ApiOperation("Get an NGO details By ID") // annotation to describe the endpoint and its response type
    @GetMapping("/getbyid/{id}")  // annotation that acts as a shortcut for @RequestMapping.
    public NGO fetchById(@PathVariable int id) {
        return ngoService.fetchById(id);
    }

    @ApiOperation("Delete an NGO record")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        ngoService.deleteNGO(id);
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}