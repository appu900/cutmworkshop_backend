package com.example.cutmworkshopserver.Service;


import com.example.cutmworkshopserver.Repository.UserDetailsRepository;
import com.example.cutmworkshopserver.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceimp implements UserDetailsService {

    @Autowired
    private  UserDetailsRepository userDetailsRepository;
    @Override
    public UserDetails createUserDetails(UserDetails userDetails) {
        return userDetailsRepository.save(userDetails);
    }
}
