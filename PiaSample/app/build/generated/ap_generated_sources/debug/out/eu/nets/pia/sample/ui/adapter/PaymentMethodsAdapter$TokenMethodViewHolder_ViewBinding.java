// Generated code from Butter Knife. Do not modify!
package eu.nets.pia.sample.ui.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import eu.nets.pia.sample.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PaymentMethodsAdapter$TokenMethodViewHolder_ViewBinding implements Unbinder {
  private PaymentMethodsAdapter.TokenMethodViewHolder target;

  @UiThread
  public PaymentMethodsAdapter$TokenMethodViewHolder_ViewBinding(
      PaymentMethodsAdapter.TokenMethodViewHolder target, View source) {
    this.target = target;

    target.mCardLogo = Utils.findRequiredViewAsType(source, R.id.card_scheme_logo, "field 'mCardLogo'", ImageView.class);
    target.mCardSchemeDigits = Utils.findRequiredViewAsType(source, R.id.card_scheme_digits, "field 'mCardSchemeDigits'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PaymentMethodsAdapter.TokenMethodViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mCardLogo = null;
    target.mCardSchemeDigits = null;
  }
}