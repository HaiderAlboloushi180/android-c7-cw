package com.example.android.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle bundle = getIntent().getExtras();
        final Items selectedItem = (Items) bundle.getSerializable("ITEMS");

        String selectedItemName = selectedItem.getItemName();
        Double selectedItemPrice = selectedItem.getItemPrice();
        int selectedItemImage = selectedItem.getItemImage();

        TextView itemNameTextView  = findViewById(R.id.itemName);
        TextView itemPriceTextView = findViewById(R.id.itemPrice);
        ImageView itemImageView = findViewById(R.id.itemImage);

        itemNameTextView.setText(selectedItemName);
        itemPriceTextView.setText(""+selectedItemPrice);
        itemImageView.setImageResource(selectedItemImage);
    }
}