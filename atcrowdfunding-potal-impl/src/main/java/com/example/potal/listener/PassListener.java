package com.example.potal.listener;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;
import org.springframework.context.ApplicationContext;

import com.example.bean.Member;
import com.example.potal.service.MemberService;
import com.example.potal.service.TicketService;
import com.example.util.ApplicationContextUtils;

// 实名认证审核通过执行的操作
public class PassListener implements ExecutionListener {

	// 不能直接进行自动装配，因为流程监听器对象是自己创建的
	// @Autowired
	// private TicketSErvice ticketService;

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		// ApplicationContext ioc = new ClassPathXMlApplicationContext(""); //
		// 不能自己创建ioc容器，保证容器是唯一的。
		// ApplicationContext ioc =
		// WebApplicationContextUtils.getWebApplicationContext(application); //
		// 需要获取application对象，可以使用流程变量或ThreadLocal

		// 获取IoC容器，通过自定义工具类，实现Spring接口，以接口注入的方式获取IoC容器对象。
		ApplicationContext applicationContext = ApplicationContextUtils.applicationContext;

		// 获取TicketService, MemberService对象。
		TicketService ticketService = applicationContext.getBean(TicketService.class);
		MemberService memberService = applicationContext.getBean(MemberService.class);

		// 更新t_member表的authstatus字段：1 -> 2 - 已实名认证
		Integer memberid = (Integer) execution.getVariable("memberid");
		Member member = memberService.getMemberById(memberid);
		member.setAuthstatus("2");
		memberService.updateAuthstatus(member);

		// 更新t_ticket表的status字段 0 -> 1 表示流程结束
		ticketService.updateStatus(member);
	}

}
