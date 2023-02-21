package com.microservices.demo.twitter.to.kafka.service;

import java.util.Arrays;
import com.microservices.demo.twitter.to.kafka.service.config.TwitterToKafkaServiceConfigData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {
    public static final Logger LOG = LoggerFactory.getLogger(TwitterToKafkaServiceApplication.class);
    public final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;

    public TwitterToKafkaServiceApplication (TwitterToKafkaServiceConfigData configData){
        this.twitterToKafkaServiceConfigData = configData;
    }

    public static void main (String[] args){
        SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("App Started...");
        LOG.info(twitterToKafkaServiceConfigData.getWelcomeMessage());
        LOG.info(Arrays.toString(twitterToKafkaServiceConfigData.getTwitterKeywords().toArray(new String[] {})));
    }
}
