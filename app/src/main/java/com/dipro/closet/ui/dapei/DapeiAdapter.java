package com.dipro.closet.ui.dapei;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.dipro.closet.model.entity.DapeiEntity;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;



public class DapeiAdapter extends RecyclerView.Adapter<DapeiAdapter.DapeiViewHolder> {

    private static final String TAG = "TAG";

    private List<DapeiEntity> mDataList;

    public DapeiAdapter() {
        mDataList = new ArrayList<>();
    }

    @Override
    public DapeiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(DapeiViewHolder holder, int position) {
        DapeiEntity entity = mDataList.get(position);
        holder.onBindViewHolder(entity);
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class DapeiViewHolder extends RecyclerView.ViewHolder{

        public DapeiViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void onBindViewHolder(DapeiEntity entity){

        }
    }
}
