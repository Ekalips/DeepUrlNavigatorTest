package com.ekalips.navigatortest.data

object MockData {

    fun pageWithTitle(title: String?): Pair<String, String>? {
        return pages.first { it.first == title }
    }


    val pages = listOf(
            "Page1" to "Page 1 subtitle",
            "Page2" to "Page 2 subtitle",
            "Page3" to "Page 3 subtitle",
            "Page4" to "Page 4 subtitle",
            "Page5" to "Page 5 subtitle",
            "Page6" to "Page 6 subtitle",
            "Page7" to "Page 7 subtitle"
    )

}