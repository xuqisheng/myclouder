package com.myclouder.upms.rpc.common;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author yanhaizhe
 * @create 2017-05-30 上午 11:36
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:/spring/applicationContext.xml"
})
//@ContextConfiguration(classes = {HibernateConfiguration.class})
public class BaseTest {
}
