package com.example.asus.resepmakanan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private LinkedList<String> resep_nama = new LinkedList<String>();
    private LinkedList<String> resep_detail = new LinkedList<String>();
    private LinkedList<String> resep_ingredients = new LinkedList<String>();
    private LinkedList<String> resep_process = new LinkedList<String>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resep_nama.add("Nasi pecel");
        resep_detail.add("Pecel atau pecal adalah makanan yang menggunakan bumbu sambal kacang sebagai bahan utamanya yang dicampur dengan aneka jenis sayuran. Makanan ini populer terutama di wilayah DI Yogyakarta, Jawa Tengah, dan Jawa Timur. ");
        resep_ingredients.add("1. 250 gr kacang tanah \n2. 5 butir bawang putih\n3. 3 buah cabe merah besar \n4. 3 lembar daun jeruk \n5. bawang putih\n6. bawang merah\n7. 1/2 sdm asam Jawa\n8. 50 gr gula merah sisir \n9. sayuran rebus");
        resep_process.add("1.process");
        resep_nama.add("Nasi Campur");
        resep_detail.add("Nasi campur adalah masakan khas Indonesia. Makanan ini terdiri dari nasi putih yang dihidangkan dengan bermacam-macam lauk-pauk.");
        resep_ingredients.add("1. 4 cup beras  \n2. 5 butir bawang putih\n3. 3 buah cabe merah besar \n4. lauk\\n5. air\"" );
        resep_process.add("1.process");
        resep_nama.add("Nasi Uduk");
        resep_detail.add("Nasi uduk adalah nama sejenis makanan terbuat dari bahan dasar nasi putih yang diaron dan dikukus dengan santan dari kelapa yang di parut, serta dibumbui dengan pala, kayu manis, jahe, daun serai dan merica.");
        resep_ingredients.add("1. Beras 300 g, cuci bersih  \n2. Santan kelapa kental 450 ml\n3. daun salam muda 2 lembar \n4. Cengkeh 2 butir\n5. Serai 2 batang, memarkan\n6. Garam 1 sdt");
        resep_process.add("1.process");
        setContentView(R.layout.activity_main);
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, resep_nama, resep_detail, resep_ingredients, resep_process);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
