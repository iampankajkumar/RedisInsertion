package com.stpl.service;

import java.util.List;

public interface RedisService {

	List<String> fecthUserNames(int domainId,int aliasId) throws Exception;
	
}
