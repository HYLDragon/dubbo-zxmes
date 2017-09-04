package com.zx.mes.hyl.service.impl;

import java.util.List;

import com.zx.mes.hyl.dao.BugTypeDaoI;
import com.zx.mes.hyl.model.Tbugtype;
import com.zx.mes.hyl.service.BugTypeServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;



@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass =BugTypeServiceI.class,protocol = {"dubbo"},retries = 0)
public class BugTypeServiceImpl implements BugTypeServiceI {

	@Autowired
	private BugTypeDaoI bugType;


	@Cacheable(value = "bugTypeServiceCache", key = "'bugTypeList'")
	public List<Tbugtype> getBugTypeList() {
		return bugType.find("from Tbugtype t");
	}

}
