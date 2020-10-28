package org.sukerin.shardingjdbc;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.sukerin.shardingjdbc.service.AccountService;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingJdbcApplicationTests {
    @Resource
    private AccountService service;

    @Test
    public void test() {
        service.insertTest(100);
        service.insertTest(101);
        service.insertTest(102);

    }
    @Test
    public void contextLoads() {
    }

}
