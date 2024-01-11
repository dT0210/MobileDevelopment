package com.example.myapplication.Tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Tuan3MainActivity extends AppCompatActivity {
    ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan3_main);
        lvContact = findViewById(R.id.lv);
        ArrayList<Contact> arrContact = new ArrayList<>();
        Contact contact1 = new Contact("RED", "Nguyen Duc Thanh", "012345678");
        Contact contact2 = new Contact("GREEN", "Pham Hong Minh", "012345679");
        Contact contact3 = new Contact("BLUE", "Bach Thanh Tra", "0654876452");

        arrContact.add(contact1);
        arrContact.add(contact2);
        arrContact.add(contact3);

        CustomAdapter adapter = new CustomAdapter(this, R.layout.item_listview_tuan3, arrContact);
        lvContact.setAdapter(adapter);
    }
}