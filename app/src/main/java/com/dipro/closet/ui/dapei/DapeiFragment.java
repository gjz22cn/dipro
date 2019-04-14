package com.dipro.closet.ui.dapei;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dipro.closet.R;
import com.dipro.closet.ui.common.basic.BasicToolbarFragment;


public class DapeiFragment extends BasicToolbarFragment {

    public DapeiFragment() {
        // Required empty public constructor
    }

    public static DapeiFragment newInstance(Bundle args) {
        DapeiFragment fragment = new DapeiFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        return view;
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.dapei, menu);
    }


    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_dapei;
    }

    @Override
    protected void setupToolbar() {
        setRawTitle("搭配");
    }
}
