package com.serega.multitype.domain.entity

import com.serega.multitype.domain.AdapterContentElement

class Movie(val id: String, val name: String, val rating: String) : AdapterContentElement {


    override fun areItemTheSame(other: AdapterContentElement): Boolean {
        if (other !is Movie) return false
        return id == other.id
    }

    override fun areContentTheSame(other: AdapterContentElement): Boolean {
        if (other !is Movie) return false

        return id == other.id
                && name == other.name
                && rating == other.rating
    }

}