package com.kotlin.recyclerviewcoroutines.Models

data class Result(
    val tags: List<String>,
    val id: String,
    val author: String,
    val content: String,
    val authorSlug: String,
    val length: Long,
    val dateAdded: String,
    val dateModified: String
)