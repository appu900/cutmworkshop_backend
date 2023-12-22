package com.example.cutmworkshopserver.Repository;

import com.example.cutmworkshopserver.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
}
