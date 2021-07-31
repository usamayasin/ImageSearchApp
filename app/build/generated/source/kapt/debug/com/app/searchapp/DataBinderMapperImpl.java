package com.app.searchapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.app.searchapp.databinding.HomeFragmentBindingImpl;
import com.app.searchapp.databinding.PhotoDetailFragmentBindingImpl;
import com.app.searchapp.databinding.PhotoItemLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_HOMEFRAGMENT = 1;

  private static final int LAYOUT_PHOTODETAILFRAGMENT = 2;

  private static final int LAYOUT_PHOTOITEMLAYOUT = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.searchapp.R.layout.home_fragment, LAYOUT_HOMEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.searchapp.R.layout.photo_detail_fragment, LAYOUT_PHOTODETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.searchapp.R.layout.photo_item_layout, LAYOUT_PHOTOITEMLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_HOMEFRAGMENT: {
          if ("layout/home_fragment_0".equals(tag)) {
            return new HomeFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_PHOTODETAILFRAGMENT: {
          if ("layout/photo_detail_fragment_0".equals(tag)) {
            return new PhotoDetailFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for photo_detail_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_PHOTOITEMLAYOUT: {
          if ("layout/photo_item_layout_0".equals(tag)) {
            return new PhotoItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for photo_item_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "data");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/home_fragment_0", com.app.searchapp.R.layout.home_fragment);
      sKeys.put("layout/photo_detail_fragment_0", com.app.searchapp.R.layout.photo_detail_fragment);
      sKeys.put("layout/photo_item_layout_0", com.app.searchapp.R.layout.photo_item_layout);
    }
  }
}
