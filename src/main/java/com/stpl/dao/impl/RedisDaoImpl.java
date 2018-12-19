package com.stpl.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stpl.dao.RedisDao;
import com.stpl.dao.repo.RedisDaoRepo;

@Component
public class RedisDaoImpl implements RedisDao {

	@Autowired
	RedisDaoRepo repository;

	@Override
	public List<String> fetchUserNames(short domainId, short aliasId) throws Exception {
		return repository.findByDomainidAliasId(domainId, aliasId);
	}

}
