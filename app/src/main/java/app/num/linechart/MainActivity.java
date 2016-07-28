package app.num.linechart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

        import com.github.mikephil.charting.charts.LineChart;
        import com.github.mikephil.charting.data.Entry;
        import com.github.mikephil.charting.data.LineData;
        import com.github.mikephil.charting.data.LineDataSet;
        import com.github.mikephil.charting.utils.ColorTemplate;

        import java.util.ArrayList;

        public class MainActivity extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                LineChart lineChart = (LineChart) findViewById(R.id.chart);


                ArrayList<Entry> entries = new ArrayList<>();
                entries.add(new Entry(215f, 0));
                entries.add(new Entry(215f, 1));
                entries.add(new Entry(215f, 3));
                entries.add(new Entry(215f, 4));
                entries.add(new Entry(215f,5 ));
                entries.add(new Entry(215f,6 ));
                entries.add(new Entry(215f, 7));
                entries.add(new Entry(215f,8 ));
                entries.add(new Entry(215f, 9));
                entries.add(new Entry(215f, 10));
                entries.add(new Entry(215f, 11));
                entries.add(new Entry(215f,12 ));
                entries.add(new Entry(215f, 13));
                entries.add(new Entry(215f, 14));
                entries.add(new Entry(215f, 15));
                entries.add(new Entry(215f, 16));
                entries.add(new Entry(215f, 17));
                entries.add(new Entry(215f,18 ));
                entries.add(new Entry(215f,19 ));
                entries.add(new Entry(215f,20 ));
                entries.add(new Entry(215f, 21));
                entries.add(new Entry(215f, 22));
                entries.add(new Entry(215f,23 ));
                entries.add(new Entry(215f, 24));
                entries.add(new Entry(215f, 25));
                entries.add(new Entry(215f, 26));

                entries.add(new Entry(0f, 27));
                entries.add(new Entry(0f, 28));
                entries.add(new Entry(0f,29 ));
                entries.add(new Entry(0f, 30));
                entries.add(new Entry(0f, 31));

                entries.add(new Entry(214f, 32));
                entries.add(new Entry(71f, 33));

                entries.add(new Entry(0f, 34));
                entries.add(new Entry(0f, 35));
                entries.add(new Entry(127f, 36));
                entries.add(new Entry(0f, 37));
                entries.add(new Entry(0f, 38));
                entries.add(new Entry(0f, 39));
                entries.add(new Entry(0f,40 ));

                entries.add(new Entry(32f, 41));
                entries.add(new Entry(32f, 42));
                entries.add(new Entry(32f,43 ));
                entries.add(new Entry(32f, 44));
                entries.add(new Entry(32f, 45));
                entries.add(new Entry(32f, 46));
                entries.add(new Entry(32f, 47));
                entries.add(new Entry(32f, 48));

                entries.add(new Entry(0f, 49));
                entries.add(new Entry(0f, 50));
                entries.add(new Entry(0f, 51));
                entries.add(new Entry(0f, 52));
                entries.add(new Entry(0f,53 ));
                entries.add(new Entry(0f, 54));
                entries.add(new Entry(0f, 55));
                entries.add(new Entry(0f, 56));

                entries.add(new Entry(127f, 57));
                entries.add(new Entry(127f, 58));

                LineDataSet dataset = new LineDataSet(entries, "# of Calls");

                ArrayList<String> labels = new ArrayList<String>();
                labels.add("26th Jul 09:23:09 ");
                labels.add("26th Jul 09:24:51 ");
                labels.add("26th Jul 09:25:42");
                labels.add("26th Jul 09:28:14");
                labels.add("26th Jul 09:30:47");
                labels.add("26th Jul 09:34:09");
                labels.add("26th Jul 09:35:50");
                labels.add("26th Jul 09:39:13");
                labels.add("26th Jul 09:40:54");
                labels.add("27th Jul 09:43:27");
                labels.add("27th Jul 09:45:59");
                labels.add("27th Jul 09:48:31");
                labels.add("27th Jul 09:49:22");
                labels.add("27th Jul 09:52:44 ");
                labels.add("27th Jul 09:53:35");
                labels.add("27th Jul 09:55:17");
                labels.add("27th Jul 10:03:44");
                labels.add("28th Jul 10:16:24 ");
                labels.add("28th Jul 10:24:52");
                labels.add("28th Jul 10:25:42");
                labels.add("28th Jul 10:27:24 ");
                labels.add("28th Jul 10:29:56");
                labels.add("28th Jul 10:33:23");
                labels.add("28th Jul 10:35:00 ");
                labels.add("28th Jul 10:39:14");
                labels.add("28th Jul 10:41:46");
                labels.add("29th Jul 10:49:50");
                labels.add("29th Jul 10:53:10");
                labels.add("29th Jul 10:55:19 ");
                labels.add("29th Jul 10:58:36");
                labels.add("29th Jul 11:04:35");
                labels.add("29th Jul 11:05:32");
                labels.add("29th Jul 11:10:29");
                labels.add("29th Jul 11:12:40");
                labels.add("29th Jul 11:13:46");
                labels.add("29th Jul 11:19:17");
                labels.add("29th Jul 11:21:17");
                labels.add("30th Jul 11:22:18");
                labels.add("30th Jul 11:23:20");
                labels.add("30th Jul 11:26:25");
                labels.add("30th Jul 11:43:31");
                labels.add("30th Jul 11:44:21");
                labels.add("30th Jul 11:45:12");
                labels.add("30th Jul 11:46:03");
                labels.add("30th Jul 11:46:53");
                labels.add("30th Jul 11:47:44");
                labels.add("30th Jul 11:48:34");
                labels.add("30th Jul 11:49:25 ");
                labels.add("30th Jul 11:50:27");
                labels.add("31th Jul 11:51:33");
                labels.add("31th Jul 11:52:36");
                labels.add("31th Jul 11:53:39");
                labels.add("31th Jul 11:54:41");
                labels.add("31th Jul 11:55:45");
                labels.add("31th Jul 11:56:47");
                labels.add("31th Jul 11:57:49");
                labels.add("31th Jul 11:58:47");
                labels.add("31th Jul 11:59:46"); //58

                LineData data = new LineData(labels, dataset);
                //dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
                dataset.setDrawCubic(true);
                //dataset.setDrawFilled(true);

                lineChart.setData(data);
                lineChart.animateY(5000);

            }
}
