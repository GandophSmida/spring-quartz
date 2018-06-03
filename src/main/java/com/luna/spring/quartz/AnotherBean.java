package com.luna.spring.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class AnotherBean {
	public void printAnotherMessage(){
		//打印当前时间
		Date startTime = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("I am AnotherBean."+sf.format(startTime));
	}
}
