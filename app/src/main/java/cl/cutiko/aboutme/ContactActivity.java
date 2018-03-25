package cl.cutiko.aboutme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        TextView linkedin = (TextView) findViewById(R.id.linkedIn);
        final TextView phone = (TextView) findViewById(R.id.phone);

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW);
                linkedinIntent.setData(Uri.parse("https://www.linkedin.com/in/genesis-narvaez/"));
                startActivity(linkedinIntent);
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + phone.getText().toString()));
                startActivity(callIntent);
                //For this to work you have to ask for permissions, go to the manifest and ask for the permission with this:
                //<uses-permission android:name="android.permission.CALL_PHONE"/>
                //Ask your professor for help now, tell him is about the permissions he will guide you with this
                //Maybe you are lucky and you are the first in to asking this... go figure
            }
        });

    }
}
