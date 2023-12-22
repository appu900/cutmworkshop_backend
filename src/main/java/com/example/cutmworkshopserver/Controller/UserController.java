package com.example.cutmworkshopserver.Controller;
import com.example.cutmworkshopserver.Service.UserDetailsService;
import com.example.cutmworkshopserver.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired private UserDetailsService userDetailsService;
    @PostMapping("/create")
    public ResponseEntity<UserDetails> createUserDetails(@RequestBody UserDetails userDetails){
        return ResponseEntity.ok(userDetailsService.createUserDetails(userDetails));
    }
}
