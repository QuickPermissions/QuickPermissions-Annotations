package com.livinglifetechway.quickpermissions.util

import java.lang.reflect.Method

data class QuickPermissionsRequest(
        private var target: PermissionCheckerFragment,
        var permissions: Array<String> = emptyArray(),
        var handleRationale: Boolean = true,
        var rationaleMessage: String = "",
        var handlePermanentlyDenied: Boolean = true,
        var permanentlyDeniedMessage: String = "",
        internal var rationaleMethod: Method? = null,
        internal var permanentDeniedMethod: Method? = null,
        internal var permissionsDeniedMethod: Method? = null,
        var deniedPermissions: Array<String> = emptyArray(),
        var permanentlyDeniedPermissions: Array<String> = emptyArray()
) {
    /**
     * Proceed with requesting permissions again with user request
     */
    fun proceed() = target.requestPermissionsFromUser()

    /**
     * Cancels the current permissions request flow
     */
    fun cancel() = target.clean()

    /**
     * In case of permissions permanently denied, request user to enable from app settings
     */
    fun openAppSettings() = target.openAppSettings()
}