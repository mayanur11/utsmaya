package com.mayanurlestari.utsmaya.adapter
//membuat paket baru yaitu adapter dan kelas baru yaitu ItemAdapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mayanurlestari.utsmaya.R
import com.mayanurlestari.utsmaya.model.Affirmation
/**
 * Adaptor untuk [RecyclerView] di [MainActivity]. Menampilkan objek data [Afirmasi].
 */
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Memberikan referensi ke tampilan untuk setiap item data
    // Item data kompleks mungkin memerlukan lebih dari satu tampilan per item, dan
    // Anda memberikan akses ke semua tampilan untuk item data dalam penampung tampilan.
    // Setiap item data hanyalah objek Afirmasi.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    /**
     * Buat tampilan baru (dipanggil oleh pengelola tata letak)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
//Teruskan ID resource tata letak XML R.layout.list_item dan kelompok tampilan parent. Argumen boolean ketiga adalah attachToRoot.
// Argumen ini harus false, karena RecyclerView menambahkan item ini ke hierarki tampilan saat waktu tersebut.
        return ItemViewHolder(adapterLayout)
    }
//Instance ViewHolder menyimpan referensi ke setiap tampilan dalam tata letak item daftar (dengan nama "holder tampilan").
    /**
     * Ganti konten tampilan (dipanggil oleh pengelola tata letak)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
//getString() dengan ID resource string, dan akan menampilkan nilai string yang terkait dengannya. getString() adalah metode di class Resources,
    // dan Anda dapat memperoleh instance class Resources melalui context.
    }

    /**
     * Kembalikan ukuran kumpulan data Anda (dipanggil oleh pengelola tata letak)
     */
    override fun getItemCount() = dataset.size
    //Metode getItemCount() harus menampilkan ukuran set data Anda. Data aplikasi Anda berada di properti dataset yang Anda berikan ke konstruktor ItemAdapter,
// dan Anda bisa mendapatkan ukurannya dengan size.
}
