package com.mayanurlestari.utsmaya.model
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
//import terlebih dahulu kelas package yang akan digunakan dalam class Affirmation
data class Affirmation(
    @StringRes val stringResourceId: Int, //stringResourceId nilai bilangan bulat
    @DrawableRes val imageResourceId: Int //imageResourceId nilai bilangan bulat
)
//Menambahkan properti di class data Affirmation untuk menyimpan nilai untuk ID resource gambar.
//Dengan begitu satu instance objek Affirmation akan berisi satu ID resource untuk teks afirmasi dan satu ID resource untuk gambar afirmasi.
