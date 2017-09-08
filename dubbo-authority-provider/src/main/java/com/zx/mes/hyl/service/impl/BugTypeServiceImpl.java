package com.zx.mes.hyl.service.impl;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.zx.mes.hyl.dao.BugTypeDaoI;
import com.zx.mes.hyl.model.Tbugtype;
import com.zx.mes.hyl.service.BugTypeServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;




@Component
//@com.alibaba.dubbo.config.annotation.Service(interfaceClass =BugTypeServiceI.class,protocol = {"dubbo"},retries = 0,
//		version = "1.0")
@Service(version = "1.0")
public class BugTypeServiceImpl implements BugTypeServiceI {

	@Autowired
	private BugTypeDaoI bugType;


	@Cacheable(value = "bugTypeServiceCache", key = "'bugTypeList'")
	public List<Tbugtype> getBugTypeList() {
		return bugType.find("from Tbugtype t");
	}

}
