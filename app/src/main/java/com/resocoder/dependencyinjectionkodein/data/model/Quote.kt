package com.resocoder.dependencyinjectionkodein.data.model


data class Quote(val text: String,
                 val author: String) {
    override fun toString(): String {
        return "$text - $author"
    }
}