package com.upsales.other;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;

import timber.log.Timber;

/**
 * Created by Dominik on 2016-07-22.
 */
public class ListStateManager {

    private ViewStub emptyStub;
    private ViewStub emptyErrorStub;
    private ViewStub progressStub;
    private ViewStub emptyNetworkStub;
    private RecyclerView recycler;

    private ListState state;

    public ListStateManager(RecyclerView recycler, ViewStub progress, ViewStub network,
                            ViewStub empty, ViewStub error) {
        this.recycler = recycler;
        this.progressStub = progress;
        this.emptyErrorStub = error;
        this.emptyStub = empty;
        this.emptyNetworkStub = network;
    }

    public ListState getState() {
        return state;
    }

    public void setState(final ListState state) {
        if (progressStub == null || recycler == null ||
               emptyNetworkStub == null ||
                emptyStub == null || emptyErrorStub == null)
            return;
        Timber.v("ListStateManager: " + state);
        this.state = state;

        // Reset all.
        progressStub.setVisibility(View.GONE);
        recycler.setVisibility(View.GONE);
        emptyStub.setVisibility(View.GONE);
        emptyErrorStub.setVisibility(View.GONE);
        emptyNetworkStub.setVisibility(View.GONE);
        switch (state) {
            case Loading:
                progressStub.setVisibility(View.VISIBLE);
                break;
            case Empty:
                emptyStub.setVisibility(View.VISIBLE);
                break;
            case Error:
                emptyErrorStub.setVisibility(View.VISIBLE);
                break;
            case NetworkOff:
                emptyNetworkStub.setVisibility(View.VISIBLE);
                break;
            case Visible:
                recycler.setVisibility(View.VISIBLE);
                break;
        }
    }
}
