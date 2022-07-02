package com.instacodeApp.use_cases.follow.repository;

import com.instacodeApp.use_cases.follow.domain.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, Long> {
}
