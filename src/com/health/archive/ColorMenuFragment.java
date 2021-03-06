package com.health.archive;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import cn.younext.R;

import com.health.archive.vaccinate.Vaccinate;

public class ColorMenuFragment extends ListFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.list, null);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		String[] colors = getResources().getStringArray(R.array.color_names);

		ArrayAdapter<String> colorAdapter = new ArrayAdapter<String>(
				getActivity(), android.R.layout.simple_list_item_1,
				android.R.id.text1, colors);
		setListAdapter(colorAdapter);
	}

	@Override
	public void onListItemClick(ListView lv, View v, int position, long id) {
		Fragment newContent = null;		
		switch (position) {
		case 0:
			newContent = new ArchiveCover();
			break;
		case 1:
			newContent = new BasicInfoFragment();
			break;
		case 2:
			newContent =new Vaccinate();
			break;
		case 3:
			newContent = ColorFragment.getColorFragment(android.R.color.holo_green_light);
			break;
		case 4:
			newContent = new BasicInfoFragment();
			break;
		}
		if (newContent != null)
			switchFragment(newContent);
	}

	// �л�Fragment��ͼ��ring
	private void switchFragment(Fragment fragment) {
		if (getActivity() == null)
			return;

		if (getActivity() instanceof ArchiveMain) {
			ArchiveMain fca = (ArchiveMain) getActivity();
			fca.switchContent(fragment);
		}
	}

}
