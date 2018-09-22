package com.resocoder.dependencyinjectionkodein.ui.quotes

import androidx.lifecycle.ViewModel
import com.resocoder.dependencyinjectionkodein.data.model.Quote
import com.resocoder.dependencyinjectionkodein.data.repository.QuoteRepository


class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

    fun getQuotes() = quoteRepository.getQuotes()
}