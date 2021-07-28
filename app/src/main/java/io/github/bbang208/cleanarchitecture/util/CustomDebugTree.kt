package io.github.bbang208.cleanarchitecture.util

import timber.log.Timber

class CustomDebugTree : Timber.DebugTree() {
    override fun createStackElementTag(element: StackTraceElement): String {
        return String.format(
            "[M:%s][%s:%s]",
            element.methodName,
            super.createStackElementTag(element),
            element.lineNumber
        )
    }
}