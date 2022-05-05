package com.makaota.myshoppal.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


// Create a data model class for Address details.
/**
 * A data model class for Address item with required fields.
 */
@Parcelize
data class Address(
    val user_id: String = "",
    val name: String = "",
    val mobileNumber: String = "",

    val address: String = "",
    val zipCode: String = "",
    val additionalNote: String = "",

    val type: String = "",
    val otherDetails: String = "",
    var id: String = "",
) : Parcelable