package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_vjezba_detail.*

class BackActivity : AppCompatActivity(), OnVjezbaClickListener {

    var vjezbe = ArrayList<Vjezba>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back)

        createDummyVjezbeList()

        val rv_vjezba_list = findViewById<RecyclerView>(R.id.rv_vjezba_list)

        var vjezbaAdapter = VjezbaAdapter(vjezbe, this)
        rv_vjezba_list.layoutManager = LinearLayoutManager(this)
        rv_vjezba_list.adapter = vjezbaAdapter
        vjezbaAdapter.notifyDataSetChanged()



    }

    fun createDummyVjezbeList(){



            vjezbe.add(Vjezba("Pull-up", "blabla", "pullup"))

            /* vjezbe.add(Vjezba("Deadlift", "Approach the bar so that it is centered over your feet. Your feet should be about hip-width apart. Bend at the hip to grip the bar at shoulder-width allowing your shoulder blades to protract. Typically, you would use an alternating grip.\n" +
                    "With your feet and your grip set, take a big breath and then lower your hips and flex the knees until your shins contact the bar. Look forward with your head. Keep your chest up and your back arched, and begin driving through the heels to move the weight upward.\n" +
                    "After the bar passes the knees aggressively pull the bar back, pulling your shoulder blades together as you drive your hips forward into the bar.\n" +
                    "Lower the bar by bending at the hips and guiding it to the floor.", ))

            vjezbe.add(Vjezba("Lat pull-down", "Sit down on a pull-down machine with a wide bar attached to the top pulley. Make sure that you adjust the knee pad of the machine to fit your height. These pads will prevent your body from being raised by the resistance attached to the bar.\n" +
                    "Grab the bar with the palms facing forward using the prescribed grip. Note on grips: For a wide grip, your hands need to be spaced out at a distance wider than shoulder width. For a medium grip, your hands need to be spaced out at a distance equal to your shoulder width and for a close grip at a distance smaller than your shoulder width.\n" +
                    "As you have both arms extended in front of you holding the bar at the chosen grip width, bring your torso back around 30 degrees or so while creating a curvature on your lower back and sticking your chest out. This is your starting position.\n" +
                    "As you breathe out, bring the bar down until it touches your upper chest by drawing the shoulders and the upper arms down and back. Tip: Concentrate on squeezing the back muscles once you reach the full contracted position. The upper torso should remain stationary and only the arms should move. The forearms should do no other work except for holding the bar; therefore do not try to pull down the bar using the forearms.\n" +
                    "After a second at the contracted position squeezing your shoulder blades together, slowly raise the bar back to the starting position when your arms are fully extended and the lats are fully stretched. Inhale during this portion of the movement.\n"))

            vjezbe.add(Vjezba("Seated row", "For this exercise you will need access to a low pulley row machine with a V-bar. Note: The V-bar will enable you to have a neutral grip where the palms of your hands face each other. To get into the starting position, first sit down on the machine and place your feet on the front platform or crossbar provided making sure that your knees are slightly bent and not locked.\n" +
                    "Lean over as you keep the natural alignment of your back and grab the V-bar handles.\n" +
                    "With your arms extended pull back until your torso is at a 90-degree angle from your legs. Your back should be slightly arched and your chest should be sticking out. You should be feeling a nice stretch on your lats as you hold the bar in front of you. This is the starting position of the exercise.\n" +
                    "Keeping the torso stationary, pull the handles back towards your torso while keeping the arms close to it until you touch the abdominals. Breathe out as you perform that movement. At that point you should be squeezing your back muscles hard. Hold that contraction for a second and slowly go back to the original position while breathing in.\n"))

            vjezbe.add(Vjezba("Bent over row", "Holding a barbell with a pronated grip (palms facing down), bend your knees slightly and bring your torso forward, by bending at the waist, while keeping the back straight until it is almost parallel to the floor. Tip: Make sure that you keep the head up. The barbell should hang directly in front of you as your arms hang perpendicular to the floor and your torso. This is your starting position.\n" +
                    "Now, while keeping the torso stationary, breathe out and lift the barbell to you. Keep the elbows close to the body and only use the forearms to hold the weight. At the top contracted position, squeeze the back muscles and hold for a brief pause."))

            vjezbe.add(Vjezba("T-bar bent over row", "Load the bar to an appropriate weight for your training. Stand astride the bar and bend at the hips to take a pronated grip on the handles.\n" +
                    "Ensure that your back remains flat, and then remove the weight from the rests, letting the bar hang at arms length. This will be your starting position.\n" +
                    "Perform the movement by flexing the elbows and retracting the shoulder blades, pulling the weight to your chest.\n" +
                    "After a brief pause at the top of the motion, return to the starting position.")) */

    }

    override fun onVjezbaItemClicked(position: Int) {
        val intent = Intent(this, VjezbaDetail ::class.java)
        intent.putExtra("name", vjezbe[position].name)
        intent.putExtra("details", vjezbe[position].detail)
        startActivity(intent)
    }

}