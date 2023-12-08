package com.rmhan.itf.model.rcmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.rmhan.itf.R;
import com.rmhan.itf.model.favorite.DataFavAdapter;
import com.rmhan.itf.model.favorite.RcfavAdapter;
import com.rmhan.itf.model.img.ImageAdapter;

import java.util.List;

public class RcMenuAdapter extends RecyclerView.Adapter<RcMenuAdapter.ViewHolder>{

    Context context;
    List<DataMenuAdapter> dataMenuAdapters;
    ImageLoader imageLoader;

    public RcMenuAdapter(List<DataMenuAdapter> getDataMenuAdapter, Context context){

        super();
        this.dataMenuAdapters = getDataMenuAdapter;
        this.context = context;
    }

    @Override
    public RcMenuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_menu, parent, false);

        RcMenuAdapter.ViewHolder viewHolder = new RcMenuAdapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RcMenuAdapter.ViewHolder Viewholder, int position) {

        DataMenuAdapter dataMenuAdapterOBJ =  dataMenuAdapters.get(position);

        imageLoader = ImageAdapter.getInstance(context).getImageLoader();

        imageLoader.get(dataMenuAdapterOBJ.geturl(),
                ImageLoader.getImageListener(
                        Viewholder.imgvolley,
                        R.mipmap.ic_launcher,
                        android.R.drawable.ic_dialog_alert
                )
        );

        Viewholder.imgvolley.setImageUrl(dataMenuAdapterOBJ.geturl(), imageLoader);
        Viewholder.txtname.setText(dataMenuAdapterOBJ.getName_menu());
        Viewholder.txtharga.setText(dataMenuAdapterOBJ.getHarga_menu());

    }

    @Override
    public int getItemCount() {

        return dataMenuAdapters.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public TextView txtname,txtharga;
        public NetworkImageView imgvolley ;

        ;

        public ViewHolder(View itemView) {

            super(itemView);

            txtname = (TextView) itemView.findViewById(R.id.txtnamemenu) ;
            imgvolley = (NetworkImageView) itemView.findViewById(R.id.imgmenu) ;
            txtharga = (TextView) itemView.findViewById(R.id.txthargamenu);

        }
    }
}
