package com.example;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private int id;
    private String cname, address;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCname() {
        return cname;
    }
    @Override
    public String toString() {
        return "Customer [address=" + address + ", cname=" + cname + ", id=" + id + "]";
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
