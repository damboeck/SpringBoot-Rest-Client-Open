package at.ac.htlstp.demo.springbootrestclientopen.service;

import at.ac.htlstp.demo.springbootrestinterface.endpoints.RestEndpoints;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PingService {

    public static final String pingLocalRestServer = "http://localhost:"+RestEndpoints.ServerPort+RestEndpoints.ping;
    public boolean ping(String url) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
            if (response.getStatusCode().is2xxSuccessful()) {
                if (response.getBody().trim().equals("pong"))
                    return true;
            }
        } catch (Exception ex) {}
        return false;
    }
}
