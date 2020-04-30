
package com.example420.cartel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;
    public SliderAdapter(Context context){
        this.context=context;
    }

    public int[] images={
            R.drawable.spacevr,
            R.drawable.spaceshooter
    };

    public String[] headings={
            "SPACE SETTELMENT WALKTHROUGH-VR",
            "SPACE SHOOTER",

    };

    public String[] desc={
            "Indulge into a futuristic walkthrough into a Settlement on the moon.\n" +
                    "Never seen before, witness the future through VR.\\n\\n\n" +
                    "Developed by Shashank Lokesh.",
            "Fight through a swarm of aliens for galactic justice. \n" +
                    "A first person shooter never seen before. Coming soon on Android"
    };
    @Override
    public int getCount() {
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view== (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slider,container,false);

        ImageView slideimage=view.findViewById(R.id.imageView);
        TextView slideheading=view.findViewById(R.id.textView);
        TextView slidedesc=view.findViewById(R.id.textView2);

        slideimage.setImageResource(images[position]);
        slideheading.setText(headings[position]);
        slidedesc.setText(desc[position]);

        container.addView(view);

        return view;


    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }
}