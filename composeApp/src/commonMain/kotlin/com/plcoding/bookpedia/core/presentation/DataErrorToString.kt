package com.plcoding.bookpedia.core.presentation

import cmp_bookpedia.composeapp.generated.resources.Res
import cmp_bookpedia.composeapp.generated.resources.error_DISK_FULL
import cmp_bookpedia.composeapp.generated.resources.error_NO_INTERNET_CONNECTION
import cmp_bookpedia.composeapp.generated.resources.error_REQUEST_TIMEOUT
import cmp_bookpedia.composeapp.generated.resources.error_SERIALIZATION_ERROR
import cmp_bookpedia.composeapp.generated.resources.error_SERVER_ERROR
import cmp_bookpedia.composeapp.generated.resources.error_TOO_MANY_REQUESTS
import cmp_bookpedia.composeapp.generated.resources.error_UNKNOWN_ERROR
import cmp_bookpedia.composeapp.generated.resources.error_UNKNOWN_LOCAL_ERROR
import com.plcoding.bookpedia.core.domain.DataError

fun DataError.toUiText(): UiText {
    val stringRes =  when(this) {
        DataError.Local.UNKNOWN_ERROR -> Res.string.error_UNKNOWN_LOCAL_ERROR
        DataError.Remote.NO_INTERNET_CONNECTION -> Res.string.error_NO_INTERNET_CONNECTION
        DataError.Remote.REQUEST_TIMEOUT -> Res.string.error_REQUEST_TIMEOUT
        DataError.Remote.SERVER_ERROR -> Res.string.error_SERVER_ERROR
        DataError.Remote.TOO_MANY_REQUESTS -> Res.string.error_TOO_MANY_REQUESTS
        DataError.Remote.SERIALIZATION_ERROR -> Res.string.error_SERIALIZATION_ERROR
        DataError.Local.DISK_FULL -> Res.string.error_DISK_FULL
        DataError.Remote.UNKNOWN_ERROR -> Res.string.error_UNKNOWN_ERROR
    }
    return UiText.StringResourceId(stringRes)
}