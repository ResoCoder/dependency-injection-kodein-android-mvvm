package com.resocoder.dependencyinjectionkodein.data.db


class DatabaseFakeImpl : Database {
    override val quoteDao: QuoteDao = QuoteDaoFakeImpl()
}