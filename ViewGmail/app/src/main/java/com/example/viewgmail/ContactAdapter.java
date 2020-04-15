package com.example.viewgmail;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.viewgmail.ContactModel;
import com.example.viewgmail.R;

import java.util.List;

public class ContactAdapter extends BaseAdapter {

    List<ContactModel> contacts;

    public ContactAdapter(List<ContactModel> contacts) {
        this.contacts = contacts;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int i) {
        return contacts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;

        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = view.findViewById(R.id.imgView);
            viewHolder.textFullname = view.findViewById(R.id.text_fullname);
            viewHolder.textRound = view.findViewById(R.id.text_round);
            viewHolder.textSubject = view.findViewById(R.id.text_subject);
            viewHolder.textContent = view.findViewById(R.id.text_content);
            viewHolder.textTime = view.findViewById(R.id.text_time);
            viewHolder.imageFavorite = view.findViewById(R.id.img_star);
            view.setTag(viewHolder);

        }
        else
            viewHolder = (ViewHolder) view.getTag();

        final ContactModel contact = contacts.get(i);
        viewHolder.textRound.setText(contact.getName().substring(0, 1));
        viewHolder.imageView.setColorFilter(Color.parseColor(contact.getColor()));
        viewHolder.textFullname.setText(contact.getName());
        viewHolder.textSubject.setText(contact.getSubject());
        viewHolder.textContent.setText(contact.getContent());

        if (contact.isStar())
            viewHolder.imageFavorite.setImageResource(R.drawable.ic_star_favorite);
        else
            viewHolder.imageFavorite.setImageResource(R.drawable.ic_star_normal);

        viewHolder.imageFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isStar = contacts.get(i).isStar();
                contacts.get(i).setStar(!isStar);
                notifyDataSetChanged();

            }
        });

        return view;
    }

    class ViewHolder {
        ImageView imageView;
        TextView textRound;
        TextView textFullname;
        TextView textSubject;
        TextView textContent;
        TextView textTime;
        ImageView imageFavorite;
    }
}
