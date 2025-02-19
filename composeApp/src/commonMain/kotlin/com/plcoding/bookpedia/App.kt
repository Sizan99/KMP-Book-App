package com.plcoding.bookpedia

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.plcoding.bookpedia.book.data.network.KtorRemoteBookDataSource
import com.plcoding.bookpedia.book.data.repository.DefaultBookRepository
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.plcoding.bookpedia.book.presentation.book_list.BookListViewModel
import com.plcoding.bookpedia.core.data.HttpClientFactory
import io.ktor.client.engine.HttpClientEngine
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App(engine: HttpClientEngine) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerpadding ->
        BookListScreenRoot(
            viewModel = remember {
                BookListViewModel(
                    bookRepository = DefaultBookRepository(
                        remoteBookDataSource = KtorRemoteBookDataSource(
                            httpClient = HttpClientFactory.create(engine)
                        )
                    )
                )
            },
            onBookClick = {}
        )

    }

}