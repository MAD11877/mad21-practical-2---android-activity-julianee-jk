package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User userInfo = new User("Julian", 1, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer purus lorem, volutpat id leo ac, rutrum interdum mi. Cras sagittis velit nisi, et euismod erat tristique eget.", false);

        Button followButton = findViewById(R.id.followBtn);
        TextView loremText = findViewById(R.id.loremText);
        loremText.setText(userInfo.description);
        TextView helloText = findViewById(R.id.helloText);
        helloText.setText(userInfo.name);
        if (userInfo.followed == true) {
            followButton.setText("Unfollow");
        }
        else {
            followButton.setText("Follow");
        }

        followButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.v(TAG, "Button Pressed!");
                // if the follow button is false
                if (userInfo.followed == false) {
                    followButton.setText("Unfollow");
                    // set follow button to true
                    userInfo.followed = true;
                }
                else {
                    followButton.setText("Follow");
                    // set follow button to false
                    userInfo.followed = false;
                }
            }
        });
    }
}