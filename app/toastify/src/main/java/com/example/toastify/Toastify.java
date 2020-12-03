package com.example.toastify;

import android.app.Activity;
import android.graphics.drawable.ShapeDrawable;
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

    public void show() {
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
        private LinearLayout linearLayout;

        public Builder(Activity context) {
            setup(context);
        }

        private void setup(Activity context) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.custom_toast_layout, context.findViewById(R.id.custom_toast_main_layout));
            imageView = linearLayout.findViewById(R.id.image_view_img_content);
            headerTextView = linearLayout.findViewById(R.id.text_view_header);
            contentTextView = linearLayout.findViewById(R.id.text_view_message);
            toast = Toast.makeText(context, null, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM, 0, 0);

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

        public Builder setGravity(int gravity, int offsetX, int offsetY) {
            toast.setGravity(gravity, offsetX, offsetY);
            return this;
        }

        public Builder setBackground(int backgroundResource) {
            linearLayout.setBackgroundResource(backgroundResource);
            return this;
        }

        public Builder setDuration(int length) {
            if (length == Toast.LENGTH_LONG)
                toast.setDuration(length);
            else {
                toast.setDuration(Toast.LENGTH_SHORT);
            }
            return this;
        }

        public Builder setHeaderTextSize(int size) {
            headerTextView.setTextSize(size);
            return this;
        }

        public Builder setHeaderTextColor(int color) {
            headerTextView.setTextColor(color);
            return this;
        }

        public Builder setContentTextSize(int size) {
            contentTextView.setTextSize(size);
            return this;
        }

        public Builder setContentTextColor(int color) {
            contentTextView.setTextColor(color);
            return this;
        }


        public Toastify build() {
            toast.setView(linearLayout);
            return new Toastify(this);
        }
    }


}
