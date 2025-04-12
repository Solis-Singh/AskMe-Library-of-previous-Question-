package com.example.lnmcbmprevques;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder>{

    private Context mtx;
    private List<Product> productList;


    public ProductAdapter(Context mtx, List<Product> productList) {
        this.mtx = mtx;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mtx);
        View view = inflater.inflate(R.layout.layout_products,null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder,final int position) {

           final Product product = productList.get(position);


            holder.textViewTitle.setText(product.getTitle());
            holder.imageView.setImageDrawable(mtx.getResources().getDrawable(product.getImage()));
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(),pdf.class);
                    intent.putExtra("title",productList.get(position).getTitle());
                    intent.putExtra("product",productList.get(position).getTitle());
                    intent.putExtra("link",productList.get(position).getLink());
                    mtx.startActivity(intent);

                }
            });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}

class ProductViewHolder extends RecyclerView.ViewHolder{

    CardView cardView;
    ImageView imageView;
    TextView textViewTitle;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        cardView = itemView.findViewById(R.id.cardview);
        imageView = itemView.findViewById(R.id.imageview);
        textViewTitle = itemView.findViewById(R.id.textViewTitle);
    }
}