package com.dipro.closet.ui.dapei;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.dipro.closet.R;

import java.util.List;

public class DapeiResourceAdapter extends RecyclerView.Adapter<DapeiResourceAdapter.DapeiResourceViewHolder> {
    private LayoutInflater mInflater;
    private Context mContext;
    protected List<String> mDatas;
    private OnItemClickListener mOnItemClickListener;

    /*
    recyclerView = (RecyclerView) findViewById(R.id.picture_recyclerView);
    this.registerForContextMenu(recyclerView);
    pictureAdapter = new PictureAdapter(this, mFileList, imageLoader);
    recyclerView.setLayoutManager(new  StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
    recyclerView.setAdapter(pictureAdapter);
    recyclerView.setItemAnimator(new DefaultItemAnimator());
    */



    public DapeiResourceAdapter(Context mContext, List<String> mDatas) {
        this.mContext = mContext;
        this.mDatas = mDatas;
        mInflater=LayoutInflater.from(mContext);
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);

        void onItemLongClick(View view, int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mOnItemClickListener = listener;
    }

    @Override
    public DapeiResourceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        DapeiResourceViewHolder holder = new DapeiResourceViewHolder(mInflater.inflate(R.layout.dapei_resource_grid_item, viewGroup, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(final DapeiResourceViewHolder holder, final int position) {
        /*
        if(position%2==0){
            holder.mImageView.setImageResource(R.drawable.baby1);
        }
        else{
            holder.mImageView.setImageResource(R.drawable.baby2);
        }*/

        if (mOnItemClickListener != null) {
            holder.mImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = holder.getLayoutPosition();
                    mOnItemClickListener.onItemClick(holder.mImageView, position);
                }
            });
            holder.mImageView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    int postion = holder.getLayoutPosition();
                    mOnItemClickListener.onItemLongClick(holder.mImageView, postion);
                    return false;
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class DapeiResourceViewHolder extends RecyclerView.ViewHolder{
        private ImageView mImageView;
        public DapeiResourceViewHolder(View itemView){
            super(itemView);
            mImageView=(ImageView) itemView.findViewById(R.id.iv);
        }
    }
}
