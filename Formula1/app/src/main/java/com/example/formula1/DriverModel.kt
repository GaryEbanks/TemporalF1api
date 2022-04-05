package com.example.formula1

import com.google.gson.annotations.SerializedName
import java.util.*

data class DriverModel (
    @SerializedName("givenName") var givenName:String?,
    @SerializedName("familyName") var familyName:String?,
    @SerializedName("dateOfBirth") var dateOfBirth:Date?,
    @SerializedName("nationality") var nationality:String?,
    @SerializedName("permanentNumber") var permanentNumber:Int?,
    @SerializedName("code") var code:String?
        )