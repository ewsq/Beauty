package com.lq.beauty.app.widget;

import android.content.Context;
import android.os.Environment;


/**
 * Created by why8222 on 2016/2/26.
 */
public class MagicParams {
    public static Context context;
    public static MagicBaseView magicBaseView;

    public static String videoPath = Environment.getExternalStorageDirectory().getPath();
    public static String videoName = "MagicCamera_test2.mp4";

    public static int beautyLevel = 5;

    public MagicParams() {

    }
}
