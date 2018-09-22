package com.resocoder.dependencyinjectionkodein.data.db

import androidx.lifecycle.LiveData
import com.resocoder.dependencyinjectionkodein.data.model.Quote


interface QuoteDao {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}