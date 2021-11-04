package com.serega.multitype.domain

interface AdapterContentElement {

    fun areContentTheSame(other: AdapterContentElement): Boolean

    fun areItemTheSame(other: AdapterContentElement): Boolean
}