package com.resocoder.dependencyinjectionkodein.data.repository

import androidx.lifecycle.LiveData
import com.resocoder.dependencyinjectionkodein.data.model.Quote


interface QuoteRepository {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}