package com.x.cgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText course_1, course_2, course_3, course_4, course_5, course_6, course_7, course_8, course_9,
            course_10, course_11, course_12, course_13, course_14, course_15;
    EditText credit_1, credit_2, credit_3, credit_4, credit_5, credit_6, credit_7, credit_8, credit_9,
            credit_10, credit_11, credit_12, credit_13, credit_14, credit_15;
    EditText grade_1, grade_2, grade_3, grade_4, grade_5, grade_6, grade_7, grade_8, grade_9, grade_10,
            grade_11, grade_12, grade_13, grade_14, grade_15;
    EditText CGPA;
    Button calculate;

    int gp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        // Accessing the credit fields

        credit_1 = (EditText) findViewById(R.id.credit1); credit_9 = (EditText) findViewById(R.id.credit9);
        credit_2 = (EditText) findViewById(R.id.credit2); credit_10 = (EditText) findViewById(R.id.credit10);
        credit_3 = (EditText) findViewById(R.id.credit3); credit_11 = (EditText) findViewById(R.id.credit11);
        credit_4 = (EditText) findViewById(R.id.credit4); credit_12 = (EditText) findViewById(R.id.credit12);
        credit_5 = (EditText) findViewById(R.id.credit5); credit_13 = (EditText) findViewById(R.id.credit13);
        credit_6 = (EditText) findViewById(R.id.credit6); credit_14 = (EditText) findViewById(R.id.credit14);
        credit_7 = (EditText) findViewById(R.id.credit7); credit_15 = (EditText) findViewById(R.id.credit15);
        credit_8 = (EditText) findViewById(R.id.credit8);

        // Accessing the grade fields

        grade_1 = (EditText) findViewById(R.id.grade1); grade_10 = (EditText) findViewById(R.id.grade10);
        grade_2 = (EditText) findViewById(R.id.grade2); grade_11 = (EditText) findViewById(R.id.grade11);
        grade_3 = (EditText) findViewById(R.id.grade3); grade_12 = (EditText) findViewById(R.id.grade12);
        grade_4 = (EditText) findViewById(R.id.grade4); grade_13 = (EditText) findViewById(R.id.grade13);
        grade_5 = (EditText) findViewById(R.id.grade5); grade_14 = (EditText) findViewById(R.id.grade14);
        grade_6 = (EditText) findViewById(R.id.grade6); grade_15 = (EditText) findViewById(R.id.grade15);
        grade_7 = (EditText) findViewById(R.id.grade7);  grade_9 = (EditText) findViewById(R.id.grade9);
        grade_8 = (EditText) findViewById(R.id.grade8);

        // Accessing CGPA and Button

        CGPA = (EditText) findViewById(R.id.cgpa);
        calculate = (Button) findViewById(R.id.calculate_b);

        // On Button Clicked
        calculate.setOnClickListener(this);

    }

    // Button ckicked function

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.calculate_b:
                calcCGPA();
                break;
        }
    }


     // Calcculate CGPA

    private void calcCGPA() {

/** CALCULATING THE UNIT **/

        //course1
        String c1 = credit_1.getText().toString();
        int cr1;
        try {
            cr1 = Integer.parseInt(c1);
        } catch (NumberFormatException e) {
            cr1 = 0;
        }

        //course2
        String c2 = credit_2.getText().toString();
        int cr2;
        try {
            cr2 = Integer.parseInt(c2);
        } catch (NumberFormatException e) {
            cr2 = 0;
        }

        //course3
        String c3 = credit_3.getText().toString();
        int cr3;
        try {
            cr3 = Integer.parseInt(c3);
        } catch (NumberFormatException e) {
            cr3 = 0;
        }

        //course4
        String c4 = credit_4.getText().toString();
        int cr4;
        try {
            cr4 = Integer.parseInt(c4);
        } catch (NumberFormatException e) {
            cr4 = 0;
        }

        //course5
        String c5 = credit_5.getText().toString();
        int cr5;
        try {
            cr5 = Integer.parseInt(c5);
        } catch (NumberFormatException e) {
            cr5 = 0;
        }

        //course6
        String c6 = credit_6.getText().toString();
        int cr6;
        try {
            cr6 = Integer.parseInt(c6);
        } catch (NumberFormatException e) {
            cr6 = 0;
        }

        //course7
        String c7 = credit_7.getText().toString();
        int cr7;
        try {
            cr7 = Integer.parseInt(c7);
        } catch (NumberFormatException e) {
            cr7 = 0;
        }

        //course8
        String c8 = credit_8.getText().toString();
        int cr8;
        try {
            cr8 = Integer.parseInt(c8);
        } catch (NumberFormatException e) {
            cr8 = 0;
        }

        //course9
        String c9 = credit_9.getText().toString();
        int cr9;
        try {
            cr9 = Integer.parseInt(c9);
        } catch (NumberFormatException e) {
            cr9 = 0;
        }

        //course10
        String c10 = credit_10.getText().toString();
        int cr10;
        try {
            cr10 = Integer.parseInt(c10);
        } catch (NumberFormatException e) {
            cr10 = 0;
        }

        //course11
        String c11 = credit_11.getText().toString();
        int cr11;
        try {
            cr11 = Integer.parseInt(c11);
        } catch (NumberFormatException e) {
            cr11 = 0;
        }

        //course12
        String c12 = credit_12.getText().toString();
        int cr12;
        try {
            cr12 = Integer.parseInt(c12);
        } catch (NumberFormatException e) {
            cr12 = 0;
        }

        //course13
        String c13 = credit_13.getText().toString();
        int cr13;
        try {
            cr13 = Integer.parseInt(c13);
        } catch (NumberFormatException e) {
            cr13 = 0;
        }

        //course14
        String c14 = credit_14.getText().toString();
        int cr14;
        try {
            cr14 = Integer.parseInt(c14);
        } catch (NumberFormatException e) {
            cr14 = 0;
        }

        //course15
        String c15 = credit_15.getText().toString();
        int cr15;
        try {
            cr15 = Integer.parseInt(c15);
        } catch (NumberFormatException e) {
            cr15 = 0;
        }

        int total_unit = cr1 + cr2 + cr3 + cr4 + cr5 + cr6 + cr7 +
                cr8 + cr9 + cr10 + cr11 + cr12 + cr13 + cr14 + cr15;

/**         CALCULATING GRADE                 **/


        //course1
        String g1 = grade_1.getText().toString();
        float gp1;
        try {
            gp1 = Float.parseFloat(g1);
        } catch (NumberFormatException e) {
            gp1 = 0;
        }

        //course2
        String g2 = grade_2.getText().toString();
        float gp2;
        try {
            gp2 = Float.parseFloat(g2);
        } catch (NumberFormatException e) {
            gp2 = 0;
        }


        //course3
        String g3 = grade_3.getText().toString();
        float gp3;
        try {
            gp3 = Float.parseFloat(g3);
        } catch (NumberFormatException e) {
            gp3 = 0;
        }


        //course4
        String g4 = grade_4.getText().toString();
        float gp4;
        try {
            gp4 = Float.parseFloat(g4);
        } catch (NumberFormatException e) {
            gp4 = 0;
        }


        //course1
        String g5 = grade_5.getText().toString();
        float gp5;
        try {
            gp5 = Float.parseFloat(g5);
        } catch (NumberFormatException e) {
            gp5 = 0;
        }


        //course6
        String g6 = grade_6.getText().toString();
        float gp6;
        try {
            gp6 = Float.parseFloat(g6);
        } catch (NumberFormatException e) {
            gp6 = 0;
        }


        //course7
        String g7 = grade_7.getText().toString();
        float gp7;
        try {
            gp7 = Float.parseFloat(g7);
        } catch (NumberFormatException e) {
            gp7 = 0;
        }


        //course8
        String g8 = grade_8.getText().toString();
        float gp8;
        try {
            gp8 = Float.parseFloat(g8);
        } catch (NumberFormatException e) {
            gp8 = 0;
        }


        //course9
        String g9 = grade_9.getText().toString();
        float gp9;
        try {
            gp9 = Float.parseFloat(g9);
        } catch (NumberFormatException e) {
            gp9 = 0;
        }


        //course10
        String g10 = grade_10.getText().toString();
        float gp10;
        try {
            gp10 = Float.parseFloat(g10);
        } catch (NumberFormatException e) {
            gp10 = 0;
        }


        //course11
        String g11 = grade_11.getText().toString();
        float gp11;
        try {
            gp11 = Float.parseFloat(g11);
        } catch (NumberFormatException e) {
            gp11 = 0;
        }


        //course12
        String g12 = grade_12.getText().toString();
        float gp12;
        try {
            gp12 = Float.parseFloat(g12);
        } catch (NumberFormatException e) {
            gp12 = 0;
        }


        //course13
        String g13 = grade_13.getText().toString();
        float gp13;
        try {
            gp13 = Float.parseFloat(g13);
        } catch (NumberFormatException e) {
            gp13 = 0;
        }


        //course14
        String g14 = grade_14.getText().toString();
        float gp14;
        try {
            gp14 = Float.parseFloat(g14);
        } catch (NumberFormatException e) {
            gp14 = 0;
        }


        //course15
        String g15 = grade_15.getText().toString();
        float gp15;
        try {
            gp15 = Float.parseFloat(g15);
        } catch (NumberFormatException e) {
            gp15 = 0;
        }


        try {

/**      CALCULATE GPA             **/


            double GP1 = cr1 * gp1; double GP9 = cr9 * gp9;
            double GP2 = cr2 * gp2; double GP10 = cr10 * gp10;
            double GP3 = cr3 * gp3; double GP11 = cr11 * gp11;
            double GP4 = cr4 * gp4; double GP12 = cr12 * gp12;
            double GP5 = cr5 * gp5; double GP13 = cr13 * gp13;
            double GP6 = cr6 * gp6; double GP14 = cr14 * gp14;
            double GP7 = cr7 * gp7; double GP15 = cr15 * gp15;
            double GP8 = cr8 * gp8;


            double total_GP = GP1 + GP2 + GP3 + GP4 + GP5 + GP6 + GP7 +
                    GP8 + GP9 + GP10 + GP11 + GP12 + GP13 + GP14 + GP15;


/**       CALCULATE CGPA             **/


            double cgpa = total_GP / total_unit;

            // Display CGPA

            CGPA.setText(String.valueOf(cgpa));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
