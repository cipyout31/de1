package com.example.demo.controller;

import com.example.demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudvendorApiService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
        return cloudVendor;

    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloudvendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(String vendorId) {
        this.cloudVendor = null;
        return "Cloud vendor Deleted Successfully";
    }
}
