package com.neoteric.javatdd;

import org.junit.jupiter.api.Test;

public class InsuranceFormTest {
    @Test
    public void test(){
        InsuranceForm dinesh = new InsuranceForm();
        dinesh.name = "dinesh";
        dinesh.age = 20;
        dinesh.previoushealthcondition = "bone fractured";
        dinesh.nomineename = "ramarao";
        dinesh.phonenumber = 9063959115L;
        dinesh.address = "hyd";
        dinesh.pincode = 521401;
        System.out.println("the insurencer name "+dinesh.name);







    }
}
