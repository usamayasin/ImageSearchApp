package com.app.searchapp.utils

import android.content.Context
import android.net.ConnectivityManager
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import cn.pedant.SweetAlert.SweetAlertDialog

fun View.closeSoftKeyboard() {
    val imm = this.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(this.windowToken, 0)
}