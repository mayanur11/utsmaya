package com.mayanurlestari.utsmaya.data
import com.mayanurlestari.utsmaya.R
import com.mayanurlestari.utsmaya.model.Affirmation

class Datasource() {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
//Tambahkan Affirmation objek yang tersisa ke daftar semua afirmasi,
// yang dipisahkan dengan koma. Kode yang sudah selesai akan terlihat seperti berikut.

            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2),
            Affirmation(R.string.affirmation3, R.drawable.image3),
            Affirmation(R.string.affirmation4, R.drawable.image4),
            Affirmation(R.string.affirmation5, R.drawable.image5),
            Affirmation(R.string.affirmation6, R.drawable.image6),
            Affirmation(R.string.affirmation7, R.drawable.image7),
            Affirmation(R.string.affirmation8, R.drawable.image8),
            Affirmation(R.string.affirmation9, R.drawable.image9),
            Affirmation(R.string.affirmation10, R.drawable.image10)
        )
    }
}
//Untuk setiap Affirmation, tambahkan ID resource gambar sebagai argumen, seperti R.drawable.image1.
//Fungsi loadAffirmations() perlu menampilkan daftar Affirmations. Untuk melakukannya,
//perlu membuat daftar dan mengisinya dengan instance Affirmation untuk setiap string resource.