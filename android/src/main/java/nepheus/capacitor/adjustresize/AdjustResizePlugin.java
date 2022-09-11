package nepheus.capacitor.adjustresize;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

import com.getcapacitor.Plugin;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "AdjustResize")
public class AdjustResizePlugin extends Plugin {
    private View decorView;
    private View contentView;
    private int additionalSpacing = -1;

    public void load() {
        //only required on newer android versions. it was working on API level 19 (Build.VERSION_CODES.KITKAT)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            this.decorView = getActivity().getWindow().getDecorView();
            this.contentView = ((ViewGroup) decorView.findViewById(android.R.id.content)).getChildAt(0);
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
        @Override
        public void onGlobalLayout() {
            //r will be populated with the coordinates of your view that area still visible.
            Rect r = new Rect();
            decorView.getWindowVisibleDisplayFrame(r);

            //get screen height and calculate the difference with the useable area from the r
            int height = decorView.getContext().getResources().getDisplayMetrics().heightPixels;

            if (additionalSpacing == -1) {
                //get additional spacing that could be caused by elements like the status bar
                additionalSpacing = (height - r.bottom) * -1;
            }

            int diff = height + additionalSpacing - r.bottom;
            if (contentView.getPaddingBottom() != diff) {
                contentView.setPadding(0, 0, 0, diff);
            }
        }
    };
}
