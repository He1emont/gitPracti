// Generated by view binder compiler. Do not edit!
package com.example.icerockrepoapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.icerockrepoapp.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAuthBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FrameLayout btSignIn;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextInputEditText tiToken;

  @NonNull
  public final TextView tvSignIn;

  private FragmentAuthBinding(@NonNull ConstraintLayout rootView, @NonNull FrameLayout btSignIn,
      @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar,
      @NonNull TextInputEditText tiToken, @NonNull TextView tvSignIn) {
    this.rootView = rootView;
    this.btSignIn = btSignIn;
    this.linearLayout = linearLayout;
    this.progressBar = progressBar;
    this.tiToken = tiToken;
    this.tvSignIn = tvSignIn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAuthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_auth, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAuthBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bt_SignIn;
      FrameLayout btSignIn = ViewBindings.findChildViewById(rootView, id);
      if (btSignIn == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.tiToken;
      TextInputEditText tiToken = ViewBindings.findChildViewById(rootView, id);
      if (tiToken == null) {
        break missingId;
      }

      id = R.id.tvSignIn;
      TextView tvSignIn = ViewBindings.findChildViewById(rootView, id);
      if (tvSignIn == null) {
        break missingId;
      }

      return new FragmentAuthBinding((ConstraintLayout) rootView, btSignIn, linearLayout,
          progressBar, tiToken, tvSignIn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
