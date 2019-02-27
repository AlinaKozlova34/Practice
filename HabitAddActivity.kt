package padev.badhabits.application.ui.activity

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.widget.Toolbar
import android.text.Layout
import android.view.View
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import padev.badhabits.R
import padev.badhabits.core.view.BaseActivity

class HabitAddActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_habit_add)

        val toolbar = findViewById<Toolbar>(R.id.activity_habit_add_appbar_toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportActionBar?.title = getString(R.string.habit_add)

        val unnecessaryThingsRadioButton = findViewById<RadioButton>(R.id.activity_habit_add_radio_button_unnecessary_things)

        unnecessaryThingsRadioButton.setOnCheckedChangeListener { buttonView, isChecked ->
            val unnecessaryThingsLongTextView = findViewById<TextView>(R.id.activity_habit_add_text_view_unnecessary_things_long)
            if (isChecked) unnecessaryThingsLongTextView.visibility = View.VISIBLE
            else unnecessaryThingsLongTextView.visibility = View.GONE
        }

        val nailBitingRadioButton = findViewById<RadioButton>(R.id.activity_habit_add_radio_button_nail_biting)

        nailBitingRadioButton.setOnCheckedChangeListener { buttonView, isChecked ->
            val nailBitingLongTextView = findViewById<TextView>(R.id.activity_habit_add_text_view_nail_biting_long)
            if (isChecked) nailBitingLongTextView.visibility = View.VISIBLE
            else nailBitingLongTextView.visibility = View.GONE
        }

        val otherRadioButton = findViewById<RadioButton>(R.id.activity_habit_add_radio_button_other)

        otherRadioButton.setOnCheckedChangeListener { buttonView, isChecked ->
            val otherLayout = findViewById<LinearLayout>(R.id.activity_habit_add_layout_other)
            if (isChecked) otherLayout.visibility = View.VISIBLE
            else otherLayout.visibility = View.GONE
        }

        val floatingButton= findViewById<FloatingActionButton>(R.id.activity_habit_add_fab)

        floatingButton.setOnClickListener {
            val radioGroup = findViewById <RadioGroup> (R.id.activity_habit_add_radio_group)
            val radioButton = findViewById <RadioButton> (radioGroup.checkedRadioButtonId)

            radioButton.text.toString()
        }

    }
}