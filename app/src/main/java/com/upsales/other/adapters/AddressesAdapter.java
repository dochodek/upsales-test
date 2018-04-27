package com.upsales.other.adapters;


import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.upsales.R;
import com.upsales.model.Address;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddressesAdapter extends RecyclerView.Adapter<AddressesAdapter.ViewHolder> {
    private List<Address> addresses;
    private Context context;

    public AddressesAdapter(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        this.context = parent.getContext();
        View v = LayoutInflater.from(context)
                .inflate(R.layout.item_address, parent, false);
        return new ViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Address address = addresses.get(position);

        holder.tvCity.setText(address.getZipcode() +" "+ address.getCity());
        holder.tvStreet.setText(address.getAddress());
        holder.lParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Not implemented
            }
        });
    }

    @Override
    public int getItemCount() {
        return addresses.size();
    }

    public List<Address> getAllItems(){
        return this.addresses;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.image) ImageView image;
        @BindView(R.id.root_element) RelativeLayout lParent;
        @BindView(R.id.street) TextView tvStreet;
        @BindView(R.id.city) TextView tvCity;

        public ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }


}