package com.xiaomi.publish.app.biz;

import com.xiaomi.publish.app.model.AppType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:app-resource.xml")
public class AppTypeBizImplTest {

    @Autowired
    private IAppTypeBiz appTypeBiz;

    @Test
    public void saveTest(){
        AppType appType = new AppType();
        appType.setName("test");
        appType.setDesc("test");
        appType.setOrderno(1);
        appTypeBiz.save(appType);
    }

}