package com.plcoding.bookpedia.book.data.network

import com.plcoding.bookpedia.book.data.dto.SearchResponseDto
import com.plcoding.bookpedia.core.data.safeCall
import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.Result
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter

private const val BASE_URL = "https://openlibrary.org/"

class KtorRemoteBookDataSource(
    private val httpClient: HttpClient
):RemoteBookDataSource {
    override suspend fun searchBooks(
        query: String,
        resultsLimit: Int?
    ): Result<SearchResponseDto,DataError.Remote>{
        return safeCall {
            httpClient.get("$BASE_URL/search.json")
            {
                parameter("q", query)
                parameter("limit", resultsLimit)
                parameter("language", "eng")
                parameter("fields", "key,title,language,cover_i,author_key,author_name,cover_edition_key,first_publish_year,ratings_average,ratings_count,num_pages_median,edition_count")
            }
        }
    }
}