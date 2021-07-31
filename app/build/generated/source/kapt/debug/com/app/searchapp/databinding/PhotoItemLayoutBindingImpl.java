package com.app.searchapp.databinding;
import com.app.searchapp.R;
import com.app.searchapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PhotoItemLayoutBindingImpl extends PhotoItemLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardPhoto, 4);
        sViewsWithIds.put(R.id.imageDetails, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PhotoItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private PhotoItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.card.MaterialCardView) bindings[4]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.imgPhoto.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvTags.setTag(null);
        this.tvUsername.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.data == variableId) {
            setData((com.app.searchapp.model.PixabayImage) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.app.searchapp.model.PixabayImage Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String dataLargeImageURL = null;
        java.lang.String dataTags = null;
        java.lang.String dataUser = null;
        com.app.searchapp.model.PixabayImage data = mData;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.largeImageURL
                    dataLargeImageURL = data.getLargeImageURL();
                    // read data.tags
                    dataTags = data.getTags();
                    // read data.user
                    dataUser = data.getUser();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageUri(this.imgPhoto, dataLargeImageURL);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTags, dataTags);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUsername, dataUser);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}