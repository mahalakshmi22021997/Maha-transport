package com.cg.mahalakshmi.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.mahalakshmi.bean.TransportBean;

public class DataBase {
	private static Map<String, String> transportDetails=new HashMap<>();
	private static Map<Integer,TransportBean > bookTransport=new HashMap<>();
	public static Map<String, String> getTransportDetails() {
		transportDetails.put("f-1", "flight");
		transportDetails.put("f-2", "train");
		transportDetails.put("f-3", "taxi");
		
		return transportDetails;
	}

	public static void addTransport(TransportBean bean) {
		bookTransport.put(bean.getId(),bean);
		
	}

}
