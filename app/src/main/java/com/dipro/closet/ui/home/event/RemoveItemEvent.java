package com.dipro.closet.ui.home.event;

import com.dipro.closet.model.entity.ProductEntity;

/**
 * Created by Ethan on 2017/9/24.
 */

public class RemoveItemEvent {

    private ProductEntity removeEntity;

    public RemoveItemEvent(ProductEntity removeEntity) {
        this.removeEntity = removeEntity;
    }

    public ProductEntity getRemoveEntity() {
        return removeEntity;
    }

    public void setRemoveEntity(ProductEntity removeEntity) {
        this.removeEntity = removeEntity;
    }
}
