package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableRow;

public class MessageList extends AppCompatActivity {

    TableRow row1;
    private static final int PICK_CONTACT = 1234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_list);

        ImageView iv1 = (ImageView)findViewById(R.id.image4);
        iv1.setImageResource(R.drawable.girl_prof1);

        ImageView iv2 = (ImageView)findViewById(R.id.image1);
        iv2.setImageResource(R.drawable.boy);

        ImageView iv3 = (ImageView)findViewById(R.id.image3);
        iv3.setImageResource(R.drawable.giroud5);

        iv1 = (ImageView)findViewById(R.id.image2);
        iv1.setImageResource(R.drawable.boy2);
    }

    public void runChat(View view){
//        Log.d("Test", "Test");
        Intent intent = new Intent(MessageList.this, ChatTestActivity.class);
        startActivity(intent);
    }
    public void runChat2(View view){
//        Log.d("Test", "Test");
        Intent intent = new Intent(MessageList.this, ChatTestActivity2.class);
        startActivity(intent);
    }

    public void addMessage(View view){
        Intent it= new Intent(Intent.ACTION_PICK,  ContactsContract.Contacts.CONTENT_URI);

        startActivityForResult(it, PICK_CONTACT);

//        Intent intent = new Intent(MessageList.this, ChatTestActivity.class);
//        startActivity(intent);
    }

}
