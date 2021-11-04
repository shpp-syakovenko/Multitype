package com.serega.multitype.domain.entity

import com.serega.multitype.domain.AdapterContentElement

class Comment(val id: String, val body: String) : AdapterContentElement {

    override fun areItemTheSame(other: AdapterContentElement): Boolean {
        if (other !is Comment) return false
        return id == other.id
    }

    override fun areContentTheSame(other: AdapterContentElement): Boolean {
        if (other !is Comment) return false

        return id == other.id
                && body == other.body
    }

}