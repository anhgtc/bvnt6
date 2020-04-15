package com.example.viewgmail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.bloco.faker.Faker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<ContactModel> contact = new ArrayList<>();
        Faker fake = new Faker();
        for (int i =0; i<15; i++)
        {
            contact.add(new ContactModel(fake.name.name(), fake.lorem.sentence(), fake.lorem.paragraph(), "12pm", fake.color.hexColor()));
        }
        ContactAdapter adapter = new ContactAdapter(contact);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);


    }
}
