package com.iak_batch3.alikhsan778.museumsunda;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



/**
 * Created by Axioo on 08/05/2017.
 */
public class RecyclerViewHolder
        extends RecyclerView.ViewHolder {
    public TextView namaMuseum, alamatMuseum, waktuBuka,nohp,hargaAwal,hargaTotal,quantity;
    public ImageView photoMuseum,iconNav,iconCall,iconBrowse;
    public Button buttonBuy;

    public RecyclerViewHolder(View itemView){
        super (itemView);
        namaMuseum = (TextView) itemView.findViewById(R.id.nama_museum);
        photoMuseum = (ImageView) itemView.findViewById(R.id.photo_museum);
        alamatMuseum = (TextView) itemView.findViewById(R.id.alamat);
        iconNav = (ImageView) itemView.findViewById(R.id.ico_nav);
        iconCall = (ImageView) itemView.findViewById(R.id.ico_call);
        iconBrowse = (ImageView) itemView.findViewById(R.id.ico_browse);
        waktuBuka = (TextView)itemView.findViewById(R.id.waktu_buka);
        nohp = (TextView)itemView.findViewById(R.id.nohp);
        hargaAwal = (TextView)itemView.findViewById(R.id.harga_tiket);
        buttonBuy = (Button)itemView.findViewById(R.id.btn_buy);






    }
    /**@Override
    public void onClick(View view){
        //Toast.makeText(view.getContext(),"Clicked Country Position = "+ getPosition(),Toast.LENGTH_SHORT).show();
      int posisi = getPosition();
        if (posisi == 0){
          //  Toast.makeText(view.getContext(),"Click Country position = "+posisi,Toast.LENGTH_SHORT).show();
            //String url = "http://www.google.com";
            //Intent i = new Intent(Intent.ACTION_VIEW);
            //i.setData(Uri.parse(url));
            //startActivity(i);
        }

    }
    @Override
    public int getItemCount(){
        return this.itemList.size();
    }
*/
}