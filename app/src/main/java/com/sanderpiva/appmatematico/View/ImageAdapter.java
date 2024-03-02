package com.sanderpiva.appmatematico.View;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.sanderpiva.appmatematico.R;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private int[] mImageIds = { R.drawable.image2, R.drawable.image2,
            R.drawable.image2, R.drawable.image2, R.drawable.image2, R.drawable.image2,
            R.drawable.image2, R.drawable.image2, R.drawable.image2, R.drawable.image2};

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mImageIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // Cria uma nova ImageView para cada item referenciado pelo Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // Se não foi reutilizado, inicializa algumas propriedades
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(250, 250));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        // Define a imagem de origem para a ImageView
        imageView.setImageResource(mImageIds[position]);
        return imageView;
    }
}

