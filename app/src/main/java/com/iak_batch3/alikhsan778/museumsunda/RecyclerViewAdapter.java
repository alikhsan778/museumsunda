package com.iak_batch3.alikhsan778.museumsunda;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Axioo on 08/05/2017.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private List<ItemObject> itemList;
    private Context context;
    private Bundle bundle;

    /**
     * TODO = constructor
     */
    public RecyclerViewAdapter(Context context, List<ItemObject> itemList, Bundle bundle) {
        this.itemList = itemList;
        this.context = context;
        this.bundle = bundle;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, null);
        RecyclerViewHolder rcv = new RecyclerViewHolder(layoutView);
        return rcv;
    }

    /**
     * TODO = method extend recyclerView
     */
    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.namaMuseum.setText(itemList.get(position).getName());
        holder.photoMuseum.setImageResource(itemList.get(position).getPhoto());
        holder.alamatMuseum.setText(itemList.get(position).getAlamat());
        holder.nohp.setText(itemList.get(position).getHp());
        holder.hargaAwal.setText(itemList.get(position).getHarga());
        holder.waktuBuka.setText(itemList.get(position).getWaktu());
        /**setOnclick*/
        holder.namaMuseum.setOnClickListener(clickListener_web);
        holder.photoMuseum.setOnClickListener(clickListener_web);
        holder.iconBrowse.setOnClickListener(clickListener_web);
        holder.iconNav.setOnClickListener(clickListener_alamat);
        holder.iconCall.setOnClickListener(clickListener_call);
        holder.alamatMuseum.setOnClickListener(clickListener_alamat);
        holder.nohp.setOnClickListener(clickListener_call);
        holder.buttonBuy.setOnClickListener(clickListener);
        /**set tag*/
        holder.iconBrowse.setTag(holder);
        holder.iconNav.setTag(holder);
        holder.iconCall.setTag(holder);
        holder.namaMuseum.setTag(holder);
        holder.alamatMuseum.setTag(holder);
        holder.photoMuseum.setTag(holder);
        holder.buttonBuy.setTag(holder);
        holder.nohp.setTag(holder);


    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getPosition();
            if (position == 0 && position < getItemCount()) {
                Intent intent = new Intent(context, DetailActivity.class);
                bundle.putInt("data4",1000);
                bundle.putString("data5","Museum Sri Baduga");
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
            else if (position == 1 && position < getItemCount()) {
                Intent intent = new Intent(context, DetailActivity.class);
                bundle.putInt("data4",1500);
                bundle.putString("data5","Museum Prabu Geusan U..");
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
            else if (position == 2 && position < getItemCount()) {
                Intent intent = new Intent(context, DetailActivity.class);
                bundle.putInt("data4",2000);
                bundle.putString("data5","Museum Mandala Wangsit S..");
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
            else if (position == 3 && position < getItemCount()) {
                Intent intent = new Intent(context, DetailActivity.class);
                bundle.putInt("data4",2500);
                bundle.putString("data5","Museum Talaga Manggung");
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
            else if (position == 4 && position < getItemCount()) {
                Intent intent = new Intent(context, DetailActivity.class);
                bundle.putInt("data4",3000);
                bundle.putString("data5","Museum Railway Indonesia");
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
            else if (position == 5 && position < getItemCount()) {
                Intent intent = new Intent(context, DetailActivity.class);
                bundle.putInt("data4",3500);
                bundle.putString("data5","Museum Perjoangan Bogor");
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
            else if (position == 6 && position < getItemCount()) {
                Intent intent = new Intent(context, DetailActivity.class);
                bundle.putInt("data4",4000);
                bundle.putString("data5","Museum Keraton Kasepuhan");
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
        }
    };
    View.OnClickListener clickListener_alamat = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getPosition();
            if (position == 0 && position < getItemCount()) {
                double latitude = -6.937802;
                double longitude = 107.603430;
                String label = "Museum Sri Baduga";
                String uriBegin = "geo:" + latitude + "," + longitude;
                String query = latitude + "," + longitude + "(" + label + ")";
                String encodedQuery = Uri.encode(query);
                String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
                Uri uri = Uri.parse(uriString);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                context.startActivity(intent);
            } else if (position == 1 && position < getItemCount()) {
                double latitude = -6.861162;
                double longitude = 107.920877;
                String label = "Museum Prabu Geusan Ulun";
                String uriBegin = "geo:" + latitude + "," + longitude;
                String query = latitude + "," + longitude + "(" + label + ")";
                String encodedQuery = Uri.encode(query);
                String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
                Uri uri = Uri.parse(uriString);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                context.startActivity(intent);
            } else if (position == 2 && position < getItemCount()) {
                double latitude = -6.917757;
                double longitude = 107.611258;
                String label = "Museum Mandala Wangsit Siliwangi";
                String uriBegin = "geo:" + latitude + "," + longitude;
                String query = latitude + "," + longitude + "(" + label + ")";
                String encodedQuery = Uri.encode(query);
                String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
                Uri uri = Uri.parse(uriString);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                context.startActivity(intent);
            } else if (position == 3 && position < getItemCount()) {
                double latitude = -6.985141;
                double longitude = 108.311159;
                String label = "Museum Talaga Manggung";
                String uriBegin = "geo:" + latitude + "," + longitude;
                String query = latitude + "," + longitude + "(" + label + ")";
                String encodedQuery = Uri.encode(query);
                String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
                Uri uri = Uri.parse(uriString);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                context.startActivity(intent);
            } else if (position == 4 && position < getItemCount()) {
                double latitude = -7.265430;
                double longitude = 110.401298;
                String label = "Museum Railway Indonesia";
                String uriBegin = "geo:" + latitude + "," + longitude;
                String query = latitude + "," + longitude + "(" + label + ")";
                String encodedQuery = Uri.encode(query);
                String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
                Uri uri = Uri.parse(uriString);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                context.startActivity(intent);
            } else if (position == 5 && position < getItemCount()) {
                double latitude = -6.594100;
                double longitude = 106.786358;
                String label = "Museum Perjoangan Bogor";
                String uriBegin = "geo:" + latitude + "," + longitude;
                String query = latitude + "," + longitude + "(" + label + ")";
                String encodedQuery = Uri.encode(query);
                String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
                Uri uri = Uri.parse(uriString);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                context.startActivity(intent);
            } else if (position == 6 && position < getItemCount()) {
                double latitude = -6.726350;
                double longitude = 108.570995;
                String label = "Museum Keraton Kasepuhan";
                String uriBegin = "geo:" + latitude + "," + longitude;
                String query = latitude + "," + longitude + "(" + label + ")";
                String encodedQuery = Uri.encode(query);
                String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
                Uri uri = Uri.parse(uriString);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                context.startActivity(intent);
            }
        }
    };
    View.OnClickListener clickListener_web = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getPosition();
            if (position == 0 && position < getItemCount()) {
                String url = "http://www.museumsribaduga.jabarprov.go.id/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                context.startActivity(intent);
            } else if (position == 1 && position < getItemCount()) {
                String url = "http://museumprabugeusanulun.org/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                context.startActivity(intent);
            } else if (position == 2 && position < getItemCount()) {
                String url = "http://tempatwisatadibandung.info/museum-mandala-wangsit-siliwangi-bandung/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                context.startActivity(intent);
            } else if (position == 3 && position < getItemCount()) {
                String url = "http://museumtalagamanggung.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                context.startActivity(intent);
            } else if (position == 4 && position < getItemCount()) {
                Toast.makeText(context, "Sorry this museum no have web service", Toast.LENGTH_SHORT).show();
            } else if (position == 5 && position < getItemCount()) {
                Toast.makeText(context, "Sorry this museum no have web service", Toast.LENGTH_SHORT).show();
            } else if (position == 6 && position < getItemCount()) {
                String url = "http://kasepuhan.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                context.startActivity(intent);
            }
        }
    };
    View.OnClickListener clickListener_call = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getPosition();
            if (position == 0 && position < getItemCount()) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:0225210976"));
                context.startActivity(callIntent);
            }
            if (position == 1 && position < getItemCount()) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:0261201714"));
                context.startActivity(callIntent);
            }
            if (position == 2 && position < getItemCount()) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:0224203393"));
                context.startActivity(callIntent);
            }
            if (position == 3 && position < getItemCount()) {
                Toast.makeText(context, "Sorry this museum no have call service", Toast.LENGTH_SHORT).show();
            }
            if (position == 4 && position < getItemCount()) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:0298591035"));
                context.startActivity(callIntent);
            }
            if (position == 5 && position < getItemCount()) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:02519135879"));
                context.startActivity(callIntent);
            }
            if (position == 6 && position < getItemCount()) {
                Toast.makeText(context, "Sorry this museum no have call service", Toast.LENGTH_SHORT).show();
            }

        }
    };

    public int getItemCount() {
        return this.itemList.size();
    }


}
