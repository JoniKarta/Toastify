package com.example.toastify;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public final class Toastify {
    private Toast toast;
    private ImageView imageView;
    private TextView headerTextView;
    private TextView contentTextView;


    private Toastify(Builder builder) {
        this.headerTextView = builder.headerTextView;
        this.contentTextView = builder.contentTextView;
        this.imageView = builder.imageView;
        this.toast = builder.toast;
    }
    public void show(){
        toast.show();
    }

    public ImageView getImageView() {
        return imageView;
    }

    public TextView getContentTextView() {
        return contentTextView;
    }

    public TextView getHeaderTextView() {
        return headerTextView;
    }

    public static class Builder {

        private Toast toast;
        private ImageView imageView;
        private TextView headerTextView;
        private TextView contentTextView;

        public Builder(Activity context) {
            setup(context);
        }

        private void setup(Activity context){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            LinearLayout constraintLayout = (LinearLayout) layoutInflater.inflate(R.layout.custom_toast_layout, context.findViewById(R.id.custom_toast_main_layout));
            imageView = constraintLayout.findViewById(R.id.image_view_img_content);
            headerTextView = constraintLayout.findViewById(R.id.text_view_header);
            contentTextView = constraintLayout.findViewById(R.id.text_view_message);
            toast = Toast.makeText(context,null, Toast.LENGTH_SHORT);
            toast.setView(constraintLayout);
            toast.setGravity(Gravity.CENTER, 0 ,0 );

        }
        public Builder setHeader(String header) {
            headerTextView.setText(header);
            return this;
        }

        public Builder setContent(String message) {
            contentTextView.setText(message);
            return this;
        }

        public Builder setImageResource(int imageResource) {
            imageView.setImageResource(imageResource);
            return this;
        }


        public Toastify build() {
            return new Toastify(this);
        }
    }


}
