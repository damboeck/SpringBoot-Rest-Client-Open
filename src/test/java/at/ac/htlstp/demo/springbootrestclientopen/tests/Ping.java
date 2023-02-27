package at.ac.htlstp.demo.springbootrestclientopen.tests;

import at.ac.htlstp.demo.springbootrestclientopen.service.PingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Ping {

    @Autowired private PingService pingService;

    @Test
    public void testPingGet() {
        System.out.println(pingService.ping(PingService.pingLocalRestServer));
    }
}
