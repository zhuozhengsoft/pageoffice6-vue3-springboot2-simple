package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    @Value("${posyspath}")
    private String poSysPath;
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
    }



    @Bean
    public ServletRegistrationBean pageofficeRegistrationBean()  {
        com.zhuozhengsoft.pageoffice.poserver.Server poserver
                = new com.zhuozhengsoft.pageoffice.poserver.Server();
        poserver.setSysPath(poSysPath);//设置PageOffice注册成功后,license.lic文件存放的目录

        ServletRegistrationBean srb = new ServletRegistrationBean(poserver);
        srb.addUrlMappings("/poserver.zz");
        srb.addUrlMappings("/poclient");
        srb.addUrlMappings("/pageoffice.js");
        srb.addUrlMappings("/sealsetup.exe");
        return srb;
    }

}
