package shtain.myapplication.widget

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet

/**
 * Created by Irina Shtain on 24.04.2019.
 */
class SquareConstraintLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val size = Math.min(widthMeasureSpec, heightMeasureSpec)
        super.onMeasure(size, size)
    }
}