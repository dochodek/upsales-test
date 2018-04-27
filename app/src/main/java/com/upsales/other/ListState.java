package com.upsales.other;

public enum ListState {
    Loading,       // loading spinner on empty background
    Empty,        // info about empty list, no items, add new item
    Error,        // some error
    NetworkOff, // no internet connection
    Visible,      // normal list visible
}
