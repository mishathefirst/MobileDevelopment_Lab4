package group.moveon.lab2_nogovitsyn.data

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Android(val title: String, @DrawableRes val imageAndroid: Int) : Parcelable