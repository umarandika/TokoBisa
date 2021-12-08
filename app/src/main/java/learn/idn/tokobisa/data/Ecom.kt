package learn.idn.tokobisa.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Ecom(
    var id: Int = 0,
    var title: String = "",
    var detail: String = "",
    var price: String = "",
    var image: Int = 0
): Parcelable