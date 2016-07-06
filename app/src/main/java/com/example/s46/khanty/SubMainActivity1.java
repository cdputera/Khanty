package com.example.s46.khanty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class SubMainActivity1 extends AppCompatActivity {


    int primage[]={
            R.drawable.syma,
            R.drawable.symb,
            R.drawable.symc,
            R.drawable.symd,
            R.drawable.syme,
            R.drawable.symf,
            R.drawable.symg,
            R.drawable.symh,
            R.drawable.symi,
            R.drawable.symj,
            R.drawable.symk,
            R.drawable.syml,
            R.drawable.symm,
            R.drawable.symn,
            R.drawable.symo,
            R.drawable.symp,
            R.drawable.symq,
            R.drawable.symr,
            R.drawable.syms,
            R.drawable.symt,
            R.drawable.symu,
            R.drawable.symv,
            R.drawable.symw,
            R.drawable.symx,
            R.drawable.symy,
            R.drawable.symz,
            R.drawable.symza,
            R.drawable.symzb,
            R.drawable.symzc,
            R.drawable.symzd
    };

    ImageView pr, chl1, chl2, chl3, right, left;
    int letKey;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_main1);

        pr = (ImageView) findViewById(R.id.parent);
        chl1 = (ImageView) findViewById(R.id.child1);
        chl2 = (ImageView) findViewById(R.id.child2);
        chl3 = (ImageView) findViewById(R.id.child3);
        right = (ImageView) findViewById(R.id.rightButton);
        left = (ImageView) findViewById(R.id.leftButton);



        Intent i = getIntent();
        int key = i.getIntExtra("id", 0);

        if (key < 1) {
            key = 1;
            letterCheck();
            Log.w("TAG", "key minus");
        }

        if (key > 30){
            key=30;
            letterCheck();
            Log.w("TAG", "key plus");
        }

        Log.w("TAG", "letterCheck");
        if (key == 1) {
            pr.setImageResource(primage[0]);
            chl1.setImageResource(R.drawable.a_1);
            chl2.setImageResource(R.drawable.a_2);
            chl3.setImageResource(R.drawable.a_3);
            Log.w("TAG", "1");
            letKey=1;
            right.setImageDrawable(null);

        } else if (key == 2) {
            pr.setImageResource(primage[1]);
            chl1.setImageResource(R.drawable.b_1);
            chl2.setImageResource(R.drawable.b_2);
            chl3.setImageResource(R.drawable.b_3);
            Log.w("TAG", "2");
            letKey=2;
            right.setImageResource(R.drawable.right);
        } else if (key == 3) {
            pr.setImageResource(primage[2]);
            chl1.setImageResource(R.drawable.c_1);
            chl2.setImageResource(R.drawable.c_2);
            chl3.setImageResource(R.drawable.c_3);
            letKey=3;
        } else if (key == 4) {
            pr.setImageResource(primage[3]);
            chl1.setImageResource(R.drawable.d_1);
            chl2.setImageResource(R.drawable.d_2);
            chl3.setImageResource(R.drawable.d_3);
            letKey=4;
        } else if (key == 5) {
            pr.setImageResource(primage[4]);
            chl1.setImageResource(R.drawable.e_1);
            chl2.setImageResource(R.drawable.e_2);
            chl3.setImageResource(R.drawable.e_3);
            letKey=5;
        } else if (key == 6) {
            pr.setImageResource(primage[5]);
            chl1.setImageResource(R.drawable.f_1);
            chl2.setImageResource(R.drawable.f_2);
            chl3.setImageResource(R.drawable.f_3);
            letKey=6;
        } else if (key == 7) {
            pr.setImageResource(primage[6]);
            chl1.setImageResource(R.drawable.g_1);
            chl2.setImageResource(R.drawable.g_2);
            chl3.setImageResource(R.drawable.g_3);
            letKey=7;
        } else if (key == 8) {
            pr.setImageResource(primage[7]);
            chl1.setImageResource(R.drawable.h_1);
            chl2.setImageResource(R.drawable.h_2);
            chl3.setImageResource(R.drawable.h_3);
            letKey=8;
        } else if (key == 9) {
            pr.setImageResource(primage[8]);
            chl1.setImageResource(R.drawable.i_1);
            chl2.setImageResource(R.drawable.i_2);
            chl3.setImageResource(R.drawable.i_3);
            letKey=9;
        } else if (key == 10) {
            pr.setImageResource(primage[9]);
            chl1.setImageResource(R.drawable.j_1);
            chl2.setImageResource(R.drawable.j_2);
            chl3.setImageResource(R.drawable.j_3);
            letKey=10;
        } else if (key == 11) {
            pr.setImageResource(primage[10]);
            chl1.setImageResource(R.drawable.k_1);
            chl2.setImageResource(R.drawable.k_2);
            chl3.setImageResource(R.drawable.k_3);
            letKey=11;
        } else if (key == 12) {
            pr.setImageResource(primage[11]);
            chl1.setImageResource(R.drawable.l_1);
            chl2.setImageResource(R.drawable.l_2);
            chl3.setImageResource(R.drawable.l_3);
            letKey=12;
        } else if (key == 13) {
            pr.setImageResource(primage[12]);
            chl1.setImageResource(R.drawable.m_1);
            chl2.setImageResource(R.drawable.m_2);
            chl3.setImageResource(R.drawable.m_3);
            letKey=13;
        } else if (key == 14) {
            pr.setImageResource(primage[13]);
            chl1.setImageResource(R.drawable.n_1);
            chl2.setImageResource(R.drawable.n_2);
            chl3.setImageResource(R.drawable.n_3);
            letKey=14;
        } else if (key == 15) {
            pr.setImageResource(primage[14]);
            chl1.setImageResource(R.drawable.o_1);
            chl2.setImageResource(R.drawable.o_2);
            chl3.setImageResource(R.drawable.o_3);
            letKey=15;
        } else if (key == 16) {
            pr.setImageResource(primage[15]);
            chl1.setImageResource(R.drawable.p_1);
            chl2.setImageResource(R.drawable.p_2);
            chl3.setImageResource(R.drawable.p_3);
            letKey=16;
        } else if (key == 17) {
            pr.setImageResource(primage[16]);
            chl1.setImageResource(R.drawable.q_1);
            chl2.setImageResource(R.drawable.q_2);
            chl3.setImageResource(R.drawable.q_3);
            letKey=17;
        } else if (key == 18) {
            pr.setImageResource(primage[17]);
            chl1.setImageResource(R.drawable.r_1);
            chl2.setImageResource(R.drawable.r_2);
            chl3.setImageResource(R.drawable.r_3);
            letKey=18;
        } else if (key == 19) {
            pr.setImageResource(primage[18]);
            chl1.setImageResource(R.drawable.s_1);
            chl2.setImageResource(R.drawable.s_2);
            chl3.setImageResource(R.drawable.s_3);
            letKey=19;
        } else if (key == 20) {
            pr.setImageResource(primage[19]);
            chl1.setImageResource(R.drawable.t_1);
            chl2.setImageResource(R.drawable.t_2);
            chl3.setImageResource(R.drawable.t_3);
            letKey=20;
        } else if (key == 21) {
            pr.setImageResource(primage[20]);
            chl1.setImageResource(R.drawable.u_1);
            chl2.setImageResource(R.drawable.u_2);
            chl3.setImageResource(R.drawable.u_3);
            letKey=21;
        } else if (key == 22) {
            pr.setImageResource(primage[21]);
            chl1.setImageResource(R.drawable.v_1);
            chl2.setImageResource(R.drawable.v_2);
            chl3.setImageResource(R.drawable.v_3);
            letKey=22;
        } else if (key == 23) {
            pr.setImageResource(primage[22]);
            chl1.setImageResource(R.drawable.w_1);
            chl2.setImageResource(R.drawable.w_2);
            chl3.setImageResource(R.drawable.w_3);
            letKey=23;
        } else if (key == 24) {
            pr.setImageResource(primage[23]);
            chl1.setImageResource(R.drawable.x_1);
            chl2.setImageResource(R.drawable.x_2);
            chl3.setImageResource(R.drawable.x_3);
            letKey=24;
        } else if (key == 25) {
            pr.setImageResource(primage[24]);
            chl1.setImageResource(R.drawable.y_1);
            chl2.setImageResource(R.drawable.y_2);
            chl3.setImageResource(R.drawable.y_3);
            letKey=25;
        } else if (key == 26) {
            pr.setImageResource(primage[25]);
            chl1.setImageResource(R.drawable.z_1);
            chl2.setImageResource(R.drawable.z_2);
            chl3.setImageResource(R.drawable.z_3);
            letKey=26;
        } else if (key == 27) {
            pr.setImageResource(primage[26]);
            chl1.setImageResource(R.drawable.za_1);
            chl2.setImageResource(R.drawable.za_2);
            chl3.setImageResource(R.drawable.za_3);
            letKey=27;
        } else if (key == 28) {
            pr.setImageResource(primage[27]);
            chl1.setImageResource(R.drawable.zb_1);
            chl2.setImageResource(R.drawable.zb_2);
            chl3.setImageResource(R.drawable.zb_3);
            letKey=28;
        } else if (key == 29) {
            pr.setImageResource(primage[28]);
            chl1.setImageResource(R.drawable.zc_1);
            chl2.setImageResource(R.drawable.zc_2);
            chl3.setImageResource(R.drawable.zc_3);
            letKey=29;
            left.setImageResource(R.drawable.left);
        } else if (key == 30) {
            pr.setImageResource(primage[29]);
            chl1.setImageResource(R.drawable.zd_1);
            chl2.setImageResource(R.drawable.zd_2);
            chl3.setImageResource(R.drawable.zd_3);
            letKey=30;
            left.setImageDrawable(null);
        }
    }

        public void letterCheck() {

        if (letKey< 1) {
            letKey = 1;
            letterCheck();
            Log.w("TAG", "key minus");
        }

        if (letKey > 30){
            letKey=30;
            letterCheck();
            Log.w("TAG", "key plus");
            }



            Log.w("TAG", "letterCheck");
        if (letKey == 1) {
            pr.setImageResource(primage[0]);
            chl1.setImageResource(R.drawable.a_1);
            chl2.setImageResource(R.drawable.a_2);
            chl3.setImageResource(R.drawable.a_3);
            Log.w("TAG", "1");
            right.setImageDrawable(null);
        } else if (letKey == 2) {
            pr.setImageResource(primage[1]);
            chl1.setImageResource(R.drawable.b_1);
            chl2.setImageResource(R.drawable.b_2);
            chl3.setImageResource(R.drawable.b_3);
            Log.w("TAG", "2");
            right.setImageResource(R.drawable.right);
        } else if (letKey == 3) {
            pr.setImageResource(primage[2]);
            chl1.setImageResource(R.drawable.c_1);
            chl2.setImageResource(R.drawable.c_2);
            chl3.setImageResource(R.drawable.c_3);
        } else if (letKey == 4) {
            pr.setImageResource(primage[3]);
            chl1.setImageResource(R.drawable.d_1);
            chl2.setImageResource(R.drawable.d_2);
            chl3.setImageResource(R.drawable.d_3);
        } else if (letKey == 5) {
            pr.setImageResource(primage[4]);
            chl1.setImageResource(R.drawable.e_1);
            chl2.setImageResource(R.drawable.e_2);
            chl3.setImageResource(R.drawable.e_3);
        } else if (letKey == 6) {
            pr.setImageResource(primage[5]);
            chl1.setImageResource(R.drawable.f_1);
            chl2.setImageResource(R.drawable.f_2);
            chl3.setImageResource(R.drawable.f_3);
        } else if (letKey == 7) {
            pr.setImageResource(primage[6]);
            chl1.setImageResource(R.drawable.g_1);
            chl2.setImageResource(R.drawable.g_2);
            chl3.setImageResource(R.drawable.g_3);
        } else if (letKey == 8) {
            pr.setImageResource(primage[7]);
            chl1.setImageResource(R.drawable.h_1);
            chl2.setImageResource(R.drawable.h_2);
            chl3.setImageResource(R.drawable.h_3);
        } else if (letKey == 9) {
            pr.setImageResource(primage[8]);
            chl1.setImageResource(R.drawable.i_1);
            chl2.setImageResource(R.drawable.i_2);
            chl3.setImageResource(R.drawable.i_3);
        } else if (letKey == 10) {
            pr.setImageResource(primage[9]);
            chl1.setImageResource(R.drawable.j_1);
            chl2.setImageResource(R.drawable.j_2);
            chl3.setImageResource(R.drawable.j_3);
        } else if (letKey == 11) {
            pr.setImageResource(primage[10]);
            chl1.setImageResource(R.drawable.k_1);
            chl2.setImageResource(R.drawable.k_2);
            chl3.setImageResource(R.drawable.k_3);
        } else if (letKey == 12) {
            pr.setImageResource(primage[11]);
            chl1.setImageResource(R.drawable.l_1);
            chl2.setImageResource(R.drawable.l_2);
            chl3.setImageResource(R.drawable.l_3);
        } else if (letKey == 13) {
            pr.setImageResource(primage[12]);
            chl1.setImageResource(R.drawable.m_1);
            chl2.setImageResource(R.drawable.m_2);
            chl3.setImageResource(R.drawable.m_3);
        } else if (letKey == 14) {
            pr.setImageResource(primage[13]);
            chl1.setImageResource(R.drawable.n_1);
            chl2.setImageResource(R.drawable.n_2);
            chl3.setImageResource(R.drawable.n_3);
        } else if (letKey == 15) {
            pr.setImageResource(primage[14]);
            chl1.setImageResource(R.drawable.o_1);
            chl2.setImageResource(R.drawable.o_2);
            chl3.setImageResource(R.drawable.o_3);
        } else if (letKey == 16) {
            pr.setImageResource(primage[15]);
            chl1.setImageResource(R.drawable.p_1);
            chl2.setImageResource(R.drawable.p_2);
            chl3.setImageResource(R.drawable.p_3);
        } else if (letKey == 17) {
            pr.setImageResource(primage[16]);
            chl1.setImageResource(R.drawable.q_1);
            chl2.setImageResource(R.drawable.q_2);
            chl3.setImageResource(R.drawable.q_3);
        } else if (letKey == 18) {
            pr.setImageResource(primage[17]);
            chl1.setImageResource(R.drawable.r_1);
            chl2.setImageResource(R.drawable.r_2);
            chl3.setImageResource(R.drawable.r_3);
        } else if (letKey == 19) {
            pr.setImageResource(primage[18]);
            chl1.setImageResource(R.drawable.s_1);
            chl2.setImageResource(R.drawable.s_2);
            chl3.setImageResource(R.drawable.s_3);
        } else if (letKey == 20) {
            pr.setImageResource(primage[19]);
            chl1.setImageResource(R.drawable.t_1);
            chl2.setImageResource(R.drawable.t_2);
            chl3.setImageResource(R.drawable.t_3);
        } else if (letKey == 21) {
            pr.setImageResource(primage[20]);
            chl1.setImageResource(R.drawable.u_1);
            chl2.setImageResource(R.drawable.u_2);
            chl3.setImageResource(R.drawable.u_3);
        } else if (letKey == 22) {
            pr.setImageResource(primage[21]);
            chl1.setImageResource(R.drawable.v_1);
            chl2.setImageResource(R.drawable.v_2);
            chl3.setImageResource(R.drawable.v_3);
        } else if (letKey == 23) {
            pr.setImageResource(primage[22]);
            chl1.setImageResource(R.drawable.w_1);
            chl2.setImageResource(R.drawable.w_2);
            chl3.setImageResource(R.drawable.w_3);
        } else if (letKey == 24) {
            pr.setImageResource(primage[23]);
            chl1.setImageResource(R.drawable.x_1);
            chl2.setImageResource(R.drawable.x_2);
            chl3.setImageResource(R.drawable.x_3);
        } else if (letKey == 25) {
            pr.setImageResource(primage[24]);
            chl1.setImageResource(R.drawable.y_1);
            chl2.setImageResource(R.drawable.y_2);
            chl3.setImageResource(R.drawable.y_3);
        } else if (letKey == 26) {
            pr.setImageResource(primage[25]);
            chl1.setImageResource(R.drawable.z_1);
            chl2.setImageResource(R.drawable.z_2);
            chl3.setImageResource(R.drawable.z_3);
        } else if (letKey == 27) {
            pr.setImageResource(primage[26]);
            chl1.setImageResource(R.drawable.za_1);
            chl2.setImageResource(R.drawable.za_2);
            chl3.setImageResource(R.drawable.za_3);
        } else if (letKey == 28) {
            pr.setImageResource(primage[27]);
            chl1.setImageResource(R.drawable.zb_1);
            chl2.setImageResource(R.drawable.zb_2);
            chl3.setImageResource(R.drawable.zb_3);
        } else if (letKey == 29) {
            pr.setImageResource(primage[28]);
            chl1.setImageResource(R.drawable.zc_1);
            chl2.setImageResource(R.drawable.zc_2);
            chl3.setImageResource(R.drawable.zc_3);
            left.setImageResource(R.drawable.left);
        } else if (letKey == 30) {
            pr.setImageResource(primage[29]);
            chl1.setImageResource(R.drawable.zd_1);
            chl2.setImageResource(R.drawable.zd_2);
            chl3.setImageResource(R.drawable.zd_3);
            left.setImageDrawable(null);
        }
    }

    public void l (View v){
        letKey++;
        letterCheck();
        Log.w("TAG", "left");
    }

    public void r (View v){
        letKey--;
        letterCheck();
        Log.w("TAG", "right");
    }

    public void check (View v){
        Intent j = new Intent(SubMainActivity1.this, CanvasActivity.class);
        if (letKey == 1) {
            j.putExtra("id", 1);
        }
        else if (letKey == 2) {
            j.putExtra("id", 2);
        }
        else if (letKey == 3) {
            j.putExtra("id", 3);
        }
        else if (letKey == 4) {
            j.putExtra("id", 4);
        }
        else if (letKey == 5) {
            j.putExtra("id", 5);
        }
        else if (letKey == 6) {
            j.putExtra("id", 6);
        }
        else if (letKey == 7) {
            j.putExtra("id", 7);
        }
        else if (letKey == 8) {
            j.putExtra("id", 8);
        }
        else if (letKey == 9) {
            j.putExtra("id", 9);
        }
        else if (letKey == 10) {
            j.putExtra("id", 10);
        }
        else if (letKey == 11) {
            j.putExtra("id", 11);
        }
        else if (letKey == 12) {
            j.putExtra("id", 12);
        }
        else if (letKey == 13) {
            j.putExtra("id", 13);
        }
        else if (letKey == 14) {
            j.putExtra("id", 14);
        }
        else if (letKey == 15) {
            j.putExtra("id", 15);
        }
        else if (letKey == 16) {
            j.putExtra("id", 16);
        }
        else if (letKey == 17) {
            j.putExtra("id", 17);
        }
        else if (letKey == 18) {
            j.putExtra("id", 18);
        }
        else if (letKey == 19) {
            j.putExtra("id", 19);
        }
        else if (letKey == 20) {
            j.putExtra("id", 20);
        }
        else if (letKey == 21) {
            j.putExtra("id", 21);
        }
        else if (letKey == 22) {
            j.putExtra("id", 23);
        }
        else if (letKey == 23) {
            j.putExtra("id", 23);
        }
        else if (letKey == 24) {
            j.putExtra("id", 24);
        }
        else if (letKey == 25) {
            j.putExtra("id", 25);
        }
        else if (letKey == 26) {
            j.putExtra("id", 26);
        }
        else if (letKey == 27) {
            j.putExtra("id", 27);
        }
        else if (letKey == 28) {
            j.putExtra("id", 28);
        }
        else if (letKey == 29) {
            j.putExtra("id", 29);
        }
        else if (letKey == 30) {
            j.putExtra("id", 30);
        }
        startActivity(j);
    }
    }
