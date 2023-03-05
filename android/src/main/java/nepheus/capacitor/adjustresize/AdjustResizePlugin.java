package nepheus.capacitor.adjustresize;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

import com.getcapacitor.Plugin;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "AdjustResize")
public class AdjustResizePlugin extends Plugin {
    private View decorView;
    private View contentView;
    private int additionalSpacing;
    private int lastOrientation = -1;

    public void load() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            this.decorView = getActivity().getWindow().getDecorView();
            this.contentView = ((ViewGroup) decorView.findViewById(android.R.id.content)).getChildAt(0);

            decorView.getViewTreeObserver().addOnGlobalLayoutListener(() -> {
                Rect r = new Rect();
                decorView.getWindowVisibleDisplayFrame(r);

                int height = decorView.getContext().getResources().getDisplayMetrics().heightPixels;
                int orientation = getActivity().getResources().getConfiguration().orientation;

                if (orientation != lastOrientation) {
                    lastOrientation = orientation;
                    additionalSpacing = (height - r.bottom) * -1;
                }

                int diff = height + additionalSpacing - r.bottom;
                if (contentView.getPaddingBottom() != diff) {
                    contentView.setPadding(0, 0, 0, diff);
                }
            });
        }
    }
}
