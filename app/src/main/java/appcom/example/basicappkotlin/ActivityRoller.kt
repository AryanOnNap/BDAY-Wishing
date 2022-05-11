package appcom.example.basicappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ActivityRoller : AppCompatActivity() {
    var diceRoll = 1..6;
     var  dicePik: Int = 1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roller)
        supportActionBar?.hide();
        val buttonRol = findViewById<Button>(R.id.button_roll);
        val textNumber = findViewById<TextView>(R.id.textView_number);
        val diceImage = findViewById<ImageView>(R.id.imageView2);
        buttonRol.setOnClickListener {
            textNumber.text ="6";
            val toast = Toast.makeText(this, "Rolled", Toast.LENGTH_LONG);
            toast.show();
           var diceCatch: Any = rolled();
            textNumber.text = diceCatch.toString();
            if(textNumber.text == "1"){
                diceImage.setImageResource(R.drawable.dice_1);
            }else if (textNumber.text == "2"){
                diceImage.setImageResource(R.drawable.dice_2);
            }else if (textNumber.text == "3"){
                diceImage.setImageResource(R.drawable.dice_3);
            } else if (textNumber.text == "4") {
                diceImage.setImageResource(R.drawable.dice_4);
            } else if (textNumber.text == "5") {
                diceImage.setImageResource(R.drawable.dice_5);
            } else if (textNumber.text == "6") {
                diceImage.setImageResource(R.drawable.dice_6);
            }


        }

    }

    private fun rolled() :Int {
        dicePik = diceRoll.random();
        return  dicePik;
    }
}