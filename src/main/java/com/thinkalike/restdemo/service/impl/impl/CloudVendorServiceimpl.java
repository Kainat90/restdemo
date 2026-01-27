package com.thinkalike.restdemo.service.impl.impl;

import com.thinkalike.restdemo.model.CloudVendor;
import com.thinkalike.restdemo.repository.CloudVendorRepository;
import com.thinkalike.restdemo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CloudVendorServiceimpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceimpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }



    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
//more business logic
        cloudVendorRepository.save(cloudVendor);
        return "Succesfully Created! ";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
//more business logic
        cloudVendorRepository.save(cloudVendor);
        return "Sucecss";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        //more business logic
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Deleted Successfully!";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {

        //more business logic

        return
                cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        //more business logic
        return cloudVendorRepository.findAll();
    }
}
