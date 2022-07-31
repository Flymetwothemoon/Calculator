package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private StringBuffer XW=new StringBuffer();
    private StringBuffer str=new StringBuffer();
   private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button0=(Button) findViewById(R.id.button_0);
        Button button1=(Button)findViewById(R.id.button_1);
        Button button2=(Button)findViewById(R.id.button_2);
        Button button3=(Button)findViewById(R.id.button_3);
        Button button4=(Button)findViewById(R.id.button_4);
        Button button5=(Button)findViewById(R.id.button_5);
        Button button6=(Button)findViewById(R.id.button_6);
        Button button7=(Button)findViewById(R.id.button_7);
        Button button8=(Button)findViewById(R.id.button_8);
        Button button9=(Button)findViewById(R.id.button_9);
        Button AC = (Button) findViewById(R.id.button_AC);
        Button left = (Button) findViewById(R.id.button_left);
        Button right = (Button) findViewById(R.id.button_right);
        Button chu = (Button) findViewById(R.id.button_chu);
        Button cheng = (Button) findViewById(R.id.button_cheng);
        Button jia = (Button) findViewById(R.id.button_jia);
        Button jian =(Button) findViewById(R.id.button_jian);
        Button DEL =(Button) findViewById(R.id.button_DEL);
        Button dian=(Button) findViewById(R.id.button_dian);
        Button deng = (Button) findViewById(R.id.button_deng);
        textView =   findViewById(R.id.textView);
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        AC.setOnClickListener(this);
        left.setOnClickListener(this);
        right.setOnClickListener(this);
        chu.setOnClickListener(this);
        cheng.setOnClickListener(this);
        jia.setOnClickListener(this);
        jian.setOnClickListener(this);
        DEL.setOnClickListener(this);
        dian.setOnClickListener(this);
        deng.setOnClickListener(this);

    }
    private boolean flag=false;
    private int zuo=0;
    private int you=0;
    private int a=0;
    @Override
    public void onClick(View view){
    switch (view.getId()){
        case R.id.button_0:
        if(flag){
            XW =XW.delete(0,XW.length());
            flag=false;
        }
        if(XW.length()==0){
            XW.append("0");
        }else{
            if(XW.charAt(XW.length()-1)==')'){
                XW.append("*0");
            }
            else{
                XW.append("0");
            }
        }
         textView.setText(XW.toString());
        break;
        case R.id.button_1:
            if(flag){
                XW=XW.delete(0,XW.length());
                flag=false;
            }
            if(XW.length()==0){
                XW.append("1");
            }else{
                if(XW.charAt(XW.length()-1)==')'){
                    XW.append("*1");
                }
                else{
                    XW.append("1");
                }
            }
            textView.setText(XW.toString());
            break;
        case R.id.button_2:
            if(flag){
                XW=XW.delete(0,XW.length());
                flag=false;
            }
            if(XW.length()==0){
                XW.append("2");
            }else{
                if(XW.charAt(XW.length()-1)==')'){
                    XW.append("*2");
                }
                else{
                    XW.append("2");
                }
            }
            textView.setText(XW.toString());
            break;
        case R.id.button_3:
            if(flag){
                XW=XW.delete(0,XW.length());
                flag=false;
            }
            if(XW.length()==0){
                XW.append("3");
            }else{
                if(XW.charAt(XW.length()-1)==')'){
                    XW.append("*3");
                }
                else{
                    XW.append("3");
                }
            }
            textView.setText(XW.toString());
            break;
        case R.id.button_4:
            if(flag){
                XW=XW.delete(0,XW.length());
                flag=false;
            }
            if(XW.length()==0){
                XW.append("4");
            }
            else{
                if(XW.charAt(XW.length()-1)==')'){
                    XW.append("*4");
                }
                else{
                    XW.append("4");
                }
        }
            textView.setText(XW.toString());
            break;
        case R.id.button_5:
            if(flag){
                XW=XW.delete(0,XW.length());
                flag=false;
            }
            if(XW.length()==0){
                XW.append("5");
            }
            else{
                if(XW.charAt(XW.length()-1)==')'){
                    XW.append("*5");
                }
                else{
                    XW.append("5");
                }
            }
            textView.setText(XW.toString());
            break;
        case R.id.button_6:
            if(flag){
                XW=XW.delete(0,XW.length());
                flag=false;
            }
            if(XW.length()==0){
                XW.append("6");
            }
            else{
                if(XW.charAt(XW.length()-1)==')'){
                    XW.append("*6");
                }
                else{
                    XW.append("6");
                }
            }
            textView.setText(XW.toString());
            break;
        case R.id.button_7:
            if(flag){
                XW=XW.delete(0,XW.length());
                flag=false;
            }
            if(XW.length()==0){
                XW.append("7");
            }
            else{
                if(XW.charAt(XW.length()-1)==')'){
                    XW.append("*7");
                }
                else{
                    XW.append("7");
                }
            }
            textView.setText(XW.toString());
            break;
        case R.id.button_8:
            if(flag){
                XW=XW.delete(0,XW.length());
                flag=false;
            }
            if(XW.length()==0){
                XW.append("8");
            }
            else{
                if(XW.charAt(XW.length()-1)==')'){
                    XW.append("*8");
                }
                else{
                    XW.append("8");
                }
            }
            textView.setText(XW.toString());
            break;
        case R.id.button_9:
            if(flag){
                XW=XW.delete(0,XW.length());
                flag=false;
            }
            if(XW.length()==0){
                XW.append("9");
            }
            else{
                if(XW.charAt(XW.length()-1)==')'){
                    XW.append("*9");
                }
                else{
                    XW.append("9");
                }
            }
            textView.setText(XW.toString());
            break;
            //左括号
        case R.id.button_left:
            if(flag){

                flag=false;
            }
            if(XW.length()>0&&(XW.charAt(XW.length()-1)>='0'&&XW.charAt(XW.length()-1)<='9')){
                XW=XW.append("*(");
            }
            if(XW.length()==0){
                XW.append("(");
            }
            if(XW.length()>0&&(XW.charAt(XW.length()-1)=='*'||XW.charAt(XW.length()-1)=='/'||XW.charAt(XW.length()-1)=='+'||XW.charAt(XW.length()-1)=='-')){
                XW=XW.append("(");
            }
            textView.setText(XW.toString());
            break;
        case R.id.button_right:
            if(flag){
                flag=false;
            }
            int count_num=0;
            int Sum=0;
            int num=0;
           zuo=you=0;
            if(XW.length()!=0){
                for(int i=XW.length()-1;i>=0;i--){
                    if(zuo==0&&(XW.charAt(i)>='0'&&XW.charAt(i)<='9')){
                        count_num++;
                    }
                    if(XW.charAt(i)=='('){
                       zuo++;

                    }
                    if(XW.charAt(i)==')'){
                        you++;
                    }
                }
                if((zuo>you)&&count_num>0){
                    if(XW.charAt(XW.length()-1)!='-'&&XW.charAt(XW.length()-1)!='+'&&XW.charAt(XW.length()-1)!='*'&&XW.charAt(XW.length()-1)!='/'){
                        XW.append(")");
                    }
                }
            }
            textView.setText(XW.toString());
            break;
            //清屏
        case R.id.button_AC:
            if(flag){
                flag=false;
            }
            XW=XW.delete(0,XW.length());
            textView.setText(XW.toString());
            break;
            //删除
        case R.id.button_DEL:
            if(flag){
                flag=false;
            }
            if(XW.length()!=0&&a==0){
                if(XW.charAt(XW.length()-1)=='-'&&XW.charAt(XW.length()-2)=='('||XW.charAt(XW.length()-1)=='.'&&XW.charAt(XW.length()-2)=='0'){
                    XW=XW.deleteCharAt(XW.length()-1);
                    XW=XW.deleteCharAt(XW.length()-1);
                }else{
                    XW=XW.deleteCharAt(XW.length()-1);
                }
            }
            else if(XW.length()!=0&&a==1){
                XW=XW.delete(0,XW.length());
            }
            textView.setText(XW.toString());
            a=0;
            break;
            //加法
        case R.id.button_jia:  if(flag){
            flag=false;
        }
            if(XW.length()!=0){
                if(XW.charAt(XW.length()-1)>='0'&&XW.charAt(XW.length()-1)<='9'||XW.charAt(XW.length()-1)=='.'){
                    if(XW.charAt(XW.length()-1)>='0'&&XW.charAt(XW.length()-1)<='9'){
                        XW.append("+");
                    }
                    if(XW.charAt(XW.length()-1)=='.'){
                        XW.append("0+");
                    }
                }
                if(XW.charAt(XW.length()-1)==')'){
                    XW.append("+");
                }
            }
            textView.setText(XW.toString());
            break;
            //减法
        case R.id.button_jian:
            if(flag){
                flag=false;
            }
            if(XW.length()!=0){
                if(XW.charAt(XW.length()-1)>='0'&&XW.charAt(XW.length()-1)<='9'||XW.charAt(XW.length()-1)=='.'){
                    if(XW.charAt(XW.length()-1)>='0'&&XW.charAt(XW.length()-1)<='9'){
                        XW.append("-");
                    }
                    if(XW.charAt(XW.length()-1)=='.'){
                        XW.append("0-");
                    }
                }
                if(XW.charAt(XW.length()-1)==')'){
                    XW.append("-");
                }
                else if(XW.charAt(XW.length()-1)=='('){
                    XW.append("(-");
                }
                else if(XW.charAt(XW.length()-1)=='+'||XW.charAt(XW.length()-1)=='-'||XW.charAt(XW.length()-1)=='*'||XW.charAt(XW.length()-1)=='/'){
                    XW.append("(-");
                }

            }
            else{
                XW.append("(-");
            }
            textView.setText(XW.toString());
            break;
        case R.id.button_cheng:
            if(flag){
               flag=false;
            }
            if(XW.length()!=0){
                if(XW.charAt(XW.length()-1)>='0'&&XW.charAt(XW.length()-1)<='9'||XW.charAt(XW.length()-1)=='.'){
                    if(XW.charAt(XW.length()-1)>='0'&&XW.charAt(XW.length()-1)<='9'){
                        XW.append("*");
                    }
                    if(XW.charAt(XW.length()-1)=='.'){
                        XW.append("0*");
                    }
                }
                if(XW.charAt(XW.length()-1)==')'){
                    XW.append("*");
                }
            }
            textView.setText(XW.toString());
            break;
        case R.id.button_chu:
            if(flag){
                flag=false;
            }
            if(XW.length()!=0){
                if(XW.charAt(XW.length()-1)>='0'&&XW.charAt(XW.length()-1)<='9'||XW.charAt(XW.length()-1)=='.'){
                    if(XW.charAt(XW.length()-1)>='0'&&XW.charAt(XW.length()-1)<='9'){
                        XW.append("/");
                    }
                    if(XW.charAt(XW.length()-1)=='.'){
                        XW.append("0/");
                    }
                }
                if(XW.charAt(XW.length()-1)==')'){
                    XW.append("/");
                }
            }
            textView.setText(XW.toString());
            break;

        case R.id.button_dian:
            int apps=0;
            if(flag){
                flag=false;
            }
            if(XW.length()!=0){
                if(XW.charAt(XW.length()-1)>='0'&&XW.charAt(XW.length()-1)<='9'){
                    for(int i=XW.length()-2;i>=0;i--){
                        if(XW.charAt(i)=='.'){
                            apps=1;
                            break;
                        }
                        else if(XW.charAt(i)=='('||XW.charAt(i)=='+'||XW.charAt(i)=='-'||XW.charAt(i)=='*'||XW.charAt(i)=='/'){
                            break;
                        }
                    }
                    if(apps==0){
                        XW.append(".");
                    }
                }
                if(XW.charAt(XW.length()-1)=='('||XW.charAt(XW.length()-1)==')'){
                    if(XW.charAt(XW.length()-1)==')'){
                        XW.append("*0.");
                    }else{
                        XW.append("0.");
                    }
                }
                if(XW.charAt(XW.length()-1)=='*'||XW.charAt(XW.length()-1)=='/'||XW.charAt(XW.length()-1)=='+'||XW.charAt(XW.length()-1)=='-'){
                    XW.append("0.");
                }
            }
            else{
                XW.append("0.");
            }
            textView.setText(XW.toString());
            break;

        case R.id.button_deng:
            int count_left=0;
            int count_right=0;
            if(flag){
                flag=false;
            }
            if(XW.length()!=0){
                for(int i=XW.length()-1;i>=0;i--){
                    if(XW.charAt(i)==')'){
                        count_right++;
                    }
                    if(XW.charAt(i)=='('){
                        count_left++;
                    }
                }
                if(count_left!=count_right){
                    Toast.makeText(MainActivity.this, "请注意括号匹配！！！", Toast.LENGTH_SHORT).show();
                }
                if(count_left==count_right&&(XW.charAt(XW.length()-1)>='0'&&XW.charAt(XW.length()-1)<='9')||XW.charAt(XW.length()-1)==')'){
                    try{
                        textView.setText(InfixToSuffix.Cal(InfixToSuffix.Suffix(XW)));
                        a=1;
                        XW=XW.delete(0,XW.length());
                        XW.append(textView.getText().toString());
                    }catch(Exception e){
                        textView.setText("你怕不是贝极星");
                        XW=XW.delete(0,XW.length());
                    }
                }
            }
            break;
        default:
            break;













    }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                Intent intent = new Intent(this,MainActivity2.class);
                startActivity(intent);
                break;
                default:
        }

        return true;
    }


}