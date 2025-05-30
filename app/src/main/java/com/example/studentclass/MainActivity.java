package com.example.studentclass;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Define the Student Class
    public class Student {
        private String name;
        private String studentId;

        // Constructor
        public Student(String name, String studentId) {
            this.name = name;
            this.studentId = studentId;
        }

        // Getter and Setter methods
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }
    }

    // Define the GraduateStudent Subclass
    public class GraduateStudent extends Student {
        private String researchTopic;

        // Constructor
        public GraduateStudent(String name, String studentId, String researchTopic) {
            super(name, studentId); // Calls the constructor of the parent (Student) class
            this.researchTopic = researchTopic;
        }

        // Getter and Setter for researchTopic
        public String getResearchTopic() {
            return researchTopic;
        }

        public void setResearchTopic(String researchTopic) {
            this.researchTopic = researchTopic;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create Student and GraduateStudent instances
        Student regularStudent = new Student("John Doe", "S1001");
        GraduateStudent gradStudent = new GraduateStudent("Jane Smith", "GS2002", "AI Ethics");

        // Get the TextView from the layout to display the output
        TextView outputTextView = findViewById(R.id.outputTextView);

        // Build the output text to display
        String output = "Student: " + regularStudent.getName() + ", ID: " + regularStudent.getStudentId() + "\n";
        output += "Grad Student: " + gradStudent.getName() + ", ID: " + gradStudent.getStudentId() +
                ", Research Topic: " + gradStudent.getResearchTopic() + "\n";

        // Test setter and update Grad Student's name
        gradStudent.setName("Jane Johnson");
        output += "Updated Grad Student Name: " + gradStudent.getName();

        // Display the output in the TextView
        outputTextView.setText(output);
    }
}
