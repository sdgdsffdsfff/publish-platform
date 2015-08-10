package com.xiaomi.publish.bus.biz;

import com.xiaomi.publish.bus.model.BusName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:bus-resource.xml")
public class BusNameBizImplTest {

    @Autowired
    private IBusNameBiz busNameBiz;

    @Test
    public void saveTest(){
        BusName busName = new BusName();
        busName.setName("test");

        busNameBiz.save(busName);
    }
}