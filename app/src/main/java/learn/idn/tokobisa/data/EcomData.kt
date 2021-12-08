package learn.idn.tokobisa.data

import learn.idn.tokobisa.R

object EcomData {

    private val titleHome = arrayOf(
        "Baju Anak",
        "Baju Dewasa",
        "Baju Main",
        "Baju Renang",
        "Baju Tidur"
    )

    private val detailHome = arrayOf(
        "Lorem ipsum dolor dit amet",
        "Lorem ipdswwfwamet",
        "Lorekadowoqolor dit amet",
        "Lorem ipor dit amet",
        "Lorem ipsum do amet"
    )

    private val imageHome = intArrayOf(
        R.drawable.shirt,
        R.drawable.androidcert,
        R.drawable.kotlincert,
        R.drawable.pythoncert,
        R.drawable.solidcert
    )

    private val priceHome = arrayOf(
        "rp 20.000",
        "rp 30.000",
        "rp 40.000",
        "rp 60.000",
        "rp 100.000"
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

}