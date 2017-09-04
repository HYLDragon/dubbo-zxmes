package com.zx.mes.hyl.dao.impl;

import com.zx.mes.hyl.dao.BugTypeDaoI;
import com.zx.mes.hyl.model.Tbugtype;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;



@Repository
public class BugTypeDaoImpl extends BaseDaoImpl<Tbugtype> implements BugTypeDaoI {

	@Cacheable(value = "bugTypeDaoCache", key = "#id")
	public Tbugtype getById(String id) {
		return super.get(Tbugtype.class, id);
	}

}
