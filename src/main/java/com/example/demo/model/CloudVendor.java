package com.example.demo.model;

public class CloudVendor {

    private String vendorId;
    private String vendorName;
    private String vendorAdress;
    private String vendorphoneNumber;

    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String vendorName, String vendorAdress, String vendorphoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAdress = vendorAdress;
        this.vendorphoneNumber = vendorphoneNumber;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorphoneNumber() {
        return vendorphoneNumber;
    }

    public void setVendorphoneNumber(String vendorphoneNumber) {
        this.vendorphoneNumber = vendorphoneNumber;
    }

    public String getVendorAdress() {
        return vendorAdress;
    }

    public void setVendorAdress(String vendorAdress) {
        this.vendorAdress = vendorAdress;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

}
