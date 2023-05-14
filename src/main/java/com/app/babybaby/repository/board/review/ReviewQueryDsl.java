package com.app.babybaby.repository.board.review;

import com.app.babybaby.entity.board.review.Review;
import com.app.babybaby.search.admin.AdminReviewSearch;
import com.app.babybaby.type.CategoryType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;
import java.util.Optional;

public interface ReviewQueryDsl {

    public List<Review> findReviewById_QueryDSL(Long memberId);

    public Slice<Review> findAllByMemberId_QueryDSL(Pageable pageable, Long memberId);

    //[관리자] 리뷰 게시판 목록 조회
    public Page<Review> findAllReviewBoardWithSearch_queryDSL(Pageable pageable, AdminReviewSearch adminReviewSearch, CategoryType eventCategory);

    //[관리자] 리뷰 게시판  상세
    public Optional<Review> findReviewBoardById_queryDSL(Long reviewBoardId);

    //[관리자] 리뷰 게시판 삭제
    public void deleteReviewBoardByIds_queryDSL(List<Long> reviewBoardIds);
}
