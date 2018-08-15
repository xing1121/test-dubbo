package com.sf.wdx.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.sf.wdx.service.TestGetDate;

/**
 * 描述：要暴漏的接口的实现类
 * @author 80002888
 * @date   2018年8月15日
 */
@Service
public class TestGetDateImpl implements TestGetDate{

	@Override
	public Date getDate() {
		return new Date();
	}

}
