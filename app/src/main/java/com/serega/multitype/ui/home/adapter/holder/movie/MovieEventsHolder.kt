package com.serega.multitype.ui.home.adapter.holder.movie

import com.serega.multitype.core.adapter.TypeEventsHolder
import com.serega.multitype.ui.home.adapter.listener.MovieClickListener

class MovieEventsHolder : TypeEventsHolder {
    var movieClickListener: MovieClickListener? = null
}