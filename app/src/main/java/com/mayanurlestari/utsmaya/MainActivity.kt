package com.mayanurlestari.utsmaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.mayanurlestari.utsmaya.adapter.ItemAdapter
import com.mayanurlestari.utsmaya.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)
        //Inisialisasi Data
        //Menggunakan class Datasource dan ItemAdapter untuk membuat dan menampilkan item di RecyclerView
        val myDataset = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
       // Untuk memberi tahu recyclerView agar menggunakan class ItemAdapter yang Anda buat, buat instance ItemAdapter baru.
        recyclerView.adapter = ItemAdapter(this, myDataset)
        // Gunakan pengaturan ini untuk meningkatkan kinerja jika Anda tahu itu berubah
        // dalam konten tidak mengubah ukuran tata letak RecyclerView
        recyclerView.setHasFixedSize(true)

    }
}