package com.zx.mes.test;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/9/6.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:root.xml" })
public class Test {
    private static final Logger logger=Logger.getLogger(Test.class);

    @org.junit.Test
    public void test (){
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("classpath:root.xml");
        ac.getBean("baseDaoImpl");
        logger.info(JSON.toJSONStringWithDateFormat("test","yyyy-MM-dd HH:mm:ss"));
    }
}
