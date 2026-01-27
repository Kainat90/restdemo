package com.thinkalike.restdemo.controller;

import com.thinkalike.restdemo.model.CloudVendor;
import com.thinkalike.restdemo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //marks this class responsible for all restapis
@RequestMapping("/cloudvendor") //
public class CloudVendorController {



    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

//Read Specific Vendor Details
    @GetMapping("/{vendorId}") //get mapping annotation used to call get method

    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){


        return cloudVendorService.getCloudVendor(vendorId);

    }
//Read All Vendor Details
    @GetMapping() //get mapping annotation used to call get method

    public List<CloudVendor> getAllCloudVendorDetails(){


        return cloudVendorService.getAllCloudVendors();

    }
@PostMapping
public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){

   cloudVendorService.createCloudVendor(cloudVendor);
return "Cloud Vendor Created Successfully";
}

@PutMapping
public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
   cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated  Successfully";
}

    @DeleteMapping("/{vendorId}")

    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
}