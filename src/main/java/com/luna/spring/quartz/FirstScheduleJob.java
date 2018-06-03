package com.luna.spring.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class FirstScheduleJob extends QuartzJobBean {

	private AnotherBean anotherBean;
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		//打印当前时间
		Date startTime = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("FirstScheduleJob Executes!"+sf.format(startTime));
		this.anotherBean.printAnotherMessage();
	}
	
	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
}
