package com.serega.multitype.core.adapter

import androidx.recyclerview.widget.DiffUtil

class TypeItemsDiffCallback : DiffUtil.ItemCallback<TypeDataHolder>() {
    override fun areItemsTheSame(oldItem: TypeDataHolder, newItem: TypeDataHolder): Boolean {
        return oldItem.areItemTheSame(newItem)
    }

    override fun areContentsTheSame(oldItem: TypeDataHolder, newItem: TypeDataHolder): Boolean {
        return oldItem.areContentTheSame(newItem)
    }

}