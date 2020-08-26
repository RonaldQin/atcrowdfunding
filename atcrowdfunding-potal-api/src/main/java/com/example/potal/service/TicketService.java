package com.example.potal.service;

import com.example.bean.Member;
import com.example.bean.Ticket;

public interface TicketService {
    Ticket getTicketByMemberId(Integer id);

    void saveTicket(Ticket ticket);

    void updatePstep(Ticket ticket);

    void updatePiidAndPstep(Ticket ticket);

    Member getMemberByPiid(String processInstanceId);

    void updateStatus(Member member);
}
