package com.neoteric.javatdd;

import org.junit.jupiter.api.Test;

public class BankFormTest {

    @Test

    public void test(){
        BankForm dinesh = new BankForm();
        dinesh.firstname = "dinesh";
        dinesh.lastname = "ramisetti";
        dinesh.age = 20;
        dinesh.accountnumber = 908712348756L;
        dinesh.phonenumber = 9063959115L;
        dinesh.branchname = "madhapur";
        dinesh.address = "hyd";
        dinesh.pincode = 521401;
    }
}
