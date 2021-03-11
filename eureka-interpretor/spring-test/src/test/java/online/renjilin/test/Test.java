package online.renjilin.test;

import online.renjilin.TestApplication;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Test {
    @Autowired
    RestTemplate restTemplate;

    @org.junit.Test
    public void test() throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(restTemplate.getForObject("http://127.0.0.1:20001/order", String.class));
                    }catch(Exception e) {
                        System.out.println("限流了");
                    }
                }
            });

            thread.start();
        }

        Thread.sleep(3000);
        
    }
}
