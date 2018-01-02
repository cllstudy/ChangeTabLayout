package com.zl.changetablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author : lei
 * @desc :
 * @date : 2018/1/2 0002  下午 3:28.
 * 码云: https://gitee.com/cllstudy
 */

public class CheckFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_check, container, false);
    }
}
