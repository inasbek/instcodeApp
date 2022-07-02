package com.instacodeApp.use_cases.follow.exposition;

import lombok.Data;

@Data
public class FollowDto {
    public Long id;
    public String followerUserName;
    public String followedUserName;
}
