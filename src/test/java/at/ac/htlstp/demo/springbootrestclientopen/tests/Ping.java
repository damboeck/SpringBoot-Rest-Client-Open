package at.ac.htlstp.demo.springbootrestclientopen.tests;

import at.ac.htlstp.demo.springbootrestclientopen.service.PingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class Ping {

    @Autowired private PingService pingService;

    @Test
    public void testPingGet() {
        assertTrue(pingService.ping(PingService.pingLocalRestServer));
    }
}
