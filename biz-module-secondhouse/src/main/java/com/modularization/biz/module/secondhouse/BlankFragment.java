package com.modularization.biz.module.secondhouse;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.modularization.biz.service.secondhouse.SecondHouseRouterTable;

@Route(path = SecondHouseRouterTable.PATH_FRAGMENT_BLANK)
public class BlankFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";

    @Autowired(name = "param1")
    String mParam1;

    public BlankFragment() {
        // Required empty public constructor
    }

    public static BlankFragment newInstance(String param1) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_blank, container, false);
        TextView textView = rootView.findViewById(R.id.textView);
        if(!TextUtils.isEmpty(mParam1)) {
            textView.setText(mParam1);
        }
        return rootView;
    }
}