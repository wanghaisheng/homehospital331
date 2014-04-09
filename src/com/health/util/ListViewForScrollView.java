package com.health.util;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/***
 * 
 * 能在scrollview中使用的listview
 *  copy from
 * http://www.apkbus.com/android-161576-1-1.html
 * 
 * @author jiqunpeng
 * 
 *         创建时间：2014-4-8 下午7:46:08
 */
public class ListViewForScrollView extends ListView {
	public ListViewForScrollView(Context context) {
		super(context);
	}

	public ListViewForScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public ListViewForScrollView(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	/**
	 * 重写该方法，达到使ListView适应ScrollView的效果
	 */
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
				MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}
}
