package com.master.old.tv.presenter.contract;


import com.master.old.tv.base.BasePresenter;
import com.master.old.tv.base.BaseView;
import com.master.old.tv.model.bean.VideoInfo;
import com.master.old.tv.model.bean.VideoType;

import java.util.List;

/**
 * Description: VideoListContract
 * Creator: yxc
 * date: 2017/9/16 14:59
 */
public interface SearchVideoListContract {

    interface View extends BaseView {

        void refreshFaild(String msg);

        void loadMoreFaild(String msg);

        void showContent(List<VideoType> list);

        void showMoreContent(List<VideoType> list);

        void showRecommend(List<VideoInfo> list);
    }

    interface Presenter extends BasePresenter<View> {

        void onRefresh();

        void loadMore();

        void setSearchKey(String strSearchKey);

    }
}
