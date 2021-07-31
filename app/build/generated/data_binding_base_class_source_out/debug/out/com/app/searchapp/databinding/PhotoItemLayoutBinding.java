// Generated by data binding compiler. Do not edit!
package com.app.searchapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.searchapp.R;
import com.app.searchapp.model.PixabayImage;
import com.google.android.material.card.MaterialCardView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PhotoItemLayoutBinding extends ViewDataBinding {
  @NonNull
  public final MaterialCardView cardPhoto;

  @NonNull
  public final LinearLayout imageDetails;

  @NonNull
  public final ImageView imgPhoto;

  @NonNull
  public final TextView tvTags;

  @NonNull
  public final TextView tvUsername;

  @Bindable
  protected PixabayImage mData;

  protected PhotoItemLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialCardView cardPhoto, LinearLayout imageDetails, ImageView imgPhoto, TextView tvTags,
      TextView tvUsername) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardPhoto = cardPhoto;
    this.imageDetails = imageDetails;
    this.imgPhoto = imgPhoto;
    this.tvTags = tvTags;
    this.tvUsername = tvUsername;
  }

  public abstract void setData(@Nullable PixabayImage data);

  @Nullable
  public PixabayImage getData() {
    return mData;
  }

  @NonNull
  public static PhotoItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.photo_item_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PhotoItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PhotoItemLayoutBinding>inflateInternal(inflater, R.layout.photo_item_layout, root, attachToRoot, component);
  }

  @NonNull
  public static PhotoItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.photo_item_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PhotoItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PhotoItemLayoutBinding>inflateInternal(inflater, R.layout.photo_item_layout, null, false, component);
  }

  public static PhotoItemLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static PhotoItemLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (PhotoItemLayoutBinding)bind(component, view, R.layout.photo_item_layout);
  }
}
