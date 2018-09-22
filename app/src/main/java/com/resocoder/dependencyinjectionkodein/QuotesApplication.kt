package com.resocoder.dependencyinjectionkodein

import android.app.Application
import com.resocoder.dependencyinjectionkodein.data.db.Database
import com.resocoder.dependencyinjectionkodein.data.db.DatabaseFakeImpl
import com.resocoder.dependencyinjectionkodein.data.db.QuoteDao
import com.resocoder.dependencyinjectionkodein.data.db.QuoteDaoFakeImpl
import com.resocoder.dependencyinjectionkodein.data.repository.QuoteRepository
import com.resocoder.dependencyinjectionkodein.data.repository.QuoteRepositoryImpl
import com.resocoder.dependencyinjectionkodein.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton


class QuotesApplication : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        bind<Database>() with singleton { DatabaseFakeImpl() }
        bind<QuoteDao>() with singleton { instance<Database>().quoteDao }
        bind<QuoteRepository>() with singleton { QuoteRepositoryImpl(instance()) }
        bind() from provider { QuotesViewModelFactory(instance()) }
    }
}