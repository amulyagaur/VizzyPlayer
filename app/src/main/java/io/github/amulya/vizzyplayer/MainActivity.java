package io.github.amulya.vizzyplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView myVV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myVV = (VideoView) findViewById(R.id.myVideoView);
    }

    public void playVideo(View view)
    {
        MediaController mc = new MediaController(this);
        mc.setAnchorView(myVV);
        myVV.setMediaController(mc);
        myVV.setVideoPath("https://downpwnew.com/upload_file/367/Bollywood%20Video%20Songs%20n%20Trailers/Bollywood%20Video%20Songs%20n%20Trailers%202017/Tiger%20Zinda%20Hai%20%282017%29%20HD%20Video%20Songs/Swag%20Se%20Swagat%20-%20Tiger%20Zinda%20Hai%20%28HD%20Android%29.mp4");
        myVV.start();
    }

}
