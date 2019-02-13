package com.dalel_najaf.codeforiraq.org.dalelnajaf;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class ViewHolder extends RecyclerView.ViewHolder {

    private View mView;

    public ViewHolder(View itemView) {
        super(itemView);

        mView = itemView;
    }

    //set details to recycler view row
    public void setDetails(Context ctx, String title, String description, String image)  {
        //Views
        TextView mTitleTv = mView.findViewById(R.id.rTitleTv);
        TextView mDetailTv = mView.findViewById(R.id.rDescriptionTv);
        ImageView mImageIv = mView.findViewById(R.id.rImageView);
        ProgressBar progressBar=mView.findViewById(R.id.myProgress);
        //set data to views
        mTitleTv.setText(title);
        mDetailTv.setText(description);
        progressBar.setIndeterminate(true);

        RequestOptions myOptions = new RequestOptions()
                .override(500, 500 );

        Glide.with(ctx)
                .asBitmap()
                .apply(myOptions)
                .load(image)
                .into(mImageIv);
        progressBar.setIndeterminate(false);
    }
}