package com.dipro.closet.ui.common.basic;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;


import com.dipro.closet.R;

import butterknife.BindView;

/**
 * Created by Ethan on 17/2/9.
 */
public abstract class BasicToolBarActivity extends BasicActivity {

    @BindView(R.id.toolbar_include_header)
    protected Toolbar mToolbar;

    @BindView(R.id.tv_include_header_title)
    protected TextView mTvHeaderTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mToolbar.setTitle("");
        mToolbar.setSubtitle("");
        setSupportActionBar(mToolbar);
        mToolbar.setNavigationIcon(R.drawable.icon_toolbar_left);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    /**
     * 隐藏toolbar
     */
    public void hideToolbar() {
        mToolbar.setVisibility(View.GONE);
    }

    public void setToolbarVisibility(int visibility) {
        mToolbar.setVisibility(visibility);
    }

    public void setRawTitle(String titleContent){
        mToolbar.setSubtitle("");
        mToolbar.setTitle(titleContent);
    }

    public void setHeaderTitle(String titleContent) {
        mTvHeaderTitle.setText(titleContent);
    }

    public void setHeaderTitle(@StringRes int titleResID) {
        mTvHeaderTitle.setText(titleResID);
    }

    public void setNavigationIcon(@DrawableRes int resID) {
        mToolbar.setNavigationIcon(resID);
    }

    public void setupToolbar(@DrawableRes int leftResID, String titleContent) {
        mToolbar.setNavigationIcon(leftResID);
        setHeaderTitle(titleContent);
    }

    public Toolbar getToolbar() {
        return mToolbar;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
