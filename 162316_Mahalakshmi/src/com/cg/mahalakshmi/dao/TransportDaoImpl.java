package com.cg.mahalakshmi.dao;

import java.util.Map;

import com.cg.mahalakshmi.bean.TransportBean;
import com.cg.mahalakshmi.util.DataBase;

public class TransportDaoImpl implements ITransportDao {

	@Override
	public Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		return DataBase.getTransportDetails();
	}

	@Override
	public void addTransport(TransportBean bean) {
		
		  DataBase.addTransport(bean);
		
	}

}
