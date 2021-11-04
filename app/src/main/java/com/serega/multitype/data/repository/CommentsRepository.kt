package com.serega.multitype.data.repository

import com.serega.multitype.domain.entity.Comment

interface CommentsRepository {

    suspend  fun loadComments(): List<Comment>
}