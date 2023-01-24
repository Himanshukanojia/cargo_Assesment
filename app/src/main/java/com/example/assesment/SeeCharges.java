package com.example.assesment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SeeCharges extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_charges);

        ListView  listView =findViewById(R.id.listview);

        MyAdapter adapter=new MyAdapter();
        listView.setAdapter(adapter);
    }

    private class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {

            convertView = getLayoutInflater().inflate(R.layout.card,parent,false);
            TextView textView1=convertView.findViewById(R.id.from);
            ImageView ImageView1=convertView.findViewById(R.id.lane);
            TextView textView2=convertView.findViewById(R.id.to);
            TextView textView3=convertView.findViewById(R.id.from_full);
            TextView textView4=convertView.findViewById(R.id.time);
            TextView textView5=convertView.findViewById(R.id.to_full);
            TextView textView6=convertView.findViewById(R.id._date);
            TextView textView7=convertView.findViewById(R.id.free_time);
            TextView textView8=convertView.findViewById(R.id.month);
            TextView textView9=convertView.findViewById(R.id._free_time);
            ImageView ImageView2=convertView.findViewById(R.id.round1);
            ImageView ImageView3=convertView.findViewById(R.id.line);
            ImageView ImageView4=convertView.findViewById(R.id.round2);
            ImageView ImageView5=convertView.findViewById(R.id.logo);
            TextView textView10=convertView.findViewById(R.id.terms);
            TextView textVie11=convertView.findViewById(R.id.price);


            return convertView;
        }
    }
}