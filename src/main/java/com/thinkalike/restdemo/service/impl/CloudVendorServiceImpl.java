package com.thinkalike.restdemo.service.impl;

import com.thinkalike.restdemo.model.CloudVendor;
import com.thinkalike.restdemo.repository.CloudVendorRepository;
import com.thinkalike.restdemo.service.CloudVendorService;

import java.util.List;

public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);

        return "";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        return "";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        return "";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return null;
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return List.of();
    }
}
