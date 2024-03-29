// Generated by data binding compiler. Do not edit!
package com.yassineabou.calculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.yassineabou.calculator.R;
import com.yassineabou.calculator.ui.emi.EMIViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentEmiCalculationBinding extends ViewDataBinding {
  @NonNull
  public final View background;

  @NonNull
  public final ImageButton compare;

  @NonNull
  public final Button done;

  @NonNull
  public final TextView emiAmount;

  @NonNull
  public final TextView interest;

  @NonNull
  public final TextView labelCompare;

  @NonNull
  public final TextView labelEmiAmount;

  @NonNull
  public final TextView labelInterest;

  @NonNull
  public final TextView labelPrincipal;

  @NonNull
  public final View lineSeparatorBackground;

  @NonNull
  public final View lineSeparatorCompare;

  @NonNull
  public final TextView numberInstallments;

  @NonNull
  public final TextView perMonth;

  @NonNull
  public final TextView principal;

  @NonNull
  public final TextView totalAmount;

  @Bindable
  protected EMIViewModel mViewModel;

  protected FragmentEmiCalculationBinding(Object _bindingComponent, View _root,
      int _localFieldCount, View background, ImageButton compare, Button done, TextView emiAmount,
      TextView interest, TextView labelCompare, TextView labelEmiAmount, TextView labelInterest,
      TextView labelPrincipal, View lineSeparatorBackground, View lineSeparatorCompare,
      TextView numberInstallments, TextView perMonth, TextView principal, TextView totalAmount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.background = background;
    this.compare = compare;
    this.done = done;
    this.emiAmount = emiAmount;
    this.interest = interest;
    this.labelCompare = labelCompare;
    this.labelEmiAmount = labelEmiAmount;
    this.labelInterest = labelInterest;
    this.labelPrincipal = labelPrincipal;
    this.lineSeparatorBackground = lineSeparatorBackground;
    this.lineSeparatorCompare = lineSeparatorCompare;
    this.numberInstallments = numberInstallments;
    this.perMonth = perMonth;
    this.principal = principal;
    this.totalAmount = totalAmount;
  }

  public abstract void setViewModel(@Nullable EMIViewModel viewModel);

  @Nullable
  public EMIViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentEmiCalculationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_emi_calculation, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEmiCalculationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentEmiCalculationBinding>inflateInternal(inflater, R.layout.fragment_emi_calculation, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentEmiCalculationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_emi_calculation, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEmiCalculationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentEmiCalculationBinding>inflateInternal(inflater, R.layout.fragment_emi_calculation, null, false, component);
  }

  public static FragmentEmiCalculationBinding bind(@NonNull View view) {
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
  public static FragmentEmiCalculationBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentEmiCalculationBinding)bind(component, view, R.layout.fragment_emi_calculation);
  }
}
