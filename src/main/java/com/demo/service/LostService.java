package com.demo.service;

import com.demo.entity.Lost;

import java.util.List;

public interface LostService {

    List<Lost> queryLost();

    Lost queryByLostId(int lostId);

    List<Lost> queryBycategory(int category);

    boolean insertLost(Lost lost);

    int updateLost(Lost lost);

    int deleteLost(int lostId);
}
