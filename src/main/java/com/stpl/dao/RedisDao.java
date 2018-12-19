package com.stpl.dao;

import java.util.List;

public interface RedisDao {

	public List<String> fetchUserNames(short domainId, short aliasId) throws Exception;
}
