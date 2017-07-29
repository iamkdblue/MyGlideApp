package com.kdblue.glideapp.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kdblue.glideapp.Model.Details;
import com.kdblue.glideapp.R;

import java.util.List;

/**
 * Created by kulde on 7/20/2017.
 */

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.MyDetailsAdapter> {

    List<Details> detailsList;
    Context context;
    public DetailsAdapter(Context context,List<Details> detailsList) {
        this.context=context;
        this.detailsList=detailsList;
    }

    @Override
    public MyDetailsAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("kkk","1st");
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_imageview,parent,false);
        return new MyDetailsAdapter(view);
    }

    @Override
    public void onBindViewHolder(MyDetailsAdapter holder, int position) {
            holder.textView.setText(detailsList.get(position).getQuote());
        Log.d("kkk","2st");
    }

    @Override
    public int getItemCount() {
        Log.d("kkk","3st");
        return detailsList.size();

    }

    public class MyDetailsAdapter extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        public MyDetailsAdapter(View itemView) {
            super(itemView);

            imageView=(ImageView)itemView.findViewById(R.id.imageView);
            textView=(TextView)itemView.findViewById(R.id.textView);
        }
    }
}
