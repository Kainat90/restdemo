package com.thinkalike.restdemo.repository;

import com.thinkalike.restdemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {


}
