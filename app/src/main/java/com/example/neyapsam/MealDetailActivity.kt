package com.example.neyapsam

import android.content.Intent
import com.bumptech.glide.Glide
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MealDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal_detail)

        val buttonGoBack = findViewById<Button>(R.id.buttonGoBack)

        // Butona tıklanıldığında MainActivity'ye dön
        buttonGoBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Mevcut Activity'yi sonlandırır
        }



        // Intent'ten gelen veriyi al
        val yemekListesi = intent.getSerializableExtra("yemekListesi") as? List<Yemek>

        // UI bileşenlerini bul
        val textViewMealName: TextView = findViewById(R.id.textViewMealName)
        val imageViewMeal: ImageView = findViewById(R.id.imageViewMeal)
        val textViewIngredients: TextView = findViewById(R.id.textViewIngredients)
        val textViewLink: TextView = findViewById(R.id.textViewLink)

        // Rastgele bir yemek seç
        val randomMeal = yemekListesi?.randomOrNull()

        // UI bileşenlerine verileri yükle
        if (randomMeal != null) {
            textViewMealName.text = randomMeal.isim
            textViewIngredients.text = randomMeal.malzemeler
            Glide.with(this).load(randomMeal.imageResId).into(imageViewMeal)
            textViewLink.text = randomMeal.link
        } else {
            textViewMealName.text = "Yemek bulunamadı"
            imageViewMeal.setImageDrawable(null)
            textViewIngredients.text = ""
            textViewLink.text = ""
        }


    }
}