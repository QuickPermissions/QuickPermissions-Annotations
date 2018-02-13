package com.livinglifetechway.quickpermissions.annotations


/**
 * Permission Required annotation to safely execute code block requiring defined permissions
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class RequiresPermissions(
        val permissions: Array<String>,
        val rationaleMessage: String = "",
        val permanentlyDeniedMessage: String = "",
        val handleRationale: Boolean = true,
        val handlePermanentlyDenied: Boolean = true)

/**
 * Annotation for method to execute when it should handle rationale condition when permission is denied
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class OnShowRationale

/**
 * Annotation for method to execute when it should handle permissions permanently denied condition
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class OnPermissionsPermanentlyDenied

/**
 * Annotation for method to execute when it completes the permissions flow and the end result is
 * one or more permissions denied
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class OnPermissionsDenied