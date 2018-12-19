package com.stpl.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stpl.dao.RedisDao;

@Service
public class RedisServiceImpl implements RedisService {

	private static final Logger log = LoggerFactory.getLogger(RedisServiceImpl.class);
	@Autowired
	RedisDao dao;

	@Override
	public List<String> fecthUserNames(int domainId, int aliasId) throws Exception {
		log.info("Fetching Players for domain=" + domainId + " and alias=" + aliasId);
		return dao.fetchUserNames((short) domainId, (short) aliasId);
	}

}
