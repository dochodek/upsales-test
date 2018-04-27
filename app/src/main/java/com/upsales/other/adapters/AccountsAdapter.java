package com.upsales.other.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mikhaellopez.hfrecyclerview.HFRecyclerView;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.upsales.R;
import com.upsales.model.DataAccounts;
import com.upsales.other.events.OnAccountClick;
import com.upsales.other.events.OnLoadMoreClick;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import timber.log.Timber;

public class AccountsAdapter extends HFRecyclerView<DataAccounts> {
    private List<DataAccounts> dataAccounts;
    private boolean showLoadMore = true;

    public AccountsAdapter(List<DataAccounts> dataAccounts) {
        // With Header & With Footer
        super(dataAccounts, true, true);
        this.dataAccounts = dataAccounts;
    }

    @Override
    protected RecyclerView.ViewHolder getItemView(LayoutInflater inflater, ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_account, parent, false);
        return new ItemViewHolder(v);
    }

    @Override
    protected RecyclerView.ViewHolder getHeaderView(LayoutInflater inflater, ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.header_account_list, parent, false);
        return new HeaderViewHolder(v);
    }

    @Override
    protected RecyclerView.ViewHolder getFooterView(LayoutInflater inflater, ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.footer_account_list, parent, false);
        return new FooterViewHolder(v);
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.name) TextView tvName;
        @BindView(R.id.manager) TextView tvManagerName;
        @BindView(R.id.image) ImageView image;
        @BindView(R.id.root_element) LinearLayout root;

        public ItemViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }

    class HeaderViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.companies_title) TextView tvTitle;
        @BindView(R.id.count) TextView tvCount;

        public HeaderViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }

    class FooterViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.load_more) TextView tvLoadMore;
        @BindView(R.id.progress) ProgressWheel progress;
        @BindView(R.id.load_more_layout) RelativeLayout lLoadMore;

        public FooterViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ItemViewHolder) {
            final ItemViewHolder itemViewHolder = (ItemViewHolder) holder;
            final DataAccounts account = dataAccounts.get(position - 1);
            itemViewHolder.tvName.setText(account.getName());
            itemViewHolder.tvManagerName.setText(account.getUsers().get(0).getName());

            itemViewHolder.root.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Timber.v("Clicked account: "+account.getName());
                    EventBus.getDefault().post(new OnAccountClick(account));
                }
            });
        } else if (holder instanceof HeaderViewHolder){
            final HeaderViewHolder headerViewHolder = (HeaderViewHolder) holder;

            headerViewHolder.tvCount.setText(dataAccounts.size()+" companies");
        } else if (holder instanceof FooterViewHolder){
            final FooterViewHolder footerViewHolder = (FooterViewHolder) holder;

            if (showLoadMore){
                footerViewHolder.lLoadMore.setVisibility(View.VISIBLE);
                footerViewHolder.progress.setVisibility(View.GONE);
                footerViewHolder.tvLoadMore.setVisibility(View.VISIBLE);
                footerViewHolder.lLoadMore.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        footerViewHolder.progress.setVisibility(View.VISIBLE);
                        footerViewHolder.tvLoadMore.setVisibility(View.GONE);
                        EventBus.getDefault().post(new OnLoadMoreClick());
                    }
                });
            } else {
                footerViewHolder.lLoadMore.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public int getItemCount() {
        return dataAccounts.size()+2;
    }

    public void updateAll(List<?> all) {
        List<DataAccounts> list = (List<DataAccounts>) all;
        for (DataAccounts p : list){
            this.dataAccounts.add(p);
        }
        notifyDataSetChanged();
    }

    public List<DataAccounts> getAll(){
        return this.dataAccounts;
    }

    public boolean isShowLoadMore() {
        return showLoadMore;
    }
    public void setShowLoadMore(boolean showLoadMore) {
        this.showLoadMore = showLoadMore;
    }
}