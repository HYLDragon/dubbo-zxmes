package com.zx.mes.hyl.dao;


import com.zx.mes.hyl.model.Tbugtype;

public interface BugTypeDaoI extends BaseDaoI<Tbugtype> {

	/**
	 * 通过ID获得BUG类型
	 * 
	 * @param id
	 * @return
	 */
	public Tbugtype getById(String id);

}
