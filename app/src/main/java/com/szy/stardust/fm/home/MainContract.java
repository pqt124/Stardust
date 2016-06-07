package com.szy.stardust.fm.home;

import com.szy.stardust.base.BasePresenter;
import com.szy.stardust.base.BaseView;
import com.szy.stardust.data.bean.DBMainFragment;
import com.szy.stardust.data.bean.MyInfoBean;

import java.util.ArrayList;
import java.util.List;

/**
 * author: suzeyu on 16/6/6 15:28
 * github: https://github.com/suzeyu1992
 * -------------------------------------
 * class description :  进入home页面的的contract契约类
 */
public interface MainContract {

    interface Persenter extends BasePresenter{
        ArrayList<DBMainFragment>  initLoadViewData();
    }

    interface View extends BaseView<Persenter>{

        void clickPager(int pagerIndex);

        void setMyInfo(boolean isLogin, MyInfoBean myinfo);

    }
}
