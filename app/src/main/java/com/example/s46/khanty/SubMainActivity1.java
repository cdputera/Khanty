package com.example.s46.khanty;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
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
    MediaPlayer mp0, mp1, mp2, mp3;
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
            mp0 = MediaPlayer.create(this, R.raw.a);
            mp1 = MediaPlayer.create(this, R.raw.aa);
            mp2 = MediaPlayer.create(this, R.raw.aaa);
            mp3 = MediaPlayer.create(this, R.raw.aaaa);
            Log.w("TAG", "1");
            letKey=1;
            right.setImageDrawable(null);

        } else if (key == 2) {
            pr.setImageResource(primage[1]);
            chl1.setImageResource(R.drawable.b_1);
            chl2.setImageResource(R.drawable.b_2);
            chl3.setImageResource(R.drawable.b_3);
            mp0 = MediaPlayer.create(this, R.raw.b);
            mp1 = MediaPlayer.create(this, R.raw.bb);
            mp2 = MediaPlayer.create(this, R.raw.bbb);
            mp3 = MediaPlayer.create(this, R.raw.bbbb);
            Log.w("TAG", "2");
            letKey=2;
            right.setImageResource(R.drawable.right);
        } else if (key == 3) {
            pr.setImageResource(primage[2]);
            chl1.setImageResource(R.drawable.c_1);
            chl2.setImageResource(R.drawable.c_2);
            chl3.setImageResource(R.drawable.c_3);
            mp0 = MediaPlayer.create(this, R.raw.c);
            mp1 = MediaPlayer.create(this, R.raw.cc);
            mp2 = MediaPlayer.create(this, R.raw.ccc);
            mp3 = MediaPlayer.create(this, R.raw.cccc);
            letKey=3;
        } else if (key == 4) {
            pr.setImageResource(primage[3]);
            chl1.setImageResource(R.drawable.d_1);
            chl2.setImageResource(R.drawable.d_2);
            chl3.setImageResource(R.drawable.d_3);
            mp0 = MediaPlayer.create(this, R.raw.d);
            mp1 = MediaPlayer.create(this, R.raw.dd);
            mp2 = MediaPlayer.create(this, R.raw.ddd);
            mp3 = MediaPlayer.create(this, R.raw.dddd);
            letKey=4;
        } else if (key == 5) {
            pr.setImageResource(primage[4]);
            chl1.setImageResource(R.drawable.e_1);
            chl2.setImageResource(R.drawable.e_2);
            chl3.setImageResource(R.drawable.e_3);
            mp0 = MediaPlayer.create(this, R.raw.e);
            mp1 = MediaPlayer.create(this, R.raw.ee);
            mp2 = MediaPlayer.create(this, R.raw.eee);
            mp3 = MediaPlayer.create(this, R.raw.eeee);
            letKey=5;
        } else if (key == 6) {
            pr.setImageResource(primage[5]);
            chl1.setImageResource(R.drawable.f_1);
            chl2.setImageResource(R.drawable.f_2);
            chl3.setImageResource(R.drawable.f_3);
            mp0 = MediaPlayer.create(this, R.raw.f);
            mp1 = MediaPlayer.create(this, R.raw.ff);
            mp2 = MediaPlayer.create(this, R.raw.fff);
            mp3 = MediaPlayer.create(this, R.raw.ffff);
            letKey=6;
        } else if (key == 7) {
            pr.setImageResource(primage[6]);
            chl1.setImageResource(R.drawable.g_1);
            chl2.setImageResource(R.drawable.g_2);
            chl3.setImageResource(R.drawable.g_3);
            mp0 = MediaPlayer.create(this, R.raw.g);
            mp1 = MediaPlayer.create(this, R.raw.gg);
            mp2 = MediaPlayer.create(this, R.raw.ggg);
            mp3 = MediaPlayer.create(this, R.raw.gggg);
            letKey=7;
        } else if (key == 8) {
            pr.setImageResource(primage[7]);
            chl1.setImageResource(R.drawable.h_1);
            chl2.setImageResource(R.drawable.h_2);
            chl3.setImageResource(R.drawable.h_3);
            mp0 = MediaPlayer.create(this, R.raw.h);
            mp1 = MediaPlayer.create(this, R.raw.hh);
            mp2 = MediaPlayer.create(this, R.raw.hhh);
            mp3 = MediaPlayer.create(this, R.raw.hhhh);
            letKey=8;
        } else if (key == 9) {
            pr.setImageResource(primage[8]);
            chl1.setImageResource(R.drawable.i_1);
            chl2.setImageResource(R.drawable.i_2);
            chl3.setImageResource(R.drawable.i_3);
            mp0 = MediaPlayer.create(this, R.raw.i);
            mp1 = MediaPlayer.create(this, R.raw.ii);
            mp2 = MediaPlayer.create(this, R.raw.iii);
            mp3 = MediaPlayer.create(this, R.raw.iiii);
            letKey=9;
        } else if (key == 10) {
            pr.setImageResource(primage[9]);
            chl1.setImageResource(R.drawable.j_1);
            chl2.setImageResource(R.drawable.j_2);
            chl3.setImageResource(R.drawable.j_3);
            mp0 = MediaPlayer.create(this, R.raw.j);
            mp1 = MediaPlayer.create(this, R.raw.jj);
            mp2 = MediaPlayer.create(this, R.raw.jjj);
            mp3 = MediaPlayer.create(this, R.raw.jjjj);
            letKey=10;
        } else if (key == 11) {
            pr.setImageResource(primage[10]);
            chl1.setImageResource(R.drawable.k_1);
            chl2.setImageResource(R.drawable.k_2);
            chl3.setImageResource(R.drawable.k_3);
            mp0 = MediaPlayer.create(this, R.raw.k);
            mp1 = MediaPlayer.create(this, R.raw.kk);
            mp2 = MediaPlayer.create(this, R.raw.kkk);
            mp3 = MediaPlayer.create(this, R.raw.kkkk);
            letKey=11;
        } else if (key == 12) {
            pr.setImageResource(primage[11]);
            chl1.setImageResource(R.drawable.l_1);
            chl2.setImageResource(R.drawable.l_2);
            chl3.setImageResource(R.drawable.l_3);
            mp0 = MediaPlayer.create(this, R.raw.l);
            mp1 = MediaPlayer.create(this, R.raw.ll);
            mp2 = MediaPlayer.create(this, R.raw.lll);
            mp3 = MediaPlayer.create(this, R.raw.llll);
            letKey=12;
        } else if (key == 13) {
            pr.setImageResource(primage[12]);
            chl1.setImageResource(R.drawable.m_1);
            chl2.setImageResource(R.drawable.m_2);
            chl3.setImageResource(R.drawable.m_3);
            mp0 = MediaPlayer.create(this, R.raw.m);
            mp1 = MediaPlayer.create(this, R.raw.mm);
            mp2 = MediaPlayer.create(this, R.raw.mmm);
            mp3 = MediaPlayer.create(this, R.raw.mmmm);
            letKey=13;
        } else if (key == 14) {
            pr.setImageResource(primage[13]);
            chl1.setImageResource(R.drawable.n_1);
            chl2.setImageResource(R.drawable.n_2);
            chl3.setImageResource(R.drawable.n_3);
            mp0 = MediaPlayer.create(this, R.raw.n);
            mp1 = MediaPlayer.create(this, R.raw.nn);
            mp2 = MediaPlayer.create(this, R.raw.nnn);
            mp3 = MediaPlayer.create(this, R.raw.nnnn);
            letKey=14;
        } else if (key == 15) {
            pr.setImageResource(primage[14]);
            chl1.setImageResource(R.drawable.o_1);
            chl2.setImageResource(R.drawable.o_2);
            chl3.setImageResource(R.drawable.o_3);
            mp0 = MediaPlayer.create(this, R.raw.o);
            mp1 = MediaPlayer.create(this, R.raw.oo);
            mp2 = MediaPlayer.create(this, R.raw.ooo);
            mp3 = MediaPlayer.create(this, R.raw.oooo);
            letKey=15;
        } else if (key == 16) {
            pr.setImageResource(primage[15]);
            chl1.setImageResource(R.drawable.p_1);
            chl2.setImageResource(R.drawable.p_2);
            chl3.setImageResource(R.drawable.p_3);
            mp0 = MediaPlayer.create(this, R.raw.p);
            mp1 = MediaPlayer.create(this, R.raw.pp);
            mp2 = MediaPlayer.create(this, R.raw.ppp);
            mp3 = MediaPlayer.create(this, R.raw.pppp);
            letKey=16;
        } else if (key == 17) {
            pr.setImageResource(primage[16]);
            chl1.setImageResource(R.drawable.q_1);
            chl2.setImageResource(R.drawable.q_2);
            chl3.setImageResource(R.drawable.q_3);
            mp0 = MediaPlayer.create(this, R.raw.q);
            mp1 = MediaPlayer.create(this, R.raw.qq);
            mp2 = MediaPlayer.create(this, R.raw.qqq);
            mp3 = MediaPlayer.create(this, R.raw.qqqq);
            letKey=17;
        } else if (key == 18) {
            pr.setImageResource(primage[17]);
            chl1.setImageResource(R.drawable.r_1);
            chl2.setImageResource(R.drawable.r_2);
            chl3.setImageResource(R.drawable.r_3);
            mp0 = MediaPlayer.create(this, R.raw.r);
            mp1 = MediaPlayer.create(this, R.raw.rr);
            mp2 = MediaPlayer.create(this, R.raw.rrr);
            mp3 = MediaPlayer.create(this, R.raw.rrrr);
            letKey=18;
        } else if (key == 19) {
            pr.setImageResource(primage[18]);
            chl1.setImageResource(R.drawable.s_1);
            chl2.setImageResource(R.drawable.s_2);
            chl3.setImageResource(R.drawable.s_3);
            mp0 = MediaPlayer.create(this, R.raw.s);
            mp1 = MediaPlayer.create(this, R.raw.ss);
            mp2 = MediaPlayer.create(this, R.raw.sss);
            mp3 = MediaPlayer.create(this, R.raw.ssss);
            letKey=19;
        } else if (key == 20) {
            pr.setImageResource(primage[19]);
            chl1.setImageResource(R.drawable.t_1);
            chl2.setImageResource(R.drawable.t_2);
            chl3.setImageResource(R.drawable.t_3);
            mp0 = MediaPlayer.create(this, R.raw.t);
            mp1 = MediaPlayer.create(this, R.raw.tt);
            mp2 = MediaPlayer.create(this, R.raw.ttt);
            mp3 = MediaPlayer.create(this, R.raw.tttt);
            letKey=20;
        } else if (key == 21) {
            pr.setImageResource(primage[20]);
            chl1.setImageResource(R.drawable.u_1);
            chl2.setImageResource(R.drawable.u_2);
            chl3.setImageResource(R.drawable.u_3);
            mp0 = MediaPlayer.create(this, R.raw.u);
            mp1 = MediaPlayer.create(this, R.raw.uu);
            mp2 = MediaPlayer.create(this, R.raw.uuu);
            mp3 = MediaPlayer.create(this, R.raw.uuuu);
            letKey=21;
        } else if (key == 22) {
            pr.setImageResource(primage[21]);
            chl1.setImageResource(R.drawable.v_1);
            chl2.setImageResource(R.drawable.v_2);
            chl3.setImageResource(R.drawable.v_3);
            mp0 = MediaPlayer.create(this, R.raw.v);
            mp1 = MediaPlayer.create(this, R.raw.vv);
            mp2 = MediaPlayer.create(this, R.raw.vvv);
            mp3 = MediaPlayer.create(this, R.raw.vvvv);
            letKey=22;
        } else if (key == 23) {
            pr.setImageResource(primage[22]);
            chl1.setImageResource(R.drawable.w_1);
            chl2.setImageResource(R.drawable.w_2);
            chl3.setImageResource(R.drawable.w_3);
            mp0 = MediaPlayer.create(this, R.raw.w);
            mp1 = MediaPlayer.create(this, R.raw.ww);
            mp2 = MediaPlayer.create(this, R.raw.www);
            mp3 = MediaPlayer.create(this, R.raw.wwww);
            letKey=23;
        } else if (key == 24) {
            pr.setImageResource(primage[23]);
            chl1.setImageResource(R.drawable.x_1);
            chl2.setImageResource(R.drawable.x_2);
            chl3.setImageResource(R.drawable.x_3);
            mp0 = MediaPlayer.create(this, R.raw.x);
            mp1 = MediaPlayer.create(this, R.raw.xx);
            mp2 = MediaPlayer.create(this, R.raw.xxx);
            mp3 = MediaPlayer.create(this, R.raw.xxxx);
            letKey=24;
        } else if (key == 25) {
            pr.setImageResource(primage[24]);
            chl1.setImageResource(R.drawable.y_1);
            chl2.setImageResource(R.drawable.y_2);
            chl3.setImageResource(R.drawable.y_3);
            mp0 = MediaPlayer.create(this, R.raw.y);
            mp1 = MediaPlayer.create(this, R.raw.yy);
            mp2 = MediaPlayer.create(this, R.raw.yyy);
            mp3 = MediaPlayer.create(this, R.raw.yyyy);
            letKey=25;
        } else if (key == 26) {
            pr.setImageResource(primage[25]);
            chl1.setImageResource(R.drawable.z_1);
            chl2.setImageResource(R.drawable.z_2);
            chl3.setImageResource(R.drawable.z_3);
            mp0 = MediaPlayer.create(this, R.raw.z);
            mp1 = MediaPlayer.create(this, R.raw.zz);
            mp2 = MediaPlayer.create(this, R.raw.zzz);
            mp3 = MediaPlayer.create(this, R.raw.zzzz);
            letKey=26;
        } else if (key == 27) {
            pr.setImageResource(primage[26]);
            chl1.setImageResource(R.drawable.za_1);
            chl2.setImageResource(R.drawable.za_2);
            chl3.setImageResource(R.drawable.za_3);
            mp0 = MediaPlayer.create(this, R.raw.za);
            mp1 = MediaPlayer.create(this, R.raw.zaa);
            mp2 = MediaPlayer.create(this, R.raw.zaaa);
            mp3 = MediaPlayer.create(this, R.raw.zaaaa);
            letKey=27;
        } else if (key == 28) {
            pr.setImageResource(primage[27]);
            chl1.setImageResource(R.drawable.zb_1);
            chl2.setImageResource(R.drawable.zb_2);
            chl3.setImageResource(R.drawable.zb_3);
            mp0 = MediaPlayer.create(this, R.raw.zb);
            mp1 = MediaPlayer.create(this, R.raw.zbb);
            mp2 = MediaPlayer.create(this, R.raw.zbbb);
            mp3 = MediaPlayer.create(this, R.raw.zbbbb);
            letKey=28;
        } else if (key == 29) {
            pr.setImageResource(primage[28]);
            chl1.setImageResource(R.drawable.zc_1);
            chl2.setImageResource(R.drawable.zc_2);
            chl3.setImageResource(R.drawable.zc_3);
            mp0 = MediaPlayer.create(this, R.raw.zc);
            mp1 = MediaPlayer.create(this, R.raw.zcc);
            mp2 = MediaPlayer.create(this, R.raw.zccc);
            mp3 = MediaPlayer.create(this, R.raw.zcccc);
            letKey=29;
            left.setImageResource(R.drawable.left);
        } else if (key == 30) {
            pr.setImageResource(primage[29]);
            chl1.setImageResource(R.drawable.zd_1);
            chl2.setImageResource(R.drawable.zd_2);
            chl3.setImageResource(R.drawable.zd_3);
            mp0 = MediaPlayer.create(this, R.raw.zd);
            mp1 = MediaPlayer.create(this, R.raw.zdd);
            mp2 = MediaPlayer.create(this, R.raw.zddd);
            mp3 = MediaPlayer.create(this, R.raw.zdddd);
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
                mp0 = MediaPlayer.create(this, R.raw.a);
                mp1 = MediaPlayer.create(this, R.raw.aa);
                mp2 = MediaPlayer.create(this, R.raw.aaa);
                mp3 = MediaPlayer.create(this, R.raw.aaaa);
                Log.w("TAG", "1");
                letKey=1;
                right.setImageDrawable(null);

            } else if (letKey == 2) {
                pr.setImageResource(primage[1]);
                chl1.setImageResource(R.drawable.b_1);
                chl2.setImageResource(R.drawable.b_2);
                chl3.setImageResource(R.drawable.b_3);
                mp0 = MediaPlayer.create(this, R.raw.b);
                mp1 = MediaPlayer.create(this, R.raw.bb);
                mp2 = MediaPlayer.create(this, R.raw.bbb);
                mp3 = MediaPlayer.create(this, R.raw.bbbb);
                Log.w("TAG", "2");
                letKey=2;
                right.setImageResource(R.drawable.right);
            } else if (letKey == 3) {
                pr.setImageResource(primage[2]);
                chl1.setImageResource(R.drawable.c_1);
                chl2.setImageResource(R.drawable.c_2);
                chl3.setImageResource(R.drawable.c_3);
                mp0 = MediaPlayer.create(this, R.raw.c);
                mp1 = MediaPlayer.create(this, R.raw.cc);
                mp2 = MediaPlayer.create(this, R.raw.ccc);
                mp3 = MediaPlayer.create(this, R.raw.cccc);
                letKey=3;
            } else if (letKey == 4) {
                pr.setImageResource(primage[3]);
                chl1.setImageResource(R.drawable.d_1);
                chl2.setImageResource(R.drawable.d_2);
                chl3.setImageResource(R.drawable.d_3);
                mp0 = MediaPlayer.create(this, R.raw.d);
                mp1 = MediaPlayer.create(this, R.raw.dd);
                mp2 = MediaPlayer.create(this, R.raw.ddd);
                mp3 = MediaPlayer.create(this, R.raw.dddd);
                letKey=4;
            } else if (letKey == 5) {
                pr.setImageResource(primage[4]);
                chl1.setImageResource(R.drawable.e_1);
                chl2.setImageResource(R.drawable.e_2);
                chl3.setImageResource(R.drawable.e_3);
                mp0 = MediaPlayer.create(this, R.raw.e);
                mp1 = MediaPlayer.create(this, R.raw.ee);
                mp2 = MediaPlayer.create(this, R.raw.eee);
                mp3 = MediaPlayer.create(this, R.raw.eeee);
                letKey=5;
            } else if (letKey == 6) {
                pr.setImageResource(primage[5]);
                chl1.setImageResource(R.drawable.f_1);
                chl2.setImageResource(R.drawable.f_2);
                chl3.setImageResource(R.drawable.f_3);
                mp0 = MediaPlayer.create(this, R.raw.f);
                mp1 = MediaPlayer.create(this, R.raw.ff);
                mp2 = MediaPlayer.create(this, R.raw.fff);
                mp3 = MediaPlayer.create(this, R.raw.ffff);
                letKey=6;
            } else if (letKey == 7) {
                pr.setImageResource(primage[6]);
                chl1.setImageResource(R.drawable.g_1);
                chl2.setImageResource(R.drawable.g_2);
                chl3.setImageResource(R.drawable.g_3);
                mp0 = MediaPlayer.create(this, R.raw.g);
                mp1 = MediaPlayer.create(this, R.raw.gg);
                mp2 = MediaPlayer.create(this, R.raw.ggg);
                mp3 = MediaPlayer.create(this, R.raw.gggg);
                letKey=7;
            } else if (letKey == 8) {
                pr.setImageResource(primage[7]);
                chl1.setImageResource(R.drawable.h_1);
                chl2.setImageResource(R.drawable.h_2);
                chl3.setImageResource(R.drawable.h_3);
                mp0 = MediaPlayer.create(this, R.raw.h);
                mp1 = MediaPlayer.create(this, R.raw.hh);
                mp2 = MediaPlayer.create(this, R.raw.hhh);
                mp3 = MediaPlayer.create(this, R.raw.hhhh);
                letKey=8;
            } else if (letKey == 9) {
                pr.setImageResource(primage[8]);
                chl1.setImageResource(R.drawable.i_1);
                chl2.setImageResource(R.drawable.i_2);
                chl3.setImageResource(R.drawable.i_3);
                mp0 = MediaPlayer.create(this, R.raw.i);
                mp1 = MediaPlayer.create(this, R.raw.ii);
                mp2 = MediaPlayer.create(this, R.raw.iii);
                mp3 = MediaPlayer.create(this, R.raw.iiii);
                letKey=9;
            } else if (letKey == 10) {
                pr.setImageResource(primage[9]);
                chl1.setImageResource(R.drawable.j_1);
                chl2.setImageResource(R.drawable.j_2);
                chl3.setImageResource(R.drawable.j_3);
                mp0 = MediaPlayer.create(this, R.raw.j);
                mp1 = MediaPlayer.create(this, R.raw.jj);
                mp2 = MediaPlayer.create(this, R.raw.jjj);
                mp3 = MediaPlayer.create(this, R.raw.jjjj);
                letKey=10;
            } else if (letKey == 11) {
                pr.setImageResource(primage[10]);
                chl1.setImageResource(R.drawable.k_1);
                chl2.setImageResource(R.drawable.k_2);
                chl3.setImageResource(R.drawable.k_3);
                mp0 = MediaPlayer.create(this, R.raw.k);
                mp1 = MediaPlayer.create(this, R.raw.kk);
                mp2 = MediaPlayer.create(this, R.raw.kkk);
                mp3 = MediaPlayer.create(this, R.raw.kkkk);
                letKey=11;
            } else if (letKey == 12) {
                pr.setImageResource(primage[11]);
                chl1.setImageResource(R.drawable.l_1);
                chl2.setImageResource(R.drawable.l_2);
                chl3.setImageResource(R.drawable.l_3);
                mp0 = MediaPlayer.create(this, R.raw.l);
                mp1 = MediaPlayer.create(this, R.raw.ll);
                mp2 = MediaPlayer.create(this, R.raw.lll);
                mp3 = MediaPlayer.create(this, R.raw.llll);
                letKey=12;
            } else if (letKey == 13) {
                pr.setImageResource(primage[12]);
                chl1.setImageResource(R.drawable.m_1);
                chl2.setImageResource(R.drawable.m_2);
                chl3.setImageResource(R.drawable.m_3);
                mp0 = MediaPlayer.create(this, R.raw.m);
                mp1 = MediaPlayer.create(this, R.raw.mm);
                mp2 = MediaPlayer.create(this, R.raw.mmm);
                mp3 = MediaPlayer.create(this, R.raw.mmmm);
                letKey=13;
            } else if (letKey == 14) {
                pr.setImageResource(primage[13]);
                chl1.setImageResource(R.drawable.n_1);
                chl2.setImageResource(R.drawable.n_2);
                chl3.setImageResource(R.drawable.n_3);
                mp0 = MediaPlayer.create(this, R.raw.n);
                mp1 = MediaPlayer.create(this, R.raw.nn);
                mp2 = MediaPlayer.create(this, R.raw.nnn);
                mp3 = MediaPlayer.create(this, R.raw.nnnn);
                letKey=14;
            } else if (letKey == 15) {
                pr.setImageResource(primage[14]);
                chl1.setImageResource(R.drawable.o_1);
                chl2.setImageResource(R.drawable.o_2);
                chl3.setImageResource(R.drawable.o_3);
                mp0 = MediaPlayer.create(this, R.raw.o);
                mp1 = MediaPlayer.create(this, R.raw.oo);
                mp2 = MediaPlayer.create(this, R.raw.ooo);
                mp3 = MediaPlayer.create(this, R.raw.oooo);
                letKey=15;
            } else if (letKey == 16) {
                pr.setImageResource(primage[15]);
                chl1.setImageResource(R.drawable.p_1);
                chl2.setImageResource(R.drawable.p_2);
                chl3.setImageResource(R.drawable.p_3);
                mp0 = MediaPlayer.create(this, R.raw.p);
                mp1 = MediaPlayer.create(this, R.raw.pp);
                mp2 = MediaPlayer.create(this, R.raw.ppp);
                mp3 = MediaPlayer.create(this, R.raw.pppp);
                letKey=16;
            } else if (letKey == 17) {
                pr.setImageResource(primage[16]);
                chl1.setImageResource(R.drawable.q_1);
                chl2.setImageResource(R.drawable.q_2);
                chl3.setImageResource(R.drawable.q_3);
                mp0 = MediaPlayer.create(this, R.raw.q);
                mp1 = MediaPlayer.create(this, R.raw.qq);
                mp2 = MediaPlayer.create(this, R.raw.qqq);
                mp3 = MediaPlayer.create(this, R.raw.qqqq);
                letKey=17;
            } else if (letKey == 18) {
                pr.setImageResource(primage[17]);
                chl1.setImageResource(R.drawable.r_1);
                chl2.setImageResource(R.drawable.r_2);
                chl3.setImageResource(R.drawable.r_3);
                mp0 = MediaPlayer.create(this, R.raw.r);
                mp1 = MediaPlayer.create(this, R.raw.rr);
                mp2 = MediaPlayer.create(this, R.raw.rrr);
                mp3 = MediaPlayer.create(this, R.raw.rrrr);
                letKey=18;
            } else if (letKey == 19) {
                pr.setImageResource(primage[18]);
                chl1.setImageResource(R.drawable.s_1);
                chl2.setImageResource(R.drawable.s_2);
                chl3.setImageResource(R.drawable.s_3);
                mp0 = MediaPlayer.create(this, R.raw.s);
                mp1 = MediaPlayer.create(this, R.raw.ss);
                mp2 = MediaPlayer.create(this, R.raw.sss);
                mp3 = MediaPlayer.create(this, R.raw.ssss);
                letKey=19;
            } else if (letKey == 20) {
                pr.setImageResource(primage[19]);
                chl1.setImageResource(R.drawable.t_1);
                chl2.setImageResource(R.drawable.t_2);
                chl3.setImageResource(R.drawable.t_3);
                mp0 = MediaPlayer.create(this, R.raw.t);
                mp1 = MediaPlayer.create(this, R.raw.tt);
                mp2 = MediaPlayer.create(this, R.raw.ttt);
                mp3 = MediaPlayer.create(this, R.raw.tttt);
                letKey=20;
            } else if (letKey == 21) {
                pr.setImageResource(primage[20]);
                chl1.setImageResource(R.drawable.u_1);
                chl2.setImageResource(R.drawable.u_2);
                chl3.setImageResource(R.drawable.u_3);
                mp0 = MediaPlayer.create(this, R.raw.u);
                mp1 = MediaPlayer.create(this, R.raw.uu);
                mp2 = MediaPlayer.create(this, R.raw.uuu);
                mp3 = MediaPlayer.create(this, R.raw.uuuu);
                letKey=21;
            } else if (letKey == 22) {
                pr.setImageResource(primage[21]);
                chl1.setImageResource(R.drawable.v_1);
                chl2.setImageResource(R.drawable.v_2);
                chl3.setImageResource(R.drawable.v_3);
                mp0 = MediaPlayer.create(this, R.raw.v);
                mp1 = MediaPlayer.create(this, R.raw.vv);
                mp2 = MediaPlayer.create(this, R.raw.vvv);
                mp3 = MediaPlayer.create(this, R.raw.vvvv);
                letKey=22;
            } else if (letKey == 23) {
                pr.setImageResource(primage[22]);
                chl1.setImageResource(R.drawable.w_1);
                chl2.setImageResource(R.drawable.w_2);
                chl3.setImageResource(R.drawable.w_3);
                mp0 = MediaPlayer.create(this, R.raw.w);
                mp1 = MediaPlayer.create(this, R.raw.ww);
                mp2 = MediaPlayer.create(this, R.raw.www);
                mp3 = MediaPlayer.create(this, R.raw.wwww);
                letKey=23;
            } else if (letKey == 24) {
                pr.setImageResource(primage[23]);
                chl1.setImageResource(R.drawable.x_1);
                chl2.setImageResource(R.drawable.x_2);
                chl3.setImageResource(R.drawable.x_3);
                mp0 = MediaPlayer.create(this, R.raw.x);
                mp1 = MediaPlayer.create(this, R.raw.xx);
                mp2 = MediaPlayer.create(this, R.raw.xxx);
                mp3 = MediaPlayer.create(this, R.raw.xxxx);
                letKey=24;
            } else if (letKey == 25) {
                pr.setImageResource(primage[24]);
                chl1.setImageResource(R.drawable.y_1);
                chl2.setImageResource(R.drawable.y_2);
                chl3.setImageResource(R.drawable.y_3);
                mp0 = MediaPlayer.create(this, R.raw.y);
                mp1 = MediaPlayer.create(this, R.raw.yy);
                mp2 = MediaPlayer.create(this, R.raw.yyy);
                mp3 = MediaPlayer.create(this, R.raw.yyyy);
                letKey=25;
            } else if (letKey == 26) {
                pr.setImageResource(primage[25]);
                chl1.setImageResource(R.drawable.z_1);
                chl2.setImageResource(R.drawable.z_2);
                chl3.setImageResource(R.drawable.z_3);
                mp0 = MediaPlayer.create(this, R.raw.z);
                mp1 = MediaPlayer.create(this, R.raw.zz);
                mp2 = MediaPlayer.create(this, R.raw.zzz);
                mp3 = MediaPlayer.create(this, R.raw.zzzz);
                letKey=26;
            } else if (letKey == 27) {
                pr.setImageResource(primage[26]);
                chl1.setImageResource(R.drawable.za_1);
                chl2.setImageResource(R.drawable.za_2);
                chl3.setImageResource(R.drawable.za_3);
                mp0 = MediaPlayer.create(this, R.raw.za);
                mp1 = MediaPlayer.create(this, R.raw.zaa);
                mp2 = MediaPlayer.create(this, R.raw.zaaa);
                mp3 = MediaPlayer.create(this, R.raw.zaaaa);
                letKey=27;
            } else if (letKey == 28) {
                pr.setImageResource(primage[27]);
                chl1.setImageResource(R.drawable.zb_1);
                chl2.setImageResource(R.drawable.zb_2);
                chl3.setImageResource(R.drawable.zb_3);
                mp0 = MediaPlayer.create(this, R.raw.zb);
                mp1 = MediaPlayer.create(this, R.raw.zbb);
                mp2 = MediaPlayer.create(this, R.raw.zbbb);
                mp3 = MediaPlayer.create(this, R.raw.zbbbb);
                letKey=28;
            } else if (letKey == 29) {
                pr.setImageResource(primage[28]);
                chl1.setImageResource(R.drawable.zc_1);
                chl2.setImageResource(R.drawable.zc_2);
                chl3.setImageResource(R.drawable.zc_3);
                mp0 = MediaPlayer.create(this, R.raw.zc);
                mp1 = MediaPlayer.create(this, R.raw.zcc);
                mp2 = MediaPlayer.create(this, R.raw.zccc);
                mp3 = MediaPlayer.create(this, R.raw.zcccc);
                letKey=29;
                left.setImageResource(R.drawable.left);
            } else if (letKey == 30) {
                pr.setImageResource(primage[29]);
                chl1.setImageResource(R.drawable.zd_1);
                chl2.setImageResource(R.drawable.zd_2);
                chl3.setImageResource(R.drawable.zd_3);
                mp0 = MediaPlayer.create(this, R.raw.zd);
                mp1 = MediaPlayer.create(this, R.raw.zdd);
                mp2 = MediaPlayer.create(this, R.raw.zddd);
                mp3 = MediaPlayer.create(this, R.raw.zdddd);
                letKey=30;
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

    public void s0 (View v){
        mp0.start();

    }

    public void s1 (View v){
        mp1.start();

    }
    public void s2 (View v){
        mp2.start();

    }
    public void s3 (View v){
        mp3.start();

    }

    /*public  boolean onError(MediaPlayer mp, int what, int extra)
    {
        if (what == 100)
        {
            mp0.stop();
            mp1.stop();
            mp2.stop();
        }

        return true;
    }*/












    }
