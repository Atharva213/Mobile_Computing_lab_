// Generated by data binding compiler. Do not edit!
package com.yassineabou.calculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.yassineabou.calculator.R;
import com.yassineabou.calculator.data.model.PreviousOperation;
import com.yassineabou.calculator.ui.calculator.PreviousOperationAction;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PreviousOperationItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView input;

  @NonNull
  public final TextView result;

  @Bindable
  protected PreviousOperation mPreviousOperation;

  @Bindable
  protected PreviousOperationAction mPreviousOperationActions;

  protected PreviousOperationItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView input, TextView result) {
    super(_bindingComponent, _root, _localFieldCount);
    this.input = input;
    this.result = result;
  }

  public abstract void setPreviousOperation(@Nullable PreviousOperation previousOperation);

  @Nullable
  public PreviousOperation getPreviousOperation() {
    return mPreviousOperation;
  }

  public abstract void setPreviousOperationActions(
      @Nullable PreviousOperationAction previousOperationActions);

  @Nullable
  public PreviousOperationAction getPreviousOperationActions() {
    return mPreviousOperationActions;
  }

  @NonNull
  public static PreviousOperationItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.previous_operation_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PreviousOperationItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PreviousOperationItemBinding>inflateInternal(inflater, R.layout.previous_operation_item, root, attachToRoot, component);
  }

  @NonNull
  public static PreviousOperationItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.previous_operation_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PreviousOperationItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PreviousOperationItemBinding>inflateInternal(inflater, R.layout.previous_operation_item, null, false, component);
  }

  public static PreviousOperationItemBinding bind(@NonNull View view) {
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
  public static PreviousOperationItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (PreviousOperationItemBinding)bind(component, view, R.layout.previous_operation_item);
  }
}
