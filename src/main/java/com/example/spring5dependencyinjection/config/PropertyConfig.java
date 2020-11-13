package com.example.spring5dependencyinjection.config;

import com.example.spring5dependencyinjection.examplebeans.FakeDataSource;
import com.example.spring5dependencyinjection.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${mat.username}")
    String user;

    @Value("${mat.password}")
    String password;

    @Value("${mat.dburl}")
    String url;

    @Value("${mat.jms.username}")
    String jmsUsername;

    @Value("${mat.jms.password}")
    String jmsPassword;

    @Value("${mat.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();

        fakeDataSource.setUsername(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();

        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);

        return fakeJmsBroker;
    }
}
