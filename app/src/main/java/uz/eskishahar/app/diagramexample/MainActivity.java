package uz.eskishahar.app.diagramexample;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


import im.dacer.androidcharts.BarView;
import im.dacer.androidcharts.LineView;
import im.dacer.androidcharts.PieHelper;
import im.dacer.androidcharts.PieView;



public class MainActivity extends AppCompatActivity {



    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);







//-------------------------------Barr Diagramm --------------------------------------
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("bir");
        arrayList.add("ikki");
        arrayList.add("uch");
        arrayList.add("turt");
        arrayList.add("besh");
        arrayList.add("bir");
        arrayList.add("ikki");
        arrayList.add("uch");
        arrayList.add("қва");
        arrayList.add("besh");
        arrayList.add("bir");
        arrayList.add("ikki");
        arrayList.add("uch");
        arrayList.add("turt");
        arrayList.add("besh");

        ArrayList<Integer> dataList = new ArrayList<>();
        dataList.add(1);
        dataList.add(2);
        dataList.add(3);
        dataList.add(4);
        dataList.add(5);
        dataList.add(1);
        dataList.add(2);
        dataList.add(3);
        dataList.add(4);
        dataList.add(5);
        dataList.add(1);
        dataList.add(2);
        dataList.add(3);
        dataList.add(4);
        dataList.add(5);


        BarView1 barView = (BarView1)findViewById(R.id.bar_view);
        barView.setBottomTextList(arrayList);
        barView.setDataList(dataList,15);

//-------------------------------------END BAR DIAGRAMM---------------------------------------



//----------------------------------- PIE DIAGRAMM------------------------------------
        PieView pieView = (PieView)findViewById(R.id.pie_view);

        ArrayList<PieHelper> pieHelperArrayList = new ArrayList<PieHelper>();



        pieHelperArrayList.add(new PieHelper(20, Color.BLACK));
        pieHelperArrayList.add(new PieHelper(6));
        pieHelperArrayList.add(new PieHelper(30));
        pieHelperArrayList.add(new PieHelper(12));
        pieHelperArrayList.add(new PieHelper(32));

        pieView.setDate(pieHelperArrayList);

        pieView.setOnPieClickListener(new PieView.OnPieClickListener() {
            @Override public void onPieClick(int index) {
                if (index != PieView.NO_SELECTED_INDEX) {
                    textView.setText(index + " selected");
                } else {
                    textView.setText("No selected pie");
                }
            }
        });
        pieView.selectedPie(2);


        pieView.showPercentLabel(true); //optional
//------------------------------------END PIE -------------------------------------------------------

        ArrayList<Integer> dataArray1 = new ArrayList<>();
        dataArray1.add(1);
        dataArray1.add(2);
        dataArray1.add(3);
        dataArray1.add(4);
        dataArray1.add(5);
        dataArray1.add(1);
        dataArray1.add(2);
        dataArray1.add(3);
        dataArray1.add(4);
        dataArray1.add(5);
        dataArray1.add(1);
        dataArray1.add(2);
        dataArray1.add(3);
        dataArray1.add(4);
        dataArray1.add(5);

        ArrayList<Integer> dataArray2 = new ArrayList<>();
        dataArray2.add(3);
        dataArray2.add(4);
        dataArray2.add(5);
        dataArray2.add(6);
        dataArray2.add(7);
        dataArray2.add(3);
        dataArray2.add(4);
        dataArray2.add(5);
        dataArray2.add(6);
        dataArray2.add(7);
        dataArray2.add(3);
        dataArray2.add(0);
        dataArray2.add(0);
        dataArray2.add(6);
        dataArray2.add(7);

        ArrayList<ArrayList<Integer>> fullDataArrar = new ArrayList<>();
        fullDataArrar.add(dataArray1);
        fullDataArrar.add(dataArray2);

        LineView lineView = (LineView)findViewById(R.id.line_view);
        lineView.setDrawDotLine(false); //optional
        lineView.setShowPopup(LineView.SHOW_POPUPS_MAXMIN_ONLY); //optional
        lineView.setBottomTextList(arrayList);
        lineView.setColorArray(new int[]{Color.BLACK,Color.GREEN,Color.GRAY,Color.CYAN, Color.GRAY});
        lineView.setDataList(fullDataArrar); //or lineView.setFloatDataList(floatDataLists)
    }



}
