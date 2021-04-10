package com.nevco.nestedrecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MessageViewHolder> {
    private Context context;
    private ArrayList<DataModel> userMessagesList;




    public NewsAdapter(Context context, ArrayList<DataModel> userMessageList) {
        this.context = context;
        this.userMessagesList = userMessageList;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.news_feed_row, viewGroup, false);
        return new MessageViewHolder(view);
    }

    //Loads data into views
    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder viewHolder, int i) {

        //            viewHolder.senderTextView.setText(message.getMessage());

        viewHolder.senderTextView.setText(userMessagesList.get(i).getName());

        viewHolder.receiverTextView.setText(userMessagesList.get(i).getAge());





    }


    @Override
    public int getItemCount() {
        return userMessagesList.size();
    }


    //links up ui elements
    static class MessageViewHolder extends RecyclerView.ViewHolder {
        private TextView senderTextView, receiverTextView;


        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);

            senderTextView = itemView.findViewById(R.id.newsBody);
            receiverTextView = itemView.findViewById(R.id.newsTitle);

        }


    }

}
