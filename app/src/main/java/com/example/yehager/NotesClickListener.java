package com.example.yehager;

import androidx.cardview.widget.CardView;

import com.example.yehager.Models.Notes;

public interface NotesClickListener {

    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
