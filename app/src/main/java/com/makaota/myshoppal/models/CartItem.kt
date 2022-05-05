package com.makaota.myshoppal.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


// TCreate a data model class for Cart item with required fields.
// START
/**
 * A data model class for Cart item with required fields.
 */
@Parcelize
data class CartItem(
    val user_id: String = "",
    val product_owner_id: String = "",
    val product_id: String = "",
    val title: String = "",
    val price: String = "",
    val image: String = "",
    var cart_quantity: String = "",
    var stock_quantity: String = "",
    var id: String = "",
) : Parcelable
// END