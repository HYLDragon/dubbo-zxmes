package com.zx.mes.hyl.dao.impl;

import com.zx.mes.hyl.dao.ResourceTypeDaoI;
import com.zx.mes.hyl.model.Tresourcetype;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;



@Repository
public class ResourceTypeDaoImpl extends BaseDaoImpl<Tresourcetype> implements ResourceTypeDaoI {


	@Cacheable(value = "resourceTypeDaoCache", key = "#id")
	public Tresourcetype getById(String id) {
		return super.get(Tresourcetype.class, id);
	}

}
