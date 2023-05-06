package com.app.babybaby.entity.board;

import com.app.babybaby.entity.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@ToString(callSuper = true, exclude = "admin")
@Table(name = "TBL_ANNOUNCEMENT")
@PrimaryKeyJoinColumn(name = "ID")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Announcement extends BoardInfo{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADMIN_ID")
    private User admin;


}
