package com.beyzanuraydemir.yemektariflerisqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Menuyu main activitye bağlıyoruz.
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //xml ile kod bağlaması inflater ile yapılır.
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.yemek_ekle,menu)

        return super.onCreateOptionsMenu(menu)
    }

    //Menuden bir şey seçilirse yapılacak işlemler
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //item id sini kontrol et
        if(item.itemId == R.id.yemek_ekleme_item){
            //Tıklandığında gönderilecek sayfa için actionı yaz
            val action = ListeFragmentDirections.actionListeFragmentToTarifFragment("menudengeldim",0)
            //navigation çağır
            Navigation.findNavController(this,R.id.fragmentContainerView).navigate(action)
        }
        return super.onOptionsItemSelected(item)
    }
}