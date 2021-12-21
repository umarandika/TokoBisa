package learn.idn.tokobisa.data

import learn.idn.tokobisa.R

object EcomData {

    //HOME
    private val titleHome = arrayOf(
        "Baju Anak",
        "Baju Dewasa",
        "Baju Main",
        "Baju Koko",
        "Baju Tidur"
    )

    private val detailHome = arrayOf(
        "Baju Anak",
        "Baju Dewasa",
        "Baju Main",
        "Baju Koko",
        "Baju Tidur"
    )

    private val imageHome = intArrayOf(
        R.drawable.shirt,
        R.drawable.dewasa,
        R.drawable.main,
        R.drawable.koko,
        R.drawable.tidur
    )

    private val priceHome = arrayOf(
        "Rp 20.000",
        "Rp 30.000",
        "Rp 40.000",
        "Rp 60.000",
        "Rp 100.000"
        )

    // BOOKMARK
    private val titleBook = arrayOf(
        "Baju Anak",
        "Baju Dewasa"
    )

    private val detailBook = arrayOf(
        "Baju Anak",
        "Baju Dewasa"
    )

    private val imageBook = intArrayOf(
        R.drawable.shirt,
        R.drawable.dewasa
    )

    private val priceBook = arrayOf(
        "Rp 20.000",
        "Rp 30.000"
    )



    val listDataEcom: ArrayList<Ecom>
        get() {
            val list = arrayListOf<Ecom>()
            for (position in titleHome.indices) {
                val home = Ecom()
                home.title = titleHome[position]
                home.detail = detailHome[position]
                home.image = imageHome[position]
                home.price = priceHome[position]




                list.add(home)
            }

            return list
        }

    val listDataEcomm: ArrayList<Ecom>
        get() {
            val lists = arrayListOf<Ecom>()
            for (position in titleBook.indices) {
                val book = Ecom()
                book.title = titleBook[position]
                book.detail = detailBook[position]
                book.image = imageBook[position]
                book.price = priceBook[position]




                lists.add(book)
            }

            return lists
        }


}