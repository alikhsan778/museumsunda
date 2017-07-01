package com.iak_batch3.alikhsan778.museumsunda;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private GridLayoutManager ILayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupToolBar();
        List<ItemObject> rowListItem = getAllItemList();
        ILayout = new GridLayoutManager(HomeActivity.this, 1);
        RecyclerView rView = (RecyclerView) findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(ILayout);
        Bundle bundle = getIntent().getExtras();
        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(HomeActivity.this, rowListItem,bundle);
        rView.setAdapter(rcAdapter);


    }
    private void setupToolBar(){
        Toolbar toolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        final ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setTitle(R.string.tittle_activity_home);


    }
    private List<ItemObject> getAllItemList() {
        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Museum Sri Baduga", R.drawable.msm_baduga,"Jl. BKR No.185, Pelindung Hewan, Astanaanyar, Kota Bandung, Jawa Barat 40243, Indonesia","(022) 5210976","Rp.1000","08.00–16.00 WIB"));
        allItems.add(new ItemObject("Museum Prabu Geusan Ulun", R.drawable.msm_prabu,"Jl. Prabu Geusan Ulun No. 40, Regol Wetan, Sumedang Selatan, Regol Wetan, Sumedang Sel., Kabupaten Sumedang, Jawa Barat 45355","(026) 1201714","Rp.1500","08.00–14.00 WIB"));
        allItems.add(new ItemObject("Museum Mandala Wangsit Siliwangi", R.drawable.msm_wangsit,"Jl. Lembong No.38, Braga, Sumur Bandung, Kota Bandung, Jawa Barat 40181","(022) 4203393","Rp. 2000","None description from museum"));
        allItems.add(new ItemObject("Museum Talaga Manggung", R.drawable.msm_talaga,"Jl. Talaga Majalengka No. 1, Talagawetan, Talaga, Kabupaten Majalengka, Jawa Barat 45465","None description from museum","Rp. 2500","07.00–18.00 WIB"));
        allItems.add(new ItemObject("Museum Railway Indonesia", R.drawable.msm_railway,"Jl. Stasiun No. 1, Panjang, Ambarawa, Panjang, Ambarawa, Semarang, Jawa Tengah 50614","(029) 8591035","Rp. 3000","08.00–17.00 WIB"));
        allItems.add(new ItemObject("Museum Perjoangan Bogor", R.drawable.msm_pejungan,"Jl. Raya Merdeka No.56, Ciwaringin, Bogor Tengah, Kota Bogor, Jawa Barat 16124","(025) 19135879","Rp. 3500","None description from museum"));
        allItems.add(new ItemObject("Museum Keraton Kasepuhan", R.drawable.msm_kraton,"Jl. Kasepuhan No.43, Kesepuhan, Lemahwungkuk, Kota Cirebon, Jawa Barat 45114","None description from museum","Rp. 4000","08.00–18.00 WIB"));
        return allItems;
    }

}
