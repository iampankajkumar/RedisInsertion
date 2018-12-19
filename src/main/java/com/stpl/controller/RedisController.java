package com.stpl.controller;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.stpl.service.RedisService;

import redis.clients.jedis.Jedis;

@Component
@Configuration
@PropertySource("classpath:application.properties")
public class RedisController implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(RedisController.class);

	@Autowired
	RedisService service;

	@Value("${redis.ip}")
	public String redisIp;

	@Value("${redis.port}")
	public int redisPort;

	@Value("${domain.domainId}")
	public short domainId;

	@Value("${domain.aliasId}")
	public short aliasId;

	@Value("${domain.aliasList}")
	public String aliasList;

	@Override
	public void run(String... args) throws Exception {

		Jedis redis = new Jedis(redisIp, redisPort);
		try {

			List<String> userNames = service.fecthUserNames(domainId, aliasId);
			log.info("Number of users fetched from Database :::: >> " + userNames.size());

			log.info("Redis Insertion Started :::: >> ");
			for (String userName : userNames) {
				redis.set(userName, aliasList);
			}
			log.info("Redis Insertion Completed :::: >> ");

		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			redis.close();
		}
	}

}
