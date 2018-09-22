package com.resocoder.dependencyinjectionkodein.data.repository

import com.resocoder.dependencyinjectionkodein.data.db.QuoteDao
import com.resocoder.dependencyinjectionkodein.data.model.Quote


class QuoteRepositoryImpl(private val quoteDao: QuoteDao)
    : QuoteRepository {
    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuotes() = quoteDao.getQuotes()
}