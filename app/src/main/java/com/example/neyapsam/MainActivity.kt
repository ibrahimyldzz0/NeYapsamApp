package com.example.neyapsam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.Serializable


class MainActivity : AppCompatActivity() {

    private var backPressedTime: Long = 0 //çıkış yapma kodu

    private val anaYemekler = listOf(
        Yemek(
            "Karnıyarık", R.mipmap.karniyarikyeni_foreground,
            "4 adet patlıcan\n200 gr kıyma\n1 adet soğan\n2 diş sarımsak\n2 adet domates\n1 adet yeşil biber\n1 yemek kaşığı salça\nTuz, karabiber\nSıvı yağ (kızartmak için)\n1 su bardağı su",
            "https://www.youtube.com/watch?v=brvuUWDqXw8"
        ),

        Yemek(
            "Etli Güveç", R.mipmap.etliguvecyeni_foreground,
            "500 gr kuşbaşı et\n2 adet patates\n2 adet patlıcan\n2 adet kabak\n2 adet domates\n1 adet soğan\n2 diş sarımsak\n1 yemek kaşığı salça\nTuz, karabiber, pul biber\n2 su bardağı su\nSıvı yağ",
            "https://www.youtube.com/watch?v=QV1ZwlCnoYk"
        ),

        Yemek(
            "Tavuk Sote", R.mipmap.tavuksoteyeni_foreground,
            "500 gr tavuk göğsü\n1 adet soğan\n2 adet yeşil biber\n1 adet kırmızı biber\n2 adet domates\n2 diş sarımsak\n1 yemek kaşığı salça\nTuz, karabiber, kekik\nSıvı yağ",
            "https://www.youtube.com/watch?v=3wo7qr6PIU4"
        ),

        Yemek(
            "İzmir Köfte", R.mipmap.izmirkofteyeni_foreground,
            "500 gr kıyma\n1 adet soğan\n1 adet yumurta\n2 dilim bayat ekmek içi\n4 adet patates\n2 adet domates\n2 adet yeşil biber\n1 yemek kaşığı salça\nTuz, karabiber, kimyon\nSıvı yağ",
            "https://www.youtube.com/watch?v=W8f6E3ryHvQ"
        ),

        Yemek(
            "Fırında Makarna", R.mipmap.firindamakarnayeni_foreground,
            "1 paket makarna\n2 su bardağı süt\n2 yemek kaşığı un\n2 yemek kaşığı tereyağı\n1 su bardağı rendelenmiş kaşar peyniri\nTuz, karabiber",
            "https://www.youtube.com/watch?v=0R1i9ULSBWU"
        )
    )

    private val pilavlar = listOf(
        Yemek(
            "Pirinç Pilavı", R.mipmap.pirincpilaviyeniyeni_foreground,
            "1 su bardağı pirinç\n1,5 su bardağı su\n1 yemek kaşığı tereyağı\n1 yemek kaşığı sıvı yağ\nTuz",
            "https://www.youtube.com/watch?v=asoXVOUJ80o"
        ),

        Yemek(
            "Bulgur Pilavı", R.mipmap.bulgurpilaviyeni_foreground,
            "1 su bardağı bulgur\n1 adet soğan\n1 adet domates\n1 yemek kaşığı salça\n2 su bardağı su\nTuz, karabiber\nSıvı yağ",
            "https://www.youtube.com/watch?v=SirHOn5Fs2I"
        ),

        Yemek(
            "Şehriyeli Pilav", R.mipmap.sehriyelipilavyeni_foreground,
            "1 su bardağı pirinç\n1/2 su bardağı şehriye\n1,5 su bardağı su\n1 yemek kaşığı tereyağı\nTuz",
            "https://www.youtube.com/watch?v=SXunoK3p3MM"
        ),

        Yemek(
            "Mercimekli Bulgur Pilavı", R.mipmap.mercimeklibulgurpilavyeni_foreground,
            "1 su bardağı bulgur\n1/2 su bardağı yeşil mercimek\n1 adet soğan\n2 su bardağı su\n1 yemek kaşığı tereyağı\nTuz",
            "https://www.youtube.com/watch?v=7oo7x-2ZpFs"
        ),

        Yemek(
            "Sebzeli Bulgur Pilavı", R.mipmap.sebzelibulgurpilavyeni_foreground,
            "1 su bardağı bulgur\n1 adet havuç\n1 adet kabak\n1 adet kırmızı biber\n1 adet soğan\n2 su bardağı su\nTuz, karabiber\nSıvı yağ",
            "https://www.youtube.com/watch?v=0UkAco-fJKg"
        )
    )

    private val makarnalar = listOf(
        Yemek(
            "Spagetti Bolonez", R.mipmap.spagettibolonezyeni_foreground,
            "1 paket spagetti\n200 gr kıyma\n1 adet soğan\n2 diş sarımsak\n2 adet domates\n1 yemek kaşığı salça\nTuz, karabiber\nSıvı yağ",
            "https://www.youtube.com/watch?v=z3DSjSdghtU"
        ),

        Yemek(
            "Penne Arabiata", R.mipmap.pennearabiatayeni_foreground,
            "1 paket penne makarna\n3 diş sarımsak\n4 adet domates\n1 tatlı kaşığı kırmızı pul biber\nTuz\nSıvı yağ",
            "https://www.youtube.com/watch?v=bSoQS758irQ"
        ),

        Yemek(
            "Fettucine Alfredo", R.mipmap.fettucinialfrredoyeni_foreground,
            "1 paket fettucine makarna\n200 ml krema\n2 yemek kaşığı tereyağı\n1/2 su bardağı rendelenmiş parmesan peyniri\nTuz, karabiber",
            "https://www.youtube.com/watch?v=zztgNQvbtPc"
        ),

        Yemek(
            "Makarna Salatası",
            R.mipmap.makarnasalatasiyeni_foreground,
            "\n 1 su bardağı doğranmış kornişon turşu\n1 su bardağı yoğurt\n2 yemek kaşığı mayonez\nTuz, karabiber",
            "https://www.youtube.com/watch?v=FUBuaKfjJzI"
        ),

        Yemek(
            "Lazanya", R.mipmap.lazanyayeni_foreground,
            "1 paket lazanya yaprağı\n300 gr kıyma\n1 adet soğan\n2 diş sarımsak\n2 adet domates\n2 yemek kaşığı salça\n1 su bardağı rendelenmiş kaşar peyniri\nTuz, karabiber\nBeşamel sos için:\n2 yemek kaşığı tereyağı\n2 yemek kaşığı un\n2 su bardağı süt\nTuz, karabiber",
            "https://www.youtube.com/watch?v=QBEdqnjRiqA"
        )
    )

    private val salatalar = listOf(
        Yemek(
            "Çoban Salatası", R.mipmap.cobansalatayeni_foreground,
            "3 adet domates\n1 adet salatalık\n1 adet soğan\n2 adet yeşil biber\n1/2 demet maydanoz\nZeytinyağı, limon suyu, tuz",
            "https://www.youtube.com/watch?v=xS121G16n0A"
        ),

        Yemek(
            "Yoğurtlu Semizotu Salatası", R.mipmap.semizotuyeni_foreground,
            "1 demet semizotu\n1 su bardağı yoğurt\n2 diş sarımsak\n1 yemek kaşığı zeytinyağı\nTuz",
            "https://www.youtube.com/watch?v=YvGcJ81lB7Y"
        ),

        Yemek(
            "Marul Salatası", R.mipmap.marulsalatayeni_foreground,
            "1 adet kuru soğan\n 1 büyük kök marul\n 1 küçük boy kırmızı lahana\n 1-2 adet orta boy havuç\n Limon suyu\n Tuz\n 4 çorba kaşığı zeytinyağı\n 1 fincan sirke",
            "https://www.youtube.com/watch?v=LEujohveXwg"
        ),

        Yemek(
            "Akdeniz Salatası", R.mipmap.akdemzisalatasiyeni_foreground,
            "1 adet marul\n1 adet kırmızı biber\n1 adet salatalık\n1/2 su bardağı zeytin\n100 gr beyaz peynir\nZeytinyağı, limon suyu, tuz",
            "https://www.youtube.com/watch?v=bX_UKCaFlCw"
        ),

        Yemek(
            "Mevsim Salatası", R.mipmap.mevsimsalatasyeni_foreground,
            "1 adet marul\n1 adet havuç\n1 adet kırmızı lahana\n1 adet salatalık\nZeytinyağı, limon suyu, tuz",
            "https://www.youtube.com/watch?v=CPgeFixLG3o"
        )
    )

    private val mezeler = listOf(
        Yemek(
            "Haydari", R.mipmap.haydariyeni_foreground,
            "1 su bardağı süzme yoğurt\n2 diş sarımsak\n2 yemek kaşığı beyaz peynir\n1 yemek kaşığı zeytinyağı\n1 yemek kaşığı dereotu\nTuz",
            "https://www.youtube.com/watch?v=MdfH3rjEW4k"
        ),

        Yemek(
            "Humus", R.mipmap.humusyeni_foreground,
            "1 su bardağı nohut (haşlanmış)\n2 yemek kaşığı tahin\n2 diş sarımsak\n1 limonun suyu\n1/4 su bardağı zeytinyağı\nKimyon, tuz, kırmızı biber",
            "https://www.youtube.com/watch?v=XD8hWdGCCWc"
        ),

        Yemek(
            "Kısır", R.mipmap.kisiryeni_foreground,
            "2 su bardağı ince bulgur\n2 yemek kaşığı biber salçası\n1 adet soğan\n3 adet domates\n1 adet salatalık\n1 demet maydanoz\n1 demet taze soğan\nZeytinyağı, nar ekşisi, tuz, karabiber",
            "https://www.youtube.com/watch?v=WtQ2Q39NZPc"
        ),

        Yemek(
            "Acılı Ezme", R.mipmap.aciliezmeyeni_foreground,
            "3 adet domates\n1 adet soğan\n2 adet yeşil biber\n2 diş sarımsak\n1 yemek kaşığı biber salçası\n1 yemek kaşığı nar ekşisi\n1 çay kaşığı kırmızı pul biber\nTuz, karabiber, zeytinyağı",
            "https://www.youtube.com/watch?v=q_W6Hy9cyqk"
        ),

        Yemek(
            "Babagannuş", R.mipmap.babagannusyeni_foreground,
            "2 adet patlıcan\n2 diş sarımsak\n1 yemek kaşığı tahin\n2 yemek kaşığı zeytinyağı\n1 limonun suyu\nTuz, karabiber, kırmızı biber",
            "https://www.youtube.com/watch?v=9xtKg_F_fTg"
        )
    )

    private val tatlilar = listOf(
        Yemek(
            "Baklava", R.mipmap.baklavayeni_foreground,
            "1 paket hazır baklava yufkası\n2 su bardağı ceviz içi\n250 gr tereyağı\n3 su bardağı şeker\n2 su bardağı su\n1 dilim limon",
            "https://www.youtube.com/watch?v=Ehf8igYTJVk"
        ),

        Yemek(
            "Sütlaç", R.mipmap.sutlacyeni_foreground,
            "1 litre süt\n1 su bardağı pirinç\n1,5 su bardağı şeker\n2 yemek kaşığı nişasta\n1 paket vanilya",
            "https://www.youtube.com/watch?v=vCzTZP9hv5M"
        ),

        Yemek(
            "Şekerpare", R.mipmap.sekerpareyeni_foreground,
            "125 gr tereyağı\n1 su bardağı un\n1 su bardağı irmik\n1 su bardağı şeker\n2 adet yumurta\n1 paket kabartma tozu\n1 paket vanilya\nŞerbet için:\n2 su bardağı su\n2 su bardağı şeker\n1 dilim limon",
            "https://www.youtube.com/watch?v=CdOpexuxoBo"
        ),

        Yemek(
            "Muhallebi", R.mipmap.muhallebiyeni_foreground,
            "1 litre süt\n1 su bardağı şeker\n3 yemek kaşığı un\n2 yemek kaşığı nişasta\n1 yemek kaşığı tereyağı\n1 paket vanilya",
            "https://www.youtube.com/watch?v=PcrycQyGstg"
        ),

        Yemek(
            "Tiramisu", R.mipmap.tramisuyeni_foreground,
            "1 paket kedi dili bisküvi\n2 su bardağı süt\n2 yemek kaşığı un\n2 yemek kaşığı şeker\n1 paket labne peyniri\n1 yemek kaşığı nescafe\nKakao",
            "https://www.youtube.com/watch?v=CcdP11ExXgY"
        ),

        )
    private val kahvaltilar = listOf(
        Yemek(
            "Menemen", R.mipmap.menemenyenii_foreground,
            "2 adet domates\n2 adet yeşil biber\n3 adet yumurta\n1 yemek kaşığı zeytinyağı\nTuz ve karabiber",
            "https://www.youtube.com/watch?v=GaduRIkOYzA"
        ),

        Yemek(
            "Sahanda Yumurta", R.mipmap.sahandayumurtayeni_foreground,
            "2 adet yumurta\n1 yemek kaşığı tereyağı\nTuz ve karabiber\nİsteğe bağlı: sucuk, pastırma",
            "https://www.youtube.com/watch?v=nSZcwJ0UVaU"
        ),

        Yemek(
            "Patatesli Yumurta", R.mipmap.patatesliyumurtayenii_foreground,
            "2 adet yumurta\n1 adet orta boy patates\n1 yemek kaşığı tereyağı\n1 adet soğan (isteğe bağlı)\nTuz ve karabiber\nKısmi olarak: biber, domates",
            "https://www.youtube.com/watch?v=j4qCD7Xj-4E"
        ),

        Yemek(
            "Peynirli Börek", R.mipmap.peynirliborekyeni_foreground,
            "4 adet yufka\n200 gr beyaz peynir\n100 gr lor peyniri\n1 yumurta\nYarım su bardağı sıvı yağ\nİsteğe bağlı: maydanoz",
            "https://www.youtube.com/watch?v=jKgkzDpJ_dI"
        ),

        Yemek(
            "Sucuklu Yumurta", R.mipmap.sucukluyumurtayenii_foreground,
            "2 adet yumurta\n100 gr sucuk\n1 yemek kaşığı tereyağı\nTuz ve karabiber",
            "https://www.youtube.com/watch?v=CqB-DOaGl6c"
        )
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Butonları bul
        val buttonAnaYemek = findViewById<Button>(R.id.button8)
        val buttonPilav = findViewById<Button>(R.id.button3)
        val buttonMakarna = findViewById<Button>(R.id.button7)
        val buttonSalata = findViewById<Button>(R.id.button4)
        val buttonMeze = findViewById<Button>(R.id.button6)
        val buttonTatli = findViewById<Button>(R.id.button5)
        val buttonKahvalti = findViewById<Button>(R.id.button9)

        // Butonlara tıklama olaylarını ekle
        buttonAnaYemek.setOnClickListener { openMealDetailActivity(anaYemekler) }
        buttonPilav.setOnClickListener { openMealDetailActivity(pilavlar) }
        buttonMakarna.setOnClickListener { openMealDetailActivity(makarnalar) }
        buttonSalata.setOnClickListener { openMealDetailActivity(salatalar) }
        buttonMeze.setOnClickListener { openMealDetailActivity(mezeler) }
        buttonTatli.setOnClickListener { openMealDetailActivity(tatlilar) }
        buttonKahvalti.setOnClickListener { openMealDetailActivity(kahvaltilar) }
    }


    private fun openMealDetailActivity(yemekListesi: List<Yemek>) {
        val intent = Intent(this, MealDetailActivity::class.java)
        intent.putExtra("yemekListesi", ArrayList(yemekListesi)) // Veriyi gönder
        startActivity(intent)
    }

    // Çıkış yapma kodu
    override fun onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed() // Uygulamayı kapat
        } else {
            Toast.makeText(applicationContext, "Çıkmak için tekrar basın", Toast.LENGTH_SHORT)
                .show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}











