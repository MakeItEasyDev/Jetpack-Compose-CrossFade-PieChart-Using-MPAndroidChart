package com.jetpack.crossfadepiechart

data class PieChartItem(
    var key: String?,
    var value: Float?
)

//sample data
val getPieChartData = listOf(
    PieChartItem(
        "Java",
        30.0f
    ),
    PieChartItem(
        "Kotlin",
        35.0f
    ),
    PieChartItem(
        "Compose",
        35.0f
    )
)
