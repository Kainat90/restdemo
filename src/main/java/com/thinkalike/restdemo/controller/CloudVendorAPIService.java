package com.thinkalike.restdemo.controller;

import com.thinkalike.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController  //marks this class responsible for all restapis
@RequestMapping("/cloudvendor") //
public class CloudVendorAPIService {

    CloudVendor cloudVendor;
    @GetMapping("/{vendorId}") //getmapping annotation used to call get method


    public CloudVendor getCloudVendorDetails(String vendorId){


        return cloudVendor;
                //new CloudVendor("C1","Vendor 1",
                //"Address One", "Vendor PhoneNumber xxxx");

    }
@PostMapping
public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
this.cloudVendor = cloudVendor;
return "Cloud Vendor Created Sucessfully";
}

@PutMapping
public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated  Sucessfully";
}

    @DeleteMapping("/{vendorId}")

    public String deleteCloudVendorDetails(@PathVariable String vendorId){
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }
}