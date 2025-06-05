package com.example.studentclass;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    // Declare TextViews
    private TextView textViewProfileName, textViewProfileId, textViewProfileTopic;
    private Object MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                // Get the Intent that started this activity
        Intent intent = getIntent();

        // Check if the Intent has extras (data)
        if (intent != null && intent.getExtras() != null) {
            String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
            String studentId = intent.getStringExtra(MainActivity.EXTRA_STUDENT_ID);
            String researchTopic = intent.getStringExtra(MainActivity.EXTRA_RESEARCH_TOPIC);

            // Display the data in the TextViews
            textViewProfileName.setText("Name: " + (name != null ? name : "N/A"));
            textViewProfileId.setText("Student ID: " + (studentId != null ? studentId : "N/A"));
            textViewProfileTopic.setText("Research Topic: " + (researchTopic != null && !researchTopic.isEmpty() ? researchTopic : "N/A"));
        } else {
            // If no data was passed, show error messages
            textViewProfileName.setText("Name: Error loading data");
            textViewProfileId.setText("Student ID: Error loading data");
            textViewProfileTopic.setText("Research Topic: Error loading data");
        }
    }
}
