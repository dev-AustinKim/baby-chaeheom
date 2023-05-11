package com.app.babybaby.repository.board.event;

import com.app.babybaby.entity.board.event.Event;
import com.app.babybaby.entity.member.Member;
import com.app.babybaby.search.board.parentsBoard.EventBoardSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.Optional;

public interface EventQueryDsl {
    //    이벤트 게시판 목록
    public Slice<Event> findEventList(EventBoardSearch eventBoardSearch,Pageable pageable);
    //    이벤트 게시판 상세 페이지
    public Optional<Event> findEventById(Long id);
    //     결제 상세 페이지
    public Optional<Event> findEventPayById(Long memberId, Long eventId);


}
