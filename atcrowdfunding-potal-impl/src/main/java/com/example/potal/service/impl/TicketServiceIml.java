package com.example.potal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Member;
import com.example.bean.Ticket;
import com.example.potal.dao.TicketMapper;
import com.example.potal.service.TicketService;

@Service
public class TicketServiceIml implements TicketService {

	@Autowired
	private TicketMapper ticketMapper;

	@Override
	public Ticket getTicketByMemberId(Integer id) {
		return ticketMapper.getTicketByMemberId(id);
	}

	@Override
	public void saveTicket(Ticket ticket) {
		ticketMapper.saveTicket(ticket);
	}

	@Override
	public void updatePstep(Ticket ticket) {
		ticketMapper.updatePstep(ticket);
	}

	@Override
	public void updatePiidAndPstep(Ticket ticket) {
		ticketMapper.updatePiidAndPstep(ticket);
	}

	@Override
	public Member getMemberByPiid(String processInstanceId) {
		return ticketMapper.getMemberByPiid(processInstanceId);
	}

	@Override
	public void updateStatus(Member member) {
		ticketMapper.updateStatus(member);
	}

}
