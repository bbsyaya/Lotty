package fjnu.edu.cn.lotty.activity;

import android.support.v4.app.Fragment;

import fjnu.edu.cn.lotty.fragment.BrowserFragment;


/**
 * Created by Administrator on 2017\9\3 0003.
 * 网页浏览页面
 */

public class BrowserActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new BrowserFragment();
    }
}