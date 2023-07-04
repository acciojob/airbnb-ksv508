package com.driver.controllers;

import com.driver.model.Hotel;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;

@Repository
public class HotelManagementRepo {
    HashSet<Hotel>hotel = new HashSet<>();

}
