package com.smktelkom.www.db2_farhan;

import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);


    }

    public void onClickShareTextButton(View v) {
        EditText textToShare = findViewById(R.id.body);
        String textThatYouWantToShare = textToShare.getText().toString();
        shareText(textThatYouWantToShare);
    }

    private void shareText(String textToShare) {
        String mimeType = "text/plain";
        String title = "Share Text";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle(title)
                .setText(textToShare)
                .startChooser();
    }
}


