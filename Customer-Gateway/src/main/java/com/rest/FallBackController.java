package com.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	@GetMapping("/customerFallback")
	public ResponseEntity<String> customerServiceFallback() {
		return new ResponseEntity<String>("CustomerLoan service is taking longer than expected\nPlease try after sometime", HttpStatus.SERVICE_UNAVAILABLE);
	}
	
	 @GetMapping("/vehicleFallback")
	    public ResponseEntity<String> vehicleFallback() {
	        return new ResponseEntity<String>("VehicleLoan service is taking longer than expected. Please try after sometime.", HttpStatus.GATEWAY_TIMEOUT);
	    }
 
	    
	    @GetMapping("/personalFallback")
	    public ResponseEntity<String> lifeFallback() {
	        return new ResponseEntity<String>("PersonalLoan service is taking longer than expected. Please try after sometime.", HttpStatus.GATEWAY_TIMEOUT);
	    }
 
	   
	    @GetMapping("/businessFallback")
	    public ResponseEntity<String> businessFallback() {
	        return new ResponseEntity<String>("BusinessLoan service is taking longer than expected. Please try after sometime.", HttpStatus.GATEWAY_TIMEOUT);
	    }
 
	    
	    @GetMapping("/agricultureFallback")
	    public ResponseEntity<String> agricultureFallback() {
	        return new ResponseEntity<String>("Agriculture service is taking longer than expected. Please try after sometime.", HttpStatus.GATEWAY_TIMEOUT);
	    }
	    
	    
	    @GetMapping("/homeFallback")
	    public ResponseEntity<String> homeServiceFallBack() {
	        return new ResponseEntity<String>("Home service is taking longer than expected. Please try after sometime.", HttpStatus.GATEWAY_TIMEOUT);
	    }
 
	    
	   

}
