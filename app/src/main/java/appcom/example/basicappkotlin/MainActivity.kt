package appcom.example.basicappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    private var timeChange = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide();
        setContentView(R.layout.activity_main)
        val butnRecordTime = findViewById<Button>(R.id.button_clicked);
        val textToChange = findViewById<TextView>(R.id.textView);
        val textBarun = findViewById<TextView>(R.id.textView_barun_change);
        textBarun.setOnClickListener(View.OnClickListener {   intent = Intent(this, ActivityRoller::class.java)   })
        startActivity(intent);
        butnRecordTime.setOnClickListener(View.OnClickListener {
            timeChange = timeChange + 1;
            textToChange.text = timeChange.toString();
            intent = Intent(this, ActivityRoller::class.java)
            startActivity(intent);
            finish();
        })
    }
}