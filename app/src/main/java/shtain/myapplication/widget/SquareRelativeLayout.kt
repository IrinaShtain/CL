package shtain.myapplication.widget

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout

/**
 * Created by Irina Shtain on 24.04.2019.
 */

class SquareRelativeLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : RelativeLayout(context, attrs, defStyleAttr) {
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val size = Math.min(widthMeasureSpec, heightMeasureSpec)
        super.onMeasure(size, size)
    }
}