package com.dipro.closet.model.response;

import com.dipro.closet.model.base.BaseResponse;
import com.dipro.closet.model.entity.HomeCategoryEntity;

import java.util.List;

/**
 * Created by Ethan on 2017/9/19.
 * 衣橱页
 */

public class HomeClosetResponse extends BaseResponse {

    List<HomeCategoryEntity> mHomeCategoryEntityList;

    public HomeClosetResponse(List<HomeCategoryEntity> homeCategoryEntityList) {
        mHomeCategoryEntityList = homeCategoryEntityList;
    }

    public List<HomeCategoryEntity> getHomeCategoryEntityList() {
        return mHomeCategoryEntityList;
    }

    public void setHomeCategoryEntityList(List<HomeCategoryEntity> homeCategoryEntityList) {
        mHomeCategoryEntityList = homeCategoryEntityList;
    }
}
