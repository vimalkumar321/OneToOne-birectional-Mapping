package com.vimal.onetoonebidirectional.controller;

import com.vimal.onetoonebidirectional.model.Address;
import com.vimal.onetoonebidirectional.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;
    @GetMapping("/address/get/all")
    public List<Address> getAddress() {
        return (List<Address>)addressRepository.findAll();
    }

}
