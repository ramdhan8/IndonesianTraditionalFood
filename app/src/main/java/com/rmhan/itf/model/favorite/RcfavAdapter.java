package com.rmhan.itf.model.favorite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.rmhan.itf.R;
import com.rmhan.itf.model.img.ImageAdapter;

import java.util.List;

public class RcfavAdapter extends RecyclerView.Adapter<RcfavAdapter.ViewHolder>{

    Context context;
    List<DataFavAdapter> dataFavAdapters;
    ImageLoader imageLoader;

    public RcfavAdapter(List<DataFavAdapter> getDataFavAdapter, Context context){

        super();
        this.dataFavAdapters = getDataFavAdapter;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.reycle_fav, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder Viewholder, int position) {

        DataFavAdapter datafavAdapterOBJ =  dataFavAdapters.get(position);

        imageLoader = ImageAdapter.getInstance(context).getImageLoader();

        imageLoader.get(datafavAdapterOBJ.geturl(),
                ImageLoader.getImageListener(
                        Viewholder.imgvolley,
                        R.mipmap.ic_launcher,
                        android.R.drawable.ic_dialog_alert
                )
        );

        Viewholder.imgvolley.setImageUrl(datafavAdapterOBJ.geturl(), imageLoader);
        Viewholder.txtname.setText(datafavAdapterOBJ.getName_fav());
        Viewholder.txtharga.setText(datafavAdapterOBJ.getHarga_fav());

    }

    @Override
    public int getItemCount() {

        return dataFavAdapters.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public TextView txtname,txtharga;
        public NetworkImageView imgvolley ;

      ;

        public ViewHolder(View itemView) {

            super(itemView);

            txtname = (TextView) itemView.findViewById(R.id.txtnamefav) ;
            imgvolley = (NetworkImageView) itemView.findViewById(R.id.imgfav) ;
            txtharga = (TextView) itemView.findViewById(R.id.txtharga);

        }
    }
}
