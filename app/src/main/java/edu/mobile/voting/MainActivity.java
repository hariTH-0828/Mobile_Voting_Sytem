package edu.mobile.voting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextView validateId;
    private TextInputEditText getVoterid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        validateId = findViewById(R.id.idVerify);
        getVoterid = findViewById(R.id.editVoterid);

        getVoterid.setOnFocusChangeListener((view, b) -> {
            if(!b){
                Log.i("getVoter", "Focus out");
            }
        });

        validateId.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "Button clicked", Toast.LENGTH_SHORT).show());
    }


}