package online.renjilin.test;

import com.netflix.discovery.converters.Auto;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ClientTest {
    @Autowired
    RestTemplate restTemplate;

    @Test
    public void test()
    {
        System.out.println(restTemplate);
    }
}
