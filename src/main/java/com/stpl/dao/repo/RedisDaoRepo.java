package com.stpl.dao.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stpl.dto.StPmPlayerMaster;

@Repository
public interface RedisDaoRepo extends CrudRepository<StPmPlayerMaster, Long> {

	@Query("SELECT userName FROM StPmPlayerMaster playerMaster WHERE playerMaster.domainId = :domainId AND playerMaster.aliasId = :aliasId")
	List<String> findByDomainidAliasId(@Param("domainId") short domainId, @Param("aliasId") short aliasId);

}
