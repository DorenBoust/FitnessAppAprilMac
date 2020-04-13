package com.example.fitnessapp.articals;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitnessapp.R;
import com.example.fitnessapp.user.ProductDataBase;
import com.example.fitnessapp.user.User;

import java.util.Dictionary;
import java.util.Map;

public class ProductTabRecyclerAdapter extends RecyclerView.Adapter<ProductTabRecyclerAdapter.ProductHolder> {

    private Recpie recpie;
    private LayoutInflater inflater;
    private Map<String, ProductDataBase> productDataBase;

    public ProductTabRecyclerAdapter(Recpie recpie, LayoutInflater inflater, Map<String, ProductDataBase> productDataBase) {
        this.recpie = recpie;
        this.inflater = inflater;
        this.productDataBase = productDataBase;
    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.recipe_activity_product_recycler, parent,false);

        return new ProductHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {
        System.out.println("productDataBase" + productDataBase);

        String[] split = recpie.getProduct().get(position).getProductName().split("/");

        RecpieProduct recpieProduct = recpie.getProduct().get(position);

        holder.productNumber.setText(String.valueOf(position + 1));
        holder.productName.setText(productDataBase.get(split[4]).getProductNameHEB());
        holder.qty.setText(recpieProduct.getQty());
        holder.unit.setText(recpieProduct.getUnit());

    }

    @Override
    public int getItemCount() {
        return recpie.getProduct().size();
    }

    public class ProductHolder extends RecyclerView.ViewHolder {

        private TextView productNumber;
        private TextView productName;
        private TextView qty;
        private TextView unit;

        public ProductHolder(@NonNull View itemView) {
            super(itemView);

            productNumber = itemView.findViewById(R.id.number_of_product_recycler_recipe);
            productName = itemView.findViewById(R.id.product_name_recipe_recycler);
            qty = itemView.findViewById(R.id.qty_recycler_recipe);
            unit = itemView.findViewById(R.id.unit_recycler_reice);

        }
    }
}
