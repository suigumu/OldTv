package com.master.old.tv.presenter.contract;


import com.master.old.tv.base.BasePresenter;
import com.master.old.tv.base.BaseView;
import com.master.old.tv.model.bean.VideoType;

import java.util.List;

/**
 * Description: CommentContract
 * Creator: yxc
 * date: 2016/10/18 13:21
 */
public interface CommentContract {

    interface View extends BaseView {

        void refreshFaild(String msg);

        void showContent(List<VideoType> list);

        void showMoreContent(List<VideoType> list);
    }

    interface Presenter extends BasePresenter<View> {

        void onRefresh();

        void loadMore();

        void setMediaId(String id);

    }
}
