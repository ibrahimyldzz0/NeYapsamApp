package com.example.neyapsam

class DataRepository {
    val anaYemekler = listOf(
        Yemek(
            "Karnıyarık", R.drawable.karniyarik_background,
            "4 adet patlıcan\n200 gr kıyma\n1 adet soğan\n2 diş sarımsak\n2 adet domates\n1 adet yeşil biber\n1 yemek kaşığı salça\nTuz, karabiber\nSıvı yağ (kızartmak için)\n1 su bardağı su",
            "https://www.youtube.com/watch?v=brvuUWDqXw8"
        ),

        Yemek(
            "Etli Güveç", R.drawable.karniyarik_background,
            "500 gr kuşbaşı et\n2 adet patates\n2 adet patlıcan\n2 adet kabak\n2 adet domates\n1 adet soğan\n2 diş sarımsak\n1 yemek kaşığı salça\nTuz, karabiber, pul biber\n2 su bardağı su\nSıvı yağ",
            "https://www.youtube.com/watch?v=QV1ZwlCnoYk"
        ),

        Yemek(
            "Tavuk Sote", R.drawable.karniyarik_background,
            "500 gr tavuk göğsü\n1 adet soğan\n2 adet yeşil biber\n1 adet kırmızı biber\n2 adet domates\n2 diş sarımsak\n1 yemek kaşığı salça\nTuz, karabiber, kekik\nSıvı yağ",
            "https://www.youtube.com/watch?v=3wo7qr6PIU4"
        ),

        Yemek(
            "İzmir Köfte", R.drawable.karniyarik_background,
            "500 gr kıyma\n1 adet soğan\n1 adet yumurta\n2 dilim bayat ekmek içi\n4 adet patates\n2 adet domates\n2 adet yeşil biber\n1 yemek kaşığı salça\nTuz, karabiber, kimyon\nSıvı yağ",
            "https://www.youtube.com/watch?v=W8f6E3ryHvQ"
        ),

        Yemek(
            "Fırında Makarna", R.drawable.karniyarik_background,
            "1 paket makarna\n2 su bardağı süt\n2 yemek kaşığı un\n2 yemek kaşığı tereyağı\n1 su bardağı rendelenmiş kaşar peyniri\nTuz, karabiber",
            "https://www.youtube.com/watch?v=0R1i9ULSBWU"
        )
    )

    private val pilavlar = listOf(
        Yemek(
            "Pirinç Pilavı", R.drawable.karniyarik_background,
            "1 su bardağı pirinç\n1,5 su bardağı su\n1 yemek kaşığı tereyağı\n1 yemek kaşığı sıvı yağ\nTuz",
            "https://www.youtube.com/watch?v=asoXVOUJ80o"
        ),

        Yemek(
            "Bulgur Pilavı", R.drawable.karniyarik_background,
            "1 su bardağı bulgur\n1 adet soğan\n1 adet domates\n1 yemek kaşığı salça\n2 su bardağı su\nTuz, karabiber\nSıvı yağ",
            "https://www.youtube.com/watch?v=SirHOn5Fs2I"
        ),

        Yemek(
            "Şehriyeli Pilav", R.drawable.karniyarik_background,
            "1 su bardağı pirinç\n1/2 su bardağı şehriye\n1,5 su bardağı su\n1 yemek kaşığı tereyağı\nTuz",
            "https://www.youtube.com/watch?v=SXunoK3p3MM"
        ),

        Yemek(
            "Mercimekli Bulgur Pilavı", R.drawable.karniyarik_background,
            "1 su bardağı bulgur\n1/2 su bardağı yeşil mercimek\n1 adet soğan\n2 su bardağı su\n1 yemek kaşığı tereyağı\nTuz",
            "https://www.youtube.com/watch?v=7oo7x-2ZpFs"
        ),

        Yemek(
            "Sebzeli Bulgur Pilavı", R.drawable.karniyarik_background,
            "1 su bardağı bulgur\n1 adet havuç\n1 adet kabak\n1 adet kırmızı biber\n1 adet soğan\n2 su bardağı su\nTuz, karabiber\nSıvı yağ",
            "https://www.youtube.com/watch?v=0UkAco-fJKg"
        )
    )

    private val makarnalar = listOf(
        Yemek(
            "Spagetti Bolonez", R.drawable.karniyarik_background,
            "1 paket spagetti\n200 gr kıyma\n1 adet soğan\n2 diş sarımsak\n2 adet domates\n1 yemek kaşığı salça\nTuz, karabiber\nSıvı yağ",
            "https://www.youtube.com/watch?v=z3DSjSdghtU"
        ),

        Yemek(
            "Penne Arabiata", R.drawable.karniyarik_background,
            "1 paket penne makarna\n3 diş sarımsak\n4 adet domates\n1 tatlı kaşığı kırmızı pul biber\nTuz\nSıvı yağ",
            "https://www.youtube.com/watch?v=bSoQS758irQ"
        ),

        Yemek(
            "Fettucine Alfredo", R.drawable.karniyarik_background,
            "1 paket fettucine makarna\n200 ml krema\n2 yemek kaşığı tereyağı\n1/2 su bardağı rendelenmiş parmesan peyniri\nTuz, karabiber",
            "https://www.youtube.com/watch?v=zztgNQvbtPc"
        ),

        Yemek(
            "Makarna Salatası",
            R.drawable.karniyarik_background,
            "\n 1 su bardağı doğranmış kornişon turşu\n1 su bardağı yoğurt\n2 yemek kaşığı mayonez\nTuz, karabiber",
            "https://www.youtube.com/watch?v=FUBuaKfjJzI"
        ),

        Yemek(
            "Lazanya", R.drawable.karniyarik_background,
            "1 paket lazanya yaprağı\n300 gr kıyma\n1 adet soğan\n2 diş sarımsak\n2 adet domates\n2 yemek kaşığı salça\n1 su bardağı rendelenmiş kaşar peyniri\nTuz, karabiber\nBeşamel sos için:\n2 yemek kaşığı tereyağı\n2 yemek kaşığı un\n2 su bardağı süt\nTuz, karabiber",
            "https://www.youtube.com/watch?v=QBEdqnjRiqA"
        )
    )

    private val salatalar = listOf(
        Yemek(
            "Çoban Salatası", R.drawable.karniyarik_background,
            "3 adet domates\n1 adet salatalık\n1 adet soğan\n2 adet yeşil biber\n1/2 demet maydanoz\nZeytinyağı, limon suyu, tuz",
            "https://www.youtube.com/watch?v=xS121G16n0A"
        ),

        Yemek(
            "Yoğurtlu Semizotu Salatası", R.drawable.karniyarik_background,
            "1 demet semizotu\n1 su bardağı yoğurt\n2 diş sarımsak\n1 yemek kaşığı zeytinyağı\nTuz",
            "https://www.youtube.com/watch?v=YvGcJ81lB7Y"
        ),

        Yemek(
            "Marul Salatası", R.drawable.karniyarik_background,
            "1 adet kuru soğan\n 1 büyük kök marul\n 1 küçük boy kırmızı lahana\n 1-2 adet orta boy havuç\n Limon suyu\n Tuz\n 4 çorba kaşığı zeytinyağı\n 1 fincan sirke",
            "https://www.youtube.com/watch?v=LEujohveXwg"
        ),

        Yemek(
            "Akdeniz Salatası", R.drawable.karniyarik_background,
            "1 adet marul\n1 adet kırmızı biber\n1 adet salatalık\n1/2 su bardağı zeytin\n100 gr beyaz peynir\nZeytinyağı, limon suyu, tuz",
            "https://www.youtube.com/watch?v=bX_UKCaFlCw"
        ),

        Yemek(
            "Mevsim Salatası", R.drawable.karniyarik_background,
            "1 adet marul\n1 adet havuç\n1 adet kırmızı lahana\n1 adet salatalık\nZeytinyağı, limon suyu, tuz",
            "https://www.youtube.com/watch?v=CPgeFixLG3o"
        )
    )

    private val mezeler = listOf(
        Yemek(
            "Haydari", R.drawable.karniyarik_background,
            "1 su bardağı süzme yoğurt\n2 diş sarımsak\n2 yemek kaşığı beyaz peynir\n1 yemek kaşığı zeytinyağı\n1 yemek kaşığı dereotu\nTuz",
            "https://www.youtube.com/watch?v=MdfH3rjEW4k"
        ),

        Yemek(
            "Humus", R.drawable.karniyarik_background,
            "1 su bardağı nohut (haşlanmış)\n2 yemek kaşığı tahin\n2 diş sarımsak\n1 limonun suyu\n1/4 su bardağı zeytinyağı\nKimyon, tuz, kırmızı biber",
            "https://www.youtube.com/watch?v=XD8hWdGCCWc"
        ),

        Yemek(
            "Kısır", R.drawable.karniyarik_background,
            "2 su bardağı ince bulgur\n2 yemek kaşığı biber salçası\n1 adet soğan\n3 adet domates\n1 adet salatalık\n1 demet maydanoz\n1 demet taze soğan\nZeytinyağı, nar ekşisi, tuz, karabiber",
            "https://www.youtube.com/watch?v=WtQ2Q39NZPc"
        ),

        Yemek(
            "Acılı Ezme", R.drawable.karniyarik_background,
            "3 adet domates\n1 adet soğan\n2 adet yeşil biber\n2 diş sarımsak\n1 yemek kaşığı biber salçası\n1 yemek kaşığı nar ekşisi\n1 çay kaşığı kırmızı pul biber\nTuz, karabiber, zeytinyağı",
            "https://www.youtube.com/watch?v=q_W6Hy9cyqk"
        ),

        Yemek(
            "Babagannuş", R.drawable.karniyarik_background,
            "2 adet patlıcan\n2 diş sarımsak\n1 yemek kaşığı tahin\n2 yemek kaşığı zeytinyağı\n1 limonun suyu\nTuz, karabiber, kırmızı biber",
            "https://www.youtube.com/watch?v=9xtKg_F_fTg"
        )
    )

    private val tatlilar = listOf(
        Yemek(
            "Baklava", R.drawable.karniyarik_background,
            "1 paket hazır baklava yufkası\n2 su bardağı ceviz içi\n250 gr tereyağı\n3 su bardağı şeker\n2 su bardağı su\n1 dilim limon",
            "https://www.youtube.com/watch?v=Ehf8igYTJVk"
        ),

        Yemek(
            "Sütlaç", R.drawable.karniyarik_background,
            "1 litre süt\n1 su bardağı pirinç\n1,5 su bardağı şeker\n2 yemek kaşığı nişasta\n1 paket vanilya",
            "https://www.youtube.com/watch?v=vCzTZP9hv5M"
        ),

        Yemek(
            "Şekerpare", R.drawable.karniyarik_background,
            "125 gr tereyağı\n1 su bardağı un\n1 su bardağı irmik\n1 su bardağı şeker\n2 adet yumurta\n1 paket kabartma tozu\n1 paket vanilya\nŞerbet için:\n2 su bardağı su\n2 su bardağı şeker\n1 dilim limon",
            "https://www.youtube.com/watch?v=CdOpexuxoBo"
        ),

        Yemek(
            "Muhallebi", R.drawable.karniyarik_background,
            "1 litre süt\n1 su bardağı şeker\n3 yemek kaşığı un\n2 yemek kaşığı nişasta\n1 yemek kaşığı tereyağı\n1 paket vanilya",
            "https://www.youtube.com/watch?v=PcrycQyGstg"
        ),

        Yemek(
            "Tiramisu", R.drawable.karniyarik_background,
            "1 paket kedi dili bisküvi\n2 su bardağı süt\n2 yemek kaşığı un\n2 yemek kaşığı şeker\n1 paket labne peyniri\n1 yemek kaşığı nescafe\nKakao",
            "https://www.youtube.com/watch?v=CcdP11ExXgY"
        ),

        )
}
