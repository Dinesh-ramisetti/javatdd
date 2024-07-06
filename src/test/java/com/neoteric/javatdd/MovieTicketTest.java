package com.neoteric.javatdd;

import org.junit.jupiter.api.Test;

public class MovieTicketTest {

    @Test

    public void test(){
        MovieTicket theatrename = new MovieTicket();
        theatrename.moviename = "gabbarsingh";
        theatrename.seatnumber = 23;
        theatrename.date = "6-7-24";
        theatrename.time = "15:30";
        theatrename.place = "balanagar";


    }
}
