package com.example.teatime.survey;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.os.Environment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LayoutInflater inflater = LayoutInflater.from(this);
        final LinearLayout questionPart = (LinearLayout)findViewById(R.id.question);
        final LinearLayout q1 = (LinearLayout)inflater.inflate(R.layout.question1,null).findViewById(R.id.linQ1);
        final LinearLayout q2 = (LinearLayout)inflater.inflate(R.layout.question2,null).findViewById(R.id.linQ2);
        final LinearLayout q3 = (LinearLayout)inflater.inflate(R.layout.question3,null).findViewById(R.id.linQ3);
        final LinearLayout q4 = (LinearLayout)inflater.inflate(R.layout.question4,null).findViewById(R.id.linQ4);
        final LinearLayout q5 = (LinearLayout)inflater.inflate(R.layout.question5,null).findViewById(R.id.linQ5);
        final LinearLayout q6 = (LinearLayout)inflater.inflate(R.layout.question6,null).findViewById(R.id.linQ6);
        final LinearLayout q7 = (LinearLayout)inflater.inflate(R.layout.question7,null).findViewById(R.id.linQ7);
        final LinearLayout q8 = (LinearLayout)inflater.inflate(R.layout.question8,null).findViewById(R.id.linQ8);
        final LinearLayout q9 = (LinearLayout)inflater.inflate(R.layout.question9,null).findViewById(R.id.linQ9);
        final LinearLayout q10 = (LinearLayout)inflater.inflate(R.layout.question10,null).findViewById(R.id.linQ10);
        final LinearLayout q11 = (LinearLayout)inflater.inflate(R.layout.question11,null).findViewById(R.id.linQ11);
        final LinearLayout q12 = (LinearLayout)inflater.inflate(R.layout.question12,null).findViewById(R.id.linQ12);

        final String[] result;
        result = new String[12];
        final String[] sum;
        sum = new String[1];

        Button btnStart = (Button)findViewById(R.id.start);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                questionPart.removeAllViews();
                questionPart.addView(q1);

                Button btnGoTo2 = (Button)findViewById(R.id.btnGoTo2);
                RadioGroup rg1 = (RadioGroup)findViewById(R.id.rg1);
                result[0]="yes";
                final RadioButton rd1_yes = (RadioButton)findViewById(R.id.q1_yes);
                final RadioButton rd1_no = (RadioButton)findViewById(R.id.q1_no);

                rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                    @Override
                    public void onCheckedChanged(RadioGroup group,int checkedId){
                        if(checkedId==rd1_yes.getId()){
                            result[0]=rd1_yes.getText().toString();
                        }
                        else if(checkedId==rd1_no.getId()){
                            result[0]=rd1_no.getText().toString();
                        }
                    }
                });

                btnGoTo2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        q1.removeAllViews();
                        q1.addView(q2);

                        Button btnGoTo3 = (Button)findViewById(R.id.btnGoTo3);
                        RadioGroup rg2 = (RadioGroup)findViewById(R.id.rg2);
                        result[1]="yes";
                        final RadioButton rd2_yes = (RadioButton)findViewById(R.id.q2_yes);
                        final RadioButton rd2_no = (RadioButton)findViewById(R.id.q2_no);

                        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                            @Override
                            public void onCheckedChanged(RadioGroup group,int checkedId){
                                if(checkedId==rd2_yes.getId()){
                                    result[1]=rd2_yes.getText().toString();
                                }
                                else if(checkedId==rd2_no.getId()){
                                    result[1]=rd2_no.getText().toString();
                                }
                            }
                        });

                        btnGoTo3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                q2.removeAllViews();
                                q2.addView(q3);

                                Button btnGoTo4 = (Button)findViewById(R.id.btnGoTo4);
                                RadioGroup rg3 = (RadioGroup)findViewById(R.id.rg3);
                                result[2]="yes";
                                final RadioButton rd3_yes = (RadioButton)findViewById(R.id.q3_yes);
                                final RadioButton rd3_no = (RadioButton)findViewById(R.id.q3_no);

                                rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                                    @Override
                                    public void onCheckedChanged(RadioGroup group,int checkedId){
                                        if(checkedId==rd3_yes.getId()){
                                            result[2]=rd3_yes.getText().toString();
                                        }
                                        else if(checkedId==rd3_no.getId()){
                                            result[2]=rd3_no.getText().toString();
                                        }
                                    }
                                });

                                btnGoTo4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        q3.removeAllViews();
                                        q3.addView(q4);

                                        Button btnGoTo5 = (Button)findViewById(R.id.btnGoTo5);
                                        RadioGroup rg4 = (RadioGroup)findViewById(R.id.rg4);
                                        result[3]="yes";
                                        final RadioButton rd4_yes = (RadioButton)findViewById(R.id.q4_yes);
                                        final RadioButton rd4_no = (RadioButton)findViewById(R.id.q4_no);

                                        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                                            @Override
                                            public void onCheckedChanged(RadioGroup group,int checkedId){
                                                if(checkedId==rd4_yes.getId()){
                                                    result[3]=rd4_yes.getText().toString();
                                                }
                                                else if(checkedId==rd4_no.getId()){
                                                    result[3]=rd4_no.getText().toString();
                                                }
                                            }
                                        });

                                        btnGoTo5.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                q4.removeAllViews();
                                                q4.addView(q5);

                                                Button btnGoTo6 = (Button)findViewById(R.id.btnGoTo6);
                                                RadioGroup rg5 = (RadioGroup)findViewById(R.id.rg5);
                                                result[4]="yes";
                                                final RadioButton rd5_yes = (RadioButton)findViewById(R.id.q5_yes);
                                                final RadioButton rd5_no = (RadioButton)findViewById(R.id.q5_no);

                                                rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                                                    @Override
                                                    public void onCheckedChanged(RadioGroup group,int checkedId){
                                                        if(checkedId==rd5_yes.getId()){
                                                            result[4]=rd5_yes.getText().toString();
                                                        }
                                                        else if(checkedId==rd5_no.getId()){
                                                            result[4]=rd5_no.getText().toString();
                                                        }
                                                    }
                                                });

                                                btnGoTo6.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        q5.removeAllViews();
                                                        q5.addView(q6);

                                                        Button btnGoTo7 = (Button)findViewById(R.id.btnGoTo7);
                                                        RadioGroup rg6 = (RadioGroup)findViewById(R.id.rg6);
                                                        result[5]="yes";
                                                        final RadioButton rd6_yes = (RadioButton)findViewById(R.id.q6_yes);
                                                        final RadioButton rd6_no = (RadioButton)findViewById(R.id.q6_no);

                                                        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                                                            @Override
                                                            public void onCheckedChanged(RadioGroup group,int checkedId){
                                                                if(checkedId==rd6_yes.getId()){
                                                                    result[5]=rd6_yes.getText().toString();
                                                                }
                                                                else if(checkedId==rd6_no.getId()){
                                                                    result[5]=rd6_no.getText().toString();
                                                                }
                                                            }
                                                        });

                                                        btnGoTo7.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                q6.removeAllViews();
                                                                q6.addView(q7);

                                                                Button btnGoTo8 = (Button)findViewById(R.id.btnGoTo8);
                                                                RadioGroup rg7 = (RadioGroup)findViewById(R.id.rg7);
                                                                result[6]="yes";
                                                                final RadioButton rd7_yes = (RadioButton)findViewById(R.id.q7_yes);
                                                                final RadioButton rd7_no = (RadioButton)findViewById(R.id.q7_no);

                                                                rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                                                                    @Override
                                                                    public void onCheckedChanged(RadioGroup group,int checkedId){
                                                                        if(checkedId==rd7_yes.getId()){
                                                                            result[6]=rd7_yes.getText().toString();
                                                                        }
                                                                        else if(checkedId==rd7_no.getId()){
                                                                            result[6]=rd7_no.getText().toString();
                                                                        }
                                                                    }
                                                                });

                                                                btnGoTo8.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        q7.removeAllViews();
                                                                        q7.addView(q8);

                                                                        result[7] = "favourite : ";

                                                                        Button btnGoTo9 = (Button)findViewById(R.id.btnGoTo9);
                                                                        final CheckBox cb1 = (CheckBox)findViewById(R.id.cb1);
                                                                        final CheckBox cb2 = (CheckBox)findViewById(R.id.cb2);
                                                                        final CheckBox cb3 = (CheckBox)findViewById(R.id.cb3);
                                                                        final CheckBox cb4 = (CheckBox)findViewById(R.id.cb4);
                                                                        final CheckBox cb5 = (CheckBox)findViewById(R.id.cb5);
                                                                        final CheckBox cb6 = (CheckBox)findViewById(R.id.cb6);
                                                                        final CheckBox cb7 = (CheckBox)findViewById(R.id.cb7);
                                                                        final CheckBox cb8 = (CheckBox)findViewById(R.id.cb8);
                                                                        final CheckBox cb9 = (CheckBox)findViewById(R.id.cb9);
                                                                        final CheckBox cb10 = (CheckBox)findViewById(R.id.cb10);

                                                                        OnCheckedChangeListener listener= new OnCheckedChangeListener(){
                                                                            //String checkResult = new String("");
                                                                            @Override
                                                                            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                                                                                if(buttonView.getId()==R.id.cb1){
                                                                                    if(isChecked){
                                                                                        //checkResult += buttonView.getText().toString();
                                                                                        result[7] += buttonView.getText().toString() + ".";
                                                                                    }
                                                                                }
                                                                                if(buttonView.getId()==R.id.cb2){
                                                                                    if(isChecked){
                                                                                        //checkResult += buttonView.getText().toString();
                                                                                        result[7] += buttonView.getText().toString() + ".";
                                                                                    }
                                                                                }
                                                                                if(buttonView.getId()==R.id.cb3){
                                                                                    if(isChecked){
                                                                                        //checkResult += buttonView.getText().toString();
                                                                                        result[7] += buttonView.getText().toString() + ".";
                                                                                    }
                                                                                }
                                                                                if(buttonView.getId()==R.id.cb4){
                                                                                    if(isChecked){
                                                                                        //checkResult += buttonView.getText().toString();
                                                                                        result[7] += buttonView.getText().toString() + ".";
                                                                                    }
                                                                                }
                                                                                if(buttonView.getId()==R.id.cb5){
                                                                                    if(isChecked){
                                                                                        //checkResult += buttonView.getText().toString();
                                                                                        result[7] += buttonView.getText().toString() + ".";
                                                                                    }
                                                                                }
                                                                                if(buttonView.getId()==R.id.cb6){
                                                                                    if(isChecked){
                                                                                        //checkResult += buttonView.getText().toString();
                                                                                        result[7] += buttonView.getText().toString() + ".";
                                                                                    }
                                                                                }
                                                                                if(buttonView.getId()==R.id.cb7){
                                                                                    if(isChecked){
                                                                                        //checkResult += buttonView.getText().toString();
                                                                                        result[7] += buttonView.getText().toString() + ".";
                                                                                    }
                                                                                }
                                                                                if(buttonView.getId()==R.id.cb8){
                                                                                    if(isChecked){
                                                                                        //checkResult += buttonView.getText().toString();
                                                                                        result[7] += buttonView.getText().toString() + ".";
                                                                                    }
                                                                                }
                                                                                if(buttonView.getId()==R.id.cb9){
                                                                                    if(isChecked){
                                                                                        //checkResult += buttonView.getText().toString();
                                                                                        result[7] += buttonView.getText().toString() + ".";
                                                                                    }
                                                                                }
                                                                                if(buttonView.getId()==R.id.cb10){
                                                                                    if(isChecked){
                                                                                        //checkResult += buttonView.getText().toString();
                                                                                        result[7] += buttonView.getText().toString() + ".";
                                                                                    }
                                                                                }
                                                                            }
                                                                        };

                                                                        cb1.setOnCheckedChangeListener(listener);
                                                                        cb2.setOnCheckedChangeListener(listener);
                                                                        cb3.setOnCheckedChangeListener(listener);
                                                                        cb4.setOnCheckedChangeListener(listener);
                                                                        cb5.setOnCheckedChangeListener(listener);
                                                                        cb6.setOnCheckedChangeListener(listener);
                                                                        cb7.setOnCheckedChangeListener(listener);
                                                                        cb8.setOnCheckedChangeListener(listener);
                                                                        cb9.setOnCheckedChangeListener(listener);
                                                                        cb10.setOnCheckedChangeListener(listener);

                                                                        btnGoTo9.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View view) {
                                                                                q8.removeAllViews();
                                                                                q8.addView(q9);

                                                                                Button btnGoTo10 = (Button)findViewById(R.id.btnGoTo10);
                                                                                final EditText etName = (EditText)findViewById(R.id.etName);

                                                                                btnGoTo10.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View view) {
                                                                                        result[8] = etName.getText().toString();
                                                                                        q9.removeAllViews();
                                                                                        q9.addView(q10);

                                                                                        Button btnGoTo11 = (Button)findViewById(R.id.btnGoTo11);
                                                                                        String[] adapterData = new String[]{"Argentine","Australia","Belgium","Bolivia","Bulgaria","Canada","Chile","China",
                                                                                                                            "Colombia","Czech Republic","Denmark","Egypt","Ethiopia","Finland","France",
                                                                                                                            "Germany","Ghana","Greece","Guinea","Hungary","Iceland","India","Indonesia","Iran",
                                                                                                                            "Iraq","Ireland","Italy","Japan","Koren","Latvia","Lithuania","Madagascar","Malaysia",
                                                                                                                            "Mexico","Monaco","Nepal","Netherlands","Nigeria","North Korea","Norway","Pakistan",
                                                                                                                            "Panama","Peru","Philippines","Poland","Portugal","Russia","Saudi Arabia","Singapore",
                                                                                                                            "Slovakia","Slovenia","South Africa","Spain","Sweden","Switzerland","Thailand","Turkey",
                                                                                                                            "United Kingdom","United State","Others(not list here)"};
                                                                                        final ListView lvNationality = (ListView)findViewById(R.id.lvNationality);
                                                                                        lvNationality.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_expandable_list_item_1,adapterData));
                                                                                        lvNationality.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                                                            @Override
                                                                                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                                                                                //lvNationality.setSelection(i);
                                                                                                result[9] = lvNationality.getItemAtPosition(i).toString();
                                                                                                //view.setBackgroundColor(Color.parseColor("#F5D6EA"));
                                                                                            }
                                                                                        });

                                                                                        btnGoTo11.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View view) {
                                                                                                q10.removeAllViews();
                                                                                                q10.addView(q11);

                                                                                                Button btnGoTo12 = (Button)findViewById(R.id.btnGoTo12);
                                                                                                final EditText etAge = (EditText)findViewById(R.id.etAge);

                                                                                                btnGoTo12.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View view) {
                                                                                                        result[10] = etAge.getText().toString();
                                                                                                        q11.removeAllViews();
                                                                                                        q11.addView(q12);

                                                                                                        Button btnFinish = (Button)findViewById(R.id.finish);
                                                                                                        final EditText etEmail = (EditText)findViewById(R.id.etEmail);

                                                                                                        btnFinish.setOnClickListener(new View.OnClickListener() {
                                                                                                            @Override
                                                                                                            public void onClick(View view) {
                                                                                                                result[11] = etEmail.getText().toString();
                                                                                                                sum[0] = "1: " + result[0] + "\n"
                                                                                                                        + "2: " + result[1] + "\n"
                                                                                                                        + "3: " + result[2] + "\n"
                                                                                                                        + "4: " + result[3] + "\n"
                                                                                                                        + "5: " + result[4] + "\n"
                                                                                                                        + "6: " + result[5] + "\n"
                                                                                                                        + "7: " + result[6] + "\n"
                                                                                                                        + "8: " + result[7] + "\n"
                                                                                                                        + "9: " + result[8] + "\n"
                                                                                                                        + "10: " + result[9] + "\n"
                                                                                                                        + "11: " + result[10] + "\n"
                                                                                                                        + "12: " + result[11] + "\n";
                                                                                                                int count = 0;
                                                                                                                for(int i=0;i<6;i++){
                                                                                                                    if(result[i] == "yes")
                                                                                                                            count ++;
                                                                                                                }
                                                                                                                if(count > 4)
                                                                                                                    sum[0] += "You love sweets! :)";
                                                                                                                else
                                                                                                                    sum[0] += "You seem don't like sweets. :(";
                                                                                                                final AlertDialog ad = new AlertDialog.Builder(MainActivity.this).
                                                                                                                        setTitle("Your choices:").
                                                                                                                        setMessage(sum[0]).
                                                                                                                        setPositiveButton("ok, give me feedback.", new DialogInterface.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                                                                                                String filePath;
                                                                                                                                boolean hasSDCard = Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
                                                                                                                                if(hasSDCard){
                                                                                                                                    filePath = Environment.getExternalStorageDirectory().toString() + File.separator + "survey_result.txt";
                                                                                                                                    //filePath = "/sdcard/";
                                                                                                                                }else{
                                                                                                                                    filePath = Environment.getDownloadCacheDirectory().toString() + File.separator + "survey_result.txt";
                                                                                                                                    //filePath = "/sdcard/";
                                                                                                                                }
                                                                                                                                try{
                                                                                                                                    File file = new File(filePath);
                                                                                                                                    if (!file.exists()) {
                                                                                                                                        AlertDialog ad2 = new AlertDialog.Builder(MainActivity.this).
                                                                                                                                                setMessage("Successfully outprint. Path:" + filePath).
                                                                                                                                                setPositiveButton("got it.", new DialogInterface.OnClickListener() {
                                                                                                                                                    @Override
                                                                                                                                                    public void onClick(DialogInterface dialogInterface, int i) {

                                                                                                                                                    }
                                                                                                                                                }).create();
                                                                                                                                        ad2.show();
                                                                                                                                        File dir = new File(file.getParent());
                                                                                                                                        dir.mkdirs();
                                                                                                                                        file.createNewFile();
                                                                                                                                    }
                                                                                                                                    FileOutputStream outStream = new FileOutputStream(file);
                                                                                                                                    outStream.write(sum[0].getBytes());

                                                                                                                                    outStream.close();
                                                                                                                                }catch (Exception e){
                                                                                                                                    //e.printStackTrace();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }).
                                                                                                                        setNegativeButton("got it. I don't want feedback.", new DialogInterface.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(DialogInterface dialogInterface, int i) {

                                                                                                                            }
                                                                                                                        }).
                                                                                                                        create();
                                                                                                                ad.show();
                                                                                                            }
                                                                                                        });
                                                                                                    }
                                                                                                });
                                                                                            }
                                                                                        });
                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                    }
                                                                });
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });

    }
}